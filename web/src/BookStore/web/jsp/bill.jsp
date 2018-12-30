<%-- 
    Document   : bill
    Created on : Dec 29, 2018, 6:03:20 PM
    Author     : HOANG
--%>

<%@page import="model.Users"%>
<%@page import="model.BillDetail"%>
<%@page import="java.util.List"%>
<%@page import="dao.BookDAO"%>
<%@page import="model.Bill"%>
<%@page import="dao.BillDetailDAO"%>
<%@page import="dao.BillDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../css/bill.css">
        <title>Hóa đơn</title>
    </head>
    <body>
        <%
            BillDAO billDAO = new BillDAO();
            BillDetailDAO billDetailDAO = new BillDetailDAO();
            BookDAO bookDAO = new BookDAO();
            Bill bill = (Bill) session.getAttribute("bill");
            List<BillDetail> billDetails = billDetailDAO.getListBillDetailByBillID(bill.getBillID());
            Users users = (Users) session.getAttribute("user");
        %>
        <div class="invoice-box">
            <table cellpadding="0" cellspacing="0">
                <tr class="top">
                    <td colspan="5">
                        <table>
                            <tr>
                                <td style="width:12%;">
                                    <img src="../images/logo.png" style="width: 100%;">
                                </td>

                                <td class="title">

                                    <strong>
                                        <br>
                                        <br>
                                        <br>
                                        <br>
                                        Nhà sách Hoàng Long
                                    </strong>
                                </td>
                                <td>

                                </td>
                                <td>

                                </td>
                                <td>

                                </td>
                                <td>
                                    <p style="text-align: right;">
                                        Mã hóa đơn: <%=bill.getBillID()%><br>
                                        Ngày tạo: <%=bill.getDate()%><br>
                                    </p>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>

                <tr class="information">
                    <td colspan="5">
                        <table>
                            <tr>
                                <td>
                                    Địa chỉ: Km 10 Nguyễn Trãi, Hà Đông, Hà Nội <br>
                                    Điện thoại: 0967491368 <br>
                                    Email: nshoanglong@gmail.com
                                </td>
                                <td>

                                </td>
                                <td>

                                </td>
                                <td>

                                </td>
                                <td>
                                    Mã khách hàng: <%=users.getUserID()%><br>
                                    Tên khách hàng: <%=users.getUserName()%><br>
                                    Email: <%=users.getUserEmail()%><br>
                                    Địa chỉ giao hàng: <%=bill.getAddress()%>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>




            </table>
            <table cellpadding="0" cellspacing="0">
                <tr class="heading">
                    <td style="width:30%;">
                        Phương thức thanh toán
                    </td>

                    <td>

                    </td>
                    <td>

                    </td>
                    <td>

                    </td>
                    <td>

                    </td>
                </tr>

                <tr class="details">
                    <td>
                        <%=bill.getPayment()%>
                    </td>
                </tr>
            </table>
            <table>
                <tr class="heading">
                    <td style="width: 7%;">
                        STT
                    </td>
                    <td style="width:45%">
                        Sách
                    </td>

                    <td>
                        Đơn giá
                    </td>

                    <td>
                        Số lượng
                    </td>

                    <td>
                        Thành tiền
                    </td>
                </tr>
                <%
                    for (int i = 0; i < billDetails.size(); i++) {
                %>
                <tr class="item">
                    <td>
                        <%=i + 1%>
                    </td>
                    <td>
                        <%=bookDAO.getBook(billDetails.get(i).getProductID()).getName()%>
                    </td>
                    <td>
                        <%=bookDAO.getBook(billDetails.get(i).getProductID()).getPrice()%>
                    </td>

                    <td>
                        <%=billDetails.get(i).getQuantity()%>
                    </td>

                    <td>
                        <%=billDetails.get(i).getPrice() * billDetails.get(i).getQuantity()%>
                    </td>
                </tr>
                <%
                    }
                %>
                <tr class="total">
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>

                    <td>
                        <%="Tổng: " + bill.getTotal()%>
                    </td>
                </tr>
            </table>
        </div>
        <div id="abc" style="text-align: center;">
            <p><!-- Click the button to print the current page. --></p>
            <br>
             <a href="../jsp/index.jsp"><button>Trang chủ</button></a>

            <button onclick="myFunction()">In Hóa Đơn</button>
            <br>
            <br>
            <br>
            <br>
        </div>
    <script>
        function myFunction() {
            document.getElementById('abc').style.display = 'none';
            window.print();
            document.getElementById('abc').style.display = 'block';
        }
    </script>
</body>
</html>
