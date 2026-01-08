package step_definitions.employers.Stg_MOR;

import browser.BrowserManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Employers.Stg_MOR.BlogHiringSitePage_StgMOR;
import pages.Employers.betaCRV.BlogHiringSitePage_BetaMOR;

public class BlogHiringSite_Steps {

    BlogHiringSitePage_StgMOR blogHiringSitePage;

    public BlogHiringSite_Steps(BrowserManager browserManager) {
        this.blogHiringSitePage = new BlogHiringSitePage_StgMOR(browserManager);
    }


    @When("tôi ấn menu Cẩm nang tuyển dụng Stg-MOR")
    public void tôi_ấn_menu_Cam_nang_tuyen_dung() {
        blogHiringSitePage.clickBlogHiringSite_StgMOR();
    }

    @Then("tôi truy cập page thành công Stg-MOR")
    public void tôi_Click_Menu_Đăng_Tuyển_Dụng() {
        blogHiringSitePage.AssertAccessBlogPage_StgMOR();
    }

    @And("Tôi nhập keyword tìm bài blog Stg-MOR")
    public void tôi_Nhập_Keyword_Tìm_Bài_Blog() {
        blogHiringSitePage.InputKeywordBlog_StgMOR("Tuyển Dụng");
    }

    @And("Tôi ấn nút tìm kiếm Stg-MOR")
    public void tôi_Ấn_Nút_Tìm_Kiếm() {
        blogHiringSitePage.ClickButtonSearchBlog_StgMOR();
    }

    @Then("tôi thấy các bài blog liên quan Stg-MOR")
    public void tôi_Thấy_Các_Bài_Blog_Liên_Quan() {
        blogHiringSitePage.AssertBlogSearchByKeyword_StgMOR("Tuyển Dụng");
    }


    @And("Tôi nhập keyword không tồn tại bài blog nào Stg-MOR")
    public void tôi_Nhập_Keyword_Không_Tồn_Tại_Bài_Blog_Nào() {
        blogHiringSitePage.InputKeywordBlog_StgMOR("*&!@^#!@$*&@^$*&!^)*^@*%&^!@*&(%");
        blogHiringSitePage.ClickButtonSearchBlog_StgMOR();
    }

    @Then("Tôi thấy page không tìm thấy bài blog Stg-MOR")
    public void tôi_Thấy_Page_Không_Tìm_Thấy_Bài_Blog() {
        blogHiringSitePage.AssertBlogNoResults_StgMOR();
    }

    @And("tôi ấn menu các categoty trong page Cẩm nang tuyển dụng Stg-MOR")
    public void tôi_Ấn_Menu_Các_Categoty_Trong_Page_Cẩm_Nang_Tuyển_Dụng() {

    }
}
