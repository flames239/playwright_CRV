package step_definitions.hooks;

import browser.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class Hooks {
    private final BrowserManager browserManager;

    public Hooks(BrowserManager browserManager) {
        this.browserManager = browserManager;
    }

    // Chay 1 lan truoc khi tat ca cac truong hop kiem thu bat dau
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all test suite...");
    }

    // chay 1 lan sau khi cac truong hop kiem thu chay xong
    @AfterAll
    public static void afterAll() {
        System.out.println("After all test suite...");
    }

    // chay truoc moi truong hop kiem thu
    @Before
    public void setup() {
        System.out.println("Before test...");
        browserManager.setUp();
    }

    // chay sau moi truong hop kiem thu
    @After
    public void tearDown() {
        System.out.println("After test...");
        browserManager.tearDown();
    }
}
