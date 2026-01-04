@test-suite @HomePage
Feature: Homepage cua Employer

  Background: Pre condition
    Given tôi truy cập trang chủ careerviet (NTD)

  # chưa chay duoc scenario nay do chua hien thi cac product tren FE
  Scenario: truy cập các menu trang chủ CRV Sản Phẩm Và Dịch Vụ (NTD)
    When hover chuột vào menu Sản Phẩm và Dịch Vụ MOR
    And tôi click menu đăng tuyển dụng MOR
    And tôi click menu Tìm Hồ Sơ Ứng Viên MOR
    And tôi click talent solution MOR
    And tôi click Quảng Cáo Tuyển Dụng MOR
    And tôi click Talent Driver MOR
    And tôi click Targeted Email Marketing MOR
    And tôi click Talent Referral MOR
    And tôi click Đăng tuyển dụng và Tìm Hồ Sơ Quốc Tế MOR
    And tôi click Xem tất cả sản phẩm, dịch vụ MOR
    Then Truy cập từng link thành công MOR

  @chua-login
  Scenario: truy cập các menu trang chủ CRV HRCentral (NTD)
    When hover chuột vào menu HRCentral MOR
    And tôi click menu Dashboad MOR
    And tôi click menu Đăng Tuyển Dụng MOR
    And tôi click menu Tìm Hồ Sơ MOR
    Then Truy cập từng link thành công MOR