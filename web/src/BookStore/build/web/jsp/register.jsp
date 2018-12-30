<%-- 
    Document   : register
    Created on : Dec 26, 2018, 11:55:20 AM
    Author     : HOANG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <link rel="stylesheet" type="text/css" href="../css/login.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                var x_timer;
                $("#user_name").keyup(function (e) {
                    clearTimeout(x_timer);
                    var user_name = $(this).val();
                    x_timer = setTimeout(function () {
                        check_username_ajax(user_name);
                    }, 1000);
                });

                function check_username_ajax(user_name) {
                    $("#user-result").html('<img class="checkimg" src="../images/ajax-loader.gif" />');
                    $.post('../CheckAccount', {'user_name': user_name}, function (data) {
                        $("#user-result").html(data);
                    });
                }
            });
        </script>
        <script type="text/javascript">
            $(document).ready(function () {
                var x_timer;
                $("#email").keyup(function (e) {
                    clearTimeout(x_timer);
                    var email = $(this).val();
                    x_timer = setTimeout(function () {
                        check_email_ajax(email);
                    }, 1000);
                });

                function check_email_ajax(email) {
                    $("#user-result1").html('<img class="checkimg" src="../images/ajax-loader.gif" />');
                    $.post('../CheckAccount', {'email': email}, function (data) {
                        $("#user-result1").html(data);
                    });
                }
            });
        </script>
    </head>
    <body>

        <jsp:include page="header.jsp"></jsp:include>
            <div id="id1" class="container-fluid">
                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                        <form action="../UserServlet" method="POST">
                            <h2 style="font-size: 30px">Đăng ký</h2>
                            <div id='arrow'></div>
                            <span id="user-result"></span>
                            <input name="user_name" id="user_name" placeholder='Username' type='text'>
                            <span id="user-result1"></span>
                            <input name="email" id="email" placeholder='Email' type='text'>
                            <input name="pass" id="pass" placeholder='Password' type='password'>
                            <input type="hidden" value="insert" name="command">
                            <button  id="button_span" type="submit" style="margin-left: 25%">
                                <span id="span1">
                                    Đăng ký
                                </span>
                            </button>
                        </form>
                    </div>
                </div>
            </div>
        <jsp:include page="footer.jsp"></jsp:include>


    </body>
</html>


