package pages.Jobseekers.Online;

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
        waitAndClickByRole("link", "Test DISC");
        waitForTimeOutElement(1_000);
    }

    public void clickBtnTestDisc() {
        waitAndClickByRoleFirst("link", "Làm bài test ngay");
        waitForTimeOutElement(1_000);
    }

    public void takeATestDisc() {
        for (int questionNum = 1; questionNum <= 24; questionNum++) {
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
            String mostSelector = "//input[@name='question_" + questionNum + "_most'][@value='" + most + "']";
            String leastSelector = "//input[@name='question_" + questionNum + "_least'][@value='" + least + "']";

            // Ấn kết quả
            waitAndClickSelector(mostSelector);
            waitAndClickSelector(leastSelector);

            waitForSelectorHidden("//a[@class='next']"); // Ấn "Tiếp Theo" để qua câu tiếp theo
            waitForTimeOutElement(500);

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
        fillField("#jobposition", jobPosition);
    }

    public void tickChkBoxAgreePolicy() {
        waitAndClickSelector("#hideinfor");
        waitForTimeOutElement(1_000);
    }

    public void clickButtonViewResult() {
        waitAndClickByRole("button", "Kết quả");
        waitForTimeOutElement(1_000);
    }
}
