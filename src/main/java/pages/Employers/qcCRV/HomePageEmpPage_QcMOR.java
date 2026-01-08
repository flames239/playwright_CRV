package pages.Employers.qcCRV;

import browser.BrowserManager;
import pages.base.BasePage;

public class HomePageEmpPage_QcMOR extends BasePage {

    public HomePageEmpPage_QcMOR(BrowserManager browserManager) {
        super(browserManager);
    }

    public void navigateToHomePage_QcMOR() {
        navigate("https://qccrv.dev/vi/employers");
        waitForTimeOutElement(1_000);
        getBrowserManager().getPage().pause();
    }

    public void hoverElementProductAndService_QcMOR() {

        waitAndHover("link", "Sản Phẩm và Dịch Vụ");
        waitForTimeOutElement(1_000);
    }

    public void clickPostingServiceSubMenu_QcMOR() {
        waitAndClickByRole("link", "Đăng Tuyển Dụng", true, 2);
        waitForTimeOutElement(1_000);

    }

    public void clickResumeDatabaseSubMenu_QcMOR() {
        hoverElementProductAndService_QcMOR();
        waitAndClickByRole("link", "Tìm Hồ Sơ Ứng Viên");
        waitForTimeOutElement(1_000);
    }

    public void clickTalentSolutionSubMenu_QcMOR() {
        hoverElementProductAndService_QcMOR();
        waitAndClickByRole("link", "Talent Solution");
        waitForTimeOutElement(1_000);
    }

    public void clickPostJobSubMenu_QcMOR() {
        hoverElementProductAndService_QcMOR();
        waitAndClickByRole("link", "Quảng Cáo Tuyển Dụng");
    }

    public void clickTalentDriverSubMenu_QcMOR() {
        hoverElementProductAndService_QcMOR();
        waitAndClickByRole("link", "Talent Driver");
    }

    public void clickTargetedEmailMarketingSubMenu_QcMOR() {
        hoverElementProductAndService_QcMOR();
        waitAndClickByRole("link", "Targeted Email Marketing");
    }

    public void clickTalentRefferalSubMenu_QcMOR() {
        hoverElementProductAndService_QcMOR();
        waitAndClickByRole("link", "Talent Referral");
    }

    public void clickPostingAndResumeDatabaseInternational_QcMOR() {
        hoverElementProductAndService_QcMOR();
        waitAndClickByRole("link", "Đăng Tuyển Dụng và Tìm Hồ Sơ Quốc tế", true);
    }

    public void clickViewAllService_QcMOR() {
        hoverElementProductAndService_QcMOR();
        waitAndClickByRole("link", "Xem tất cả sản phẩm / dịch vụ");
    }

    public void HoverHRCentralElement_QcMOR() {
        waitAndHover("link", "HR Central");
        waitForElementByRole("link", "HR Central",1_000);
    }

    public void ClickDashboardElement_QcMOR() {
        clickAndAssertUrl("(//a[@href=\"/vi/employers/postjobs\"])[1]","https://qccrv.dev/vi/employers/login");
        waitForTimeOutElement(1_000);
    }

    public void ClickPostJobElement_QcMOR() {
        HoverHRCentralElement_QcMOR();
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
