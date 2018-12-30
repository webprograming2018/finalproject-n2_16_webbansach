<%-- 
    Document   : login
    Created on : Dec 26, 2018, 11:44:58 AM
    Author     : HOANG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../css/login.css">
        <title>Login</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <div id="id1" class="container-fluid">
                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                        <form action="../UserServlet" method="POST">
                            <h2 style="font-size: 30px">Đăng nhập</h2>
                            <div id='arrow'></div>
                            <input name="user_name" id="user_name" placeholder='Username' type='text'>
                            <input name="pass" id="pass" placeholder='Password' type='password'>
                            <input type="hidden" value="login" name="command">
                            <button  id="button_span" type='submit'>
                                <span id="span1">
                                    Đăng nhập
                                </span>
                            </button>
                            <button id="button_span1" >
                                <span>
                                    <a href="register.jsp" style="color: white; text-decoration: none">Đăng ký</a>
                                </span>
                            </button>

                        </form>
                    </div>
                </div>
            </div>

        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
