/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upload.controler;

import com.model.details.mobileDetailsModel;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Saroj
 */
public class UploaaadController extends HttpServlet {

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
            RequestDispatcher rd = null;
            Boolean isSuccess = false;
            File file;
            int maxSize = 50000 * 60; // bytes
            int maxFactSize = 50000 * 60;
            String imageFOLDERpath = "E:/saroj/7th sem/Project/web/mobilePics";
            String type = request.getContentType();
            String photoname = "eror";
            int id = 0;
            UploadDAo upLoadDAO = new UploadDAo();

            if (type.contains("multipart/form-data")) {
                DiskFileItemFactory disFact = new DiskFileItemFactory();
                disFact.setSizeThreshold(maxFactSize);
                disFact.setRepository(new File("c:\\temp"));

                ServletFileUpload upload = new ServletFileUpload(disFact);
                upload.setSizeMax(maxSize);
                List<FileItem> lis = null;
                try {
                    lis = upload.parseRequest(request);
                } catch (FileUploadException ex) {
                    response.sendRedirect("index.jsp");
                }
                Iterator itr = lis.iterator();
                while (itr.hasNext()) {
                    FileItem item = (FileItem) itr.next();
                    if (item.isFormField()) {
                        if (item.getFieldName().equals("photoNAMEE")) {
                            String val = item.getString();
                            try {
                                id = Integer.parseInt(val);
                            } catch (Exception e) {
                                rd = request.getRequestDispatcher("UploadPhoto.jsp");
                                request.setAttribute("isSuccess", isSuccess);
                                rd.forward(request, response);
                            }
//                            String MobileName = upLoadDAO.IndividualMobileDetails(id);
                            mobileDetailsModel IndividualMobileDetails = upLoadDAO.IndividualMobileDetails(id);
                            String MobileName = IndividualMobileDetails.getName();
                            if (!(MobileName.equalsIgnoreCase("error"))) {
                                photoname = MobileName;
                            }
                        }
                    } else {
                        String test = item.getName();
                        int lastIndexOf = test.lastIndexOf(".");
                        String substring = test.substring(lastIndexOf + 1);
                        if ((substring.equalsIgnoreCase("jpeg")) || (substring.equalsIgnoreCase("jpg")) || (substring.equalsIgnoreCase("png")) || (substring.equalsIgnoreCase("bmp"))) {
                            photoname = photoname.concat(test.substring(lastIndexOf));
                            file = new File(imageFOLDERpath, photoname);
                            try {
                                item.write(file);
                                isSuccess = upLoadDAO.Uploadit(id, photoname);
                                
//                                out.println("uploaded --------------------");
//                                out.print(photoname);
//                                out.println(isSuccess);
                                //completes here
                            } catch (Exception ex) {
                                System.out.println(" error" + ex);
                            }
                         }// format checking ending here
                        
                    }
                } //while closing
            }
            request.setAttribute("isSuccess", isSuccess);
            rd = request.getRequestDispatcher("UploadPhoto.jsp");
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
