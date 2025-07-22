package step_definitions.jobseekers;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.datafaker.Faker;
import pages.Jobseekers.HomePageJskPage;

public class HomepageJSK_Steps {
    private final HomePageJskPage homePageJSK;
    private final Faker faker = new Faker();

    public HomepageJSK_Steps(HomePageJskPage homePageJSK) {
        this.homePageJSK = homePageJSK;
    }

    @Given("Tôi truy cap vào web trang chủ cho người tìm việc")
    public void tôi_truy_cap_vào_web_trang_chủ_cho_người_tìm_việc() {
        homePageJSK.navigateToHomePage();
    }

    @When("Tôi nhập tiêu đề job hợp lý de tìm jobs \\(như nhân viên kinh doanh, devops engineers, automation tester, ..)")
    public void tôi_nhập_tiêu_đề_job_hợp_lý_de_tìm_jobs_như_nhân_viên_kinh_doanh_devops_engineers_automation_tester() {
        homePageJSK.inputSearchJob("Quality Control Engineer");
    }


    @When("tôi nhập tiêu đề job ngẫu nhiên")
    public void tôi_nhập_tiêu_đề_job_ngẫu_nhiên() {
        String randomTitleJob = faker.job().title();
        homePageJSK.inputSearchJob(randomTitleJob);
    }


    @And("Tôi ấn nút tìm việc ngay")
    public void tôi_ấn_nút_tìm_việc_ngay() {
        homePageJSK.clickSearchJobButton();
        homePageJSK.waitForTimeOutElement(2_000);
    }


    @Then("Hệ thống di chuyển qua page tìm việc làm với dữ liệu jobs hiển thị")
    public void hệ_thống_di_chuyển_qua_page_tìm_việc_làm_với_dữ_liệu_jobs_hiển_thị() {
        homePageJSK.verifySearchJob();
    }


}
