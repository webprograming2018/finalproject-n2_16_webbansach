/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.UsersDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Users;

/**
 *
 * @author HOANG
 */
public class UserServlet extends HttpServlet {
    UsersDAO usersDAO = new UsersDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String command = request.getParameter("command");
        String url = "";
        Users users = new Users();
        HttpSession session = request.getSession();
        switch (command) {
            case "insert":
                users.setUserID(new java.util.Date().getTime());
                users.setUserName(request.getParameter("user_name"));
                users.setUserEmail(request.getParameter("email"));
                users.setUserPass(request.getParameter("pass"));
                users.setUserRole(false);
                if (!usersDAO.checkName(request.getParameter("user_name")) 
                        && !usersDAO.checkEmail(request.getParameter("email")) && request.getParameter("pass")!=null){
                    usersDAO.insertUser(users);
                    url = "jsp/register_success.jsp";
                } else {
                    url = "jsp/register.jsp";
                }
                break;
            case "login":
                users = usersDAO.login(request.getParameter("user_name"), request.getParameter("pass"));
                if (users != null) {
                    session.setAttribute("user", users);
                    url = "jsp/index.jsp";
                }else{
                    url = "jsp/login.jsp";
                }
                break;
            case "logout":
                if(session != null) session.invalidate();
                url = "jsp/index.jsp";
                break;
        }
        response.sendRedirect(url);
    }
}
