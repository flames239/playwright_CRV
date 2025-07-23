@test-suite @login
Feature: Careerviet.vn - JSK login

  Background: Pre condition
    Given tôi truy cập vào trang chủ careerviet
    When khi tôi click linktext Đăng nhập

  Scenario Outline: Kiểm tra trường hợp đăng nhập hợp lệ
    And tôi nhập tài khoản email "<email>"
    And tôi nhập mật khẩu "<password>"
    And tôi bấm nút đăng nhập
    Then tôi sẽ đăng nhập thành công
    Examples:
      | email            | password |
      | haha@yopmail.com | Abc123   |

  @smoke
  Scenario Outline: Kiểm tra trường hợp đăng nhập thất bại
    And tôi nhập tài khoản email sai "<email>"
    And tôi nhập mật khẩu sai "<password>"
    And tôi bấm nút đăng nhập
    Then đăng nhập không thành công
    Examples:
      | email              | password |
      | ngan62@yopmail.com | @$@@dvv  |

  @randomData
  Scenario: Kiểm tra trường hợp đăng nhập với email ngẫu nhiên và mật khẩu ngẫu nhiên
    And tôi nhập tài khoản email ngẫu nhiên
    And tôi nhập mật khẩu ngẫu nhiên
    And tôi bấm nút đăng nhập
    Then đăng nhập không thành công
