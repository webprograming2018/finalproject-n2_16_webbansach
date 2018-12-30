<%-- 
    Document   : cart
    Created on : Dec 30, 2018, 1:39:33 AM
    Author     : HOANG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">
        <link rel="stylesheet" href="../css/cart.css">
        <title>Title</title>
    </head>

    <body>
        <ul class="nav">
            <li class="nav-item dropdown">
                <a class="nav-link dropdown cart" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
                    <i class="fa fa-shopping-cart"></i><span class="badge">3</span>
                </a>
                <ul class="sub-icon1 list">
                    <h3>Recently added items(2)</h3>
                    <div class="shopping_cart">
                        <div class="cart_box">
                            <div class="message">
                                <div class="alert-close">
                                    <i class="fa fa-window-close" aria-hidden="true"></i>
                                </div>
                                <div class="list_img"><img style="width: 50px; height: 70px" src="../images/hinhsach/ASP.net.jpg" class="img-responsive" alt=""></div>
                                <div class="list_desc">
                                    <h4><a href="#">velit esse molestie</a></h4>1 x<span class="actual">
                                        $12.00</span>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                        <div class="cart_box">
                            <div class="message">
                                <div class="alert-close">
                                    <i class="fa fa-window-close" aria-hidden="true"></i>
                                </div>
                                <div class="list_img"><img src="images/14.jpg" class="img-responsive" alt=""></div>
                                <div class="list_desc">
                                    <h4><a href="#">velit esse molestie</a></h4>1 x<span class="actual">
                                        $12.00</span>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                        <div class="cart_box">
                            <div class="message">
                                <div class="alert-close">
                                    <i class="fa fa-window-close" aria-hidden="true"></i>
                                </div>
                                <div class="list_img"><img src="images/14.jpg" class="img-responsive" alt=""></div>
                                <div class="list_desc">
                                    <h4><a href="#">velit esse molestie</a></h4>1 x<span class="actual">
                                        $12.00</span>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                        <div class="cart_box">
                            <div class="message">
                                <div class="alert-close">
                                    <i class="fa fa-window-close" aria-hidden="true"></i>
                                </div>
                                <div class="list_img"><img src="images/14.jpg" class="img-responsive" alt=""></div>
                                <div class="list_desc">
                                    <h4><a href="#">velit esse molestie</a></h4>1 x<span class="actual">
                                        $12.00</span>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>
                    <div class="total">
                        <div class="total_left">CartSubtotal : </div>
                        <div class="total_right">$250.00</div>
                        <div class="clearfix"> </div>
                    </div>

                    <a name="" id="" class="btn btn-block btn-danger" href="#" role="button">Check out</a>
                    <div class="clearfix"></div>
                </ul>
            </li>
        </ul>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.13.0/umd/popper.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.min.js"></script>
    </body>

</html>