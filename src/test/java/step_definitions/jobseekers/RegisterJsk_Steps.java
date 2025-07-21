package step_definitions.jobseekers;

import browser.BrowserManager;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.datafaker.Faker;
import pages.Jobseekers.HomePageJskPage;
import pages.Jobseekers.RegisterJskPage;

public class RegisterJsk_Steps {

    public BrowserManager browserManager;
    protected final HomePageJskPage homePageJskPage;
    protected final RegisterJskPage registerJskPage;
    private final Faker faker = new Faker();

    public RegisterJsk_Steps(BrowserManager browserManager, HomePageJskPage homePageJskPage, RegisterJskPage registerJskPage) {
        this.browserManager = browserManager;
        this.homePageJskPage = homePageJskPage;
        this.registerJskPage = registerJskPage;
    }

    // Scenario outline
    @Given("tôi truy cập vào trang chủ careerviet")
    public void tôi_truy_cập_vào_trang_chủ_careerviet() {
        homePageJskPage.navigate("https://www.careerviet.vn");
    }

    @When("tôi bấm nút đăng nhập và ấn nút đăng ký")
    public void tôi_bấm_nút_đăng_nhập_và_ấn_nút_đăng_ký() {
        browserManager.getPage().getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Đăng nhập")).first().click();
        browserManager.getPage().getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Đăng ký").setExact(true)).click();
    }

    @And("tôi nhập Tên {word}")
    public void tôi_nhập_tên(String Ten) {
        registerJskPage.fillField("#firstname", Ten);
    }

    @And("tôi nhập họ và tên lót {string}")
    public void tôi_nhập_họ_và_tên_lót(String Ho_va_ten_lot) {
        registerJskPage.fillField("#lastname", Ho_va_ten_lot);
    }

    @And("tôi nhập email {string}")
    public void tôi_nhập_email(String emailAddress) {
        registerJskPage.fillField("#email", emailAddress);
    }

    @And("tôi nhập mật khẩu {string} và xác nhận mật khẩu {string}")
    public void tôi_nhập_mật_khẩu_và_xác_nhận_mật_khẩu(String passWord, String confirmPassword) {
        registerJskPage.fillField("#password", passWord);
        registerJskPage.fillField("#confirm_password", confirmPassword);
    }

    @And("tôi tick checkbox điều khoản")
    public void tôi_Tick_Checkbox_Điều_Khoản() {
        registerJskPage.clickAgreePolicyChkBox();
    }

    @And("tôi ấn nút đăng ký")
    public void tôi_Ấn_Nút_Đăng_Ký() {
        registerJskPage.clickRegisterButton();
        browserManager.getPage().waitForTimeout(5_000);
    }

    @Then("kiểm tra tôi đã đăng ký thành công")
    public void kiểm_tra_tôi_đã_đăng_ký_thành_công() {
        Page.WaitForSelectorOptions options = new Page.WaitForSelectorOptions().setTimeout(10000);
        browserManager.getPage().waitForSelector("//form[@id='frmRegister']//button", options);
    }


    @And("tôi nhập Tên ngẫu nhiên")
    public void tôi_Nhập_Tên_Ngẫu_Nhiên() {

    }

    @And("tôi nhập họ và tên lót ngẫu nhiên")
    public void tôi_Nhập_Họ_Và_Tên_Lót_Ngẫu_Nhiên() {

    }

    @And("tôi nhập email ngẫu nhiên")
    public void tôi_Nhập_Email_Ngẫu_Nhiên() {

    }

}
