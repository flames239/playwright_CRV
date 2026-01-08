@test-suitMOR @applied-without-login-MOR
Feature: careerviet.vn (MOR) - Kiểm tra chức năng ứng tuyển bên Jobseekers

  Background: Pre condition
    Given tôi truy cập vào trang chủ careerviet (MOR)

  Scenario: Ứng tuyển khi không đăng nhập (không có thư giới thiệu và không lưu hồ sơ)
    When tôi ấn nút tìm viêc (MOR)
    And tôi bấm một job bất kỳ (MOR)
    And mở new tab và ấn nút ứng tuyển (MOR)
    And mở new tab sang page ứng tuyển và tôi bấm upload hồ sơ và kiểm tra contact info được fill chưa (MOR)
    And tôi toggle off lưu hồ sơ (MOR)
    And tôi click thử mã captcha mới (nếu hiển thị - MOR)
    And tôi nhập mã captcha (nếu hiển thị - MOR)
    And tôi click checbox Argee Policy (MOR)
    And tôi click button ứng tuyển (MOR)
    Then tôi kiểm tra xem đã applied thành công hay chưa (MOR)
