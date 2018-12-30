package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Book;
import dao.BookDAO;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/contentstyle.css\">\n");
      out.write("        <title>Content</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <!--Main--> \n");
      out.write("        ");

            BookDAO bookDAO = new BookDAO();
        
      out.write("\n");
      out.write("        <section class=\"main\">\n");
      out.write("\n");
      out.write("            <div class=\"content\">\n");
      out.write("                ");

                    for (int i = 0; i < bookDAO.getListBook(1).size() - 1; i++) {
                
      out.write("\n");
      out.write("                <div class=\"book__item\">\n");
      out.write("                    <a href=\"bookdetail.jsp?bookID=");
      out.print(bookDAO.getListBook(1).get(i).getId());
      out.write("\">\n");
      out.write("                    <img class=\"book__image\" src=\"");
      out.print("../images/hinhsach/" + bookDAO.getListBook(1).get(i).getImage());
      out.write("\" /></a>               \n");
      out.write("                    <div class=\"book__info\">\n");
      out.write("                        <p class=\"book__name\">\n");
      out.write("                            ");
      out.print(bookDAO.getListBook(1).get(i).getName());
      out.write("\n");
      out.write("                        </p>\n");
      out.write("                    </div>  \n");
      out.write("                </div>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"loadding\" class=\"hidden\">\n");
      out.write("                LOADDING ...\n");
      out.write("            </div> \n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"../js/ajaxloadmore.js\" ></script>\n");
      out.write("    <script src=\"../js/ratingbook.js\" ></script>\n");
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
