/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rating.coln;

import com.model.details.mobileDetailsModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Saroj
 */
public class testControler extends HttpServlet {

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
            Cookie cookie = null;
            Cookie[] cookies = null;
            Boolean found_userName = false;
            Boolean found_tablename = false;
            String userName = null;
            String Table_Name = null;
            // Get an array of Cookies associated with the this domain
            cookies = request.getCookies();
            if (cookies != null) {
                for (int i = 0; i < cookies.length; i++) {
                    cookie = cookies[i];
                    if ((cookie.getName().equals("username"))) {
                        //                                                out.println("!!! Cookie found !!!");
                        if ((cookie.getValue() != null) && (cookie.getValue().length() > 0)) //               out.print("Value: " + cookie.getValue( )+" <br/>");
                        {
                            userName = cookie.getValue();
                            found_userName = !found_userName;
                        }
                    }
                    if ((cookie.getName().equals("tablename"))) {
                        //                                                out.println("!!! Cookie found !!!");
                        if ((cookie.getValue() != null) && (cookie.getValue().length() > 0)) //               out.print("Value: " + cookie.getValue( )+" <br/>");
                        {
                            Table_Name = cookie.getValue();
                            found_tablename = !found_tablename;
                        }
                    }
                }
            } else {
                response.sendRedirect("login.jsp");
            }
            if (!found_tablename && !found_userName) {
                response.sendRedirect("login.jsp");
            } else {
                ViewDAO v = new ViewDAO();
                ArrayList<mobileDetailsModel> list = v.findthoseMObileThatAreNotRated(Table_Name);
                if (list.size() < 1) {
                    response.sendRedirect("index.jsp");
                } else {
                    ArrayList<MObileRated_UserModel> RatedList = new ArrayList<MObileRated_UserModel>();
                    int i = 0;
                    for (mobileDetailsModel m : list) {
                        String mobileNo = "mobileNo";
                        mobileNo = mobileNo.concat(String.valueOf(i));
                        String test = request.getParameter(mobileNo);
                        int val = 0;
                        try {
                            val = Integer.parseInt(test);
                        } catch (Exception e) {
                        } 
                        if (val != 0) {
                            MObileRated_UserModel rratingList = new MObileRated_UserModel();
                            rratingList.setMobile_id(m.getId());
                            rratingList.setRateing(val);
                            RatedList.add(rratingList);
                        }
                        i++;
                    }
                    Boolean upDateRatngValue = v.upDateRatingValue(RatedList, Table_Name);
                    if (upDateRatngValue) {
                        response.sendRedirect("index.jsp");
                    } else {
                        response.sendRedirect("RatingPage.jsp");
                    }
                }
            }
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
