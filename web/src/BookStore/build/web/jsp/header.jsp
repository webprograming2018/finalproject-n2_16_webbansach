<%-- 
    Document   : header
    Created on : Nov 12, 2018, 12:34:40 AM
    Author     : HOANG
--%>

<%@page import="java.util.Map"%>
<%@page import="model.Item"%>
<%@page import="model.Cart"%>
<%@page import="model.Users"%>
<%@page import="model.Category"%>
<%@page import="dao.CategoryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Header</title>
        <meta charset="UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">
        <link rel="stylesheet" type="text/css" href="../css/headerstyle.css">
        <link rel="stylesheet" type="text/css" href="../css/responsivemenu.css">
        <link rel="stylesheet" href="../css/cart.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    </head>
    <body>
        <%
            CategoryDAO categoryDAO = new CategoryDAO();
            Users users = null;
            if (session.getAttribute("user") != null) {
                users = (Users) session.getAttribute("user");
            }
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }

        %>
        <a href="login.jsp">
            <img id="sticky-button" style="display:none;position: fixed;top: 0px;left: 20px;z-index: 9999" src="../images/login.png"></img>
        </a>
        <!-- HEADER -->
        <header class="header">
            <!-- Topbar -->
            <div class="topBar"> <!-- Vì class bên phải sẽ mạnh hơn bên trái -->
                <div class="container">
                    <div class="row">
                        <div class="col-8 left">
                            <div class="info">
                            </div>
                        </div>
                        <li class="nav-item dropdown">
                            <a onclick="myFunction()" class="nav-link dropdown cart" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
                                <i class="fa fa-shopping-cart"></i><span class="badge"><%=cart.getCartItems().size()%></span>
                            </a>
                            <ul class="sub-icon1 list" id="myDIV">
                                <h3><%="Recently added items (" + cart.getCartItems().size() + ")"%></h3>
                                <div class="shopping_cart">
                                    <%
                                        for (Map.Entry<Long, Item> list : cart.getCartItems().entrySet()) {
                                    %>
                                    <div class="cart_box">
                                        <div class="message">
                                            <div class="alert-close">
                                                <a href="../CartServlet?command=remove&bookID=<%=list.getValue().getBook().getId()%>">
                                                    <img src="../images/not-available.png">
                                                </a>
                                            </div>
                                            <div class="list_img"><img src="<%="../images/hinhsach/" + list.getValue().getBook().getImage()%>" class="img-responsive" alt=""></div>
                                            <div class="list_desc">
                                                <h4><a href="bookdetail.jsp?bookID=<%=list.getValue().getBook().getId()%>"><%=list.getValue().getBook().getName()%></a></h4><%=list.getValue().getQuantity() + "x"%><span class="actual">
                                                    <%=list.getValue().getBook().getPrice()%></span>
                                            </div>
                                            <div class="clearfix"></div>
                                        </div>
                                    </div>
                                    <%
                                        }
                                    %>

                                </div>
                                <div class="total">
                                    <div class="total_left">CartSubtotal : </div>
                                    <div class="total_right"><%=cart.totalCart()%></div>
                                    <div class="clearfix"> </div>
                                </div>

                                <a name="" id="" class="btn btn-block btn-danger" href="../jsp/checkout.jsp" role="button">Check out</a>
                                <div class="clearfix"></div>
                            </ul>
                        </li>
                        <div class="col-2 right">

                            <!--<button class="button">New post</button>-->
                            <%if (users != null) {%>
                            <p style="color: white; white-space: nowrap;" ><%="Chào mừng " + users.getUserName()%></p>
                            <form action="../UserServlet" method="POST">
                                <input type="hidden" value="logout" name="command">
                                <input type="submit" value="Logout"> 
                            </form>
                            <%} else {
                            %>
                            <a href="login.jsp" id="button_haha"><button class="button" id="button-login" style="display: block">Login</button></a>
                            <%}
                            %>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Logo -->
            <div class="container">
                <div class="logo">
                    <img src="../images/logo.png"><span style="font-size: 25px; font-family: Arial;"><strong>Nhà sách Hoàng Long</strong></span>
                </div>
            </div>
            <!-- Menu -->
            <nav class="menu">
                <div class="container">
                    <div class="row">
                        <div class="col-7">
                            <ul class="list">
                                <li class="new-icon-wrap" id="new-icon-1">
                                    <a href="index.jsp" class="old-icon">Trang chủ</a>
                                    <a href="#" class="new-icon" style="display: none"><img src="../images/home.png" alt="no source found"></a>
                                </li>
                                <li class="new-icon-wrap"  id="new-icon-2">
                                    <a href="#" class="old-icon">Sách điện tử</a>
                                    <a href="#" style="display: none" class="new-icon"><img src="../images/book.png" alt="no source found"></a>
                                    <ul class="list-child" >
                                        <%
                                            for (Category c : categoryDAO.getListCategory()) {
                                        %>
                                        <li style="display: inline">
                                            <a href="product.jsp?categoryID=<%=c.getCategoryID()%>">
                                                <svg viewBox="0 0 192 512">
                                                <path d="M166.9 264.5l-117.8 116c-4.7 4.7-12.3 4.7-17 0l-7.1-7.1c-4.7-4.7-4.7-12.3 0-17L127.3 256 25.1 155.6c-4.7-4.7-4.7-12.3 0-17l7.1-7.1c4.7-4.7 12.3-4.7 17 0l117.8 116c4.6 4.7 4.6 12.3-.1 17z" class=""></path>
                                                </svg>
                                                <%=c.getCategoryName()%>
                                            </a>
                                        </li>
                                        <%
                                            }
                                        %>
                                    </ul>

                                </li>
                                <li class="new-icon-wrap" id="new-icon-3">
                                    <a href="#" class="old-icon">Chia sẻ sách hay</a>
                                    <a href="#" style="display: none" class="new-icon"><img src="../images/bookself.png" alt="no source found"></a>
                                </li>
                                <li class="new-icon-wrap" id="new-icon-4">
                                    <a href="#" class="old-icon">Điểm sách</a>
                                    <a href="#" style="display: none" class="new-icon"><img src="../images/like.png" alt="no source found" ></a>
                                </li>
                            </ul>
                        </div>
                        <div class="col-5 searchBox">
                            <input id="name" class="search" placeholder="Bạn tìm sách gì?..." />
                            <svg class="icon" title="Click the button to search." viewBox="0 0 512 512"><path d="M505 442.7L405.3 343c-4.5-4.5-10.6-7-17-7H372c27.6-35.3 44-79.7 44-128C416 93.1 322.9 0 208 0S0 93.1 0 208s93.1 208 208 208c48.3 0 92.7-16.4 128-44v16.3c0 6.4 2.5 12.5 7 17l99.7 99.7c9.4 9.4 24.6 9.4 33.9 0l28.3-28.3c9.4-9.4 9.4-24.6.1-34zM208 336c-70.7 0-128-57.2-128-128 0-70.7 57.2-128 128-128 70.7 0 128 57.2 128 128 0 70.7-57.2 128-128 128z"></path></svg>
                            <table id="table_search_result" border="1px" width="300px" class="hidden">
                                <tbody id="row"> 
                                </tbody>
                            </table>

                        </div>

                    </div>
                </div>
            </nav>
        </header>              
        <script>
            function myFunction() {
                var x = document.getElementById("myDIV");
                if (x.style.display === "none") {
                    x.style.display = "block";
                } else {
                    x.style.display = "none";
                }
            }
        </script>
    </body>
    <script src="../js/button-login.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="../js/ajaxsearch.js" ></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.13.0/umd/popper.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.min.js"></script>
</html>
