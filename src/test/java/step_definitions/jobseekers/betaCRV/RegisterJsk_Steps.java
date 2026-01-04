package step_definitions.jobseekers.betaCRV;

import context.Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.datafaker.Faker;
import pages.Jobseekers.Online.HomePageJskPage;
import pages.Jobseekers.Online.RegisterJskPage;

public class RegisterJsk_Steps {
    protected final HomePageJskPage homePageJskPage;
    protected final RegisterJskPage registerJskPage;
    public final Context context;
    private final Faker faker = new Faker();

    public RegisterJsk_Steps(HomePageJskPage homePageJskPage, RegisterJskPage registerJskPage, Context context) {
        this.context = context;
        this.homePageJskPage = homePageJskPage;
        this.registerJskPage = registerJskPage;
    }

    // Scenario outline
    @Given("tôi truy cập vào trang chủ careerviet \\(MOR)")
    public void tôi_truy_cập_vào_trang_chủ_careerviet() {
        homePageJskPage.navigate("https://beta.careerviet.vn/");
    }

    @When("tôi bấm nút đăng nhập và ấn nút đăng ký \\(MOR)")
    public void tôi_bấm_nút_đăng_nhập_và_ấn_nút_đăng_ký() {
        registerJskPage.clickLinkTextRegisterJsk();
    }

    @And("tôi nhập Tên {word} \\(MOR)")
    public void tôi_nhập_tên(String Ten) {
        registerJskPage.inputFirstName(Ten);
    }

    @And("tôi nhập họ và tên lót {string} \\(MOR)")
    public void tôi_nhập_họ_và_tên_lót(String Ho_va_ten_lot) {
        registerJskPage.inputLastName(Ho_va_ten_lot);
    }

    @And("tôi nhập email {string} \\(MOR)")
    public void tôi_nhập_email(String emailAddress) {
        registerJskPage.inputEmail(emailAddress);
    }

    @And("tôi nhập mật khẩu {string} và xác nhận mật khẩu {string} \\(MOR)")
    public void tôi_nhập_mật_khẩu_và_xác_nhận_mật_khẩu(String passWord, String confirmPassword) {
        registerJskPage.inputPassword(passWord);
        registerJskPage.inputConfirmPassword(confirmPassword);
    }

    @And("tôi tick checkbox điều khoản \\(MOR)")
    public void tôi_Tick_Checkbox_Điều_Khoản() {
        registerJskPage.clickAgreePolicyChkBox();
    }

    @And("tôi ấn nút đăng ký \\(MOR)")
    public void tôi_Ấn_Nút_Đăng_Ký() {
        registerJskPage.clickRegisterButton();
    }

    @Then("kiểm tra tôi đã đăng ký thành công \\(MOR)")
    public void kiểm_tra_tôi_đã_đăng_ký_thành_công() {
        registerJskPage.waitForTimeOutElement(5_000);
    }

    @And("tôi nhập Tên ngẫu nhiên \\(MOR)")
    public void tôi_Nhập_Tên_Ngẫu_Nhiên() {
        String randomFirstName = faker.name().firstName();
        registerJskPage.inputFirstName(randomFirstName);
    }

    @And("tôi nhập họ và tên lót ngẫu nhiên \\(MOR)")
    public void tôi_Nhập_Họ_Và_Tên_Lót_Ngẫu_Nhiên() {
        String randomLastName = faker.name().lastName();
        registerJskPage.inputLastName(randomLastName);
    }

    @And("tôi nhập email ngẫu nhiên \\(MOR)")
    public void tôi_Nhập_Email_Ngẫu_Nhiên() {
        String randomEmailAddress = faker.internet().emailAddress();
        registerJskPage.inputEmail(randomEmailAddress);
    }
}
