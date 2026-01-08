@test-suite-MOR @TestDisc-MOR
Feature: Careerviet.vn (qc MOR) - làm bài test DISC
  Background: Pre condition
    Given tôi truy cập vào trang chủ careerviet (MOR)

  Scenario: Làm bài test DISC (MOR)
    When tôi click vào menu Test DISC (MOR)
    And tôi click button làm bài test (MOR)
    And tôi làm bài test (MOR)
    And tôi nhập họ và tên ngẫu nhiên (MOR)
    And tôi nhập email DISC (MOR)
    And tôi nhập số điện thoại ngẫu nhiên (MOR)
    And tôi nhập công việc ngẫu nhiên (MOR)
    And tôi bấm nút xác nhận (MOR)
    Then tôi xem được kết quả DISC (MOR)