package com.sirosh.mvc.web;

import com.sirosh.mvc.model.UserDB;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Illya on 30.01.17.
 */
public class Authorization extends HttpServlet{


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        if(UserDB.getInstance().isCorrect(request.getParameter("login"),request.getParameter("pass"))){

            request.setAttribute("user", UserDB.getInstance().getUser(request.getParameter("login"),request.getParameter("pass")));

            RequestDispatcher view = request.getRequestDispatcher("index.jsp");
            view.forward(request, response);
        }else{

            response.sendError(403);
        }




    }

}
