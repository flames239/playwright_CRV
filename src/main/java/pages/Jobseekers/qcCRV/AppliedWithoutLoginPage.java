package pages.Jobseekers.qcCRV;

import browser.BrowserManager;
import pages.base.BasePage;

public class AppliedWithoutLoginPage extends BasePage {
    public AppliedWithoutLoginPage(BrowserManager browserManager) {
        super(browserManager);
    }

    public void click_Button_Search_Job() {
        waitForTimeOutElement(500);
        waitAndClickSelector("//button[contains(text(),'Tìm Ngay')]");
    }

    public void click_Job_On_JobList() {
        waitForTimeOutElement(500);
        waitForSelectorVisible("#jobs-side-list-content");
        waitAndClickSelector("//div[@class='figcaption']/div/h2//a[@class='job_link']");
    }

    public void click_Button_Applied() {
        waitForTimeOutElement(500);
        waitAndClickSelector("//a[@class='btn-gradient btnApplyClick']");
    }

    public void click_Upload_file_And_Check_ContactInfo_Is_Fill() {

    }

    public void click_Toggle_Off_Save_Resume_If_Show() {

    }

    public void click_Change_New_Image_Captcha_If_Show() {

    }

    public void input_Captcha_If_Show(String captcha) {

    }

    public void click_Button_Submit_Application() {

    }

    public void check_Applided_Success() {

    }
}
