package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import model.Item;
import model.Cart;
import model.Users;
import model.Category;
import dao.CategoryDAO;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Header</title>\n");
      out.write("        <meta charset=\"UTF-8\"/>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/headerstyle.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/responsivemenu.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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

        
      out.write("\n");
      out.write("        <a href=\"login.jsp\">\n");
      out.write("            <img id=\"sticky-button\" style=\"display:none;position: fixed;top: 0px;left: 20px;z-index: 9999\" src=\"../images/login.png\"></img>\n");
      out.write("        </a>\n");
      out.write("        <!-- HEADER -->\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <!-- Topbar -->\n");
      out.write("            <div class=\"topBar\"> <!-- Vì class bên phải sẽ mạnh hơn bên trái -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-8 left\">\n");
      out.write("                            <div class=\"info\">\n");
      out.write("                                <!--<span>23/8/2018</span>\n");
      out.write("                                <span>Slogan: Nothing is impossible</span>-->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-2 right\">\n");
      out.write("\n");
      out.write("                            <!--<button class=\"button\">New post</button>-->\n");
      out.write("                            ");
if (users != null) {
      out.write("\n");
      out.write("                            <p style=\"color: white; white-space: nowrap;\" >");
      out.print("Chào mừng " + users.getUserName());
      out.write("</p>\n");
      out.write("                            <!--<button class=\"button\" type=\"button\" id=\"button-logout\" style=\"display: block\" >Logout</button>-->\n");
      out.write("                            <form action=\"../UserServlet\" method=\"POST\">\n");
      out.write("                                <input type=\"hidden\" value=\"logout\" name=\"command\">\n");
      out.write("                                <input type=\"submit\" value=\"Logout\"> \n");
      out.write("                            </form>\n");
      out.write("                            ");
} else {
                            
      out.write("\n");
      out.write("                            <a href=\"login.jsp\"><button class=\"button\" id=\"button-login\" style=\"display: block\">Login</button></a>\n");
      out.write("                            ");
}
                            
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Logo -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <img src=\"../images/logo.png\"><span style=\"font-size: 25px; font-family: Arial;\"><strong>Nhà sách Hoàng Long</strong></span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Menu -->\n");
      out.write("            <nav class=\"menu\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-7\">\n");
      out.write("                            <ul class=\"list\">\n");
      out.write("                                <li class=\"new-icon-wrap\" id=\"new-icon-1\">\n");
      out.write("                                    <a href=\"index.jsp\" class=\"old-icon\">Trang chủ</a>\n");
      out.write("                                    <a href=\"#\" class=\"new-icon\" style=\"display: none\"><img src=\"../images/home.png\" alt=\"no source found\"></a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"new-icon-wrap\"  id=\"new-icon-2\">\n");
      out.write("                                    <a href=\"#\" class=\"old-icon\">Sách điện tử</a>\n");
      out.write("                                    <a href=\"#\" style=\"display: none\" class=\"new-icon\"><img src=\"../images/book.png\" alt=\"no source found\"></a>\n");
      out.write("                                    <ul class=\"list-child\" >\n");
      out.write("                                        ");

                                            for (Category c : categoryDAO.getListCategory()) {
                                        
      out.write("\n");
      out.write("                                        <li style=\"display: inline\">\n");
      out.write("                                            <a href=\"product.jsp?categoryID=");
      out.print(c.getCategoryID());
      out.write("\">\n");
      out.write("                                                <svg viewBox=\"0 0 192 512\">\n");
      out.write("                                                <path d=\"M166.9 264.5l-117.8 116c-4.7 4.7-12.3 4.7-17 0l-7.1-7.1c-4.7-4.7-4.7-12.3 0-17L127.3 256 25.1 155.6c-4.7-4.7-4.7-12.3 0-17l7.1-7.1c4.7-4.7 12.3-4.7 17 0l117.8 116c4.6 4.7 4.6 12.3-.1 17z\" class=\"\"></path>\n");
      out.write("                                                </svg>\n");
      out.write("                                                ");
      out.print(c.getCategoryName());
      out.write("\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"new-icon-wrap\" id=\"new-icon-3\">\n");
      out.write("                                    <a href=\"#\" class=\"old-icon\">Chia sẻ sách hay</a>\n");
      out.write("                                    <a href=\"#\" style=\"display: none\" class=\"new-icon\"><img src=\"../images/bookself.png\" alt=\"no source found\"></a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"new-icon-wrap\" id=\"new-icon-4\">\n");
      out.write("                                    <a href=\"#\" class=\"old-icon\">Điểm sách</a>\n");
      out.write("                                    <a href=\"#\" style=\"display: none\" class=\"new-icon\"><img src=\"../images/like.png\" alt=\"no source found\" ></a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"new-icon-wrap\">\n");
      out.write("                                    <a href=\"#\" style=\"display: block\"><img src=\"../images/icons8-shopping-cart-24.png\" alt=\"no source found\"></a>\n");
      out.write("                                    <ul class=\"list-child\" >\n");
      out.write("                                        ");

                                            System.out.println(cart.getCartItems().size());
                                            for (Map.Entry<Long, Item> list : cart.getCartItems().entrySet()) {
                                        
      out.write("\n");
      out.write("                                        <li style=\"display: inline-block; white-space: nowrap\">\n");
      out.write("                                            <a href=\"product.jsp?categoryID=");
      out.print(list.getValue().getBook().getCategoryID());
      out.write("\" style=\"display: inline-block; white-space: nowrap\">\n");
      out.write("                                                ");
      out.print(list.getValue().getBook().getName());
      out.write("\n");
      out.write("                                                (\n");
      out.write("                                                ");
      out.print(list.getValue().getQuantity() + "x" + list.getValue().getBook().getPrice());
      out.write("\n");
      out.write("                                                )\n");
      out.write("                                                <a href=\"../CartServlet?command=remove&bookID=");
      out.print(list.getValue().getBook().getId());
      out.write("\" style=\"display: inline-block\">\n");
      out.write("                                                    <img src=\"../images/not-available.png\">\n");
      out.write("                                                </a>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                        <li style=\"display: inline-block; white-space: nowrap\">\n");
      out.write("                                            <p>");
      out.print("Tổng tiền: " + cart.totalCart());
      out.write("</p>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li style=\"display: inline-block; white-space: nowrap\">\n");
      out.write("                                            <button class=\"button\">\n");
      out.write("                                                <a href=\"../jsp/checkout.jsp\">Check out</a>\n");
      out.write("                                            </button>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-5 searchBox\">\n");
      out.write("                            <input id=\"name\" class=\"search\" placeholder=\"Bạn tìm sách gì?...\" />\n");
      out.write("                            <svg class=\"icon\" title=\"Click the button to search.\" viewBox=\"0 0 512 512\"><path d=\"M505 442.7L405.3 343c-4.5-4.5-10.6-7-17-7H372c27.6-35.3 44-79.7 44-128C416 93.1 322.9 0 208 0S0 93.1 0 208s93.1 208 208 208c48.3 0 92.7-16.4 128-44v16.3c0 6.4 2.5 12.5 7 17l99.7 99.7c9.4 9.4 24.6 9.4 33.9 0l28.3-28.3c9.4-9.4 9.4-24.6.1-34zM208 336c-70.7 0-128-57.2-128-128 0-70.7 57.2-128 128-128 70.7 0 128 57.2 128 128 0 70.7-57.2 128-128 128z\"></path></svg>\n");
      out.write("                            <table id=\"table_search_result\" border=\"1px\" width=\"300px\" class=\"hidden\">\n");
      out.write("                                <tbody id=\"row\"> \n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>              \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script src=\"../js/button-login.js\"></script>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"../js/ajaxsearch.js\" ></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.slim.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.13.0/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.min.js\"></script>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
