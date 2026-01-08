@test-suite-MOR @searchJob
Feature: careerviet.vn - Box search jobs ở trang chủ người tìm việc

  Background: Pre Conditions
    Given Tôi truy cap vào web trang chủ cho người tìm việc (MOR)

  Scenario: Nhập tiêu đề jobs hợp lý để tìm dữ liệu (không đăng nhập)
    When Tôi nhập tiêu đề job hợp lý de tìm jobs (như nhân viên kinh doanh, devops engineers, automation tester, ..) (MOR)
    And Tôi ấn nút tìm việc ngay (MOR)
    Then Hệ thống di chuyển qua page tìm việc làm với dữ liệu jobs hiển thị (MOR)


  Scenario: Nhập tiêu đề jobs ngẫu nhiên để tìm dữ liệu (không đăng nhập) - nhap du lieu ngau nhien
    When tôi nhập tiêu đề job ngẫu nhiên (MOR)
    And Tôi ấn nút tìm việc ngay (MOR)
    Then Hệ thống di chuyển qua page tìm việc làm với dữ liệu jobs hiển thị (MOR)