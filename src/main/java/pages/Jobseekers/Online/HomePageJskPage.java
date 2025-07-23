package pages.Jobseekers.Online;

import browser.BrowserManager;
import com.microsoft.playwright.Locator;
import pages.base.BasePage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HomePageJskPage extends BasePage {
    public HomePageJskPage(BrowserManager browserManager) {
        super(browserManager);
    }

    public void navigateToHomePage() {
        navigate("https://www.careerviet.vn");
    }

    public void inputSearchJob (String searchJob) {
        fillField("#keyword", searchJob);
        waitForTimeOutElement(1_000);
    }


    public void clickSearchJobButton() {
        waitForTimeOutElement(2_000);
        waitAndClickByRole("BUTTON","TÌM VIỆC NGAY");
    }

    public void verifySearchJob() {
        getBrowserManager().getPage().waitForSelector("//div[@class='box-title']");
        Locator locator = getBrowserManager().getPage().locator("//div[@class='box-title']");
        assertThat(locator).isVisible();
        assertThat(locator).hasText("Việc làm được tìm kiếm nhiều nhất");
    }
}
