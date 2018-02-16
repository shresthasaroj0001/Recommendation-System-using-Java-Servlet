<%-- 
    Document   : RatingPage
    Created on : Sep 3, 2017, 9:31:32 PM
    Author     : Saroj
--%>

<%@page import="com.model.details.mobileDetailsModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.rating.coln.ViewDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Bootstrap Example</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="vendor/jquery/jquery-3.1.1.min.js" type="text/javascript"></script>
        <script src="vendor/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <%
            ArrayList<mobileDetailsModel> list = new ArrayList<mobileDetailsModel>();
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

        <%if (!found_tablename && !found_userName) {
                response.sendRedirect("login.jsp");
            } else {
                ViewDAO v = new ViewDAO();
                list = v.findthoseMObileThatAreNotRated(Table_Name);
                v.mobileRated(Table_Name);
            }%>

        <%
            if (list.size() < 1) {
        %>
        <h1>Sorry YOu have Rated all mobile</h1>
        <%
        } else {
        %>

        <div class="container" style="margin: 50px;">
            <form class="form-inline" action="testControler" method="post">
                <div class="row">
                <% int i = 0;
                    for (mobileDetailsModel m : list) {
                        String mobileNo = "mobileNo";
                        mobileNo = mobileNo.concat(String.valueOf(i));
//                        mobileNo = mobileNo.concat(String.valueOf(m.getId()));
                %>
                <style>
/*                    .form-inline .single-line {
                        display:inline-block;
                        width:100%;
                    }*/
.form-group.single-line {
    width: 100%;
}
.form-group.single-line select {
    float: right;
}
.inline{
    display: inline-block;
    width:100%;
}
                    </style>
                    
                        <div class="col-sm-4">
                            <div class="form-group  single-line" style="margin: 13px">
                    <label for="sel1"><%out.print(m.getName());%> </label>
                    <select class="form-control" name="<%out.print(mobileNo);%>">
                        <option value="0">Select Any Value</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                    </select>
                </div>
                        </div>
                        <div>
                <%i++;}%>
                <div class="myduc" style="padding: 15px">
                    <div class="form-group inline">
                        <button type="submit" class="btn btn-primary" style=" margin-right:50px;">Submit</button>
                        <button type="reset" class="btn btn-danger" style=" margin-right: 50px;">Reset</button>
                    </div>     
                </div> 
            </form>
            <%}%>
        </div>
    </body>
</html>
