package step_definitions.employers.betaCRV;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Employers.qcCRV.HomePageEmpPage;

public class HomePageEmp_Steps {

    HomePageEmpPage homePageEmpPage;

    public HomePageEmp_Steps(HomePageEmpPage homePageEmpPage) {
        this.homePageEmpPage = homePageEmpPage;
    }

    @Given("tôi truy cập trang chủ careerviet \\(NTD)")
    public void tôi_Truy_Cập_Trang_Chủ_Careerviet_NTD() {
        homePageEmpPage.navigateToHomePage();
    }

    @When("hover chuột vào menu Sản Phẩm và Dịch Vụ MOR")
    public void hover_Chuột_Vào_Menu_Sản_Phẩm_Và_Dịch_Vụ() {
        homePageEmpPage.hoverElementProductAndService();
    }

    @And("tôi click menu đăng tuyển dụng MOR")
    public void tôi_Click_Menu_Đăng_Tuyển_Dụng() {
        homePageEmpPage.clickPostingServiceSubMenu();
    }

    @And("tôi click menu Tìm Hồ Sơ Ứng Viên MOR")
    public void tôi_Click_Menu_Tìm_Hồ_Sơ_Ứng_Viên() {
        homePageEmpPage.clickResumeDatabaseSubMenu();
    }

    @And("tôi click talent solution MOR")
    public void tôi_Click_TalentSolution() {
        homePageEmpPage.clickTalentSolutionSubMenu();
    }

    @And("tôi click Quảng Cáo Tuyển Dụng MOR")
    public void tôi_Click_Quảng_Cáo_Tuyển_Dụng() {
        homePageEmpPage.clickPostJobSubMenu();
    }

    @And("tôi click Talent Driver MOR")
    public void tôi_Click_TalentDriver() {
        homePageEmpPage.clickTalentDriverSubMenu();
    }

    @And("tôi click Targeted Email Marketing MOR")
    public void tôi_Click_Targeted_Email_Marketing() {
        homePageEmpPage.clickTargetedEmailMarketingSubMenu();
    }

    @And("tôi click Talent Referral MOR")
    public void tôi_Click_Talent_Referral() {
        homePageEmpPage.clickTalentRefferalSubMenu();
    }

    @And("tôi click Đăng tuyển dụng và Tìm Hồ Sơ Quốc Tế MOR")
    public void tôi_Click_Đăng_Tuyển_Dụng_Và_Tìm_Hồ_Sơ_Quốc_Tế() {
        homePageEmpPage.clickPostingAndResumeDatabaseInternational();
    }

    @And("tôi click Xem tất cả sản phẩm, dịch vụ MOR")
    public void tôi_Click_Xem_Tất_Cả_Sản_Phẩm_Dịch_Vụ() {
        homePageEmpPage.clickViewAllService();
    }

    @Then("Truy cập từng link thành công MOR")
    public void truy_Cập_Từng_Link_Thành_Công() {
    }

    @When("hover chuột vào menu HRCentral MOR")
    public void hover_Chuột_Vào_Menu_HRCentral() {
        homePageEmpPage.HoverHRCentralElement();
    }

    @And("tôi click menu Dashboad MOR")
    public void tôi_Click_Menu_Dashboad() {
        homePageEmpPage.ClickDashboardElement();
    }

    @And("tôi click menu Đăng Tuyển Dụng MOR")
    public void tôi_Click_Menu_Đăng_Tuyển_Dụng_1() {
        homePageEmpPage.ClickPostJobElement();
    }

    @Then("tôi truy cập được các mục category trong page Cẩm nang tuyển dụng")
    public void tôiTruyCậpĐượcCácMụcCategoryTrongPageCẩmNangTuyểnDụng() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
