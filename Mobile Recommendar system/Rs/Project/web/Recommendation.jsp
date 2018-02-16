<%-- 
    Document   : Recommendation
    Created on : Sep 7, 2017, 8:09:03 PM
    Author     : Saroj
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.model.details.mobileDetailsModel"%>
<%@page import="com.Pcc.col.PCCDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/form-mini.css" rel="stylesheet" type="text/css"/>
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="vendor/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="vendor/jquery/jquery-3.1.1.min.js" type="text/javascript"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style>
            td.Nam {
                font-size: large;
                font-style: unset;
                font-family: monospace;
            }
            td, th {
                /* padding: 0; */
                padding-left: 15px;
                font-family: cursive;
                font-size: large;
            }
        </style>
    </head>
    <body style="margin: 50px;">
         <a href="index.jsp" style="font-size: x-large; text-decoration: underline;">Back to Home</a>
    
        <%
            ArrayList<mobileDetailsModel> Result = new ArrayList<mobileDetailsModel>();
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


        <%if (!found_tablename && !found_userName) {
                response.sendRedirect("login.jsp");
            } else {
                PCCDAO v = new PCCDAO();
                Result = v.FromJsp(Table_Name);
            }%>

        <%
            if (Result.size() < 1) {
        %>
        <h1>e</h1>
        <%
        } else {
                int counter=0;
            for (mobileDetailsModel mdetail : Result) { counter++;
        %>
        <div style="height: 10px; color: white"></div>
        <div class="row" style="border-bottom:1px solid #ccc;">
            <div class="col-sm-2" style="background-color:#fff;">
                <%=counter%>
            </div>
            <div class="col-sm-5" style="background-color:#fff; ">
                <div>
                    <table>
                        <tr>
                            <td class="Nam">Name</td>
                            <td>:</td>
                            <td class="val"><%out.print(mdetail.getName());%></td>
                        </tr>
                        <tr>



                        <tr>
                            <td class="Nam">Brand</td>
                            <td>:</td>
                            <td class="val"><%out.print(mdetail.getBrand());%></td>
                        </tr>
                        <tr>
                        <tr>
                            <td class="Nam">Platform</td>
                            <td>:</td>
                            <td class="val"><%out.print(mdetail.getPlatform());%></td>
                        </tr>
                        <tr>
                            <td class="Nam">Display</td>
                            <td>:</td>
                            <td class="val"><%out.print(mdetail.getDisplay());%>"</td>
                        </tr>   
                        <tr>
                            <td class="Nam">RAM</td>
                            <td>:</td>
                            <td class="val"><%out.print(mdetail.getRam());%> G.B</td>
                        </tr>   
                        <tr>
                            <td class="Nam">Battery</td>
                            <td>:</td>
                            <td class="val"> <%out.print(mdetail.getBattery());%>mah</td>
                        </tr>
                        <tr>
                            <td class="Nam">Price</td>
                            <td>:</td>
                            <td class="val"> Rs.<%out.print(mdetail.getPrice());%></td>
                        </tr>
                    </table>
                </div>
            </div>
            <div class="col-sm-5" style="background-color:#fff;">.
                <img src="mobilePics/<%out.print(mdetail.getPhotoid());%>" alt="<%out.print(mdetail.getName());%>" height="200"/>
            </div>
        </div>
        
        
        
        
        <%}  %> 
        

        <%}%>
    </body>
</html>
