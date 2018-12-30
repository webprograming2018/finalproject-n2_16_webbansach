<%-- 
    Document   : content
    Created on : Nov 12, 2018, 2:11:06 AM
    Author     : HOANG
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Category"%>
<%@page import="model.Publisher"%>
<%@page import="model.Author"%>
<%@page import="java.util.List"%>
<%@page import="model.Cart"%>
<%@page import="dao.PublisherDAO"%>
<%@page import="dao.AuthorDAO"%>
<%@page import="dao.CategoryDAO"%>
<%@page import="model.Book"%>
<%@page import="dao.BookDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1"> 
        <link rel="stylesheet" type="text/css" href="../css/contentstyle.css">
        <link rel="stylesheet" href="./template/vendor/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="../css/danhmuc.css">
        <title>Product</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <jsp:include page="banner.jsp"></jsp:include>
            <!--Main--> 
        <%
            CategoryDAO categoryDAO = new CategoryDAO();
            AuthorDAO authorDAO = new AuthorDAO();
            PublisherDAO publisherDAO = new PublisherDAO();
            BookDAO bookDAO = new BookDAO();
            int phanLoai = -1;// 0: category; 1: author; 2: publisher
            long ID = 0;
            String s = "";
            if (request.getParameter("categoryID") != null) {
                phanLoai = 0;
                ID = Long.parseLong(request.getParameter("categoryID"));
                s = "Thể loại: " + categoryDAO.getCategoryByID(ID).getCategoryName();
            } else if (request.getParameter("authorID") != null) {
                phanLoai = 1;
                ID = Long.parseLong(request.getParameter("authorID"));
                s = "Tác giả: " + authorDAO.getAuthorByID(ID).getAuthor_Name();
            } else if (request.getParameter("publisherID") != null) {
                phanLoai = 2;
                ID = Long.parseLong(request.getParameter("publisherID"));
                s = "Nhà xuất bản: " + publisherDAO.getPublisherByID(ID).getPublisher_Name();
            }
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
            List<Author> listAuthor = authorDAO.getListAuthor();
            List<Publisher> listPublisher = publisherDAO.getListPublisher();
            List<Category> listCategory = categoryDAO.getListCategory();
            List<Book> list = new ArrayList<>();
            if (phanLoai == 0) {
                list = bookDAO.getListBookByCategory(ID);
            } else if (phanLoai == 1) {
                list = bookDAO.getListBookByAuthor(ID);
            } else if (phanLoai == 2) {
                list = bookDAO.getListBookByPublisher(ID);
            }
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
                    <div class="row"> 

                        <%
                            for (int i = 0; i < list.size(); i++) {
                        %>
                        <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                            <div class="thumbnail">
                                <a href="bookdetail.jsp?bookID=<%=list.get(i).getId()%>">
                                    <img style="width: 200px; height: 300px" src="<%="../images/hinhsach/" + list.get(i).getImage()%>" class="img-responsive book__image">
                                </a>

                                <div class="text-center">
                                    <h4><%=list.get(i).getName()%></h4>
                                    <p><%="Giá: " + (int) list.get(i).getPrice() / 1000 + "." + "000Đ"%></p>
                                    <a href="../CartServlet?command=plus&bookID=<%=list.get(i).getId()%>" class="btn btn-primary">Mua ngay</a>
                                    <a href="bookdetail.jsp?bookID=<%=list.get(i).getId()%>" class="btn btn-default">Chi tiết</a>
                                </div>
                            </div>
                        </div>
                        <%
                            }
                        %>
                    </div>
                </div>
                <div id="loadding" class="hidden">
                    LOADDING ...
                </div> 
            </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <!--<script src="../js/ajaxloadmore.js" ></script>-->
    <script src="../js/ratingbook.js" ></script>
</html>
