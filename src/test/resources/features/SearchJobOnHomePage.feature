Feature: careerviet.vn - Box search jobs ở trang chủ người tìm việc

  Background: Pre Conditions
    Given Tôi truy cap vào web trang chủ cho người tìm việc

  Scenario: Nhập tiêu đề jobs hợp lý để tìm dữ liệu (không đăng nhập)
    When Tôi nhập tiêu đề job hợp lý de tìm jobs (như nhân viên kinh doanh, devops engineers, automation tester, ..)
    And Tôi ấn nút tìm việc ngay
    Then Hệ thống di chuyển qua page tìm việc làm với dữ liệu jobs hiển thị


  Scenario: Nhập tiêu đề jobs ngẫu nhiên để tìm dữ liệu (không đăng nhập) - nhap du lieu ngau nhien
    When tôi nhập tiêu đề job ngẫu nhiên
    And Tôi ấn nút tìm việc ngay
    Then Hệ thống di chuyển qua page tìm việc làm với dữ liệu jobs hiển thị