@test-suite
Feature: Careerviet.vn/employers Homepage cua Employer

  Background: Pre condition
    Given tôi truy cập trang chủ careerviet (NTD)

  Scenario: truy cập các menu trang chủ CRV Sản Phẩm Và Dịch Vụ (NTD)
    When hover chuột vào menu Sản Phẩm và Dịch Vụ
    And tôi click menu đăng tuyển dụng
    And tôi click menu Tìm Hồ Sơ Ứng Viên
    And tôi click talent solution
    And tôi click Quảng Cáo Tuyển Dụng
    And tôi click Talent Driver
    And tôi click Targeted Email Marketing
    And tôi click Talent Referral
    And tôi click Đăng tuyển dụng và Tìm Hồ Sơ Quốc Tế
    And tôi click Xem tất cả sản phẩm, dịch vụ
    Then Truy cập từng link thành công

  @HRcentral
  Scenario: truy cập các menu trang chủ CRV HRCentral (NTD)
    When hover chuột vào menu HRCentral
    And tôi click menu Dashboad
    And tôi click menu Đăng Tuyển Dụng
    And tôi click menu Tìm Hồ Sơ
    Then Truy cập từng link thành công