BÁO CÁO BÀI TẬP LỚN MÔN LẬP TRÌNH WEB
HỌC KỲ I NĂM HỌC 2018 – 2019
Nhóm: 2 Tổ: 16
Đề tài: Web bán sách


Thành viên:
1. Họ và tên: Hoàng Văn Hiệp 			Mã sinh viên: B15DCCN207
2. Họ và tên: Nguyễn Thành Long 		Mã sinh viên: B15DCCN317
3. Họ và tên: Trịnh Văn Lực			Mã sinh viên: B15DCCN328

Nội dung
I. Giới thiệu sơ lược chủ đề
a. Mục tiêu
- Xây dựng được web bán sách online cơ bản hoàn thành nghiệp vụ bán hàng như xem, mua sách, đặt đơn hàng và thanh toán. 
- Ngoài ra còn sử dụng một số kĩ thuật để trang web thân thiện hơn với người dùng như search sản phẩm không cần load lại trang, tự động load thêm sản phẩm khi hết page,...
b. Kết quả đã đạt được
- Trang web đã cơ bản hoàn thành được những nghiệp vụ bán hàng cần thiết, áp dụng được những kĩ thuật như ajax, jquery giúp trang web thân thiện với người dùng.
c. Hạn chế, hướng phát triển
- Trang web còn nhiều hạn chế, mới chỉ dừng lại ở mức cơ bản, chưa chi tiết, chưa hoàn thành hết các chức năng có mặt trên giao diện, giao diện chưa thực sự tối ưu
- Chưa bắt chi tiết các ngoại lệ trong quá trình xử lý dẫn đến một số trường hợp có thể gây ra lỗi.
II. Phân công công việc
STT	Họ tên	Các nội dung thực hiện	Đánh giá
1.	Hoàng Văn Hiệp	- Xây dựng phần backend: kết nối database, xây dựng model, dao, servlet, xử lý jsp cho các đối tượng lên giao diện. 
- Xử lý một số chức năng liên quan đến ajax: search autocomplete, loadmore,...	Đã hoàn thành đầy đủ
2.	Nguyễn Thành Long	- Xây dựng, thiết kế phần giao diện cho trang web sử dụng html, css, framework bootstrap
	Đã hoàn thành đầy đủ
3.	Trịnh Văn Lực	- Tìm hình ảnh, xây dựng database, nghiên cứu giao diện
	Đã hoàn thành đầy đủ

III. Quá trình thực hiện:
1.	1.0
	- Button login khi bị che thì chuyển thành icon luôn nằm ở góc trái màn hình
- Ảnh sách và nội dung mô tả có kích thước như nhau không phụ thuộc kích thước màn hình
- Top menu khi không đủ diện tích và kích thước thì chuyển thành dạng icon, nếu vẫn không 
đủ thì ẩn dần từ trái qua phải	
* Xử lý:
- Bắt sự kiện bằng javascript
- Set thuộc tính width của ảnh và nội dung bằng nhau
- Sử dụng truy vẫn media screen với các kích thước khác nhau hiển thị cho mỗi icon
2.	1.1
- Cho phép người dùng đánh giá sách (sao) và lưu 
thông tin đánh giá: lần tới truy cập thì vẫn còn.
- Chức năng tìm kiếm sách cho phép hỗ trợ hiển thị 
các sách phù hợp ngay khi nhập (ajax).
- Cho phép người dùng tải thêm sách khi 
sử dụng scroll kéo	
* Xử lý:
- Sử dụng lưu cookie để lưu lại thông tin đánh giá của người dùng
- Sử dụng ajax lấy dữ liệu trên serlvet
- Sử dụng ajax lấy dữ liệu trên servlet	- OK	- …
3.	1.2
- Hoàn thiện nghiệp vụ bán hàng cho phép lọc sách
(theo thể loại, tác giả, nhà xuất bản,...), giỏ hàng,
thanh toán và in hóa đơn cho phép người dùng in trực tiếp
hóa đơn bằng html hoặc gửi qua email cho người dùng.
- Cho phép khuyến nghị các sách nên mua kèm khi
người dùng chọn mua một sách nào đó
- Chức năng báo cáo thống kê cho phép thống kê sách 
bán chạy theo ngày, tuần, tháng và xuất ra excel
(top 10 sản phẩm) (Biểu đồ)	
* Xử lý:
- Sử dụng dao truy vấn đến các đổi tượng, sử dụng servlet để gửi nhận dữ liệu, tạo các giao diện cần thiết bằng html, css
- Khuyến nghị các sách có cùng thể loại với sách đang xem
- Sử dụng POI của Apache để ghi dữ liệu ra excel
- Sử dụng google chart để vẽ biểu đồ
* Hạn chế:
- Có một số ngoại lệ chưa xử lý triệt để
- Chưa có thuật toán tối ưu khuyến nghị các sách nên mua
- Giao diện đang còn sơ sài, chưa có trang admin quản lý các vấn đề khác	
