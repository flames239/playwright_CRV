@savejob
Feature: careerviet.vn - Kiểm tra chức năng đăng ký bên Jobseekers

  Background: Pre condition
    Given tôi truy cập vào trang chủ careerviet
    When khi tôi click linktext Đăng nhập


  Scenario: Login và Tìm Job
    And tôi nhập tài khoản email "<email>"
    And tôi nhập mật khẩu "<password>"
    And tôi bấm nút đăng nhập
    Then tôi sẽ đăng nhập thành công


  Scenario: Tìm Job
    And Tôi click button tìm job
    And Tôi click icon Save job
    Then Popup Save Job Hiển thị


#  Scenario: Kiểm tra job đã lưu vào mục việc làm đã lưu
#    And Tôi hover mục chào ...
#    And Tôi click mục Việc làm đã lưu
#    Then Tôi thấy job đã lưu hiển thị ở mục việc làm đã lưu





