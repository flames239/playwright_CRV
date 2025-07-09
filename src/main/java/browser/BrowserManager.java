package browser;

import com.microsoft.playwright.*;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BrowserManager {
    /*
     * ThreadLocal giống như 1 locker cho mỗi thread, mỗi locker không chia sẻ dữ liệu với các thread khác
     * Suy nghĩ mỗi thread như 1 công nhân độc lập trong nhà máy, mỗi worker có rieng 1 toolbox (ThreadLocal)
     * */
    private static final ThreadLocal<Playwright> playwright = new ThreadLocal<>(); // duoc dung de khoi tao chromium, firefox browser
    private static final ThreadLocal<Browser> browser = new ThreadLocal<>(); // đối chiếu với browser khởi tạo
    private static final ThreadLocal<BrowserContext> browserContext = new ThreadLocal<>(); // duoc dung de cach biet browser session
    private static final ThreadLocal<Page> page = new ThreadLocal<>(); // mo single tab hay window trong browser

    public Properties properties;
    private static final Logger logger = Logger.getLogger(BrowserManager.class.getName());

    public BrowserManager() {
        properties = new Properties();

        // tao mot duong dan de config.properties file. neu "config.path" chua duoc set,
        // mac dinh file se duoc chua trong duong dan "src/main/resources/config.properties"
        Path configPath = Paths.get(System.getProperty("config.path",
                Paths.get(System.getProperty("user.dir"),
                        "src", "main", "resources", "config.properties").toString()));
        try (InputStream input = Files.newInputStream(configPath)) {
            properties.load(input);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error reading config.properties file", e);
        }
    }

    public Page getPage() {
        return page.get();
    }

    public void setPage(Page newPage) {
        page.set(newPage);
    }

    public BrowserContext getBrowserContext() {
        return browserContext.get();
    }

    public byte[] takeScreenShot() {
        if (page.get() != null) {
            return page.get().screenshot();
        }
        return new byte[0];
    }

    public void setUp() {
        // lay viewport size cua man hinh
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();

        try {
            playwright.set(Playwright.create());
            String browserType = properties.getProperty("browser", "chromium");
            switch (browserType.toLowerCase()) {
                case "chromium":
                    browser.set(playwright.get().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)));
                    break;
                case "firefox":
                    browser.set(playwright.get().firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).
                            setArgs(java.util.List.of("--deny-permission-prompts"))));
                    break;
                default:
                    logger.warning("Khong ho tro browser type: " + browserType + ". Default browser is chromium");
                    browser.set(playwright.get().chromium().launch
                            (new BrowserType.LaunchOptions().setHeadless(false).
                                    setArgs(java.util.List.of("--deny-permission-prompts"))));
                    break;
            }
            // browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            browserContext.set(browser.get().newContext(new Browser.NewContextOptions().setViewportSize(width, height)));
            page.set(browserContext.get().newPage());
            logger.info("Setup browser successfully");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Failed to setup Playwrignt!", e);
        }
    }

    public void tearDown() {
        try {
            if (playwright.get() != null) playwright.get().close();
            if (page.get() != null) page.get().close();
            if (browser.get() != null) browser.get().close();
            if (browserContext.get() != null) browserContext.get().close();
            logger.info("Tear down browser successfully");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Failed to close browser!!!", e);
        }
    }
}
