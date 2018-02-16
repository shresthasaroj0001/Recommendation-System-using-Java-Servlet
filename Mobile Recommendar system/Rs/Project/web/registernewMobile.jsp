<%-- 
    Document   : registernewMobile
    Created on : Aug 31, 2017, 7:18:14 PM
    Author     : Saroj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register New Mobile</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link href="vendor/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <style>
            .container {
                padding-top: 0px !important;
            }
        </style>
    </head>
    <body>
        <div class="container" style="max-width:600px;padding:40px 20px;background:#ebeff2">
            <h3>Register New Phone</h3>
            <form class="form-horizontal"  role="form" action="RegisterController" method="post">
                <div class="form-group">
                    <label for="name" class ="control-label col-sm-3"> Name:</label>
                    <div class="col-sm-8">
                        <input type="name" class="form-control" id="name" placeholder="Enter name"  required="" name="name">
                    </div>
                </div>
                <div class="form-group">
                    <label for="name" class ="control-label col-sm-3"> Brand:</label>
                    <div class="col-sm-8">

                        <select name="brand" class="form-control">
                            <option value="0">Choose a Brand</option>
                            <option value="1">Samsung</option>
                            <option value="2">Apple</option>
                            <option value="3">Black Berry</option>
                            <option value="4">Huwai</option>
                            <option value="5">Nokia</option>
                            <option value="6">Other</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label for="name" class ="control-label col-sm-3"> Platform :</label>
                    <div class="col-sm-8">
                        <select name="os" class="form-control">
                            <option value="0">Choose OS/Platform</option>
                            <option value="1">Android</option>
                            <option value="2">IOS</option>
                            <option value="3">bb</option>
                            <option value="4">Windows</option>
                            <option value="5">Other</option>
                        </select>     </div>
                </div>


                <div class="form-group">
                    <label for="name" class ="control-label col-sm-3"> Display: </label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" name="display" placeholder="in inches" required="">   
                                
                </div>
        </div>




        <div class="form-group">
            <label for="name" class ="control-label col-sm-3"> RAM:</label>
            <div class="col-sm-8">
                <input type="text" name="ram" placeholder="in GB" required="" class="form-control">    </div>
        </div>




        <div class="form-group">
            <label for="name" class ="control-label col-sm-3">  Battery: </label>
            <div class="col-sm-8">
                <input type="number" class="form-control" name="battery" placeholder="in mah" required="">   </div>
        </div>



        <div class="form-group">
            <label for="name" class ="control-label col-sm-3">  Price : </label>
            <div class="col-sm-8">
                <input type="number" name="price" required="" class="form-control" placeholder="Dont put . (dot)"></div>
        </div>
        <div class="form-group">
            <label for="name" class ="control-label col-sm-3">  Release Date : </label>
            <div class="col-sm-8">
                <input type="text" name="date" required="" class="form-control" placeholder="" value="2017-05-01"></div>
        </div>


        <div class="form-group">
            <label for="name" class ="control-label col-sm-3"> Description:</label>
            <div class="col-sm-8">
                <textarea maxlength="65255" class="form-control" name="description" style="color: #5f5f5f;box-sizing: border-box;width: 240px;height: 80px;box-shadow: 1px 2px 4px 0 rgba(0, 0, 0, 0.08);font: normal 13px sans-serif;padding: 12px;border: 1px solid #dbdbdb;resize: vertical;" placeholder="Write down features"></textarea>  </div>
        </div>
        <div class="col-sm-offset-2 col-sm-8">
            <button type="submit" class="btn btn-default">Register</button>
        </div>

    </form>
</body>
</html>
