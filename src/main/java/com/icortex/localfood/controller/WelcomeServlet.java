package com.icortex.localfood.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/goToLogin")
public class WelcomeServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String jspPath = "/WEB-INF/views/login.jsp";
        RequestDispatcher rd = req.getRequestDispatcher(jspPath);
        rd.forward(req,resp);
    }
}
