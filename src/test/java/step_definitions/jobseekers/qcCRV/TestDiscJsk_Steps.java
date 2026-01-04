package step_definitions.jobseekers.qcCRV;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Jobseekers.qcCRV.TestDiscJskPage;

public class TestDiscJsk_Steps {

    public TestDiscJskPage testDiscJskPage;

    public TestDiscJsk_Steps(TestDiscJskPage testDiscJskPage) {
        this.testDiscJskPage = testDiscJskPage;
    }

    @When("tôi click vào menu Test DISC \\(qc MOR)")
    public void tôi_Click_Vào_Menu_TestDISC() {
        testDiscJskPage.clickMenuTestDisc();
    }

    @And("tôi click button làm bài test \\(qc MOR)")
    public void tôi_Click_Button_Làm_Bài_Test() {
        testDiscJskPage.clickBtnTestDisc();
    }

    @And("tôi làm bài test \\(qc MOR)")
    public void tôi_Làm_Bài_Test() {
        testDiscJskPage.takeATestDisc();
    }

    @And("tôi nhập họ và tên ngẫu nhiên \\(qc MOR)")
    public void tôi_Nhập_Họ_Và_Tên_Ngẫu_Nhiên() {
        testDiscJskPage.inputFullNameRandom();

    }

    @And("tôi nhập email DISC \\(qc MOR)")
    public void tôi_Nhập_Email_DISC() {
        testDiscJskPage.fillField("#email","haha@yopmail.com");
    }

    @And("tôi nhập số điện thoại ngẫu nhiên \\(qc MOR)")
    public void tôi_Nhập_Số_Điện_Thoại_Ngẫu_Nhiên() {
        testDiscJskPage.inputPhoneNumberRandom();
    }

    @And("tôi nhập công việc ngẫu nhiên \\(qc MOR)")
    public void tôi_Nhập_Công_Việc_Ngẫu_Nhiên() {
        testDiscJskPage.inputJobPosition("Quality Control Engineer");
    }

    @And("tôi bấm nút xác nhận \\(qc MOR)")
    public void tôi_Bấm_Nút_Xác_Nhận() {
        testDiscJskPage.tickChkBoxAgreePolicy();
    }

    // phản hồi quá lâu để check được là xem được hay không
    @Then("tôi xem được kết quả DISC \\(qc MOR)")
    public void tôi_Xem_Được_Kết_Quả_DISC() {
        testDiscJskPage.clickButtonViewResult();
    }



}
