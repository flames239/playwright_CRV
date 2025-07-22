package step_definitions.jobseekers;

import browser.BrowserManager;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import context.Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.datafaker.Faker;
import pages.Jobseekers.LoginJskPage;
import pages.base.BasePage;

public class LoginJsk_Steps {
    public LoginJskPage loginJskPage;
    private final Faker faker = new Faker();
    private final Context context;

    public LoginJsk_Steps(Context context, LoginJskPage loginJskPage) {
        this.context = context;
        this.loginJskPage = loginJskPage;
    }

    // scenario về đăng nhập thành công
    @When("khi tôi click linktext Đăng nhập")
    public void khi_tôi_click_linktext_đăng_nhập() {
        loginJskPage.clickLinkTextLogin("BUTTON", "Đăng nhập");
    }

    @And("tôi nhập tài khoản email {string}")
    public void tôi_nhập_tài_khoản_email(String emailAddress) {
        loginJskPage.inputEmail(emailAddress);
    }

    @And("tôi nhập mật khẩu {string}")
    public void tôi_nhập_mật_khẩu(String passWord) {
        loginJskPage.inputPassword(passWord);
    }

    @And("tôi bấm nút đăng nhập")
    public void tôi_bấm_nút_đăng_nhập() {
        loginJskPage.clickBtnLogin("#header_login");
    }

    @Then("tôi sẽ đăng nhập thành công")
    public void tôi_Sẽ_Đăng_Nhập_Thành_Công() {

    }


    // scenario về đăng nhập thất bại
    @And("tôi nhập tài khoản email sai {string}")
    public void tôi_Nhập_Tài_Khoản_Email_Sai(String emailAddress) {
        loginJskPage.inputEmail(emailAddress);
    }

    @And("tôi nhập mật khẩu sai {string}")
    public void tôi_Nhập_Mật_Khẩu_Sai_Password(String passWord) {
        loginJskPage.inputPassword(passWord);
    }

    // tận dụng lại step bấm nút đăng nhập ở scenario đăng nhập hợp lệ
    @Then("đăng nhập không thành công")
    public void Đăng_Nhập_Không_Thành_Công() {

    }

    @And("tôi nhập tài khoản email ngẫu nhiên")
    public void tôi_Nhập_Tài_Khoản_Email_Ngẫu_Nhiên() {
        String randomEmailAddress = faker.internet().emailAddress();
        context.setRandomEmail(randomEmailAddress); // chứa trong context
        loginJskPage.inputEmail(context.getRandomEmail());
    }

    @And("tôi nhập mật khẩu ngẫu nhiên")
    public void tôi_Nhập_Mật_Khẩu_Ngẫu_Nhiên() {
        String randomPassword = faker.internet().password();
        context.setRandomEmail(randomPassword);
        loginJskPage.inputPassword(context.getRandomEmail());
    }
}
