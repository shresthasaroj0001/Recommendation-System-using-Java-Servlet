package com.registerFone.coln;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.model.details.mobileDetailsModel;
import com.model.details.vector_detailsModel;
import com.value.vector.Battery;
import com.value.vector.Brand;
import com.value.vector.Display;
import com.value.vector.Platform;
import com.value.vector.RAM;
import com.value.vector.price;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Saroj
 */
public class RegisterController extends HttpServlet {

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
            String brand = request.getParameter("brand"); //use this
            int brand_new = 0;
            try {
                brand_new = Integer.parseInt(brand);
            } catch (Exception e) {
                response.sendRedirect("registernewMobile.jsp");
            }
            String os = request.getParameter("os"); //use this
            int os_new = 0;
            try {
                os_new = Integer.parseInt(os);
            } catch (Exception e) {
                response.sendRedirect("registernewMobile.jsp");
            }
           

            String name = request.getParameter("name");  //use this
            String battery1 = request.getParameter("battery");
            String RAM1 = request.getParameter("ram");
            String pric = request.getParameter("price");

            Double price = .0;
            pric = pric.replaceAll("[^\\d.]", "");
            try {
                price = Double.parseDouble(pric); //use this
            } catch (Exception e) {
                response.sendRedirect("registernewMobile.jsp");
            }
            Double RAM = .0;
            RAM1 = RAM1.replaceAll("[^\\d.]", "");
            try {
                RAM = Double.parseDouble(RAM1);
            } catch (Exception e) {
//use this
                response.sendRedirect("registernewMobile.jsp");
            }
            int Batry_new = 0;
            battery1 = battery1.replaceAll("[^\\d.]", "");
            try {
                Batry_new = Integer.parseInt(battery1); //use this
            } catch (Exception e) {
                response.sendRedirect("registernewMobile.jsp");
            }
             Double display_new = 0.0;
            String display = request.getParameter("display"); //display
            try {
                display_new = Double.parseDouble(display);
            } catch (Exception e) {
                response.sendRedirect("registernewMobile.jsp");
            }
            
            String rdate = request.getParameter("date");
            Date date;
             SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            try {
                date = df.parse(rdate);          
            } catch (ParseException ex) {
                date = new Date();
            }

            mobileDetailsModel model = new mobileDetailsModel();
            model.setDate(date);
            model.setBattery(Batry_new);
            model.setDisplay(display_new);
            model.setRam(RAM);
            model.setName(name);
            model.setPrice(price);

            Brand b = new Brand();
            model.setBrand(b.intTObrand(brand_new));
            
            Platform p = new Platform();
            model.setPlatform(p.intTObrand(os_new));
            model.setDescription(request.getParameter("description"));

            Boolean InsertIntoVectorDetails = false;
            RegistErDAO reg = new RegistErDAO();
            Boolean InsertIntoMobileDetails = reg.InsertIntoMobileDetails(model);
            if (InsertIntoMobileDetails) {
                int autoincremetn_num = reg.get_autoincrement_value_of_memberdata();
                vector_detailsModel vmodel = new vector_detailsModel();
                vmodel.setId(autoincremetn_num-1);
                Battery bb = new Battery();
                vmodel.setBattery(bb.BatteryyinputTOint(Double.parseDouble(battery1)));
                vmodel.setBrand(brand_new);
                Display dd = new Display();
                vmodel.setDisplay(dd.inputTOint(display_new));
                vmodel.setPlatform(os_new);
                RAM r = new RAM();
                vmodel.setRam(r.inputTOint(RAM));
//            vmodel.setRam(Integer.parseInt(RAM1));
                price pi = new price();
                vmodel.setPrice(pi.inputTOint(price));
                InsertIntoVectorDetails = reg.InsertIntoVectorDetails(vmodel);
            }
            if (InsertIntoVectorDetails) {
                response.sendRedirect("index.jsp");
            } else {
                response.sendRedirect("registernewMobile.jsp");
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
