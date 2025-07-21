package pages.Jobseekers;

import browser.BrowserManager;
import com.microsoft.playwright.Page;
import pages.base.BasePage;

public class HomePageJskPage extends BasePage {
    public HomePageJskPage(BrowserManager browserManager) {
        super(browserManager);
    }

    public void navigateToHomePage() {
        navigate("https://www.careerviet.vn");
    }

    public void clickSearchJobButton() {
        Page.WaitForSelectorOptions options = new Page.WaitForSelectorOptions().setTimeout(10000);
        getBrowserManager().getPage().waitForSelector("//form[@onsubmit='return false;']//button", options);
        waitAndClickByRole("BUTTON","TÌM VIỆC NGAY");
    }
}
