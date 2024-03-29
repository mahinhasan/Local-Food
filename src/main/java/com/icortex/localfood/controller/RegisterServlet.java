package com.icortex.localfood.controller;

import com.icortex.localfood.dao.RegisterDao;
import com.icortex.localfood.model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        String name = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String gender = req.getParameter("gender");
        String city = req.getParameter("city");

        String check = req.getParameter("check");

        // Set user info
        User userInfo = new User();
        userInfo.setUsername(name);
        userInfo.setEmail(email);
        userInfo.setPassword(password);
        userInfo.setGender(gender);
        userInfo.setCity(city);

        RegisterDao register = new RegisterDao();
        if(check != null){
            try {
                boolean res = register.userRegister(userInfo);
                if(res){
                    session.setAttribute("succMessage", "Registrations successful!");
                    String jspPath = "/WEB-INF/views/login.jsp";
                    RequestDispatcher rd = req.getRequestDispatcher(jspPath);
                    rd.forward(req,resp);
                }else {
                    session.setAttribute("failMessage","Something went wrong !");
                    String jspPath = "webapp/register.jsp";
                    req.getRequestDispatcher(jspPath).forward(req,resp);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }else {
            session.setAttribute("failMessage","Please check agree & term condition!");
            String jspPath = "register.jsp";
            req.getRequestDispatcher(jspPath).forward(req,resp);
        }
    }
}
