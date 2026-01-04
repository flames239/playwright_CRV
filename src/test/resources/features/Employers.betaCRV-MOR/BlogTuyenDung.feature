@test-suite @HiringSite-CamNangTuyenDung
Feature: Page Cẩm Nang Tuyển Dụng của Employer

  Background: Pre condition
    Given tôi truy cập trang chủ careerviet (NTD)
    When tôi ấn menu Cẩm nang tuyển dụng

  Scenario: Truy cập vao blog cẩm nang tuyển dụng
    Then tôi truy cập page thành công

  Scenario: Tìm kiếm blog cẩm nang tuyển dụng
    And Tôi nhập keyword tìm bài blog
    And Tôi ấn nút tìm kiếm
    Then tôi thấy các bài blog liên quan

  Scenario: Không tìm thấy blog nào trong cẩm nang tuyển dụng
    And Tôi nhập keyword không tồn tại bài blog nào
    Then Tôi thấy page không tìm thấy bài blog

  Scenario: Truy cập vào các mục category trong blog
    And tôi ấn menu các categoty trong page Cẩm nang tuyển dụng
    Then tôi truy cập được các mục category trong page Cẩm nang tuyển dụng