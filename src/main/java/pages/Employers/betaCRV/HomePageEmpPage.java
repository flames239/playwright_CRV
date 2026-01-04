package pages.Employers.betaCRV;

import browser.BrowserManager;
import pages.base.BasePage;

public class HomePageEmpPage extends BasePage {

    public HomePageEmpPage(BrowserManager browserManager) {
        super(browserManager);
    }

    public void navigateToHomePage() {
        navigate("https://beta.careerviet.vn/vi/employers");
        waitForTimeOutElement(1_000);
        getBrowserManager().getPage().pause();
    }

    public void hoverElementProductAndService() {

        waitAndHover("link", "Sản Phẩm và Dịch Vụ");
        waitForTimeOutElement(1_000);
    }

    public void clickPostingServiceSubMenu() {
        waitAndClickByRole("link", "Đăng Tuyển Dụng", true, 2);
        waitForTimeOutElement(1_000);

    }

    public void clickResumeDatabaseSubMenu() {
        hoverElementProductAndService();
        waitAndClickByRole("link", "Tìm Hồ Sơ Ứng Viên");
        waitForTimeOutElement(1_000);
    }

    public void clickTalentSolutionSubMenu() {
        hoverElementProductAndService();
        waitAndClickByRole("link", "Talent Solution");
        waitForTimeOutElement(1_000);
    }

    public void clickPostJobSubMenu() {
        hoverElementProductAndService();
        waitAndClickByRole("link", "Quảng Cáo Tuyển Dụng");
    }

    public void clickTalentDriverSubMenu() {
        hoverElementProductAndService();
        waitAndClickByRole("link", "Talent Driver");
    }

    public void clickTargetedEmailMarketingSubMenu() {
        hoverElementProductAndService();
        waitAndClickByRole("link", "Targeted Email Marketing");
    }

    public void clickTalentRefferalSubMenu() {
        hoverElementProductAndService();
        waitAndClickByRole("link", "Talent Referral");
    }

    public void clickPostingAndResumeDatabaseInternational() {
        hoverElementProductAndService();
        waitAndClickByRole("link", "Đăng Tuyển Dụng và Tìm Hồ Sơ Quốc tế", true);
    }

    public void clickViewAllService() {
        hoverElementProductAndService();
        waitAndClickByRole("link", "Xem tất cả sản phẩm / dịch vụ");
    }

    public void HoverHRCentralElement() {
        waitAndHover("link", "HR Central");
        waitForElementByRole("link", "HR Central",1_000);
    }

    public void ClickDashboardElement() {
        clickAndAssertUrl("(//a[@href=\"/vi/employers/postjobs\"])[1]","https://qccrv.dev/vi/employers/login");
        waitForTimeOutElement(1_000);
    }

    public void ClickPostJobElement() {
        HoverHRCentralElement();
        clickAndAssertUrl("(//div[@class='left-wrap']//a[contains(text(),'Đăng Tuyển Dụng')])[3]","https://qccrv.dev/vi/employers/login");
        waitForTimeOutElement(1_000);
    }
/*
    public void ClickSearchResumeElement() {
        HoverHRCentralElement();
        waitAndClickSelector("//div[@class='main-menu']//a[@href='https://careerviet.vn/vi/tim-ung-vien.html']");
        waitForTimeOutElement(1_000);

        waitAndClickByRole("link", "CNTT - Phần mềm");
        waitForTimeOutElement(1_000);

        int randomNumber = randomNumber(1, 20);
        clickAndAssertUrlNewTab("(//table[@class='table-suggest']//div/a[@class='job-title'])["+ randomNumber +"]", "https://careerviet.vn/vi/employers/login");
        waitForTimeOutElement(1_000);
    }

 */
}
