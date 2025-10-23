@test-suite-qcMOR @register-jsk-qcMOR
Feature: careerviet.vn qc (MOR) - Kiểm tra chức năng đăng ký bên Jobseekers

  Background: Pre condition
    Given tôi truy cập vào trang chủ careerviet (qc MOR)
    When tôi bấm nút đăng nhập và ấn nút đăng ký (qc MOR)

  Scenario Outline: Kiểm tra data nhập đầu vào ngẫu nhiên
    And tôi nhập Tên ngẫu nhiên (qc MOR)
    And tôi nhập họ và tên lót ngẫu nhiên (qc MOR)
    And tôi nhập email ngẫu nhiên (qc MOR)
    And tôi nhập mật khẩu "<password>" và xác nhận mật khẩu "<confirmpassword>" (qc MOR)
    And tôi tick checkbox điều khoản (qc MOR)
    And tôi ấn nút đăng ký (qc MOR)
    Then kiểm tra tôi đã đăng ký thành công (qc MOR)
    Examples:
      | password | confirmpassword |
      | Abc123   | Abc123          |

  Scenario Outline: Kiểm tra data nhập đầu vào (qc MOR)
    And tôi nhập Tên <Ten> (qc MOR)
    And tôi nhập họ và tên lót "<Ho_va_Ten>" (qc MOR)
    And tôi nhập email "<email>" (qc MOR)
    And tôi nhập mật khẩu "<password>" và xác nhận mật khẩu "<confirmpassword>" (qc MOR)
    And tôi tick checkbox điều khoản (qc MOR)
    And tôi ấn nút đăng ký (qc MOR)
    Then kiểm tra tôi đã đăng ký thành công (qc MOR)
    Examples:
      | Ten  | Ho_va_Ten | email                     | password | confirmpassword |
      | Test | Full name | test_fullname@yopmail.com | Abc123   | Abc123          |
