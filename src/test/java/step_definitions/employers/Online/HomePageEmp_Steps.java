package step_definitions.employers.Online;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Employers.Online.HomePageEmpPage;

public class HomePageEmp_Steps {

    HomePageEmpPage homePageEmpPage;

    public HomePageEmp_Steps(HomePageEmpPage homePageEmpPage) {
        this.homePageEmpPage = homePageEmpPage;
    }

    @Given("tôi truy cập trang chủ careerviet \\(NTD)")
    public void tôi_Truy_Cập_Trang_Chủ_Careerviet_NTD() {
        homePageEmpPage.navigateToHomePage();
    }

    @When("hover chuột vào menu Sản Phẩm và Dịch Vụ")
    public void hover_Chuột_Vào_Menu_Sản_Phẩm_Và_Dịch_Vụ() {
        homePageEmpPage.hoverElementProductAndService();
    }

    @And("tôi click menu đăng tuyển dụng")
    public void tôi_Click_Menu_Đăng_Tuyển_Dụng() {
        homePageEmpPage.clickPostingServiceSubMenu();
    }

    @And("tôi click menu Tìm Hồ Sơ Ứng Viên")
    public void tôi_Click_Menu_Tìm_Hồ_Sơ_Ứng_Viên() {
        homePageEmpPage.clickResumeDatabaseSubMenu();
    }

    @And("tôi click talent solution")
    public void tôi_Click_TalentSolution() {
        homePageEmpPage.clickTalentSolutionSubMenu();
    }

    @And("tôi click Quảng Cáo Tuyển Dụng")
    public void tôi_Click_Quảng_Cáo_Tuyển_Dụng() {
        homePageEmpPage.clickPostingServiceSubMenu();
    }

    @And("tôi click Talent Driver")
    public void tôi_Click_TalentDriver() {
        homePageEmpPage.clickTalentDriverSubMenu();
    }

    @And("tôi click Targeted Email Marketing")
    public void tôi_Click_Targeted_Email_Marketing() {
        homePageEmpPage.clickTargetedEmailMarketingSubMenu();
    }

    @And("tôi click Talent Referral")
    public void tôi_Click_Talent_Referral() {
        homePageEmpPage.clickTalentRefferalSubMenu();
    }

    @And("tôi click Đăng tuyển dụng và Tìm Hồ Sơ Quốc Tế")
    public void tôi_Click_Đăng_Tuyển_Dụng_Và_Tìm_Hồ_Sơ_Quốc_Tế() {
        homePageEmpPage.clickPostingAndResumeDatabaseInternational();
    }

    @And("tôi click Xem tất cả sản phẩm, dịch vụ")
    public void tôi_Click_Xem_Tất_Cả_Sản_Phẩm_Dịch_Vụ() {
        homePageEmpPage.clickViewAllService();
    }

    @Then("Truy cập từng link thành công")
    public void truy_Cập_Từng_Link_Thành_Công() {
    }

    @When("hover chuột vào menu HRCentral")
    public void hover_Chuột_Vào_Menu_HRCentral() {

        homePageEmpPage.HoverHRCentralElement();
    }

    @And("tôi click menu Dashboad")
    public void tôi_Click_Menu_Dashboad() {
        homePageEmpPage.ClickDashboardElement();
    }

    @And("tôi click menu Đăng Tuyển Dụng")
    public void tôi_Click_Menu_Đăng_Tuyển_Dụng_1() {
        homePageEmpPage.ClickPostJobElement();
    }

    @And("tôi click menu Tìm Hồ Sơ")
    public void tôi_Click_Menu_Tìm_Hồ_Sơ() {
        homePageEmpPage.ClickSearchResumeElement();
    }
}
