package pages.Jobseekers.Online;

import browser.BrowserManager;
import pages.base.BasePage;

public class SaveJobsPage extends BasePage {

    public SaveJobsPage(BrowserManager browserManager) {
        super(browserManager);
    }

    public void clickButtonSeachJob() {
        waitForTimeOutElement(2_000);
        waitAndClickByRole("BUTTON","TÌM VIỆC NGAY",true, null);
    }

    public void clickIconSaveJob() {
        getBrowserManager().getPage().pause();
    }

}
