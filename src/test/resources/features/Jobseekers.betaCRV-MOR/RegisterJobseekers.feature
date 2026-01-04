@test-suite-MOR @register-jsk-MOR
Feature: careerviet.vn (MOR) - Kiểm tra chức năng đăng ký bên Jobseekers

  Background: Pre condition
    Given tôi truy cập vào trang chủ careerviet (MOR)
    When tôi bấm nút đăng nhập và ấn nút đăng ký (MOR)

  Scenario Outline: Kiểm tra data nhập đầu vào ngẫu nhiên
    And tôi nhập Tên ngẫu nhiên (MOR)
    And tôi nhập họ và tên lót ngẫu nhiên (MOR)
    And tôi nhập email ngẫu nhiên (MOR)
    And tôi nhập mật khẩu "<password>" và xác nhận mật khẩu "<confirmpassword>" (MOR)
    And tôi tick checkbox điều khoản (MOR)
    And tôi ấn nút đăng ký (MOR)
    Then kiểm tra tôi đã đăng ký thành công (MOR)
    Examples:
      | password | confirmpassword |
      | Abc123   | Abc123          |

  Scenario Outline: Kiểm tra data nhập đầu vào (MOR)
    And tôi nhập Tên <Ten> (MOR)
    And tôi nhập họ và tên lót "<Ho_va_Ten>" (MOR)
    And tôi nhập email "<email>" (MOR)
    And tôi nhập mật khẩu "<password>" và xác nhận mật khẩu "<confirmpassword>" (MOR)
    And tôi tick checkbox điều khoản (MOR)
    And tôi ấn nút đăng ký (MOR)
    Then kiểm tra tôi đã đăng ký thành công (MOR)
    Examples:
      | Ten  | Ho_va_Ten | email                     | password | confirmpassword |
      | Test | Full name | test_fullname@yopmail.com | Abc123   | Abc123          |
