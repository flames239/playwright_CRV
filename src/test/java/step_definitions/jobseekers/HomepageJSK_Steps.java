package step_definitions.jobseekers;

import browser.BrowserManager;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.datafaker.Faker;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HomepageJSK_Steps {
    public BrowserManager browserManager;
    private final Faker faker = new Faker();

    public HomepageJSK_Steps(BrowserManager browserManager) {
        this.browserManager = browserManager;
    }

    @Given("Tôi truy cap vào web trang chủ cho người tìm việc")
    public void tôi_truy_cap_vào_web_trang_chủ_cho_người_tìm_việc() {
        browserManager.page.navigate("https://www.careerviet.vn");
    }

    @When("Tôi nhập tiêu đề job hợp lý de tìm jobs \\(như nhân viên kinh doanh, devops engineers, automation tester, ..)")
    public void tôi_nhập_tiêu_đề_job_hợp_lý_de_tìm_jobs_như_nhân_viên_kinh_doanh_devops_engineers_automation_tester() {
        browserManager.page.getByRole(AriaRole.SEARCHBOX, new Page.GetByRoleOptions().setName("Chức danh")).fill("Quality Control Engineer");
    }


    @When("tôi nhập tiêu đề job ngẫu nhiên")
    public void tôi_nhập_tiêu_đề_job_ngẫu_nhiên() {
        String randomTitleJob = faker.job().title();
        System.out.println("randomTitleJob: " + randomTitleJob);
        browserManager.page.getByRole(AriaRole.SEARCHBOX, new Page.GetByRoleOptions().setName("Chức danh")).fill(randomTitleJob);
    }


    @And("Tôi ấn nút tìm việc ngay")
    public void tôi_ấn_nút_tìm_việc_ngay() {
        Page.WaitForSelectorOptions options = new Page.WaitForSelectorOptions().setTimeout(10000);
        browserManager.page.waitForSelector("//form[@onsubmit='return false;']//button", options);
        browserManager.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("TÌM VIỆC NGAY")).click();
    }


    @Then("Hệ thống di chuyển qua page tìm việc làm với dữ liệu jobs hiển thị")
    public void hệ_thống_di_chuyển_qua_page_tìm_việc_làm_với_dữ_liệu_jobs_hiển_thị() {
        browserManager.page.waitForSelector("//div[@class='box-title']");

        Locator locator = browserManager.page.locator("//div[@class='box-title']");
        assertThat(locator).isVisible();
        assertThat(locator).hasText("Việc làm được tìm kiếm nhiều nhất");

        //getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Việc làm được tìm kiếm nhiều")).waitFor();
    }


}
