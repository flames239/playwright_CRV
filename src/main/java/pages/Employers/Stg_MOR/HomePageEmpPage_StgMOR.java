package pages.Employers.Stg_MOR;

import browser.BrowserManager;
import org.testng.Assert;
import pages.base.BasePage;

public class HomePageEmpPage_StgMOR extends BasePage {

    public HomePageEmpPage_StgMOR(BrowserManager browserManager) {
        super(browserManager);
    }

    public void navigateToHomePage_StgMOR() {
        navigate("https://stgcrv.dev/vi/employers");
        waitForTimeOutElement(1_000);
    }

    public void hoverElementProductAndService_StgMOR() {
        waitAndHover("link", "Sản Phẩm và Dịch Vụ");
        waitForTimeOutElement(1_000);
    }

    public void clickPostingServiceSubMenu_StgMOR() {
        waitAndClickSelector("//a[@href='/vi/employers/products-and-services/dang-tuyen-dung/3']");
        waitForTimeOutElement(1_000);
    }

    public void clickResumeDatabaseSubMenu_StgMOR() {
        hoverElementProductAndService_StgMOR();
        waitAndClickByRole("link", "Tìm Hồ Sơ Ứng Viên");
        waitForTimeOutElement(1_000);
    }

    public void clickTalentSolutionSubMenu_StgMOR() {
        hoverElementProductAndService_StgMOR();
        waitAndClickSelector("//a[@href='/vi/employers/products-and-services/talent-solution/13']");
        waitForTimeOutElement(1_000);
    }

    public void clickPostJobSubMenu_StgMOR() {
        hoverElementProductAndService_StgMOR();
        waitAndClickByRole("link", "Quảng Cáo Tuyển Dụng");
    }

    public void clickTalentDriverSubMenu_StgMOR() {
        hoverElementProductAndService_StgMOR();
        waitAndClickByRole("link", "Talent Driver");
    }

    public void clickTargetedEmailMarketingSubMenu_StgMOR() {
        hoverElementProductAndService_StgMOR();
        waitAndClickByRole("link", "Targeted Email Marketing");
    }

    public void clickTalentRefferalSubMenu_StgMOR() {
        hoverElementProductAndService_StgMOR();
        waitAndClickByRole("link", "Talent Referral");
    }

    public void clickPostingAndResumeDatabaseInternational_StgMOR() {
        hoverElementProductAndService_StgMOR();
        waitAndClickByRole("link", "Đăng Tuyển Dụng và Tìm Hồ Sơ Quốc tế", true);
    }

    public void clickViewAllService_StgMOR() {
        hoverElementProductAndService_StgMOR();
        waitAndClickByRole("link", "Xem tất cả sản phẩm / dịch vụ");
    }

    public void HoverHRCentralElement_StgMOR() {
        waitAndHover("link", "HR Central");
        waitForElementByRole("link", "HR Central",1_000);
    }

    public void ClickDashboardElement_StgMOR() {
        HoverHRCentralElement_StgMOR();
        waitAndClickSelector("(//a[@href='/vi/employers/postjobs'])[1]");
        waitForTimeOutElement(1_000);
        Assert.assertTrue(getBrowserManager().getPage().url().contains("https://stgcrv.dev/vi/employers/login"),"Direct về page login thành công");
    }

    public void ClickPostJobElement_StgMOR() {
        HoverHRCentralElement_StgMOR();
        waitAndClickSelector("(//div[@class='left-wrap']//a[contains(text(),'Đăng Tuyển Dụng')])[3]");
        waitForTimeOutElement(1_000);
        Assert.assertTrue(getBrowserManager().getPage().url().contains("https://stgcrv.dev/vi/employers/login"),"Direct về page login thành công");
    }

    public void ClickMenuSearchResume() {
        HoverHRCentralElement_StgMOR();
        waitAndClickSelector("//a[@href='/vi/tim-ung-vien.html']");
        waitForTimeOutElement(1_000);
    }

    public void Search_Resume_By_Keyword(String keyword) {
        waitForSelectorVisible("#downshift-«r3»-input");
        fillField("#downshift-«r3»-input",keyword);
        waitForTimeOutElement(1_000);

        waitAndClickSelector("//button[@class='btn-gradient btn-submit']");
        waitForTimeOutElement(1_000);
    }

    public void ViewDetail_Resume() {
        waitForSelectorVisible("//table[@class='suggest CommonTable_table-common__9oZIT']");
        waitAndClickSelector("//div[@class='job-name']/a");
        waitForTimeOutElement(1_000);
    }

    public void AssertDirectPageLogin() {
        Assert.assertTrue(getBrowserManager().getPage().url().contains("https://stgcrv.dev/vi/employers/login"), "Verify direct page login thành công");
    }
}
