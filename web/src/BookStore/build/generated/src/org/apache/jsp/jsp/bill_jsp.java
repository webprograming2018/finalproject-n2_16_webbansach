package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Users;
import model.BillDetail;
import java.util.List;
import dao.BookDAO;
import model.Bill;
import dao.BillDetailDAO;
import dao.BillDAO;

public final class bill_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/bill.css\">\n");
      out.write("        <title>Hóa đơn</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            BillDAO billDAO = new BillDAO();
            BillDetailDAO billDetailDAO = new BillDetailDAO();
            BookDAO bookDAO = new BookDAO();
            Bill bill = (Bill) session.getAttribute("bill");
            List<BillDetail> billDetails = billDetailDAO.getListBillDetailByBillID(bill.getBillID());
            Users users = (Users) session.getAttribute("user");
        
      out.write("\n");
      out.write("        <div class=\"invoice-box\">\n");
      out.write("            <table cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("                <tr class=\"top\">\n");
      out.write("                    <td colspan=\"5\">\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td style=\"width:12%;\">\n");
      out.write("                                    <img src=\"../images/logo.png\" style=\"width: 100%;\">\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                                <td class=\"title\">\n");
      out.write("\n");
      out.write("                                    <strong>\n");
      out.write("                                        <br>\n");
      out.write("                                        <br>\n");
      out.write("                                        <br>\n");
      out.write("                                        <br>\n");
      out.write("                                        Nhà sách Hoàng Long\n");
      out.write("                                    </strong>\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <p style=\"align-content: flex-end\">\n");
      out.write("                                        Mã hóa đơn: ");
      out.print(bill.getBillID());
      out.write("<br>\n");
      out.write("                                        Ngày tạo: ");
      out.print(bill.getDate());
      out.write("<br>\n");
      out.write("                                    </p>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr class=\"information\">\n");
      out.write("                    <td colspan=\"5\">\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    Địa chỉ: Km 10 Nguyễn Trãi, Hà Đông, Hà Nội <br>\n");
      out.write("                                    Điện thoại: 0967491368 <br>\n");
      out.write("                                    Email: nshoanglong@gmail.com\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    Mã khách hàng: ");
      out.print(users.getUserID());
      out.write("<br>\n");
      out.write("                                    Tên khách hàng: ");
      out.print(users.getUserName());
      out.write("<br>\n");
      out.write("                                    Email: ");
      out.print(users.getUserEmail());
      out.write("<br>\n");
      out.write("                                    Địa chỉ giao hàng: ");
      out.print(bill.getAddress());
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("            <table cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("                <tr class=\"heading\">\n");
      out.write("                    <td style=\"width:30%;\">\n");
      out.write("                        Phương thức thanh toán\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr class=\"details\">\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(bill.getPayment());
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <table>\n");
      out.write("                <tr class=\"heading\">\n");
      out.write("                    <td style=\"width: 7%;\">\n");
      out.write("                        STT\n");
      out.write("                    </td>\n");
      out.write("                    <td style=\"width:45%\">\n");
      out.write("                        Sách\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        Đơn giá\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        Số lượng\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        Thành tiền\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    for (int i = 0; i < billDetails.size(); i++) {
                
      out.write("\n");
      out.write("                <tr class=\"item\">\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(i + 1);
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(bookDAO.getBook(billDetails.get(i).getProductID()).getName());
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(bookDAO.getBook(billDetails.get(i).getProductID()).getPrice());
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(billDetails.get(i).getQuantity());
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(billDetails.get(i).getPrice() * billDetails.get(i).getQuantity());
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                <tr class=\"total\">\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print("Tổng: " + bill.getTotal());
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"abc\" style=\"text-align: center;\">\n");
      out.write("            <p><!-- Click the button to print the current page. --></p>\n");
      out.write("            <br>\n");
      out.write("             <a href=\"../jsp/index.jsp\"><button>Trang chủ</button></a>\n");
      out.write("\n");
      out.write("            <button onclick=\"myFunction()\">In Hóa Đơn</button>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("        </div>\n");
      out.write("    <script>\n");
      out.write("        function myFunction() {\n");
      out.write("            document.getElementById('abc').style.display = 'none';\n");
      out.write("            window.print();\n");
      out.write("            document.getElementById('abc').style.display = 'block';\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
