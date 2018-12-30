package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/cart.css\">\n");
      out.write("        <title>Title</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link dropdown cart\" data-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                    <i class=\"fa fa-shopping-cart\"></i><span class=\"badge\">3</span>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"sub-icon1 list\">\n");
      out.write("                    <h3>Recently added items(2)</h3>\n");
      out.write("                    <div class=\"shopping_cart\">\n");
      out.write("                        <div class=\"cart_box\">\n");
      out.write("                            <div class=\"message\">\n");
      out.write("                                <div class=\"alert-close\">\n");
      out.write("                                    <i class=\"fa fa-window-close\" aria-hidden=\"true\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"list_img\"><img src=\"../images/hinhsach/ASP.net.jpg\" class=\"img-responsive\" alt=\"\"></div>\n");
      out.write("                                <div class=\"list_desc\">\n");
      out.write("                                    <h4><a href=\"#\">velit esse molestie</a></h4>1 x<span class=\"actual\">\n");
      out.write("                                        $12.00</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"cart_box\">\n");
      out.write("                            <div class=\"message\">\n");
      out.write("                                <div class=\"alert-close\">\n");
      out.write("                                    <i class=\"fa fa-window-close\" aria-hidden=\"true\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"list_img\"><img src=\"images/14.jpg\" class=\"img-responsive\" alt=\"\"></div>\n");
      out.write("                                <div class=\"list_desc\">\n");
      out.write("                                    <h4><a href=\"#\">velit esse molestie</a></h4>1 x<span class=\"actual\">\n");
      out.write("                                        $12.00</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"cart_box\">\n");
      out.write("                            <div class=\"message\">\n");
      out.write("                                <div class=\"alert-close\">\n");
      out.write("                                    <i class=\"fa fa-window-close\" aria-hidden=\"true\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"list_img\"><img src=\"images/14.jpg\" class=\"img-responsive\" alt=\"\"></div>\n");
      out.write("                                <div class=\"list_desc\">\n");
      out.write("                                    <h4><a href=\"#\">velit esse molestie</a></h4>1 x<span class=\"actual\">\n");
      out.write("                                        $12.00</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"cart_box\">\n");
      out.write("                            <div class=\"message\">\n");
      out.write("                                <div class=\"alert-close\">\n");
      out.write("                                    <i class=\"fa fa-window-close\" aria-hidden=\"true\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"list_img\"><img src=\"images/14.jpg\" class=\"img-responsive\" alt=\"\"></div>\n");
      out.write("                                <div class=\"list_desc\">\n");
      out.write("                                    <h4><a href=\"#\">velit esse molestie</a></h4>1 x<span class=\"actual\">\n");
      out.write("                                        $12.00</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"total\">\n");
      out.write("                        <div class=\"total_left\">CartSubtotal : </div>\n");
      out.write("                        <div class=\"total_right\">$250.00</div>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <a name=\"\" id=\"\" class=\"btn btn-block btn-danger\" href=\"#\" role=\"button\">Check out</a>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.13.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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
