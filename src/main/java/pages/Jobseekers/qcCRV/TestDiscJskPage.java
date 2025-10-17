package pages.Jobseekers.qcCRV;

import browser.BrowserManager;
import net.datafaker.Faker;
import pages.base.BasePage;

import java.util.Random;

public class TestDiscJskPage extends BasePage {


    public TestDiscJskPage(BrowserManager browserManager) {
        super(browserManager);
    }

    public Faker faker = new Faker();

    public void clickMenuTestDisc() {
        waitAndHover("button", "Tiện Ích");
        waitForTimeOutElement(1_000);
        waitAndClickByRole("link", "Test DISC",true);
        waitForTimeOutElement(2_000);
    }

    public void clickBtnTestDisc() {
        waitAndClickSelector("//div[@class='action']/a[contains(text(),'Làm bài test ngay')]");
        waitForTimeOutElement(1_000);
    }

    public void takeATestDisc() {
        // chạy vong lặp qua 24 cau hoi
        for (int questionNum = 1; questionNum <= 24; questionNum++) {

            // khai bao bien tra loi cho Most va Least
            int most, least;
            Random random = new Random();

            // Đợi câu hỏi xuất hiện
            String questionSelector = "#question_" + questionNum;
            waitForSelectorVisible(questionSelector);

            // Luôn tạo random data đến khi giá trị khong trùng nhau
            do {
                int baseValue = (questionNum - 1) * 4; // ví dụ: question 2 → baseValue = 4
                most = baseValue + random.nextInt(4) + 1;   // 1 to 4
                least = baseValue + random.nextInt(4) + 1;
            } while (most == least);

            // Xây selector strings element
            String mostSelector = "//input[@name='most-" + questionNum + "'][@value='" + most + "']";
            String leastSelector = "//input[@name='least-" + questionNum + "'][@value='" + least + "']";

            // Ấn kết quả
            waitForSelectorHidden(mostSelector);
            waitForTimeOutElement(100);
            waitForSelectorHidden(leastSelector);


            waitForSelectorHidden("//a[@class='next']"); // Ấn "Tiếp Theo" để qua câu tiếp theo
            waitForTimeOutElement(250);

            System.out.println("Question " + questionNum + ": MOST= " + most + ", LEAST= " + least);


            // Lựa chon khác: đợi câu hỏi khác hiển thị (trừ khi đã là câu hỏi cuối)
            if (questionNum < 24) {
                waitForSelectorVisible("#question_" + (questionNum + 1));
            }
        }
    }

    public void inputFullNameRandom() {
        String fullname = faker.name().fullName();
        fillField("#fullname", fullname);
    }

    public void inputPhoneNumberRandom() {
        String phoneNumber = faker.phoneNumber().cellPhone();
        fillField("#phone", phoneNumber);
    }

    public void inputJobPosition(String jobPosition) {
        fillField("//input[@id='downshift-«r6u»-input']", jobPosition);
    }

    public void tickChkBoxAgreePolicy() {
        waitAndClickSelector("//div[@class='test-disc-working']");
        waitAndClickSelector("#hideinfor");
        waitForTimeOutElement(1_000);
    }

    public void clickButtonViewResult() {
        waitAndClickByRole("button", "Kết quả",true);
        waitForTimeOutElement(1_000);
    }
}
