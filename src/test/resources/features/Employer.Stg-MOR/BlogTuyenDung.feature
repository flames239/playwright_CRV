@test-suite-StgMOR @HiringSite-CamNangTuyenDung-StgMOR
Feature: Page Cẩm Nang Tuyển Dụng của Employer

  Background: Pre condition
    Given tôi truy cập trang chủ careerviet (NTD) Stg-MOR
    When tôi ấn menu Cẩm nang tuyển dụng Stg-MOR

  Scenario: Truy cập vao blog cẩm nang tuyển dụng
    Then tôi truy cập page thành công Stg-MOR


  Scenario: Tìm kiếm blog cẩm nang tuyển dụng
    And Tôi nhập keyword tìm bài blog Stg-MOR
    And Tôi ấn nút tìm kiếm Stg-MOR
    Then tôi thấy các bài blog liên quan Stg-MOR

  Scenario: Không tìm thấy blog nào trong cẩm nang tuyển dụng
    And Tôi nhập keyword không tồn tại bài blog nào Stg-MOR
    Then Tôi thấy page không tìm thấy bài blog Stg-MOR

  Scenario: Truy cập vào các mục category trong blog
    And tôi ấn menu các categoty trong page Cẩm nang tuyển dụng Stg-MOR
#    Then tôi truy cập được các mục category trong page Cẩm nang tuyển dụng Stg-MOR