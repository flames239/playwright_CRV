package step_definitions.jobseekers.qcCRV;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Jobseekers.qcCRV.AppliedWithoutLoginPage;

public class AppliedWithoutLogin_Steps {
    private final AppliedWithoutLoginPage appliedWithoutLogin;

    public AppliedWithoutLogin_Steps(AppliedWithoutLoginPage appliedWithoutLogin) {
        this.appliedWithoutLogin = appliedWithoutLogin;
    }

    @When("tôi ấn nút tìm viêc \\(qcMOR)")
    public void tôi_ấn_nút_tìm_việc_qcMOR() {
        appliedWithoutLogin.click_Button_Search_Job();
    }

    @And("tôi bấm một job bất kỳ \\(qcMOR)")
    public void tôi_Bấm_Một_Job_Bất_Kỳ_QcMOR() {
        appliedWithoutLogin.click_Job_On_JobList();
    }

    @And("mở new tab và ấn nút ứng tuyển \\(qcMOR)")
    public void mở_NewTab_Và_Ấn_Nút_Ứng_Tuyển_QcMOR() {
        appliedWithoutLogin.click_Button_Applied();
    }

    @And("mở new tab sang page ứng tuyển và tôi bấm upload hồ sơ và kiểm tra contact info được fill chưa \\(qcMOR)")
    public void mở_NewTab_Sang_Page_Ứng_Tuyển_Và_Tôi_Bấm_Upload_Hồ_Sơ_và_kiểm_tra_contactInfo_được_fill_QcMOR() {
        appliedWithoutLogin.click_Upload_file_And_Check_ContactInfo_Is_Fill();
    }

    @And("tôi toggle off lưu hồ sơ \\(qcMOR)")
    public void tôi_Toggle_Off_Lưu_Hồ_Sơ_QcMOR() {
        appliedWithoutLogin.click_Toggle_Off_Save_Resume_If_Show();
    }

    @And("tôi click thử mã captcha mới \\(nếu hiển thị - qcMOR)")
    public void tôi_Click_Thử_Mã_Captcha_Mới_Nếu_Hiển_Thị_QcMOR() {
        appliedWithoutLogin.click_Change_New_Image_Captcha_If_Show();
    }

    @And("tôi nhập mã captcha \\(nếu hiển thị - qcMOR)")
    public void tôi_Nhập_Mã_Captcha_Nếu_Hiển_Thị_QcMOR() {
        appliedWithoutLogin.input_Captcha_If_Show("21412");
    }

    @And("tôi click checbox Argee Policy \\(qcMOR)")
    public void tôi_Click_Checbox_Argee_Policy() {

    }

    @And("tôi click button ứng tuyển \\(qcMOR)")
    public void tôi_Click_Button_Ứng_Tuyển_QcMOR() {

    }

    @Then("tôi kiểm tra xem đã applied thành công hay chưa \\(qcMOR)")
    public void tôi_Kiểm_Tra_Xem_Đã_Applied_Thành_Công_Hay_Chưa_QcMOR() {

    }
}
