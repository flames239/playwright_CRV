package step_definitions.jobseekers.Online;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Jobseekers.Online.SaveJobsPage;

public class SaveJobs_Steps {

    public SaveJobsPage saveJobsPage;

    public SaveJobs_Steps(SaveJobsPage saveJobsPage) {
        this.saveJobsPage = saveJobsPage;
    }

    @And("Tôi click button tìm job")
    public void tôiClickButtonTìmJob() {
        saveJobsPage.clickButtonSeachJob();
    }

    @And("Tôi click icon Save job")
    public void tôiClickIconSaveJob() {
        saveJobsPage.clickIconSaveJob();
    }

    @Then("Popup Save Job Hiển thị")
    public void popupSaveJobHiểnThị() {

    }

    @And("Tôi hover mục chào ...")
    public void tôi_Hover_Mục_chào() {

    }

    @And("Tôi click mục Việc làm đã lưu")
    public void tôi_Click_Mục_Việc_Làm_Đã_Lưu() {

    }

    @Then("Tôi thấy job đã lưu hiển thị ở mục việc làm đã lưu")
    public void tôi_Thấy_Job_Đã_Lưu_Hiển_Thị_Ở_Mục_Việc_Làm_Đã_Lưu() {

    }
}
