package pages.Jobseekers;

import browser.BrowserManager;
import pages.base.BasePage;

public class RegisterJskPage extends BasePage {
    public RegisterJskPage(BrowserManager browserManager) {
        super(browserManager);
    }

    public void inputFirstName(String firstName) {
        fillField("#firstname" ,firstName);
    }

    public void inputLastName(String lastName) {
        fillField("#lastname", lastName);
    }

    public void inputEmail(String emailAddress) {
        fillField("#email", emailAddress);
    }

    public void inputPassword(String password) {
        fillField("#password", password);
    }

    public void inputConfirmPassword(String confirmPassword) {
        fillField("#confirm_password", confirmPassword);
    }

    public void clickAgreePolicyChkBox() {
        waitAndClickSelector("label[for='chkAgree']");
    }

    public void clickRegisterButton() {
        waitAndClickSelector("//div[@class='form-group form-submit']//button");
    }
}
