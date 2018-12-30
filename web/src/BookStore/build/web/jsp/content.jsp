<%-- 
    Document   : content
    Created on : Nov 12, 2018, 2:11:06 AM
    Author     : HOANG
--%>

<%@page import="dao.CategoryDAO"%>
<%@page import="model.Category"%>
<%@page import="model.Publisher"%>
<%@page import="java.util.List"%>
<%@page import="dao.PublisherDAO"%>
<%@page import="dao.AuthorDAO"%>
<%@page import="model.Author"%>
<%@page import="model.Cart"%>
<%@page import="model.Book"%>
<%@page import="dao.BookDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">     
        <link rel="stylesheet" href="./template/vendor/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="../css/danhmuc.css">
        <link rel="stylesheet" type="text/css" href="../css/contentstyle.css">
        <title>Content</title>
    </head>
    <body>
        <!--Main--> 
        <%
            CategoryDAO categoryDAO = new CategoryDAO();
            AuthorDAO authorDAO = new AuthorDAO();
            PublisherDAO publisherDAO = new PublisherDAO();
            BookDAO bookDAO = new BookDAO();
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
            List<Author> listAuthor = authorDAO.getListAuthor();
            List<Publisher> listPublisher = publisherDAO.getListPublisher();
            List<Category> listCategory = categoryDAO.getListCategory();
        %>
        <div class="container">
            <div class="row">
                <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
                    <ul id="danhmuc" class="list-group">
                        <li id="danhmuccon" class="list-group-item active"><a id="adanhmuc1" href=""><h4>Thể Loại</h4></a></li>
                            <%
                                for (int i = 0; i < listCategory.size(); i++) {
                            %>
                        <li id="danhmuccon" class="list-group-item">
                            <a id="adanhmuc" href="product.jsp?categoryID=<%=listCategory.get(i).getCategoryID()%>">
                                <h4><%=listCategory.get(i).getCategoryName()%></h4>
                            </a>
                        </li>
                        <%
                            }
                        %>
                        <br>
                        <li id="danhmuccon" class="list-group-item active"><a id="adanhmuc1" href=""><h4>Tác Giả</h4></a></li>
                            <%
                                for (int i = 0; i < listAuthor.size(); i++) {
                            %>
                        <li id="danhmuccon" class="list-group-item">
                            <a id="adanhmuc" href="product.jsp?authorID=<%=listAuthor.get(i).getAuthor_ID()%>">
                                <h4><%=listAuthor.get(i).getAuthor_Name()%></h4>
                            </a>
                        </li>
                        <%
                            }
                        %>
                        <br>
                        <li id="danhmuccon" class="list-group-item active"><a id="adanhmuc1" href=""><h4>Nhà xuất bản</h4></a></li>
                            <%
                                for (int i = 0; i < listPublisher.size(); i++) {
                            %>
                        <li id="danhmuccon" class="list-group-item">
                            <a id="adanhmuc" href="product.jsp?publisherID=<%=listPublisher.get(i).getPublisher_ID()%>">
                                <h4><%=listPublisher.get(i).getPublisher_Name()%></h4>
                            </a>
                        </li>
                        <%
                            }
                        %>
                        <img  id=""src="./shake-and-co.jpg" alt="" style="width: 100%;">
                    </ul>
                </div>

                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                    <div class="row content">
                        <%
                            for (int i = 0; i < bookDAO.getListBook(1).size() - 1; i++) {
                        %>
                        <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                            <div class="thumbnail">
                                <a href="bookdetail.jsp?bookID=<%=bookDAO.getListBook().get(i).getId()%>">
                                    <img class="img-responsive book__image" style="width: 200px; height: 260px" src="<%="../images/hinhsach/" + bookDAO.getListBook().get(i).getImage()%>">
                                </a>
                                <div class="text-center">
                                    <h4><%=bookDAO.getListBook().get(i).getName()%></h4>
                                    <p><%="Giá: " + (int) bookDAO.getListBook().get(i).getPrice() / 1000 + "." + "000Đ"%></p>
                                    <a class="btn btn-primary" href="../CartServlet?command=plus&bookID=<%=bookDAO.getListBook().get(i).getId()%>">Mua ngay</a>
                                    <a class="btn btn-default" href="bookdetail.jsp?bookID=<%=bookDAO.getListBook().get(i).getId()%>">Chi tiết</a>
                                </div>
                            </div>
                        </div>
                        <%
                            }
                        %>
                    </div>
                </div>
            </div>
        </div>
        <div id="loadding" class="hidden">
            LOADDING ...
        </div> 
    </body>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="../js/ajaxloadmore.js" ></script>
    <script src="../js/ratingbook.js" ></script>
</html>
