/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.BookDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Book;
import model.Cart;
import model.Item;

/**
 *
 * @author HOANG
 */
public class CartServlet extends HttpServlet {
    private final BookDAO bookDAO = new BookDAO();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String command = request.getParameter("command");
        String bookID = request.getParameter("bookID");
        Cart cart = (Cart) session.getAttribute("cart");
        
        try {
            Long idBook = Long.parseLong(bookID);
            Book b = bookDAO.getBook(idBook);
            switch (command) {
                case "plus":
                    if (cart.getCartItems().containsKey(idBook)) {
                        cart.plusToCart(idBook, new Item(b,
                                cart.getCartItems().get(idBook).getQuantity()));
                    } else {
                        cart.plusToCart(idBook, new Item(b, 1));
                    }
                    break;
                case "remove":
                    cart.removeToCart(idBook);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("jsp/index.jsp");
        }
        session.setAttribute("cart", cart);
        response.sendRedirect("jsp/index.jsp");
    }
}
