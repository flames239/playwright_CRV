package pages.Employers.betaCRV;

import browser.BrowserManager;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.testng.Assert;
import pages.base.BasePage;

import java.util.ArrayList;
import java.util.List;

public class BlogHiringSitePage extends BasePage {

    public BlogHiringSitePage(BrowserManager browserManager) {
        super(browserManager);
    }

    public void clickBlogHiringSite() {
        //Click menu Blog
        waitAndClickSelector("//div[@class='left-wrap']//ul/li/a[@href=\"/vi/hiringsite\"]");
        waitForTimeOutElement(2_000);
    }

    public void AssertAccessBlogPage() {
        // So sánh URL
        String currentUrl = getBrowserManager().getPage().url();
        Assert.assertEquals(currentUrl, "https://beta.careerviet.vn/vi/hiringsite");
    }

    public void InputKeywordBlog(String keyword) {
        // Click icon kính lúp
        waitAndClickSelector("//div[@class='main-nav']/ul/li[@class='button-search']");

        // field data vào ô search
        waitForSelectorVisible("//div[@class='show-hide']");
        fillField("name=keynews", keyword);
        waitForTimeOutElement(1_000);
    }
    public void ClickButtonSearchBlog() {
        // ấn button search
        waitAndClickSelector("id=search_news");
    }

    public void AssertBlogSearchByKeyword(String keyword) {
        // Lấy tất cả bài blog có chứa keyword search
        Locator titles = getBrowserManager().getPage().locator(".figure .figcaption .title a");

        //Assert có kết quả
        int count = titles.count();
        Assert.assertTrue(count > 0, "có kết quả trả về");


        // Duyệt từng title
        for (int i = 0; i < count; i++) {
            String titleText = titles.nth(i).innerText().toLowerCase();
            Assert.assertTrue(titleText.contains(keyword),"Title không có từ: " + keyword);
        }
    }

    public void AssertBlogNoResults() {
        //Assert page không có kết quả
        Page page = getBrowserManager().getPage();
        page.waitForLoadState();

        // get text để assert
        Locator getNoResult = page.locator("body:has(.employer-layout)");
        String getText = String.valueOf(getNoResult.innerText().contains("Chúng tôi không tìm thấy"));
        Assert.assertEquals(getText, "Chúng tôi không tìm thấy");
    }
}
