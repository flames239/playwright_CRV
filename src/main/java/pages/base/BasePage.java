package pages.base;

import browser.BrowserManager;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.SelectOption;
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
        Locator element = getBrowserManager()
                .getPage()
                .getByRole(AriaRole.valueOf(role.toUpperCase()), new Page.GetByRoleOptions().setName(nameElement).setExact(false));
        element.click();
    }

    public void waitAndClickByRoleFirst(String role, String nameElement) {
        Locator element = getBrowserManager().getPage().getByRole(AriaRole.valueOf(role.toUpperCase()), new Page.GetByRoleOptions().setName(nameElement).setExact(true)).first();
        element.click();
    }

    public void waitAndClickByRoleNth(String role, String nameElement, int index) {
        Locator element = getBrowserManager().getPage().getByRole(AriaRole.valueOf(role.toUpperCase()), new Page.GetByRoleOptions().setName(nameElement).setExact(true)).nth(index);
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
        Locator element = getBrowserManager().getPage().getByRole(AriaRole.valueOf(role.toUpperCase()), new Page.GetByRoleOptions().setName(nameElement));
        element.hover();
    }

    public void waitForSelectorVisible(String selector) {
        getBrowserManager().getPage().waitForSelector(selector, new Page.WaitForSelectorOptions().setState(WaitForSelectorState.VISIBLE));
    }

    public void waitForSelectorHidden(String selector) {
        Locator element = getBrowserManager()
                .getPage()
                .locator(selector)
                .filter(new Locator.FilterOptions().setVisible(true))
                .first();
        element.click();
    }

    public void waitForTimeOutElement(double timeout) {
        getBrowserManager().getPage().waitForTimeout(timeout);
    }

    public void waitAndClickFirstByRoleInsideSelector(String selector, String role) {
        Page page = getBrowserManager().getPage();

        Locator container = page.locator(selector);
        Locator element = container.getByRole(AriaRole.valueOf(role.toUpperCase())).first();

        element.waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        element.click();
    }

    public void waitAndClickTextInsideSelector(String selector, String text) {
        Page page = getBrowserManager().getPage();

        Locator container = page.locator(selector);
        Locator element = container.getByText(text, new Locator.GetByTextOptions().setExact(true));

        element.waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        element.click();
    }

    public void selectByLabel(String selector, String label) {
        getBrowserManager().getPage().selectOption(selector, new SelectOption().setLabel(label));
    }

    public void selectByValue(String selector, String value) {
        getBrowserManager().getPage().selectOption(selector, new SelectOption().setValue(value));
    }

    public int randomNumber(int min, int max) {
        int randomNum = (int) (Math.random() * ((max - min) + 1)) + min;
        System.out.println("Random number: " + randomNum);
        return randomNum;
    }


}
