<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.model.details.mobileDetailsModel"%>
<%@page import="com.upload.controler.UploadDAo"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">       
        <title>Upload Photo Page</title>
        <link href="vendor/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="vendor/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="vendor/jquery/jquery-3.1.1.min.js" type="text/javascript"></script>
        <script src="vendor/bootstrap/js/test.js" type="text/javascript"></script>
        <%
            UploadDAo dd = new UploadDAo();
            ArrayList<mobileDetailsModel> LeftForUpload = dd.LeftForUpload();
            Boolean isSuces = (Boolean) request.getAttribute("isSuccess");
        %>

        <%if (isSuces != null) {
                if (isSuces) {
        %>
        <script>
            alert("Photo Uploaded Succccesfulyy");
        </script>
        <%} else {  %>
        <script>
            alert("Failed check file and fileName");
        </script>
        <%}
            }%>
    </head>

    <body>
        <%
            if (LeftForUpload == null) {
        %>
        <h1>Check Connection</h1>
        <%} else { //main closing   %>
        <div class="container">
            <div class="col-md-8 col-md-offset-2">
                <%
                    if (LeftForUpload.size() < 1) { //secondary checking closing
                        response.sendRedirect("index.jsp");
                %>
                <h1>Sorry No Mobile Left for Upload</h1>
                <%} else {%>
                <h3>Upload Here: </h3> 
                <form method="post" action="UploaaadController" enctype="multipart/form-data" >
                    <div class="form-group">
                        <label for="sel1">Select Mobile Name:</label>
                        <select class="form-control" name="photoNAMEE">
                            <option value="0">Select Any One</option>
                            <%
                                for (mobileDetailsModel mobile : LeftForUpload) {
                            %>
                            <option value="<%out.print(mobile.getId());%>"><%out.print(mobile.getName());%></option>
                            <%}%>
                        </select>
                    </div>
                        <div class="form-group">
                        <label for="sel1">Select Image file(jpeg,jpgbmp)</label>  
                    <input type="file" name="photo">
                        </div>
                        <div class="form-group">
                        <button type="submit" class="btn btn-primary pull-right">Submit</button>
                        <button type="reset" class="btn btn-danger">Reset</button>
                    </div>
                   
                </form>
            </div>
        </div>
        <%}
            }%>
    </body>
</html>
