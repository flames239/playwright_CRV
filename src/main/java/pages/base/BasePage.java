package pages.base;

import browser.BrowserManager;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.WaitForSelectorState;

public class BasePage {
    private final BrowserManager browserManager;

    public BasePage(BrowserManager browserManager) {
        this.browserManager = browserManager;
    }

    public void navigate(String url) {
        browserManager.getPage().navigate(url);
    }

    // truy cập được bởi lớp (class) ở cùng gói (package) hay lớp phụ (sub-class)
    protected BrowserManager getBrowserManager() {
        return browserManager;
    }

    public void waitAndClickByRole(String role, String nameElement) {
        Locator element = browserManager.getPage().getByRole(AriaRole.valueOf(role.toUpperCase()), new Page.GetByRoleOptions().setName(nameElement).setExact(true));
        element.click();
    }

    public void waitAndClickSelector(String selector) {
        browserManager.getPage().waitForSelector(selector, new Page.WaitForSelectorOptions().setState(WaitForSelectorState.VISIBLE));
        browserManager.getPage().click(selector);
    }

    public void waitAndClick(Locator locator) {
        locator.waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        locator.click();
    }

    public void fillField(String selector, String value) {
        getBrowserManager().getPage().locator(selector).fill(value);
    }

    public void waitForTimeOutElement(double timeout) {
        getBrowserManager().getPage().waitForTimeout(timeout);
    }
}
