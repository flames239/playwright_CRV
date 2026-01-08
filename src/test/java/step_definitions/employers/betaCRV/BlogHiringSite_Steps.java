package step_definitions.employers.betaCRV;

import browser.BrowserManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Employers.betaCRV.BlogHiringSitePage_BetaMOR;

public class BlogHiringSite_Steps {

    BlogHiringSitePage_BetaMOR blogHiringSitePage;

    public BlogHiringSite_Steps(BrowserManager browserManager) {
        this.blogHiringSitePage = new BlogHiringSitePage_BetaMOR(browserManager);
    }


    @When("tôi ấn menu Cẩm nang tuyển dụng")
    public void tôi_ấn_menu_Cam_nang_tuyen_dung() {
        blogHiringSitePage.clickBlogHiringSite();
    }

    @Then("tôi truy cập page thành công")
    public void tôi_Click_Menu_Đăng_Tuyển_Dụng() {
        blogHiringSitePage.AssertAccessBlogPage();
    }

    @And("Tôi nhập keyword tìm bài blog")
    public void tôi_Nhập_Keyword_Tìm_Bài_Blog() {
        blogHiringSitePage.InputKeywordBlog("Tuyển Dụng");
    }


    @And("Tôi ấn nút tìm kiếm")
    public void tôi_Ấn_Nút_Tìm_Kiếm() {
        blogHiringSitePage.ClickButtonSearchBlog();
    }

    @Then("tôi thấy các bài blog liên quan")
    public void tôi_Thấy_Các_Bài_Blog_Liên_Quan() {
        blogHiringSitePage.AssertBlogSearchByKeyword("Tuyển Dụng");
    }

    @And("Tôi nhập keyword không tồn tại bài blog nào")
    public void tôi_Nhập_Keyword_Không_Tồn_Tại_Bài_Blog_Nào() {
        blogHiringSitePage.InputKeywordBlog("*&!@^#!@$*&@^$*&!^)*^@*%&^!@*&(%");
    }

    @Then("Tôi thấy page không tìm thấy bài blog")
    public void tôi_Thấy_Page_Không_Tìm_Thấy_Bài_Blog() {
        blogHiringSitePage.AssertBlogNoResults();
    }

    @And("tôi ấn menu các categoty trong page Cẩm nang tuyển dụng")
    public void tôi_Ấn_Menu_Các_Categoty_Trong_Page_Cẩm_Nang_Tuyển_Dụng() {

    }
}
