@test-suite @TestDisc
Feature: Careerviet.vn - làm bài test DISC
  Background: Pre condition
    Given tôi truy cập vào trang chủ careerviet

  Scenario: Làm bài test DISC
    When tôi click vào menu Test DISC
    And tôi click button làm bài test
    And tôi làm bài test
    And tôi nhập họ và tên ngẫu nhiên
    And tôi nhập email ngẫu nhiên
    And tôi nhập số điện thoại ngẫu nhiên
    And tôi nhập công việc ngẫu nhiên
    And tôi bấm nút xác nhận
    Then tôi xem được kết quả DISC