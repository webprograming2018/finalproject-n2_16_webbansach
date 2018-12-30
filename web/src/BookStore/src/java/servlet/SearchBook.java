/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import com.google.gson.Gson;
import com.mysql.fabric.Server;
import dao.BookDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Book;

/**
 *
 * @author HOANG
 */
public class SearchBook extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        System.out.println(name);
        BookDAO dao = new BookDAO();
        List<Book> list = null;
        try {
            list = dao.getListBook(name);
        } catch (SQLException ex) {
            Logger.getLogger(SearchBook.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (!list.isEmpty()) {
            PrintWriter out = response.getWriter();
            Gson gson = new Gson();
            String objectToReturn = gson.toJson(list); //Convert List -> Json
            out.write(objectToReturn); //Đưa Json trả về Ajax
            out.flush();
            out.close();
        } else {
            PrintWriter out = response.getWriter();
            out.write("{\"check\":\"fail\"}");
            out.flush();
            out.close();
        }
    }
}
