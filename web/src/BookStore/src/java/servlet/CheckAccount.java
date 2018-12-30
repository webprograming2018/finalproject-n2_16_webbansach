/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.UsersDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HOANG
 */
public class CheckAccount extends HttpServlet {

    UsersDAO usersDAO = new UsersDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("user_name") != null) {
            if (usersDAO.checkName(request.getParameter("user_name"))) {
                response.getWriter().write("<img class=\"checkimg\" src=\"../images/not-available.png\" />");
            } else {
                response.getWriter().write("<img class=\"checkimg\" src=\"../images/available.png\" />");
            }
        }

        if (request.getParameter("email") != null) {
            if (usersDAO.checkEmail(request.getParameter("email"))) {
                response.getWriter().write("<img class=\"checkimg\" src=\"../images/not-available.png\" />");
            } else {
                response.getWriter().write("<img class=\"checkimg\" src=\"../images/available.png\" />");
            }
        }
    }
}
