<%@page import="com.Pcc.col.PCCDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.model.details.mobileDetailsModel"%>
<%@page import="com.forntend.coln.DisplayDAO"%>
<html>
    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Mobile World
        </title>
        <script src="vendor/popper/popper.js" type="text/javascript"></script>
        <script src="vendor/popper/popper.min.js" type="text/javascript"></script>


        <script src="vendor/jquery/jquery-3.1.1.js" type="text/javascript"></script>
    <a href="vendor/bootstrap/fonts/glyphicons-halflings-regular.woff2"></a>
    <script src="vendor/jquery/jquery-3.1.1.min.js" type="text/javascript"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <script src="vendor/bootstrap/js/bootstrap.js" type="text/javascript"></script>
    <a href="vendor/bootstrap/fonts/glyphicons-halflings-regular.woff"></a>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link href="vendor/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <link href="css/Anz.css" rel="stylesheet" type="text/css"/>
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="vendor/bootstrap/css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
    <link href="vendor/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>

    <script
        src="https://code.jquery.com/jquery-3.2.1.min.js"
        integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
    crossorigin="anonymous"></script>
</head>

<body>

    <%
        Boolean found_tablename = false;
        String Table_Name = null;
        Cookie cookie = null;
        Cookie[] cookies = null;
        Boolean found = false;
        String cookieId = null;
        // Get an array of Cookies associated with the this domain
        cookies = request.getCookies();
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                cookie = cookies[i];
                if ((cookie.getName().equals("username"))) {
                    out.println("!!! Cookie found !!!");
                    if ((cookie.getValue() != null) && (cookie.getValue().length() > 0)) //               out.print("Value: " + cookie.getValue( )+" <br/>");
                    {
                        cookieId = cookie.getValue();
                        found = !found;
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


    <div class="container">
        <div class="wrapper">
            <div class="nav1"><!--nav bar ko lagi div-->
                <nav class="navbar navbar-fixed-top navbar-default">
                    <div class="container">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#myNavbar22" aria-expanded="false" aria-controls="navbar" style="background-color:#F50004">
                                <span class="sr-only">
                                    Toggle navigation
                                </span>
                                <span class="icon-bar">
                                </span>
                                <span class="icon-bar">
                                </span>
                                <span class="icon-bar">
                                </span>                        

                            </button>
                            <a class="navbar-brand" href="index.jsp">
                                <img src="photos/logo/logo_main.png" class=" img-responsive img-rounded" alt="Mobile World" height="100" width="250">

                            </a>
                        </div>
                        <div class="collapse navbar-collapse" id="myNavbar22">
                            <ul class="nav navbar-nav">
                                <li>
                                    <a href="RatedPageVIew.jsp">Rated Mobile List
                                    </a>
                                </li>
                                <li>
                                    <a href="Recommendation.jsp">Recommendation
                                    </a>
                                </li>
                                <li>
                                    <a href="RatingPage.jsp">Rate Mobile
                                    </a>
                                </li><li>
                                    <a href="registernewMobile.jsp">Register Mobile
                                    </a>
                                </li><li>
                                    <a href="search.jsp">Search
                                    </a>
                                </li>
                                <li>
                                    <a href="UploadPhoto.jsp">Upload Photo
                                    </a>
                                </li>
                            </ul>
                            <ul class="nav navbar-nav navbar-right" id="navbar_right">
                                <%if (!found) {%>
                                <li>
                                    <a href="signup.jsp">
                                        <span class="glyphicon glyphicon-user">
                                        </span> Sign Up
                                    </a>
                                </li>
                                <li>
                                    <a href="login.jsp">
                                        <span class="glyphicon glyphicon-log-in">
                                        </span> Login
                                    </a>
                                </li>
                                <%} else {%>
                                <li>
                                    <a href="#">
                                        <span class="glyphicon glyphicon-user">
                                        </span>  Hi,<%out.println(cookieId); %>
                                    </a>
                                </li>
                                <li>
                                    <a href="logOutController">
                                        <span class="glyphicon glyphicon-log-in">
                                        </span><b> Login Out</b>
                                    </a>
                                </li>
                                <%}%>
                            </ul>
                        </div>
                    </div>
                </nav>
            </div>

            <div class="caruosel_part">
                <div class="col-md-9">
                    <div class="carousel-only" style="height: 490px;">
                        <div id="myCarousel" class="carousel slide" data-ride="carousel">
                            <!-- Indicators -->
                            <ol class="carousel-indicators">
                                <li data-target="#myCarousel" data-slide-to="0" class="active">
                                </li>
                                <li data-target="#myCarousel" data-slide-to="1">
                                </li>
                                <li data-target="#myCarousel" data-slide-to="2">
                                </li>
                                <li data-target="#myCarousel" data-slide-to="3">
                                </li>
                            </ol>
                            <!-- Wrapper for slides -->
                            <div class="carousel-inner" role="listbox" style="max-height:500px;">
                                <div class="item active">
                                    <img src="photos/carosel/iphoneSE.jpg" alt="Chania" class="img-responsive">
                                    <div class="carousel-caption"> 
                                        11
                                    </div>  
                                </div>
                                <div class="item">
                                    <img src="photos/carosel/nokiacol.jpg" alt="Chania" class="img-responsive">
                                    <div class="carousel-caption"> 
                                        222</div>  
                                </div>
                                <div class="item">
                                    <img src="photos/carosel/s8.jpg" alt="Chania" class="img-responsive">
                                    <div class="carousel-caption"> 
                                        33</div>  
                                </div>
                                <div class="item">
                                    <img src="photos/carosel/sonyXperia-XA.jpg" alt="Chania" class="img-responsive">
                                    <div class="carousel-caption"> 
                                        44</div>  
                                </div>
                            </div>

                            <!-- Left and right controls -->
                            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true">
                                </span>
                                <span class="sr-only">Previous
                                </span>
                            </a>
                            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true">
                                </span>
                                <span class="sr-only">Next
                                </span>
                            </a>
                        </div>
                    </div>
                </div>

                <div class="col-md-3" style=" padding-left: 0% !important;">
                    <div class="right_sidebar">
                        <div class="recentviews"> <h1><b>Recent Added </b></h1> </div>
                        <div class="list-group" style="height: 449px;">
                            <a href="#" class="list-group-item">Nokia 6</a>
                            <a href="#" class="list-group-item">Nokia 3</a>
                            <a href="#" class="list-group-item">Iphone 6s     </a>
                            <a href="#" class="list-group-item">Iphone 7</a> 
                            <a href="#" class="list-group-item">Iphone SE</a>
                            <a href="#" class="list-group-item">Samsung s8+</a>
                            <a href="#" class="list-group-item">Samsung s7 Edge            </a>
                            <a href="#" class="list-group-item">Samsung Note 4</a>
                            <a href="#" class="list-group-item">Samsung c7 pro        </a> 
                            <a href="#" class="list-group-item">Samsung J7 pro           </a>
                            <a href="#" class="list-group-item">Samsung J7 max        </a>
                            <a href="#" class="list-group-item">Woolen Products            </a>
                            <a href="#" class="list-group-item">Samsung Galaxy S8+     </a> 
                        </div>

                    </div> <!-- right_sidebar closing-->
                </div><!-- col-md-3 clsoing -->
            </div>

            <!--<div class="space_bar"></div>-->

            <div class="main_part" >
                <h1><b><marquee>Welcome to MobiWorld</marquee></b></h1><br>
            </div>

            <%if (found_tablename && found) {
                    PCCDAO v = new PCCDAO();
                   ArrayList<mobileDetailsModel> Result = v.FromJsp(Table_Name);
                    %>
            <div class="main_part" style="background-color: gold; height: 60px" >
                <h1><b>Recommendation</b></h1><br>
            </div>
            <%
                if (Result.size() < 1) {
            %>
            <h1>No Recommendations</h1>
            
                <%
                } else {
                    %>
                    <div class="div-inner">
                        <%
                    for (mobileDetailsModel mdetail : Result) {
                %>
                <div class="" style="margin-left: 0; margin-right: 8px; margin-bottom: 1%">
                    <div style="text-align: center;"><%out.print(mdetail.getName());%></div>
                    <img src="mobilePics/<%out.print(mdetail.getName());%>.jpg" alt="<%out.print(mdetail.getName());%>" height="170" width="200"/>
                </div>
                <%
                    }
                %>
            </div>
            <%}
            } %>


            <div class="main_part" style="background-color: gold; height: 60px" >
                <h1><b>Newest Arrival</b></h1><br>
            </div>
            <div class="div-wrapper">
                <%
                    DisplayDAO d = new DisplayDAO();
                    ArrayList<mobileDetailsModel> NewArrival = d.NewArrival();
                %>
                <div class="div-inner">
                    <%
                        for (mobileDetailsModel m : NewArrival) {
                    %>
                    <div class="" style="margin-left: 0; margin-right: 8px; margin-bottom: 1%">
                        <div style="text-align: center;"><%out.print(m.getName());%></div>
                        <img src="mobilePics/<%out.print(m.getName());%>.jpg" alt="<%out.print(m.getName());%>" height="170" width="200"/>
                    </div>
                    <%
                        }
                    %>
                </div>
            </div> 


        </div> 











        <footer class="modal-footer" style="clear:both">
            <div class="newarival">
                <img src="photos/new-arrivals.jpg" width="195" height="38">
            </div>
            <marquee direction="right" truespeed scrollamount="2" scrolldelay="40" onMouseOver="stop()" onMouseOut="start()" style="margin:1%">
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tbody>
                        <tr>
                             <%
                    ArrayList<mobileDetailsModel> marque = d.GetALLMobileDetails();
                    for(mobileDetailsModel m:marque){
                %>
                <td rowspan="2" align="center" style="padding: 5px">
                                <a> <img src="mobilePics/<%out.print(m.getName());%>.jpg" alt="" height="80"/>
                                </a>
                            </td>
                            <%}%>
                        </tr>

                    </tbody>

                </table>

            </marquee>



            <div class="footer_inner" style="text-align:center;background-color:#49FF00;">
                <span style="float:right; font-size:14px; font-weight:bold; text-align:left;">We Accept<br><img src="photos/weaccept.png" alt="we accept" width="290" height="34" vspace="5">

                </span>
                <a href=" ">Home
                </a> |<a href=" ">About Us
                </a> |  <a href=" ">Terms & Condition
                </a> |  <a href=" ">Faq
                </a> |  <a href=" ">Contact Us
                </a>
                <p>      All Right Reserved, ? Mobile World, 2017. <br>Developed By: <a href="http://https://www.facebook.com//" target="_blank">saAnz
                    </a>
                </p>

            </div>

        </footer>
    </div> <!--wrapper closing-->
</div><!-- container closing-->

<!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
-->  

</body>

</html>
