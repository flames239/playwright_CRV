package pages.base;

import browser.BrowserManager;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;

import java.nio.file.Path;
import java.util.List;
import java.util.regex.Pattern;

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
        Locator element =  getBrowserManager().getPage().getByRole(AriaRole.valueOf(role.toUpperCase()), new Page.GetByRoleOptions().setName(nameElement).setExact(true));
        element.click();
    }

    public void waitAndClickByRoleFirst(String role, String nameElement) {
        Locator element =  getBrowserManager().getPage().getByRole(AriaRole.valueOf(role.toUpperCase()), new Page.GetByRoleOptions().setName(nameElement).setExact(true)).first();
        element.click();
    }

    public void waitAndClickByRoleNth(String role, String nameElement, int index) {
        Locator element =  getBrowserManager().getPage().getByRole(AriaRole.valueOf(role.toUpperCase()), new Page.GetByRoleOptions().setName(nameElement).setExact(true)).nth(index);
        element.click();
    }

    public void waitAndClickSelector(String selector) {
        getBrowserManager().getPage().waitForSelector(selector, new Page.WaitForSelectorOptions().setState(WaitForSelectorState.VISIBLE));
        getBrowserManager().getPage().click(selector);
    }

    public void waitAndClick(Locator locator) {
        locator.waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        locator.click();
    }

    public void fillField(String selector, String value) {
        getBrowserManager().getPage().locator(selector).fill(value);
    }

    public void waitAndHover(Locator locator) {
        locator.waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        locator.hover();
    }

    public void waitAndHover(String role, String nameElement) {
        Locator element =  getBrowserManager().getPage().getByRole(AriaRole.valueOf(role.toUpperCase()), new Page.GetByRoleOptions().setName(nameElement).setExact(true));
        element.hover();
    }

    public void waitForSelectorVisible(String selector) {
        getBrowserManager().getPage().waitForSelector(selector, new Page.WaitForSelectorOptions().setState(WaitForSelectorState.VISIBLE));
    }

    public void waitForSelectorHidden(String selector) {
        Locator element =  getBrowserManager()
                .getPage()
                .locator(selector)
                .filter(new Locator.FilterOptions().setVisible(true))
                .first();
        element.click();
    }

    public void waitForTimeOutElement(double timeout) {
        getBrowserManager().getPage().waitForTimeout(timeout);
    }
}
