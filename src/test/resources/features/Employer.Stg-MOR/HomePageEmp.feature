@test-suite-StgMOR @HomePage-StgMOR
Feature: Homepage cua Employers

  Background: Pre condition
    Given tôi truy cập trang chủ careerviet (NTD) Stg-MOR

  @case-1
  # chưa chay duoc scenario nay do chua hien thi cac product tren FE
  Scenario: truy cập các menu trang chủ CRV Sản Phẩm Và Dịch Vụ (NTD)
    When hover chuột vào menu Sản Phẩm và Dịch Vụ MOR Stg-MOR
    And tôi click menu đăng tuyển dụng MOR Stg-MOR
    And tôi click menu Tìm Hồ Sơ Ứng Viên MOR Stg-MOR
    And tôi click talent solution MOR Stg-MOR
    And tôi click Quảng Cáo Tuyển Dụng MOR Stg-MOR
    And tôi click Talent Driver MOR Stg-MOR
    And tôi click Targeted Email Marketing MOR Stg-MOR
    And tôi click Talent Referral MOR Stg-MOR
    And tôi click Đăng tuyển dụng và Tìm Hồ Sơ Quốc Tế MOR Stg-MOR
    And tôi click Xem tất cả sản phẩm, dịch vụ MOR Stg-MOR
    Then Truy cập từng link thành công MOR Stg-MOR

  @case-2
  Scenario: truy cập các menu trang chủ CRV HRCentral (NTD)
    When hover chuột vào menu HRCentral MOR Stg-MOR
    And tôi click menu Dashboad MOR Stg-MOR
    And tôi click menu Đăng Tuyển Dụng MOR Stg-MOR
    And tôi click menu Tìm Hồ Sơ MOR Stg-MOR
    Then Truy cập từng link thành công MOR Stg-MOR

  @case-3
  Scenario: View Detail Một Resume
    When hover chuột vào menu HRCentral MOR Stg-MOR
    And tôi click menu Tìm Hồ Sơ MOR Stg-MOR
    And tôi search resume Stg-MOR
    And tôi click view detail 1 resume Stg-MOR
    Then tôi được direct về trang đăng nhập Stg-MOR