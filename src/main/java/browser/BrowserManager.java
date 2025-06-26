package browser;

import com.microsoft.playwright.*;

import java.awt.*;

public class BrowserManager {
    public Playwright playwright; // duoc dung de khoi tao chromium, firefox browser
    public Page page; // mo single tab hay window trong browser
    public BrowserContext browserContext; // duoc dung de cach biet browser session
    public Browser browser;

    public void setUp() {
        // lay viewport size cua man hinh
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();

        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(width, height));
        page = browserContext.newPage();
    }

    public void tearDown() {
        if (page != null) page.close();
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }

}
