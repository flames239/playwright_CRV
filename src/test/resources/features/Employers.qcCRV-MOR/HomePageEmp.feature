@test-suite
Feature: qccrv.dev/employers Homepage cua Employer

  Background: Pre condition
    Given tôi truy cập trang chủ qcMORcareerviet (NTD)

  # chưa chay duoc scenario nay do chua hien thi cac product tren FE
  Scenario: truy cập các menu trang chủ CRV Sản Phẩm Và Dịch Vụ (NTD)
    When hover chuột vào menu Sản Phẩm và Dịch Vụ qcMOR
    And tôi click menu đăng tuyển dụng qcMOR
    And tôi click menu Tìm Hồ Sơ Ứng Viên qcMOR
    And tôi click talent solution qcMOR
    And tôi click Quảng Cáo Tuyển Dụng qcMOR
    And tôi click Talent Driver qcMOR
    And tôi click Targeted Email Marketing qcMOR
    And tôi click Talent Referral qcMOR
    And tôi click Đăng tuyển dụng và Tìm Hồ Sơ Quốc Tế qcMOR
    And tôi click Xem tất cả sản phẩm, dịch vụ qcMOR
    Then Truy cập từng link thành công qcMOR

  @chua-login
  Scenario: truy cập các menu trang chủ CRV HRCentral (NTD)
    When hover chuột vào menu HRCentral qcMOR
    And tôi click menu Dashboad qcMOR
    And tôi click menu Đăng Tuyển Dụng qcMOR
    #And tôi click menu Tìm Hồ Sơ qcMOR
    Then Truy cập từng link thành công qcMOR