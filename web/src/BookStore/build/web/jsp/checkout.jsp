<%-- 
    Document   : checkout
    Created on : Dec 28, 2018, 2:31:58 AM
    Author     : HOANG
--%>

<%@page import="model.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1"> 
	<link rel="stylesheet" type="text/css" href="../css/style.css">
	<link rel="stylesheet" href="../template/vendor/bootstrap.css">
	<link rel="stylesheet" href="../css/checkout.css">
        <title>Thanh toán</title>
    </head>
    <body>
        <%
            Users users = (Users) session.getAttribute("user");
            if (users == null) {
                response.sendRedirect("../jsp/login.jsp");
            }
        %>
        <jsp:include page="header.jsp"></jsp:include> 
        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                </div>
                <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                    <div class="account">

                        <form class="form_checkout" action="../CheckOutServlet" method="POST">
                            <h2 class="account-in">Thanh toán</h2>
                            <div>
                                <span class="word">Address * :</span>
                                <input type="text" name="address" id="address" style="text-indent: 8px">
                            </div>  
                            <div>
                                <span class="tt">Payment * :</span>
                                <select class="op" name="payment">
                                    <option value="Qua thẻ ngân hàng"> Qua thẻ ngân hàng</option>
                                    <option value="Thanh toán trực tiếp"> Thanh toán trực tiếp</option>
                                </select>
                            </div>          
                            <input type="submit" value="Thanh toán" class="submit_checkout"> 
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include> 
    </body>
</html>
