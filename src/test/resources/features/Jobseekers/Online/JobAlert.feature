@test-suite @jobalert
Feature: Careerviet.vn - Tạo Job Alert

  Background: Pre condition
    Given tôi truy cập vào trang chủ careerviet

    Scenario: Tạo Job Alert
      Then tôi click tạo thông báo việc làm
      And tôi nhập chức danh, vị trí
      And tôi chọn Ngành nghề
      And tôi chọn Nơi làm việc
      And tôi chọn Mức lương
      And tôi chọn Cấp bậc
      And tôi chọn thời gian nhận email
      And tôi nhập email
      And tôi click checkbox policy
      And tôi click nút nhận email
      Then tôi tạo thành công job alert (thông báo việc làm)