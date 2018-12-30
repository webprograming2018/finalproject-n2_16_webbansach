package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<title>Footer</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../template/vendor/bootstrap.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div style=\"background-color: rgb(211, 211, 211); padding-bottom: 30px;\" id=\"bot\" class=\"container-fluid\">\n");
      out.write("    \t<div class=\"row\">\n");
      out.write("    \t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("    \t\t\t<div class=\"container\">\n");
      out.write("    \t\t\t\t<div class=\"row\">\n");
      out.write("    \t\t\t\t\t<div class=\"col-xs-4 col-sm-4 col-md-4 col-lg-4\">\n");
      out.write("    \t\t\t\t\t\t<h4>Nhà Sách Hoàng Hiệp</h4>\n");
      out.write("    \t\t\t\t\t\t<p id=\"infor\">\n");
      out.write("    \t\t\t\t\t\t\tKm 10 Nguyễn Trãi, Hà Đông, Hà Nội <br>\n");
      out.write("    \t\t\t\t\t\t\tĐiện thoại: 0967491368 <br>\n");
      out.write("    \t\t\t\t\t\t\tEmail: <a href=\"\">nshoanghiep@gmail.com</a>\n");
      out.write("    \t\t\t\t\t\t</p>\n");
      out.write("    \t\t\t\t\t</div>\n");
      out.write("    \t\t\t\t\t\n");
      out.write("    \t\t\t\t\t\n");
      out.write("    \t\t\t\t\t<div class=\"col-xs-4 col-sm-4 col-md-4 col-lg-4 \">\n");
      out.write("    \t\t\t\t\t\t\t\t<h4>Theo Dõi Chúng Tôi:</h4>\n");
      out.write("    \t\t\t\t\t\t\t\t<button id=\"nutnhan\" class=\"btn-default\" style=\"width: 40px;\">\n");
      out.write("    \t\t\t\t\t\t\t\t\t<span class=\"fa fa-facebook\"></span>\n");
      out.write("    \t\t\t\t\t\t\t\t</button>\n");
      out.write("    \t\t\t\t\t\t\t\t<a href=\"\">Facebook</a>\n");
      out.write("    \t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t\t<button id=\"nutnhan\" class=\"btn-default\" style=\"width: 40px\">\n");
      out.write("    \t\t\t\t\t\t\t\t\t<span class=\"fa fa-twitter\"></span>\n");
      out.write("    \t\t\t\t\t\t\t\t</button>\n");
      out.write("    \t\t\t\t\t\t\t\t<a href=\"\">Twitter</a>\n");
      out.write("    \t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t\t<button id=\"nutnhan\" class=\"btn-default\" style=\"width: 40px\">\n");
      out.write("    \t\t\t\t\t\t\t\t\t<span class=\"fa fa-instagram\"></span>\n");
      out.write("    \t\t\t\t\t\t\t\t</button>\n");
      out.write("    \t\t\t\t\t\t\t\t<a href=\"\">Instagram</a>\n");
      out.write("    \t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t\t<button id=\"nutnhan\" class=\"btn-default\" style=\"width: 40px\">\n");
      out.write("    \t\t\t\t\t\t\t\t\t<span class=\"fa fa-youtube\"></span>\n");
      out.write("    \t\t\t\t\t\t\t\t</button>\n");
      out.write("    \t\t\t\t\t\t\t\t<a href=\"\">Youtube</a>\n");
      out.write("    \t\t\t\t\t</div>\n");
      out.write("    \t\t\t\t\t<div class=\"col-xs-4 col-sm-4 col-md-4 col-lg-4\">\n");
      out.write("    \t\t\t\t\t\t<h4>Bản Đồ</h4>\n");
      out.write("    \t\t\t\t\t\t<iframe id=\"bando\" src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1862.641044143597!2d105.78672077713836!3d20.981326598312517!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3135accdcf7b0bd1%3A0xc1cf5dd00247628a!2zSOG7jWMgVmnhu4duIEPDtG5nIG5naOG7hyBCxrB1IENow61uaCBWaeG7hW4gVGjDtG5n!5e0!3m2!1sen!2s!4v1545881572706\" width=\"400\" height=\"200\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>\n");
      out.write("    \t\t\t\t\t</div>\n");
      out.write("    \t\t\t\t</div>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t</div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
