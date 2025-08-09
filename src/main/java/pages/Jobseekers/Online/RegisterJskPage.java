package pages.Jobseekers.Online;

import browser.BrowserManager;
import pages.base.BasePage;

public class RegisterJskPage extends BasePage {
    public RegisterJskPage(BrowserManager browserManager) {
        super(browserManager);
    }

    public void clickLinkTextRegisterJsk() {
        waitAndClickByRole("BUTTON","Đăng nhập",true, null);
        waitAndClickByRole("LINK","Đăng ký",true, null);
    }

    public void inputFirstName(String firstName) {
        fillField("#firstname" ,firstName);
        waitForTimeOutElement(1_000);
    }

    public void inputLastName(String lastName) {
        fillField("#lastname", lastName);
        waitForTimeOutElement(1_000);
    }

    public void inputEmail(String emailAddress) {
        fillField("#email", emailAddress);
        waitForTimeOutElement(1_000);
    }

    public void inputPassword(String password) {
        fillField("#password", password);
        waitForTimeOutElement(1_000);
    }

    public void inputConfirmPassword(String confirmPassword) {
        fillField("#confirm_password", confirmPassword);
        waitForTimeOutElement(1_000);
    }

    public void clickAgreePolicyChkBox() {
        waitAndClickSelector("label[for='chkAgree']");
    }

    public void clickRegisterButton() {
        waitAndClickSelector("//div[@class='form-group form-submit']//button");
        waitForTimeOutElement(3_000);
    }
}
