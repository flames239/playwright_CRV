@test-suite @register-jsk
Feature: careerviet.vn - Kiểm tra chức năng đăng ký bên Jobseekers

  Background: Pre condition
    Given tôi truy cập vào trang chủ careerviet
    When tôi bấm nút đăng nhập và ấn nút đăng ký

  Scenario: Kiểm tra data nhập đầu vào ngẫu nhiên
    And tôi nhập Tên ngẫu nhiên
    And tôi nhập họ và tên lót ngẫu nhiên
    And tôi nhập email ngẫu nhiên
    And tôi nhập mật khẩu "<password>" và xác nhận mật khẩu "<confirmpassword>"
    And tôi tick checkbox điều khoản
    And tôi ấn nút đăng ký
    Then kiểm tra tôi đã đăng ký thành công

  Scenario Outline: Kiểm tra data nhập đầu vào
    And tôi nhập Tên <Ten>
    And tôi nhập họ và tên lót "<Ho_va_Ten>"
    And tôi nhập email "<email>"
    And tôi nhập mật khẩu "<password>" và xác nhận mật khẩu "<confirmpassword>"
    And tôi tick checkbox điều khoản
    And tôi ấn nút đăng ký
    Then kiểm tra tôi đã đăng ký thành công

    Examples:
      | Ten  | Ho_va_Ten | email                     | password | confirmpassword |
      | Test | Full name | test_fullname@yopmail.com | Abc123   | Abc123          |
