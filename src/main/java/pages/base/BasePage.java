package pages.base;

import browser.BrowserManager;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.LoadState;
import com.microsoft.playwright.options.SelectOption;
import com.microsoft.playwright.options.WaitForSelectorState;

import java.nio.file.Paths;
import java.util.concurrent.ThreadLocalRandom;

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
        waitAndClickByRole(role, nameElement, false, null);
    }

    public void waitAndClickByRole(String role, String nameElement, boolean exact) {
        waitAndClickByRole(role, nameElement, exact, null);
    }

    public void waitAndClickByRole(String role, String nameElement, boolean exact, Integer index) {
        Locator locator = getBrowserManager()
                .getPage()
                .getByRole(
                        AriaRole.valueOf(role.toUpperCase()),
                        new Page.GetByRoleOptions().setName(nameElement).setExact(exact)
                );

        if (index != null) {
            locator = (index == 0) ? locator.first() : locator.nth(index);
        }

        locator.waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        locator.click();
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
        waitAndHover(
                getBrowserManager()
                        .getPage()
                        .getByRole(AriaRole.valueOf(role.toUpperCase()), new Page.GetByRoleOptions().setName(nameElement))
        );
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

    public void waitForElementSelector(String selector, double timeoutInSeconds) {
        getBrowserManager().getPage().locator(selector).waitFor(
                new Locator.WaitForOptions()
                        .setTimeout((int) (timeoutInSeconds * 1000))
                        .setState(WaitForSelectorState.VISIBLE)
        );
    }

    public void waitForElementByRole(String role, String nameElement, double timeoutInSeconds) {
        Locator locator = getBrowserManager()
                .getPage()
                .getByRole(
                        AriaRole.valueOf(role.toUpperCase()),
                        new Page.GetByRoleOptions().setName(nameElement)
                );

        locator.waitFor(new Locator.WaitForOptions()
                .setTimeout((int) (timeoutInSeconds * 1000))
                .setState(WaitForSelectorState.VISIBLE));
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
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println("Random number: " + randomNum);
        return randomNum;
    }

    // Phuong thuc check so ngau nhien trong so bi loai
    public boolean isEliminated(int num, int[] eliminateArray) {
        for (int eliminated : eliminateArray) {
            if (eliminated == num) {
                return true;
            }
        }
        return false;
    }

    // phuong thuc assert URL khi click new Tab
    public void clickAndAssertUrlNewTab(String selector, String ExpertUrl) {
        // Chứa page hiện tại
        Page mainPage = getBrowserManager().getPage();

        // Ấn và đợi new tab
        Page newPage = getBrowserManager().getPage().waitForPopup(() -> {
            mainPage.locator(selector).click();
        });

        // đợi new tab load hoàn toàn
        newPage.waitForLoadState();
        mainPage.waitForTimeout(1_000);

        // Assert the URL (Hỗ trợ URL chính xác hoặc tương đối)
        String actualUrl = newPage.url();
        if (!actualUrl.equals(ExpertUrl) && !actualUrl.startsWith(ExpertUrl)) {
            throw new AssertionError("Expected URL: " + ExpertUrl + " but was: " + actualUrl);
        }
        newPage.close();
    }

    // phuong thuc assert URL khi direct tới URL đó không cần close
    public void clickAndAssertUrl(String selector, String ExpertUrl) {
        Page mainPage = getBrowserManager().getPage();
        mainPage.locator(selector).click();
        mainPage.waitForLoadState();

        // Assert the URL (Hỗ trợ URL chính xác hoặc tương đối)
        String actualUrl = mainPage.url();

        if (!actualUrl.equals(ExpertUrl)) {
            throw new AssertionError("Expected URL: " + ExpertUrl + " but was: " + getBrowserManager().getPage().url());
        }
    }

    public Page clickAndSwitchToNewTab(String selector) {
        Page currentPage = getBrowserManager().getPage();
        BrowserContext context = currentPage.context();
        int oldPageCount = context.pages().size();

        // Đợi cho popup (new tab) được mở trước khi click
        Page newTab = context.waitForPage(() -> {
            currentPage.click(selector);
        });

        // Đợi đến khi DOM new page load hoàn toàn
        newTab.waitForLoadState(LoadState.DOMCONTENTLOADED);

        // Update the BrowserManager's current page to the new tab
        getBrowserManager().pushPage(newTab);

        return newTab;
    }

    // Xu ly upload file truc tiep tu may tinh
    public void uploadFile(String selector, String filePath) {
        getBrowserManager()
                .getPage()
                .setInputFiles(selector, Paths.get(filePath));
    }

    protected void fillIfEmpty(Page page, String selector, String value) {
        Locator field = page.locator(selector);
        String currentValue = "";
        try {
            currentValue = field.inputValue().trim();
        } catch (Exception e) {
            System.out.println("Could not get value for: " + selector + " → " + e.getMessage());
        }

        // Check if this field needs clearing regardless of its current state
        boolean shouldAlwaysClear = selector.equals("#firstname") || selector.equals("#email");

        if (shouldAlwaysClear) {
            System.out.println("Clearing field: " + selector);
            System.out.println("Resetting field: " + selector);
            field.clear();
            field.fill(value);
            System.out.println("Cleared and filled: " + selector + " → " + value);
        } else if (currentValue.isEmpty()) {
            field.fill(value);
            System.out.println("Filled missing field: " + selector + " → " + value);
        } else {
            System.out.println("Field already filled: " + selector + " → " + currentValue);
        }
    }

}
