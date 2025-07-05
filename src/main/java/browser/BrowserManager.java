package browser;

import com.microsoft.playwright.*;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BrowserManager {
    public Playwright playwright; // duoc dung de khoi tao chromium, firefox browser
    public Page page; // mo single tab hay window trong browser
    public BrowserContext browserContext; // duoc dung de cach biet browser session
    public Browser browser;
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

    public byte[] takeScreenShot() {
        if (page != null) {
            return page.screenshot();
        }
        return new byte[0];
    }

    public void setUp() {
        // lay viewport size cua man hinh
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();

        playwright = Playwright.create();
        String browserType = properties.getProperty("browser", "chromium");
        switch (browserType.toLowerCase()) {
            case "chromium":
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            case "firefox":
                browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).
                        setArgs(java.util.List.of("--deny-permission-prompts")));
                break;
            default:
                logger.warning("Khong ho tro browser type: " + browserType + ". Default browser is chromium");
                browser = playwright.chromium().launch
                        (new BrowserType.LaunchOptions().setHeadless(false).
                                setArgs(java.util.List.of("--deny-permission-prompts")));
                break;
        }
       // browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(width, height));
        page = browserContext.newPage();
        logger.info("Setup browser successfully");
    }

    public void tearDown() {
        if (page != null) page.close();
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
        logger.info("Tear down browser successfully");
    }
}
