/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import com.google.gson.Gson;
import dao.BookDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Book;

/**
 *
 * @author HOANG
 */
public class LoadmoreBook extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(LoadmoreBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        int page = Integer.parseInt(request.getParameter("page"));
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        System.out.println(page);
        BookDAO dao = new BookDAO();
        List<Book> list = null;
        try {
            list = dao.getListBook(page);
        } catch (SQLException ex) {
            Logger.getLogger(SearchBook.class.getName()).log(Level.SEVERE, null, ex);
        }

        Gson gson = new Gson();
        String objectToReturn = gson.toJson(list); //Convert List -> Json
        out.write(objectToReturn); //Đưa Json trả về Ajax
        out.flush();
        out.close();

    }
}
