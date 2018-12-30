package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.CategoryDAO;
import model.Category;
import model.Publisher;
import java.util.List;
import dao.PublisherDAO;
import dao.AuthorDAO;
import model.Author;
import model.Cart;
import model.Book;
import dao.BookDAO;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">     \n");
      out.write("        <link rel=\"stylesheet\" href=\"./template/vendor/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/danhmuc.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/contentstyle.css\">\n");
      out.write("        <title>Content</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--Main--> \n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\">\n");
      out.write("                    <ul id=\"danhmuc\" class=\"list-group\">\n");
      out.write("                        <li id=\"danhmuccon\" class=\"list-group-item active\"><a id=\"adanhmuc1\" href=\"\"><h4>Thể Loại</h4></a></li>\n");
      out.write("                            ");

                                for (int i = 0; i < listCategory.size(); i++) {
                            
      out.write("\n");
      out.write("                        <li id=\"danhmuccon\" class=\"list-group-item\">\n");
      out.write("                            <a id=\"adanhmuc\" href=\"product.jsp?categoryID=");
      out.print(listCategory.get(i).getCategoryID());
      out.write("\">\n");
      out.write("                                <h4>");
      out.print(listCategory.get(i).getCategoryName());
      out.write("</h4>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                        <br>\n");
      out.write("                        <li id=\"danhmuccon\" class=\"list-group-item active\"><a id=\"adanhmuc1\" href=\"\"><h4>Tác Giả</h4></a></li>\n");
      out.write("                            ");

                                for (int i = 0; i < listAuthor.size(); i++) {
                            
      out.write("\n");
      out.write("                        <li id=\"danhmuccon\" class=\"list-group-item\">\n");
      out.write("                            <a id=\"adanhmuc\" href=\"product.jsp?authorID=");
      out.print(listAuthor.get(i).getAuthor_ID());
      out.write("\">\n");
      out.write("                                <h4>");
      out.print(listAuthor.get(i).getAuthor_Name());
      out.write("</h4>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                        <br>\n");
      out.write("                        <li id=\"danhmuccon\" class=\"list-group-item active\"><a id=\"adanhmuc1\" href=\"\"><h4>Nhà xuất bản</h4></a></li>\n");
      out.write("                            ");

                                for (int i = 0; i < listPublisher.size(); i++) {
                            
      out.write("\n");
      out.write("                        <li id=\"danhmuccon\" class=\"list-group-item\">\n");
      out.write("                            <a id=\"adanhmuc\" href=\"product.jsp?publisherID=");
      out.print(listPublisher.get(i).getPublisher_ID());
      out.write("\">\n");
      out.write("                                <h4>");
      out.print(listPublisher.get(i).getPublisher_Name());
      out.write("</h4>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                        <img  id=\"\"src=\"./shake-and-co.jpg\" alt=\"\" style=\"width: 100%;\">\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-xs-10 col-sm-10 col-md-10 col-lg-10\">\n");
      out.write("                    <div class=\"row content\">\n");
      out.write("                        ");

                            for (int i = 0; i < bookDAO.getListBook(1).size() - 1; i++) {
                        
      out.write("\n");
      out.write("                        <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3\">\n");
      out.write("                            <div class=\"thumbnail\">\n");
      out.write("                                <a href=\"bookdetail.jsp?bookID=");
      out.print(bookDAO.getListBook().get(i).getId());
      out.write("\">\n");
      out.write("                                    <img class=\"img-responsive book__image\" style=\"width: 200px; height: 260px\" src=\"");
      out.print("../images/hinhsach/" + bookDAO.getListBook().get(i).getImage());
      out.write("\">\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"text-center\">\n");
      out.write("                                    <h4>");
      out.print(bookDAO.getListBook().get(i).getName());
      out.write("</h4>\n");
      out.write("                                    <p>");
      out.print("Giá: " + (int) bookDAO.getListBook().get(i).getPrice() / 1000 + "." + "000Đ");
      out.write("</p>\n");
      out.write("                                    <a class=\"btn btn-primary\" href=\"../CartServlet?command=plus&bookID=");
      out.print(bookDAO.getListBook().get(i).getId());
      out.write("\">Mua ngay</a>\n");
      out.write("                                    <a class=\"btn btn-default\" href=\"bookdetail.jsp?bookID=");
      out.print(bookDAO.getListBook().get(i).getId());
      out.write("\">Chi tiết</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"loadding\" class=\"hidden\">\n");
      out.write("            LOADDING ...\n");
      out.write("        </div> \n");
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
