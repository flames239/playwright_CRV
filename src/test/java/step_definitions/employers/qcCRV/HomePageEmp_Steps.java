package step_definitions.employers.qcCRV;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Employers.qcCRV.HomePageEmpPage_QcMOR;

public class HomePageEmp_Steps {

    HomePageEmpPage_QcMOR homePageEmpPage;

    public HomePageEmp_Steps(HomePageEmpPage_QcMOR homePageEmpPage) {
        this.homePageEmpPage = homePageEmpPage;
    }

    @Given("tôi truy cập trang chủ qcMORcareerviet \\(NTD)")
    public void tôi_Truy_Cập_Trang_Chủ_Careerviet_NTD() {
        homePageEmpPage.navigateToHomePage_QcMOR();
    }

    @When("hover chuột vào menu Sản Phẩm và Dịch Vụ qcMOR")
    public void hover_Chuột_Vào_Menu_Sản_Phẩm_Và_Dịch_Vụ() {
        homePageEmpPage.hoverElementProductAndService_QcMOR();
    }

    @And("tôi click menu đăng tuyển dụng qcMOR")
    public void tôi_Click_Menu_Đăng_Tuyển_Dụng() {
        homePageEmpPage.clickPostingServiceSubMenu_QcMOR();
    }

    @And("tôi click menu Tìm Hồ Sơ Ứng Viên qcMOR")
    public void tôi_Click_Menu_Tìm_Hồ_Sơ_Ứng_Viên() {
        homePageEmpPage.clickResumeDatabaseSubMenu_QcMOR();
    }

    @And("tôi click talent solution qcMOR")
    public void tôi_Click_TalentSolution() {
        homePageEmpPage.clickTalentSolutionSubMenu_QcMOR();
    }

    @And("tôi click Quảng Cáo Tuyển Dụng qcMOR")
    public void tôi_Click_Quảng_Cáo_Tuyển_Dụng() {
        homePageEmpPage.clickPostJobSubMenu_QcMOR();
    }

    @And("tôi click Talent Driver qcMOR")
    public void tôi_Click_TalentDriver() {
        homePageEmpPage.clickTalentDriverSubMenu_QcMOR();
    }

    @And("tôi click Targeted Email Marketing qcMOR")
    public void tôi_Click_Targeted_Email_Marketing() {
        homePageEmpPage.clickTargetedEmailMarketingSubMenu_QcMOR();
    }

    @And("tôi click Talent Referral qcMOR")
    public void tôi_Click_Talent_Referral() {
        homePageEmpPage.clickTalentRefferalSubMenu_QcMOR();
    }

    @And("tôi click Đăng tuyển dụng và Tìm Hồ Sơ Quốc Tế qcMOR")
    public void tôi_Click_Đăng_Tuyển_Dụng_Và_Tìm_Hồ_Sơ_Quốc_Tế() {
        homePageEmpPage.clickPostingAndResumeDatabaseInternational_QcMOR();
    }

    @And("tôi click Xem tất cả sản phẩm, dịch vụ qcMOR")
    public void tôi_Click_Xem_Tất_Cả_Sản_Phẩm_Dịch_Vụ() {
        homePageEmpPage.clickViewAllService_QcMOR();
    }

    @Then("Truy cập từng link thành công qcMOR")
    public void truy_Cập_Từng_Link_Thành_Công() {
    }

    @When("hover chuột vào menu HRCentral qcMOR")
    public void hover_Chuột_Vào_Menu_HRCentral() {
        homePageEmpPage.HoverHRCentralElement_QcMOR();
    }

    @And("tôi click menu Dashboad qcMOR")
    public void tôi_Click_Menu_Dashboad() {
        homePageEmpPage.ClickDashboardElement_QcMOR();
    }

    @And("tôi click menu Đăng Tuyển Dụng qcMOR")
    public void tôi_Click_Menu_Đăng_Tuyển_Dụng_1() {
        homePageEmpPage.ClickPostJobElement_QcMOR();
    }

    /*
    @And("tôi click menu Tìm Hồ Sơ qcMOR")
    public void tôi_Click_Menu_Tìm_Hồ_Sơ() {
        homePageEmpPage.ClickSearchResumeElement();
    }
     */
}
