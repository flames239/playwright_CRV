package step_definitions.employers.Stg_MOR;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Employers.Stg_MOR.HomePageEmpPage_StgMOR;
import pages.Employers.qcCRV.HomePageEmpPage_QcMOR;

public class HomePageEmp_Steps {

    HomePageEmpPage_StgMOR homePageEmpPage;

    public HomePageEmp_Steps(HomePageEmpPage_StgMOR homePageEmpPage) {
        this.homePageEmpPage = homePageEmpPage;
    }

    @Given("tôi truy cập trang chủ careerviet \\(NTD) Stg-MOR")
    public void tôi_Truy_Cập_Trang_Chủ_Careerviet_NTD() {
        homePageEmpPage.navigateToHomePage_StgMOR();
    }

    @When("hover chuột vào menu Sản Phẩm và Dịch Vụ MOR Stg-MOR")
    public void hover_Chuột_Vào_Menu_Sản_Phẩm_Và_Dịch_Vụ() {
        homePageEmpPage.hoverElementProductAndService_StgMOR();
    }

    @And("tôi click menu đăng tuyển dụng MOR Stg-MOR")
    public void tôi_Click_Menu_Đăng_Tuyển_Dụng() {
        homePageEmpPage.clickPostingServiceSubMenu_StgMOR();
    }

    @And("tôi click menu Tìm Hồ Sơ Ứng Viên MOR Stg-MOR")
    public void tôi_Click_Menu_Tìm_Hồ_Sơ_Ứng_Viên() {
        homePageEmpPage.clickResumeDatabaseSubMenu_StgMOR();
    }

    @And("tôi click talent solution MOR Stg-MOR")
    public void tôi_Click_TalentSolution() {
        homePageEmpPage.clickTalentSolutionSubMenu_StgMOR();
    }

    @And("tôi click Quảng Cáo Tuyển Dụng MOR Stg-MOR")
    public void tôi_Click_Quảng_Cáo_Tuyển_Dụng() {
        homePageEmpPage.clickPostJobSubMenu_StgMOR();
    }

    @And("tôi click Talent Driver MOR Stg-MOR")
    public void tôi_Click_TalentDriver() {
        homePageEmpPage.clickTalentDriverSubMenu_StgMOR();
    }

    @And("tôi click Targeted Email Marketing MOR Stg-MOR")
    public void tôi_Click_Targeted_Email_Marketing() {
        homePageEmpPage.clickTargetedEmailMarketingSubMenu_StgMOR();
    }

    @And("tôi click Talent Referral MOR Stg-MOR")
    public void tôi_Click_Talent_Referral() {
        homePageEmpPage.clickTalentRefferalSubMenu_StgMOR();
    }

    @And("tôi click Đăng tuyển dụng và Tìm Hồ Sơ Quốc Tế MOR Stg-MOR")
    public void tôi_Click_Đăng_Tuyển_Dụng_Và_Tìm_Hồ_Sơ_Quốc_Tế() {
        homePageEmpPage.clickPostingAndResumeDatabaseInternational_StgMOR();
    }

    @And("tôi click Xem tất cả sản phẩm, dịch vụ MOR Stg-MOR")
    public void tôi_Click_Xem_Tất_Cả_Sản_Phẩm_Dịch_Vụ() {
        homePageEmpPage.clickViewAllService_StgMOR();
    }

    @Then("Truy cập từng link thành công MOR Stg-MOR")
    public void truy_Cập_Từng_Link_Thành_Công_StgMOR() {
    }

    @When("hover chuột vào menu HRCentral MOR Stg-MOR")
    public void hover_Chuột_Vào_Menu_HRCentral_StgMOR() {
        homePageEmpPage.HoverHRCentralElement_StgMOR();
    }

    @And("tôi click menu Dashboad MOR Stg-MOR")
    public void tôi_Click_Menu_Dashboad_StgMOR() {
        homePageEmpPage.ClickDashboardElement_StgMOR();
    }

    @And("tôi click menu Đăng Tuyển Dụng MOR Stg-MOR")
    public void tôi_Click_Menu_Đăng_Tuyển_Dụng_1_StgMOR() {
        homePageEmpPage.ClickPostJobElement_StgMOR();
    }


    @And("tôi click menu Tìm Hồ Sơ MOR Stg-MOR")
    public void tôi_Click_Menu_Tìm_Hồ_Sơ_StgMOR() {
        homePageEmpPage.ClickMenuSearchResume();
    }

    @And("tôi search resume Stg-MOR")
    public void tôi_Search_Resume_StgMOR() {
        homePageEmpPage.Search_Resume_By_Keyword("Automation Tester");

    }

    @And("tôi click view detail {int} resume Stg-MOR")
    public void tôi_Click_View_Detail_Resume_StgMOR() {
        homePageEmpPage.AssertDirectPageLogin();
    }

    @Then("tôi được direct về trang đăng nhập Stg-MOR")
    public void tôi_Được_Direct_Về_Trang_Đăng_Nhập() {

    }
}
