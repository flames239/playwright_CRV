@test-suite-qcMOR @TestDisc-qcMOR
Feature: Careerviet.vn (qc MOR) - làm bài test DISC
  Background: Pre condition
    Given tôi truy cập vào trang chủ careerviet (qc MOR)

  Scenario: Làm bài test DISC (qc MOR)
    When tôi click vào menu Test DISC (qc MOR)
    And tôi click button làm bài test (qc MOR)
    And tôi làm bài test (qc MOR)
    And tôi nhập họ và tên ngẫu nhiên (qc MOR)
    And tôi nhập email DISC (qc MOR)
    And tôi nhập số điện thoại ngẫu nhiên (qc MOR)
    And tôi nhập công việc ngẫu nhiên (qc MOR)
    And tôi bấm nút xác nhận (qc MOR)
    Then tôi xem được kết quả DISC (qc MOR)