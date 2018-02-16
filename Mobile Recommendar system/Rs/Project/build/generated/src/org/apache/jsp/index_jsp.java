package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Pcc.col.PCCDAO;
import java.util.ArrayList;
import com.model.details.mobileDetailsModel;
import com.forntend.coln.DisplayDAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Mobile World\n");
      out.write("        </title>\n");
      out.write("        <script src=\"vendor/popper/popper.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"vendor/popper/popper.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"vendor/jquery/jquery-3.1.1.js\" type=\"text/javascript\"></script>\n");
      out.write("    <a href=\"vendor/bootstrap/fonts/glyphicons-halflings-regular.woff2\"></a>\n");
      out.write("    <script src=\"vendor/jquery/jquery-3.1.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("    <a href=\"vendor/bootstrap/fonts/glyphicons-halflings-regular.woff\"></a>\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"css/Anz.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap-theme.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    <script\n");
      out.write("        src=\"https://code.jquery.com/jquery-3.2.1.min.js\"\n");
      out.write("        integrity=\"sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    ");

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
    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div class=\"nav1\"><!--nav bar ko lagi div-->\n");
      out.write("                <nav class=\"navbar navbar-fixed-top navbar-default\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#myNavbar22\" aria-expanded=\"false\" aria-controls=\"navbar\" style=\"background-color:#F50004\">\n");
      out.write("                                <span class=\"sr-only\">\n");
      out.write("                                    Toggle navigation\n");
      out.write("                                </span>\n");
      out.write("                                <span class=\"icon-bar\">\n");
      out.write("                                </span>\n");
      out.write("                                <span class=\"icon-bar\">\n");
      out.write("                                </span>\n");
      out.write("                                <span class=\"icon-bar\">\n");
      out.write("                                </span>                        \n");
      out.write("\n");
      out.write("                            </button>\n");
      out.write("                            <a class=\"navbar-brand\" href=\"index.jsp\">\n");
      out.write("                                <img src=\"photos/logo/logo_main.png\" class=\" img-responsive img-rounded\" alt=\"Mobile World\" height=\"100\" width=\"250\">\n");
      out.write("\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"myNavbar22\">\n");
      out.write("                            <ul class=\"nav navbar-nav\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"RatedPageVIew.jsp\">Rated Mobile List\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"Recommendation.jsp\">Recommendation\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"RatingPage.jsp\">Rate Mobile\n");
      out.write("                                    </a>\n");
      out.write("                                </li><li>\n");
      out.write("                                    <a href=\"registernewMobile.jsp\">Register Mobile\n");
      out.write("                                    </a>\n");
      out.write("                                </li><li>\n");
      out.write("                                    <a href=\"search.jsp\">Search\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"UploadPhoto.jsp\">Upload Photo\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\" id=\"navbar_right\">\n");
      out.write("                                ");
