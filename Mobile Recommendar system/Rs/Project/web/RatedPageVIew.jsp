<%-- 
    Document   : RatedPageVIew
    Created on : Sep 5, 2017, 1:07:48 PM
    Author     : Saroj
--%>

<%@page import="com.upload.controler.UploadDAo"%>
<%@page import="com.rating.coln.ViewDAO"%>
<%@page import="com.rating.coln.MObileRated_UserModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.model.details.mobileDetailsModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table {
                border-collapse: collapse;
                width: 100%;
            }

            th, td {
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even){background-color: #f2f2f2}

            th {
                background-color: #4CAF50;
                color: white;
            }
        </style>
    </head>
    <body style="margin: 5%; padding: 10px;">
       
        <%
            ArrayList<MObileRated_UserModel> mobileRated = new ArrayList<MObileRated_UserModel>();
        %>

        <%
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
                //                                        out.println("<h2>No cookies founds</h2>");
            }
        %>

        <a href="index.jsp">Return to home</a>
        
         <div style=" height: 55px">
             <h1> Details of <%out.println(userName);%></h1>
        
        <%if (!found_tablename && !found_userName) {
                response.sendRedirect("login.jsp");
            } else {
                ViewDAO v = new ViewDAO();
                UploadDAo DetailsDAO = new UploadDAo();
                ArrayList<MObileRated_UserModel> RatedMobileList = v.mobileRated(Table_Name);
        %>
        <h3>Rating of <i><font style="color: red"><%out.println(RatedMobileList.size());%></font></i> Mobiles</h3>
        </div> 
        <table style="margin-top: 46px;"> 
            <tr>
                <th>S.N</th>
                <th>Mobile Name</th>
                <th>Rating</th>
                <th>Rating</th>
            </tr>
            <%int i = 1;
                for (MObileRated_UserModel mob : RatedMobileList) {
                    mobileDetailsModel moBileDetails = DetailsDAO.IndividualMobileDetails(mob.getMobile_id());
            %>

            <tr>
                <td><%=i%></td>
                <td><%out.print(moBileDetails.getName());%></td>
                <td><%out.print(mob.getRateing());%></td>
                <td> <img src="rating/<%out.print(mob.getRateing());%>.jpg" alt="4" style="height: 55px !important;width: 259px !important;"> </td>
            </tr>
            <% i++;
                } %>
        </table>
        <%
    }%>





        
    </body>
</html>
