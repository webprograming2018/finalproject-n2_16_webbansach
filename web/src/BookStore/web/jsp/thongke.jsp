<%-- 
    Document   : thongke
    Created on : Dec 30, 2018, 3:34:32 AM
    Author     : HOANG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thống kê</title>
    </head>
    <body>
        <h1>Thống kê sách bán chạy</h1>
        <form action="../ThongKeServlet" method="GET">
            Chọn ngày <input type="date" name="day">
            <input type="submit">
        </form>
        <form action="../ChartServlet" method="GET">
            Chọn ngày <input type="date" name="day">
            <input type="submit" value="Xem biểu đồ">
        </form>
    </body>
</html>
