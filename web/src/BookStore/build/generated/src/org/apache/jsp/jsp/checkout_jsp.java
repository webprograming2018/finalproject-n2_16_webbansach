package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Users;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/checkout.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../template/vendor/bootstrap.css\">\n");
      out.write("        <title>Thanh toán</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Users users = (Users) session.getAttribute("user");
            if (users == null) {
                response.sendRedirect("../jsp/login.jsp");
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-4 col-sm-4 col-md-4 col-lg-4\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-4 col-sm-4 col-md-4 col-lg-4\">\n");
      out.write("                        <div class=\"account\">\n");
      out.write("\n");
      out.write("                            <form action=\"../CheckOutServlet\" method=\"POST\">\n");
      out.write("                                <h2 class=\"account-in\">Thanh toán</h2>\n");
      out.write("                                <div>\n");
      out.write("                                    <span class=\"word\">Address * :</span>\n");
      out.write("                                    <input type=\"text\" name=\"address\" id=\"address\">\n");
      out.write("                                </div>  \n");
      out.write("                                <div>\n");
      out.write("                                    <span class=\"tt\">Payment * :</span>\n");
      out.write("                                    <select class=\"op\" name=\"payment\">\n");
      out.write("                                        <option value=\"Bank transfer\"> Bank transfer</option>\n");
      out.write("                                        <option value=\"Live\"> Live</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>          \n");
      out.write("                                <input type=\"submit\" value=\"Thanh toán\"> \n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write(" \n");
      out.write("    </body>\n");
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
