package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register</title>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                var x_timer;\n");
      out.write("                $(\"#user_name\").keyup(function (e) {\n");
      out.write("                    clearTimeout(x_timer);\n");
      out.write("                    var user_name = $(this).val();\n");
      out.write("                    x_timer = setTimeout(function () {\n");
      out.write("                        check_username_ajax(user_name);\n");
      out.write("                    }, 1000);\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                function check_username_ajax(user_name) {\n");
      out.write("                    $(\"#user-result\").html('<img src=\"../images/ajax-loader.gif\" />');\n");
      out.write("                    $.post('../CheckAccount', {'user_name': user_name}, function (data) {\n");
      out.write("                        $(\"#user-result\").html(data);\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                var x_timer;\n");
      out.write("                $(\"#email\").keyup(function (e) {\n");
      out.write("                    clearTimeout(x_timer);\n");
      out.write("                    var email = $(this).val();\n");
      out.write("                    x_timer = setTimeout(function () {\n");
      out.write("                        check_email_ajax(email);\n");
      out.write("                    }, 1000);\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                function check_email_ajax(email) {\n");
      out.write("                    $(\"#user-result1\").html('<img src=\"../images/ajax-loader.gif\" />');\n");
      out.write("                    $.post('../CheckAccount', {'email': email}, function (data) {\n");
      out.write("                        $(\"#user-result1\").html(data);\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("<div id=\"id1\" class=\"container-fluid\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("\t\t\t\t<form action=\"../UserServlet\" method=\"POST\">\n");
      out.write("\t\t\t\t  \t<h2 style=\"font-size: 30px\">Đăng Ký</h2>\n");
      out.write("\t\t\t\t    <div id='arrow'></div>\n");
      out.write("\t\t\t\t    <input id='user_name' placeholder='Username' type='text'>\n");
      out.write("                                    <span id=\"user-result\"></span>\n");
      out.write("                                    <input id='email' placeholder='Email' type='text'>\n");
      out.write("                                    <span id=\"user-result1\"></span>\n");
      out.write("\t\t\t\t    <input id='pass' placeholder='Password' type='password'>\n");
      out.write("                                    <input type=\"hidden\" value=\"insert\" name=\"command\">\n");
      out.write("                                    <button  id=\"button_span\" type='submit'>\n");
      out.write("\t\t\t\t    <span id=\"span1\">\n");
      out.write("\t\t\t\t      Đăng Ký\n");
      out.write("\t\t\t\t    </span>\n");
      out.write("\t\t\t\t    </button>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!--            <div class=\"container\">\n");
      out.write("                <div class=\"account\">\n");
      out.write("                    <h2 class=\"account-in\">Register</h2>\n");
      out.write("                    <form action=\"../UserServlet\" method=\"POST\">\n");
      out.write("                        <div>\n");
      out.write("                            <span class=\"word\">Username *</span>\n");
      out.write("                            <input type=\"text\" name=\"user_name\" id=\"user_name\">\n");
      out.write("                            <span id=\"user-result\"></span>\n");
      out.write("                            \n");
      out.write("                        </div> \t\n");
      out.write("                        <div>\n");
      out.write("                            <span class=\"word\">Email *</span>\n");
      out.write("                            <input type=\"text\" name=\"email\" id=\"email\">\n");
      out.write("                            <span id=\"user-result1\"></span>\n");
      out.write("                        </div> \t\n");
      out.write("                        <div> \n");
      out.write("                            <span class=\"word\">Password *</span>\n");
      out.write("                            <input type=\"password\" name=\"pass\">\n");
      out.write("                            <span></span>\n");
      out.write("                        </div>\t\t\t\n");
      out.write("                        <input type=\"hidden\" value=\"insert\" name=\"command\">\n");
      out.write("                        <input type=\"submit\" value=\"Register\"> \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>-->\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
