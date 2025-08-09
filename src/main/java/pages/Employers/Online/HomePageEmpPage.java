package pages.Employers.Online;

import browser.BrowserManager;
import pages.base.BasePage;

public class HomePageEmpPage extends BasePage {

    public HomePageEmpPage(BrowserManager browserManager) {
        super(browserManager);
    }

    public void navigateToHomePage() {
        navigate("https://careerviet.vn/vi/employers");
        waitForTimeOutElement(1_000);
    }

    public void hoverElementProductAndService() {
        waitAndHover("link", "Sản Phẩm và Dịch Vụ");
        waitForTimeOutElement(1_000);
    }

    public void clickPostingServiceSubMenu() {
        waitAndClickByRoleFirst("link", "Đăng Tuyển Dụng");
        waitForTimeOutElement(1_000);
    }

    public void clickResumeDatabaseSubMenu() {
        hoverElementProductAndService();
        waitAndClickByRole("link", "Tìm Hồ Sơ Ứng Viên");
        waitForTimeOutElement(1_000);
    }

    public void clickTalentSolutionSubMenu() {
        hoverElementProductAndService();
        waitAndClickByRoleFirst("link", "Talent Solution");
        waitForTimeOutElement(1_000);
    }

    public void clickPostJobSubMenu() {
        hoverElementProductAndService();
        waitAndClickByRoleFirst("link", "Quảng Cáo Tuyển Dụng");
        waitForTimeOutElement(1_000);
    }

    public void clickTalentDriverSubMenu() {
        hoverElementProductAndService();
        waitAndClickByRoleFirst("link", "Talent Driver");
        waitForTimeOutElement(1_000);
    }

    public void clickTargetedEmailMarketingSubMenu() {
        hoverElementProductAndService();
        waitAndClickByRoleFirst("link", "Targeted Email Marketing");
        waitForTimeOutElement(1_000);
    }

    public void clickTalentRefferalSubMenu() {
        hoverElementProductAndService();
        waitAndClickByRole("link", "Talent Referral");
        waitForTimeOutElement(1_000);
    }

    public void clickPostingAndResumeDatabaseInternational() {
        hoverElementProductAndService();
        waitAndClickByRole("link", "Đăng Tuyển Dụng và Tìm Hồ Sơ Quốc tế");
        waitForTimeOutElement(1_000);
    }

    public void clickViewAllService() {
        hoverElementProductAndService();
        waitAndClickByRoleFirst("link", "Xem tất cả sản phẩm / dịch vụ");
        waitForTimeOutElement(1_000);
    }

    public void HoverHRCentralElement() {
        waitAndHover("link", "HR Central");
        waitForTimeOutElement(1_000);

    }

    public void ClickDashboardElement() {
        clickAndAssertUrl("//div[@class='left-wrap']//a[contains(text(),'Dashboard')]","https://careerviet.vn/vi/employers/login");
        waitForTimeOutElement(1_000);
    }

    public void ClickPostJobElement() {
        HoverHRCentralElement();
        clickAndAssertUrl("(//div[@class='left-wrap']//a[contains(text(),'Đăng Tuyển Dụng')])[3]","https://careerviet.vn/vi/employers/login");
        waitForTimeOutElement(1_000);
    }

    public void ClickSearchResumeElement() {
        HoverHRCentralElement();
        waitAndClickByRoleFirst("link", "Tìm Hồ Sơ");
        waitForTimeOutElement(1_000);

        waitAndClickByRole("link", "CNTT - Phần mềm");
        waitForTimeOutElement(1_000);

        int randomNumber = randomNumber(1, 20);
        clickAndAssertUrlNewTab("(//table[@class='table-suggest']//div/a[@class='job-title'])["+ randomNumber +"]", "https://careerviet.vn/vi/employers/login");
        waitForTimeOutElement(1_000);
    }
}
