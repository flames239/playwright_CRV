package pages.Jobseekers.Online;

import browser.BrowserManager;
import net.datafaker.Faker;
import pages.base.BasePage;

public class JobAlertPage extends BasePage {

    Faker faker = new Faker();

    public JobAlertPage(BrowserManager browserManager) {
        super(browserManager);
    }

    public void clickJobAlert() {
        waitAndClickByRole("link","Thông Báo Việc Làm");
    }

    public void inputJobTitle() {
        String jobTitle = faker.job().title();
        fillField("#keywordJA", jobTitle);
    }

    public void clickIndustry() {
        waitAndClickFirstByRoleInsideSelector("#industryJA_chosen","list");
        waitForTimeOutElement(1_000);
        int randomNum;
        int[] eliminateNumber = {10, 19, 22, 25, 30, 36, 51, 59, 62, 68, 77, 82};
        do {
            randomNum = randomNumber(0, 82);
        } while (isEliminated(randomNum, eliminateNumber));

        waitAndClickSelector("//div[@id='industryJA_chosen']//ul[@class='chosen-results']/li[@data-option-array-index='"+ randomNum +"']");
    }

    public void clickLocation() {
        waitAndClickFirstByRoleInsideSelector("#locationJA_chosen","list");
        waitForTimeOutElement(1_000);
        int randomNumber = randomNumber(0,85);
        waitAndClickSelector("//div[@id='locationJA_chosen']//ul[@class='chosen-results']/li[@data-option-array-index='"+ randomNumber +"']");
    }

    public void clickSalary() {
        selectByValue("#salary","20");
        waitForTimeOutElement(1_000);
    }

    public void clickLevel() {
        selectByValue("#level","3");
        waitForTimeOutElement(1_000);
    }

    public void clickSendDate() {
        selectByValue("#senddays","3");
        waitForTimeOutElement(1_000);
    }

    public void inputEmail(String emailAddress) {
        fillField("#emailreg", emailAddress);
        waitForTimeOutElement(1_000);
    }

    public void clickAgreePolicyChkBox() {
        waitAndClickSelector("label[for='chkAgree']");
    }

    public void clickBtnReceiveEmail() {
        waitAndClickByRole("button","Nhận Email");
        waitForTimeOutElement(1_000);
    }
}
