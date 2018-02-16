<%-- 
    Document   : search
    Created on : Aug 31, 2017, 7:18:31 PM
    Author     : Saroj
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.model.details.mobileDetailsModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
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

    <body>
        <a href="index.jsp" style="font-size: x-large; text-decoration: underline;">Back to Home</a>
        <div class="main-content">
            <div class="form-mini-container">
                <h1>Search Form</h1>
                <form class="form-mini" method="post" action="SearchController">
                    <div class="form-row">
                        <label>
                            <select name="brand">
                                <option value="0">Choose a Brand</option>
                                <option value="1">Samsung</option>
                                <option value="2">Apple</option>
                                <option value="3">Black Berry</option>
                                <option value="4">Huwai</option>
                                <option value="5">Nokia</option>
                                <option value="6">Other</option>
                            </select>
                        </label>
                    </div>
                    <div class="form-row">
                        <label>
                            <select name="display">
                                <option value="0">Choose a Display Size</option>
                                <option value="1">Below 4.4"</option>
                                <option value="2">4.5" - 4.9"</option>
                                <option value="3">5" - 5.4"</option>
                                <option value="4">5.5" - 5.9"</option>
                                <option value="5">Above 6"</option>
                            </select>
                        </label>
                    </div>

                    <div class="form-row">
                        <label>
                            <select name="os">
                                <option value="0">Choose OS</option>
                                <option value="1">Android</option>
                                <option value="2">IOS</option>
                                <option value="3">bb</option>
                                <option value="4">Windows</option>
                                <option value="5">Other</option>
                            </select>
                        </label>
                    </div>
                    <div class="form-row">
                        <label>
                            <select name="ram">
                                <option value="0">Select RAM</option>
                                <option value="1">0 - 1GB</option>
                                <option value="2">1.1GB - 2GB</option>
                                <option value="3">2.1GB - 4GB</option>
                                <option value="4">4.1GB - 6GB</option>
                                <option value="5">Above 6.1GB</option>
                            </select>
                        </label>
                    </div>
                    <div class="form-row">
                        <label>
                            <select name="price">
                                <option value="0">Select Price Range</option>
                                <option value="1">0 - Rs.10000</option>
                                <option value="2">Rs.10000 - Rs.20000</option>
                                <option value="3">Rs.20000 - Rs.30000</option>
                                <option value="4">Rs.30000 - Rs.50000</option>
                                <option value="5">Above Rs.50000</option>
                            </select>
                        </label>
                    </div>
                    <div class="form-row">
                        <label>
                            <select name="battery">
                                <option value="0">Choose a Battery Range</option>
                                <option value="1">0 - 1999mah</option>
                                <option value="2">2000mah - 2999mah</option>
                                <option value="3">3000mah - 3999mah</option>
                                <option value="4">Above 4000mah</option>
                            </select>
                        </label>
                    </div>


                    <div class="form-row form-last-row">
                        <button type="submit">Submit Form</button>
                    </div>

                </form>
            </div> 
            <!--form mini closing-->

        </div>
        <!--main content closing here-->
        <%
//            ArrayList<mobileDetailsModel> result = (ArrayList<mobileDetailsModel>) request.getAttribute("result");
            ArrayList<mobileDetailsModel> result = (ArrayList<mobileDetailsModel>) session.getAttribute("result");
        %>

        <%
            if (result != null) {
        %>
        <div class="container-fluid" style="margin: 5%; background-color:#fff;">
            <div class="row">
                <div class="col-sm-4" style="background-color:#ccc; color:#fff;">
                    S.N
                </div>
                <div class="col-sm-4" style="background-color:#ccc; color:#fff;">
                    Name
                </div>
                <div class="col-sm-4" style="background-color:#ccc; color:#fff;">.
                    Photo
                </div>
            </div>
            <%} %>
        
        <%
            if (result!= null) {  //printing
                if (result.size() > 0) { //checking size
                %>  

        <%
                    int counter=0;
            for (mobileDetailsModel mdetail : result) { counter++;
        %>
        <div style="height: 10px; color: white"></div>
        <div class="row"style="border-bottom:1px solid #ccc;">
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
        <%} } %> 
            
    <%}%>
</div>
    </body>
</html>
