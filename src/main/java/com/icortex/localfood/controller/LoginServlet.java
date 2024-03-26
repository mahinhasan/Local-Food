package com.icortex.localfood.controller;

import com.icortex.localfood.dao.LoginDao;
import com.icortex.localfood.model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        LoginDao loginDao = new LoginDao();
        String userValidate = loginDao.authenticateUser(user);

        if(userValidate.equals("Success")){
            req.setAttribute("userName",username);
            String jspPath = "/WEB-INF/views/welcome.jsp";
            RequestDispatcher rd = req.getRequestDispatcher(jspPath);
            rd.forward(req,resp);
        }else{
            String jspPath = "/WEB-INF/views/login.jsp";
            RequestDispatcher rd = req.getRequestDispatcher(jspPath);
            rd.forward(req,resp);
        }

    }
}
