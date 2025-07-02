package step_definitions.jobseekers;

import browser.BrowserManager;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.datafaker.Faker;

public class LoginJsk_Steps {
    public BrowserManager browserManager;
    private final Faker faker = new Faker();

    public LoginJsk_Steps(BrowserManager browserManager) {
        this.browserManager = browserManager;
    }

    // scenario về đăng nhập thành công
    @When("khi tôi click linktext Đăng nhập")
    public void khi_tôi_click_linktext_đăng_nhập() {
        browserManager.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Đăng nhập")).click();
    }

    @And("tôi nhập tài khoản email {string}")
    public void tôi_nhập_tài_khoản_email(String emailAddress) {
        browserManager.page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email hoặc Tên đăng nhập")).fill(emailAddress);
        browserManager.page.waitForTimeout(1_000);
    }

    @And("tôi nhập mật khẩu {string}")
    public void tôi_nhập_mật_khẩu(String passWord) {
        browserManager.page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Mật khẩu")).fill(passWord);
        browserManager.page.waitForTimeout(1_000);
    }

    @And("tôi bấm nút đăng nhập")
    public void tôi_bấm_nút_đăng_nhập() {
        browserManager.page.locator("#header_login").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Đăng nhập")).click();
        browserManager.page.waitForTimeout(1_000);
    }

    @Then("tôi sẽ đăng nhập thành công")
    public void tôi_Sẽ_Đăng_Nhập_Thành_Công() {

    }


    // scenario về đăng nhập thất bại
    @And("tôi nhập tài khoản email sai {string}")
    public void tôi_Nhập_Tài_Khoản_Email_Sai(String emailAddress) {
        browserManager.page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email hoặc Tên đăng nhập")).fill(emailAddress);
        browserManager.page.waitForTimeout(1_000);
    }

    @And("tôi nhập mật khẩu sai {string}")
    public void tôi_Nhập_Mật_Khẩu_Sai_Password(String passWord) {
        browserManager.page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Mật khẩu")).fill(passWord);
        browserManager.page.waitForTimeout(1_000);
    }

    // tận dụng lại step bấm nút đăng nhập ở scenario đăng nhập hợp lệ

    @Then("đăng nhập không thành công")
    public void Đăng_Nhập_Không_Thành_Công() {

    }
}
