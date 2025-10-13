package runner.qcCRV;

import browser.BrowserManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.TestNG;
import org.testng.annotations.DataProvider;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

@CucumberOptions(
        features = "src/test/resources/features/Employers.qcCRV",
        glue = "step_definitions",
        tags = "@chua-login",
        plugin = {"pretty", "json:target/cucumber.json", "html:target/cucumber-report.html"}
)
public class EmployersTest extends AbstractTestNGCucumberTests {
    private static final Properties properties = new Properties();
    private static final Logger logger = Logger.getLogger(BrowserManager.class.getName());

    // static khoi nay tai file .properties
    static {
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

    public static void main(String[] args) {
        // Khởi tạo instance TestNG
        TestNG testNG = new TestNG();

        // Tạo TestNG Suite mới
        XmlSuite xmlSuite = new XmlSuite();

        // Lấy thread count từ file config.properties
        int threadCount = getThreadCount();
        System.out.println("Thread count: " + threadCount);

        // Set số thread từ data provider
        xmlSuite.setDataProviderThreadCount(threadCount);

        // Tao moi TestNG test va them no vao suite
        XmlTest test = new XmlTest(xmlSuite);
        test.setName("Jobseekers Test Suite"); // tạo name cho test suite
        test.setXmlClasses(Collections.singletonList(new XmlClass(EmployersTest.class))); // Thêm test class để test

        // Vô hiệu quá listeners mặc định  (sẽ vô hiệu TestNG reports cho việc tự sinh)
        testNG.setUseDefaultListeners(false);

        // THêm suite vào TestNG instance
        testNG.setXmlSuites(Collections.singletonList(xmlSuite));

        // Chạy testNG với suite được cấu hình
        testNG.run();
    }

    // Phuong thuc lay thread count tu file config.properties
    private static int getThreadCount() {
        return Integer.parseInt(properties.getProperty("thread.count", "1"));
    }

    // Phương thức DataProvider
    // Được dùng cho thực thi test song song, cho phép nhiều test chạy đồng thời
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios(); // Cung cấp dữ liệu cho việc test, bật cờ thực thi song song test
    }

}
