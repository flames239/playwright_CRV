package pages.Jobseekers.qcCRV;

import browser.BrowserManager;
import com.microsoft.playwright.Locator;
import net.datafaker.Faker;
import pages.base.BasePage;

public class AppliedWithoutLoginPage extends BasePage {
    public AppliedWithoutLoginPage(BrowserManager browserManager) {
        super(browserManager);
    }

    public Faker faker = new Faker();

    public void click_Button_Search_Job() {
        waitAndClickSelector("//button[contains(text(),'Tìm Ngay')]");
        waitForTimeOutElement(500);
    }

    public void click_Job_On_JobList() {
        waitForSelectorVisible("#jobs-side-list-content");
        clickAndSwitchToNewTab("//div[@class='figcaption']/div/h2//a[@class='job_link']");
        waitForTimeOutElement(500);
    }

    public void click_Button_Applied() {
        clickAndSwitchToNewTab("//a[@class='btn-gradient btnApplyClick']");
        waitForTimeOutElement(1_000);
    }

    public void click_Upload_file_And_Check_ContactInfo_Is_Fill() {
        // Step 1: Upload file sử dụng function ở BasePage
        uploadFile("#attach_file", "C:\\Users\\nam23\\Downloads\\Nguyen_Nhu_Nguyen_Em_374B62C7.pdf");
        waitForTimeOutElement(1_000);

        // Step 2: Đợi info box hiển thị
        waitForSelectorVisible("#info_box");
        waitForTimeOutElement(1_000);

        // Step 3: kiểm tra field nào còn thiếu thì fill, đủ thi ko cần fill
        String last_name = faker.name().lastName();
        String first_name = faker.name().firstName();
        String email = faker.internet().emailAddress();

        fillIfEmpty(getBrowserManager().getPage(), "#lastname", last_name);
        fillIfEmpty(getBrowserManager().getPage(), "#firstname", first_name);
        fillIfEmpty(getBrowserManager().getPage(), "#email", email);
        waitForTimeOutElement(1_000);
    }

    public void click_Toggle_Off_Save_Resume_If_Show() {
        Locator toggleOffSaveResume = getBrowserManager().getPage().locator("//span[@class='slider']");
        try {
            if (toggleOffSaveResume.isVisible()) {
                toggleOffSaveResume.click();
            }
            System.out.println("Toggle off save resume has been clicked");
        } catch (Exception e) {
            System.out.println("Toggle off save resume is not visible");
        }
        waitForTimeOutElement(1_000);
    }

    public void click_Change_New_Image_Captcha_If_Show() {
        Locator clickNewCaptchaImage = getBrowserManager().getPage().locator("#trynewcode");
        int i = 0;
        do {
            if (clickNewCaptchaImage.isVisible()) {
                clickNewCaptchaImage.click();
                i++;
                System.out.println("Click change new image captcha success");
            } else {
                System.out.println("Change new image captcha is not visible");
            }
        } while (i < 3);
        waitForTimeOutElement(1_000);
    }


    public void input_Captcha_If_Show(String captcha) {
        Locator clickNewCaptchaImage = getBrowserManager().getPage().locator("#trynewcode");
        try {
            if (clickNewCaptchaImage.isVisible()) {
                clickNewCaptchaImage.wait(1_000);
                clickNewCaptchaImage.fill(captcha);
                System.out.println("Input captcha success");
            } else {
                System.out.println("Input captcha is not visible");
            }
        } catch (Exception e) {
            System.out.println("Input captcha is not visible");
        }
    }

    public void click_Button_Submit_Application() {

    }

    public void check_Applided_Success() {

    }
}
