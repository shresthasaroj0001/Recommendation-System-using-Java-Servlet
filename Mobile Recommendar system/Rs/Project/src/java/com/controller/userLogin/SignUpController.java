/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller.userLogin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Saroj
 */
public class SignUpController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String Fname = request.getParameter("first-name");
            String Mname = request.getParameter("middle-name");
            String Lname = request.getParameter("last-name");
            String pwd = request.getParameter("password");
            
            User_Model mod = new User_Model();
            mod.setStaff_first_name(Fname);
            mod.setStaff_middle_name(Mname);
            mod.setStaff_last_name(Lname);
            mod.setStaff_pwd(pwd);
            
            loginDAO llogin = new loginDAO();
            int autoincerement = llogin.get_autoincrement_value_of_memberdata();
//            String tablename = autoincerement+"s";
            String tablename = "";
            tablename = autoincerement+"s";
            
            mod.setTable_name(tablename);
            
            Boolean add_user = llogin.add_user(mod);
            Boolean isSuccess = false;
            if(add_user){
                Boolean CreateTable4user = llogin.CreateTable4user(tablename);
                if(CreateTable4user)
                {
                    isSuccess = !isSuccess;
                }
            }
            RequestDispatcher rd=null;
            rd = request.getRequestDispatcher("signup.jsp");
            request.setAttribute("isSuccess", isSuccess);
            request.setAttribute("enteredData", mod);
            rd.forward(request, response);
                    
            
            
            
            
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
