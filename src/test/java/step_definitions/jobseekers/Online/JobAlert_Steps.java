package step_definitions.jobseekers.Online;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Jobseekers.Online.JobAlertPage;

public class JobAlert_Steps {

    JobAlertPage jobAlertPage;

    public JobAlert_Steps(JobAlertPage jobAlertPage) {
        this.jobAlertPage = jobAlertPage;
    }

    // getByRole('link', { name: 'Thông Báo Việc Làm Thông Báo' })
    @Then("tôi click tạo thông báo việc làm")
    public void tôi_Click_Tạo_Thông_Báo_Việc_Làm() {
        jobAlertPage.clickJobAlert();
    }

    @And("tôi nhập chức danh, vị trí")
    public void tôi_Nhập_Chức_Danh_Vị_Trí() {
        jobAlertPage.inputJobTitle();
    }

    @And("tôi chọn Ngành nghề")
    public void tôi_Chọn_Ngành_Nghề() {
        jobAlertPage.clickIndustry();
    }

    @And("tôi chọn Nơi làm việc")
    public void tôi_Chọn_Nơi_Làm_Việc() {
        jobAlertPage.clickLocation();
    }

    @And("tôi chọn Mức lương")
    public void tôi_Chọn_Mức_Lương() {
        jobAlertPage.clickSalary();
    }

    @And("tôi chọn Cấp bậc")
    public void tôi_Chọn_Cấp_Bậc() {
        jobAlertPage.clickLevel();
    }

    @And("tôi chọn thời gian nhận email")
    public void tôi_Chọn_Thời_Gian_Nhận_Email() {
        jobAlertPage.clickSendDate();
    }

    @And("tôi nhập email")
    public void tôi_Nhập_Email() {
        jobAlertPage.inputEmail("haha@yopmail.com");
    }

    @And("tôi click checkbox policy")
    public void tôi_Click_Checkbox_Policy() {
        jobAlertPage.clickAgreePolicyChkBox();
    }

    @And("tôi click nút nhận email")
    public void tôi_Click_Nút_Nhận_Email() {
        jobAlertPage.clickBtnReceiveEmail();
    }

    @Then("tôi tạo thành công job alert \\(thông báo việc làm)")
    public void tôi_Tạo_Thành_Công_JobAlert_Thông_Báo_Việc_Làm() {
    }

    //locator('#keywordJA')
    //locator('#industryJA_chosen').getByRole('list').first()
    //locator('#locationJA_chosen').getByRole('list').first()
    //locator('#salary')
    //locator('#level')
    //locator('#senddays')
    //locator('#emailreg')

    //getByRole('button', { name: 'Nhận Email' })
}
