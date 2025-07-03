package step_definitions.hooks;

import browser.BrowserManager;
import io.cucumber.java.*;

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
    public void tearDown(Scenario scenario) {
        System.out.println("After test...");
        if (scenario.isFailed()) {
            byte[] screenshot = browserManager.takeScreenShot();
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        browserManager.tearDown();
    }
}
