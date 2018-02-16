package com.search.col;

import com.model.details.mobileDetailsModel;
import com.model.details.vector_detailsModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Saroj
 */
public class SearchController extends HttpServlet {

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
            String display = request.getParameter("display");
            String ram = request.getParameter("ram");
            String price = request.getParameter("price");
            String os = request.getParameter("os");
            String battery = request.getParameter("battery");
            String brand = request.getParameter("brand");

            
            int displaynew = 0, ram_new = 0, price_new = 0, os_new = 0, battery_new = 0, brand_new = 0;
            try {
                displaynew = Integer.parseInt(display);
            } catch (Exception e) {
                response.sendRedirect("search.jsp");
            }
            try {
                ram_new = Integer.parseInt(ram);
            } catch (Exception e) {
                response.sendRedirect("search.jsp");
            }
            try {
                price_new = Integer.parseInt(price);
            } catch (Exception e) {
                response.sendRedirect("search.jsp");
            }
            try {
                os_new = Integer.parseInt(os);
            } catch (Exception e) {
                response.sendRedirect("search.jsp");
            }
            try {
                battery_new = Integer.parseInt(battery);
            } catch (Exception e) {
                response.sendRedirect("search.jsp");
            }
            try {
                brand_new = Integer.parseInt(brand);
            } catch (Exception e) {
                response.sendRedirect("search.jsp");
            }
            if((battery_new==0)&&(brand_new==0)&&(displaynew==0)&&(os_new==0)&&(price_new==0)&&(ram_new==0)){
//                response.sendRedirect("search.jsp");
                RequestDispatcher r;
                r = request.getRequestDispatcher("search.jsp");
                r.forward(request, response);
//                response.sendRedirect("search.jsp");
            }
            
            vector_detailsModel searchQuery = new vector_detailsModel();
            searchQuery.setBattery(battery_new);
            searchQuery.setBrand(brand_new);
            searchQuery.setDisplay(displaynew);
            searchQuery.setPlatform(os_new);
            searchQuery.setPrice(price_new);
            searchQuery.setRam(ram_new);

            controllerclass cl = new controllerclass();
            ArrayList<mobileDetailsModel> result = cl.initiate(searchQuery);
            
            RequestDispatcher rd=null;
            HttpSession session = request.getSession(true);
            if(result.size()>0){
                request.setAttribute("result", result);
                session.setAttribute("result", result);
            }
            response.sendRedirect("search.jsp");
//            rd = request.getRequestDispatcher("search.jsp");
//            rd.forward(request, response);

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
