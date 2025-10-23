@test-suite-qcMOR @applied-without-login-qcMOR
Feature: careerviet.vn (qc MOR) - Kiểm tra chức năng ứng tuyển bên Jobseekers

  Background: Pre condition
    Given tôi truy cập vào trang chủ careerviet (qc MOR)

  Scenario: Ứng tuyển khi không đăng nhập (không có thư giới thiệu và không lưu hồ sơ)
    When tôi ấn nút tìm viêc (qcMOR)
    And tôi bấm một job bất kỳ (qcMOR)
    And mở new tab và ấn nút ứng tuyển (qcMOR)
    And mở new tab sang page ứng tuyển và tôi bấm upload hồ sơ và kiểm tra contact info được fill chưa (qcMOR)
    And tôi toggle off lưu hồ sơ (qcMOR)
    And tôi click thử mã captcha mới (nếu hiển thị - qcMOR)
    And tôi nhập mã captcha (nếu hiển thị - qcMOR)
    And tôi click checbox Argee Policy (qcMOR)
    And tôi click button ứng tuyển (qcMOR)
    Then tôi kiểm tra xem đã applied thành công hay chưa (qcMOR)
