package pages.Jobseekers.Online;

import browser.BrowserManager;
import pages.base.BasePage;

public class LoginJskPage extends BasePage {
    public LoginJskPage(BrowserManager browserManager) {
        super(browserManager);
    }

    public void clickLinkTextLogin (String role, String value) {
        waitAndClickByRole(role, value);
    }

    public void inputEmail (String emailAddress) {
        fillField("//input[@name='username']", emailAddress);
        waitForTimeOutElement(1_000);
    }

    public void inputPassword (String password) {
        fillField("//input[@name='password']", password);
        waitForTimeOutElement(1_000);
    }

    public void clickBtnLogin (String selector) {
        waitAndClickSelector(selector);
        waitForTimeOutElement(1_000);
    }
}
