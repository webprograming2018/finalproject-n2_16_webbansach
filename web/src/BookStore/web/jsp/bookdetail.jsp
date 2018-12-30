<%-- 
    Document   : bookdetail
    Created on : Nov 16, 2018, 1:30:52 AM
    Author     : HOANG
--%>

<%@page import="dao.CategoryDAO"%>
<%@page import="model.Cart"%>
<%@page import="dao.PublisherDAO"%>
<%@page import="dao.AuthorDAO"%>
<%@page import="model.Book"%>
<%@page import="dao.BookDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/"
              crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="../css/detailstyle.css">
        <title>Book detail</title>
    </head>
    <body>

        <%
            BookDAO bookDAO = new BookDAO();
            Book book = new Book();
            String bookID = "";
            if (request.getParameter("bookID") != null) {
                bookID = request.getParameter("bookID");
                book = bookDAO.getBook(Long.parseLong(bookID));
            }
            AuthorDAO authorDAO = new AuthorDAO();
            PublisherDAO publisherDAO = new PublisherDAO();
            CategoryDAO categoryDAO = new CategoryDAO();
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
        %>
        <jsp:include page="header.jsp"></jsp:include>
            <div class="container">
                <div class="row">
                    <div class="col-md-3">
                        <div class="image">
                            <img class="img-thumbnail" src=<%="../images/hinhsach/" + book.getImage()%> >
                    </div>
                    <div class="rating"></div><br>
                </div>
                <div class="col-md-6">
                    <div class="book-detail">
                        <div class="book-info">
                            <h3 class="title-book">
                                <span><%=book.getName()%></span>
                            </h3>
                            <h3 class="category">
                                <span><%=categoryDAO.getCategoryByID(book.getCategoryID()).getCategoryName()%></span>
                            </h3>
                            <h4 class="author">
                                <span>by</span>
                                <span><a href=""><%=authorDAO.getAuthorByID(book.getAuthorID()).getAuthor_Name()%></a></span>
                            </h4>
                            <h3 class="category">
                                <span><%="Nhà xuất bản " + publisherDAO.getPublisherByID(book.getPublisherID()).getPublisher_Name()%></span>
                            </h3>
                        </div>
                        <div class="detail">
                            <h2 class="detail-title"><strong>Chi Tiết</strong></h2>
                            <div class="synopsis-description" translate="no">
                                <p><strong>Featuring an exclusive excerpt from Kate Quinn's next incredible historical
                                        novel, THE HUNTRESS</strong></p>
                                <p><strong>In an enthralling new historical novel from national bestselling author Kate
                                        Quinn, two women—a female spy recruited to the real-life Alice Network in France
                                        during World War I and an unconventional American socialite searching for her
                                        cousin in 1947—are brought together in a mesmerizing story of courage and
                                        redemption.</strong></p>
                                <p><em>1947.</em> In the chaotic aftermath of World War II, American college girl Charlie
                                    St. Clair is pregnant, unmarried, and on the verge of being thrown out of her very
                                    proper family. She's also nursing a desperate hope that her beloved cousin Rose, who
                                    disappeared in Nazi-occupied France during the war, might still be alive. So when
                                    Charlie's parents banish her to Europe to have her "little problem" taken care of,
                                    Charlie breaks free and heads to London, determined to find out what happened to the
                                    cousin she loves like a sister.</p>
                                <p><strong>“Both funny and heartbreaking, this epic journey of two courageous women is an
                                        unforgettable tale of little-known wartime glory and sacrifice. Quinn knocks it out
                                        of the park with this spectacular book!”—Stephanie Dray, New York Times bestselling
                                        author of <em>America's First Daughter</em></strong></p>
                            </div>

                        </div>
                        <div class="more-info">
                            <div id="sp_optly_aboutThisBookWidget">
                                <h5>About this book</h5>
                                <div class="row">
                                    <div class="col-md-4">
                                        <div class="row">
                                            <div class="col-md-6 stat-icon text-center">
                                                <i class="far fa-file-alt"></i>
                                            </div>
                                            <div class="col-md-6 stat-desc">
                                                <strong>575</strong>
                                                <span>Pages</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="row">
                                            <div class="col-md-6 stat-icon text-center">
                                                <i class="far fa-clock"></i>
                                            </div>
                                            <div class="col-md-6 stat-desc">
                                                <strong>12 - 13</strong>
                                                <span>Hours to read</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="row">
                                            <div class="col-md-6 stat-icon text-center">
                                                <i class="fas fa-book-open"></i>
                                            </div>
                                            <div class="col-md-6 stat-desc">
                                                <strong>157k</strong>
                                                <span>Total words</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 pricing-details">
                    <div class="box">
                        <h2 class="pricing-title">Mua sách này</h2>
                        <div class="row pricing-figures">
                            <div class="col-md-6 original-price">Giá gốc</div>
                            <div class="col-md-6 price-wrapper" translate="no">
                                <span class="price"><%=(int) book.getPrice() / 1000 + 5 + "." + "000"%></span>
                                <span class="currency">VNĐ</span>
                            </div>

                            <div class="col-md-6 active-price">Giá khuyến mại</div>
                            <div class="col-md-6 price-wrapper" translate="no">
                                <span class="price"><%=(int) book.getPrice() / 1000 + "." + "000"%></span>
                                <span class="currency">VNĐ</span>
                            </div>

                        </div>
                        <div class="buypad-banner text-center">
                            <div class="offer">
                                Get
                                <span class="item-offer">$5 off</span>
                            </div>
                            <div> (Save on your first purchase worth $5.01 or more)</div>
                        </div>
                        <div class="action row">
                            <a style="text-align: center; margin: auto" href="../CartServlet?command=plus&bookID=<%=book.getId()%>">
                             <button type="button" class="col-md-12 btn btn-danger btn-lg btn-block purchase-action add-to-cart">
                                <span class="text">Thêm vào giỏ hàng</span>
                            </button>
                            </a>
                           
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="container">

            <div id="demo" class="carousel slide" data-ride="carousel">

                <!-- Indicators -->
                <ul class="carousel-indicators mb-0 pb-0">
                    <li data-target="#demo" data-slide-to="0" class="active"></li>
                    <li data-target="#demo" data-slide-to="1"></li>
                    <li data-target="#demo" data-slide-to="2"></li>
                </ul>
                <p style="font-size: 20px;"><strong>Sách cùng thể loại</strong></p>
                <!-- The slideshow -->
                <div class="carousel-inner no-padding my-5">
                    <%
                        for (int i = 0; i <= bookDAO.getListBookRelatedByCategory(book.getId()).size() / 3; i++) {
                    %>
                    <%
                        if (i == 0) {
                    %>
                    <div class="carousel-item active">
                        <%
                        } else {
                        %>
                        <div class="carousel-item">
                            <%
                                }
                            %>
                            <%
                                for (int j = i * 3; j < i * 3 + 3; j++) {
                                    if (j < bookDAO.getListBookRelatedByCategory(book.getId()).size()) {

                            %>
                            <div class="col-xs-4 col-sm-4 col-md-4">
                                <div class="thumbnail">
                                    <a href="bookdetail.jsp?bookID=<%=bookDAO.getListBookRelatedByCategory(book.getId()).get(j).getId()%>">
                                        <img class="img-responsive book__image" style="width: 200px; height: 260px" src="<%="../images/hinhsach/" + bookDAO.getListBookRelatedByCategory(book.getId()).get(j).getImage()%>">
                                    </a>
                                    <div class="text-center">
                                        <h4><%=bookDAO.getListBookRelatedByCategory(book.getId()).get(j).getName()%></h4>
                                        <p><%="Giá: " + (int) bookDAO.getListBookRelatedByCategory(book.getId()).get(j).getPrice() / 1000 + "." + "000Đ"%></p>
                                        <a class="btn btn-primary" href="../CartServlet?command=plus&bookID=<%=bookDAO.getListBookRelatedByCategory(book.getId()).get(j).getId()%>">Mua ngay</a>
                                        <a class="btn btn-default" href="bookdetail.jsp?bookID=<%=bookDAO.getListBookRelatedByCategory(book.getId()).get(j).getId()%>">Chi tiết</a>
                                    </div>
                                </div>
                            </div>
                            <%                                }
                                }
                            %>
                        </div>
                        <%
                            }
                        %>

                    </div>
                </div>


<!--                 Left and right controls 
                <a class="carousel-control-prev" href="#demo" data-slide="prev">
                    <span class="carousel-control-prev-icon sp"></span>
                </a>
                <a class="carousel-control-next" href="#demo" data-slide="next">
                    <span class="carousel-control-next-icon sp"></span>
                </a>-->
            </div>
        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.13.0/umd/popper.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.min.js"></script>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
    <!-- Scripts -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-cookie/1.4.1/jquery.cookie.min.js"></script>
    <script src="../js/ratingbook.js"></script>
    <script>
        $(function () {
            'use strict';
            var id = $('#bookid').text();
            //alert(id.text());
            // Starz
            var state = $.cookie('starz' + id);
            $('.rating').starz(10, state).bind('rated', function (event, data) {
                $('.rating-result').text(data.rating);
                $.cookie('starz' + id, data.rating, {expires: 1});
            });
        });
    </script>

</html>