if (!found) {
      out.write("\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"signup.jsp\">\n");
      out.write("                                        <span class=\"glyphicon glyphicon-user\">\n");
      out.write("                                        </span> Sign Up\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"login.jsp\">\n");
      out.write("                                        <span class=\"glyphicon glyphicon-log-in\">\n");
      out.write("                                        </span> Login\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                ");
} else {
      out.write("\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <span class=\"glyphicon glyphicon-user\">\n");
      out.write("                                        </span>  Hi,");
out.println(cookieId); 
      out.write("\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"logOutController\">\n");
      out.write("                                        <span class=\"glyphicon glyphicon-log-in\">\n");
      out.write("                                        </span><b> Login Out</b>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"caruosel_part\">\n");
      out.write("                <div class=\"col-md-9\">\n");
      out.write("                    <div class=\"carousel-only\" style=\"height: 490px;\">\n");
      out.write("                        <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                            <!-- Indicators -->\n");
      out.write("                            <ol class=\"carousel-indicators\">\n");
      out.write("                                <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\">\n");
      out.write("                                </li>\n");
      out.write("                                <li data-target=\"#myCarousel\" data-slide-to=\"1\">\n");
      out.write("                                </li>\n");
      out.write("                                <li data-target=\"#myCarousel\" data-slide-to=\"2\">\n");
      out.write("                                </li>\n");
      out.write("                                <li data-target=\"#myCarousel\" data-slide-to=\"3\">\n");
      out.write("                                </li>\n");
      out.write("                            </ol>\n");
      out.write("                            <!-- Wrapper for slides -->\n");
      out.write("                            <div class=\"carousel-inner\" role=\"listbox\" style=\"max-height:500px;\">\n");
      out.write("                                <div class=\"item active\">\n");
      out.write("                                    <img src=\"photos/carosel/iphoneSE.jpg\" alt=\"Chania\" class=\"img-responsive\">\n");
      out.write("                                    <div class=\"carousel-caption\"> \n");
      out.write("                                        11\n");
      out.write("                                    </div>  \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <img src=\"photos/carosel/nokiacol.jpg\" alt=\"Chania\" class=\"img-responsive\">\n");
      out.write("                                    <div class=\"carousel-caption\"> \n");
      out.write("                                        222</div>  \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <img src=\"photos/carosel/s8.jpg\" alt=\"Chania\" class=\"img-responsive\">\n");
      out.write("                                    <div class=\"carousel-caption\"> \n");
      out.write("                                        33</div>  \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <img src=\"photos/carosel/sonyXperia-XA.jpg\" alt=\"Chania\" class=\"img-responsive\">\n");
      out.write("                                    <div class=\"carousel-caption\"> \n");
      out.write("                                        44</div>  \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Left and right controls -->\n");
      out.write("                            <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\">\n");
      out.write("                                </span>\n");
      out.write("                                <span class=\"sr-only\">Previous\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\">\n");
      out.write("                                </span>\n");
      out.write("                                <span class=\"sr-only\">Next\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3\" style=\" padding-left: 0% !important;\">\n");
      out.write("                    <div class=\"right_sidebar\">\n");
      out.write("                        <div class=\"recentviews\"> <h1><b>Recent Added </b></h1> </div>\n");
      out.write("                        <div class=\"list-group\" style=\"height: 449px;\">\n");
      out.write("                            <a href=\"#\" class=\"list-group-item\">Nokia 6</a>\n");
      out.write("                            <a href=\"#\" class=\"list-group-item\">Nokia 3</a>\n");
      out.write("                            <a href=\"#\" class=\"list-group-item\">Iphone 6s     </a>\n");
      out.write("                            <a href=\"#\" class=\"list-group-item\">Iphone 7</a> \n");
      out.write("                            <a href=\"#\" class=\"list-group-item\">Iphone SE</a>\n");
      out.write("                            <a href=\"#\" class=\"list-group-item\">Samsung s8+</a>\n");
      out.write("                            <a href=\"#\" class=\"list-group-item\">Samsung s7 Edge            </a>\n");
      out.write("                            <a href=\"#\" class=\"list-group-item\">Samsung Note 4</a>\n");
      out.write("                            <a href=\"#\" class=\"list-group-item\">Samsung c7 pro        </a> \n");
      out.write("                            <a href=\"#\" class=\"list-group-item\">Samsung J7 pro           </a>\n");
      out.write("                            <a href=\"#\" class=\"list-group-item\">Samsung J7 max        </a>\n");
      out.write("                            <a href=\"#\" class=\"list-group-item\">Woolen Products            </a>\n");
      out.write("                            <a href=\"#\" class=\"list-group-item\">Samsung Galaxy S8+     </a> \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div> <!-- right_sidebar closing-->\n");
      out.write("                </div><!-- col-md-3 clsoing -->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--<div class=\"space_bar\"></div>-->\n");
      out.write("\n");
      out.write("            <div class=\"main_part\" >\n");
      out.write("                <h1><b><marquee>Welcome to MobiWorld</marquee></b></h1><br>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");
if (found_tablename && found) {
                    PCCDAO v = new PCCDAO();
                   ArrayList<mobileDetailsModel> Result = v.FromJsp(Table_Name);
                    
      out.write("\n");
      out.write("            <div class=\"main_part\" style=\"background-color: gold; height: 60px\" >\n");
      out.write("                <h1><b>Recommendation</b></h1><br>\n");
      out.write("            </div>\n");
      out.write("            ");

                if (Result.size() < 1) {
            
      out.write("\n");
      out.write("            <h1>No Recommendations</h1>\n");
      out.write("            \n");
      out.write("                ");

                } else {
                    
      out.write("\n");
      out.write("                    <div class=\"div-inner\">\n");
      out.write("                        ");

                    for (mobileDetailsModel mdetail : Result) {
                
      out.write("\n");
      out.write("                <div class=\"\" style=\"margin-left: 0; margin-right: 8px; margin-bottom: 1%\">\n");
      out.write("                    <div style=\"text-align: center;\">");
out.print(mdetail.getName());
      out.write("</div>\n");
      out.write("                    <img src=\"mobilePics/");
out.print(mdetail.getName());
      out.write(".jpg\" alt=\"");
out.print(mdetail.getName());
      out.write("\" height=\"170\" width=\"200\"/>\n");
      out.write("                </div>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("            ");
}
            } 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"main_part\" style=\"background-color: gold; height: 60px\" >\n");
      out.write("                <h1><b>Newest Arrival</b></h1><br>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"div-wrapper\">\n");
      out.write("                ");

                    DisplayDAO d = new DisplayDAO();
                    ArrayList<mobileDetailsModel> NewArrival = d.NewArrival();
                
      out.write("\n");
      out.write("                <div class=\"div-inner\">\n");
      out.write("                    ");

                        for (mobileDetailsModel m : NewArrival) {
                    
      out.write("\n");
      out.write("                    <div class=\"\" style=\"margin-left: 0; margin-right: 8px; margin-bottom: 1%\">\n");
      out.write("                        <div style=\"text-align: center;\">");
out.print(m.getName());
      out.write("</div>\n");
      out.write("                        <img src=\"mobilePics/");
out.print(m.getName());
      out.write(".jpg\" alt=\"");
out.print(m.getName());
      out.write("\" height=\"170\" width=\"200\"/>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer class=\"modal-footer\" style=\"clear:both\">\n");
      out.write("            <div class=\"newarival\">\n");
      out.write("                <img src=\"photos/new-arrivals.jpg\" width=\"195\" height=\"38\">\n");
      out.write("            </div>\n");
      out.write("            <marquee direction=\"right\" truespeed scrollamount=\"2\" scrolldelay=\"40\" onMouseOver=\"stop()\" onMouseOut=\"start()\" style=\"margin:1%\">\n");
      out.write("                <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                             ");

                    ArrayList<mobileDetailsModel> marque = d.GetALLMobileDetails();
                    for(mobileDetailsModel m:marque){
                
      out.write("\n");
      out.write("                <td rowspan=\"2\" align=\"center\" style=\"padding: 5px\">\n");
      out.write("                                <a> <img src=\"mobilePics/");
out.print(m.getName());
      out.write(".jpg\" alt=\"\" height=\"80\"/>\n");
      out.write("                                </a>\n");
      out.write("                            </td>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </marquee>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"footer_inner\" style=\"text-align:center;background-color:#49FF00;\">\n");
      out.write("                <span style=\"float:right; font-size:14px; font-weight:bold; text-align:left;\">We Accept<br><img src=\"photos/weaccept.png\" alt=\"we accept\" width=\"290\" height=\"34\" vspace=\"5\">\n");
      out.write("\n");
      out.write("                </span>\n");
      out.write("                <a href=\" \">Home\n");
      out.write("                </a> |<a href=\" \">About Us\n");
      out.write("                </a> |  <a href=\" \">Terms & Condition\n");
      out.write("                </a> |  <a href=\" \">Faq\n");
      out.write("                </a> |  <a href=\" \">Contact Us\n");
      out.write("                </a>\n");
      out.write("                <p>      All Right Reserved, ? Mobile World, 2017. <br>Developed By: <a href=\"http://https://www.facebook.com//\" target=\"_blank\">saAnz\n");
      out.write("                    </a>\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </footer>\n");
      out.write("    </div> <!--wrapper closing-->\n");
      out.write("</div><!-- container closing-->\n");
      out.write("\n");
      out.write("<!--<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("-->  \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
