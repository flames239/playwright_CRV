package pages.Employers.Stg_MOR;

import browser.BrowserManager;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.testng.Assert;
import pages.base.BasePage;

public class BlogHiringSitePage_StgMOR extends BasePage {

    public BlogHiringSitePage_StgMOR(BrowserManager browserManager) {
        super(browserManager);
    }

    public void clickBlogHiringSite_StgMOR() {
        //Click menu Blog
        waitAndClickSelector("//div[@class='left-wrap']//ul/li/a[@href=\"/vi/hiringsite\"]");
        waitForTimeOutElement(1_000);
    }

    public void AssertAccessBlogPage_StgMOR() {
        // So sánh URL
        String currentUrl = getBrowserManager().getPage().url();
        Assert.assertEquals(currentUrl, "https://stgcrv.dev/vi/hiringsite");
        waitForTimeOutElement(1_000);
    }

    public void InputKeywordBlog_StgMOR(String keyword) {
        // Click icon kính lúp
        waitAndClickSelector("//div[@class='main-nav']/ul/li[@class='button-search']");

        // field data vào ô search
        waitForSelectorVisible("//div[@class='show-hide']");
        fillField("//input[@name='keynews']", keyword);
        waitForTimeOutElement(1_000);
    }
    public void ClickButtonSearchBlog_StgMOR() {
        // ấn button search
        waitAndClickSelector("id=search_news");
        waitForTimeOutElement(1_000);
    }

    public void AssertBlogSearchByKeyword_StgMOR(String keyword) {
        // Lấy tất cả bài blog có chứa keyword search
        Locator titles = getBrowserManager().getPage().locator("//div[@class='box-news']//div[@class='title']/a");

        //Assert có kết quả
        int count = titles.count();
        Assert.assertTrue(count > 0, "có kết quả trả về");

        // Chuyển keyword về lowercase để so sánh không phân biệt hoa thường
        String keywordLower = keyword.toLowerCase();

        // Duyệt từng title
        for (int i = 0; i < count; i++) {
            String titleText = titles.nth(i).innerText().toLowerCase();

            //Assert từng title phải chứa keyword
            Assert.assertTrue(titleText.contains(keywordLower),"Tiêu đề '" + titleText + "' không chứa keyword '" + keyword + "'");
            waitForTimeOutElement(500);
        }
        System.out.println("Tất cả " + count + " kết quả đều chứa keyword '" + keyword + "'");

    }

    public void AssertBlogNoResults_StgMOR() {
        // Lấy text không có kết quả
        Locator titles = getBrowserManager().getPage().locator("//div[@class='col-lg-9']");
        String noResults = titles.innerText();

        // get text để assert
        Assert.assertTrue(noResults.contains("Chúng tôi"), "'Chúng tôi khhông tìm thấy...', Actual: '" + noResults + "'");

        System.out.println("Đã tìm thấy message không tìm thấy kết quả");

    }
}
