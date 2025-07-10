package context;

public class Context {
    // Biến ThreadLocal để chứa dữ liệu ngẫu nhiên cho mỗi thread, tự khởi tạo đến khi null
    private final ThreadLocal<String> randomEmail = ThreadLocal.withInitial(() -> null);
    private final ThreadLocal<String> randomFirstName = ThreadLocal.withInitial(() -> null);
    private final ThreadLocal<String> randomLastName = ThreadLocal.withInitial(() -> null);
    private final ThreadLocal<String> randomPassword = ThreadLocal.withInitial(() -> null);

    public String getRandomLastName() {
        return randomLastName.get();
    }

    public String getRandomFirstName() {
        return randomFirstName.get();
    }

    public String getRandomEmail() {
        return randomEmail.get();
    }

    public String getRandomPwd() {
        return randomPassword.get();
    }


    public void setRandomFirstName(String randomFirstName) {
        this.randomFirstName.set(randomFirstName);
    }

    public void setRandomLastName(String randomLastName) {
        this.randomLastName.set(randomLastName);
    }


    public void setRandomEmail(String randomEmail) {
        this.randomEmail.set(randomEmail);
    }

    public void setRandomPwd(String randomPassword) {
        this.randomPassword.set(randomPassword);
    }
}

