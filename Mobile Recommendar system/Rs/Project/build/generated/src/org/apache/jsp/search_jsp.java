package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.model.details.mobileDetailsModel;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Search Page</title>\n");
      out.write("        <link href=\"css/form-mini.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"vendor/jquery/jquery-3.1.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            td.Nam {\n");
      out.write("                font-size: large;\n");
      out.write("                font-style: unset;\n");
      out.write("                font-family: monospace;\n");
      out.write("            }\n");
      out.write("            td, th {\n");
      out.write("                /* padding: 0; */\n");
      out.write("                padding-left: 15px;\n");
      out.write("                font-family: cursive;\n");
      out.write("                font-size: large;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <a href=\"index.jsp\" style=\"font-size: x-large; text-decoration: underline;\">Back to Home</a>\n");
      out.write("        <div class=\"main-content\">\n");
      out.write("            <div class=\"form-mini-container\">\n");
      out.write("                <h1>Search Form</h1>\n");
      out.write("                <form class=\"form-mini\" method=\"post\" action=\"SearchController\">\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <label>\n");
      out.write("                            <select name=\"brand\">\n");
      out.write("                                <option value=\"0\">Choose a Brand</option>\n");
      out.write("                                <option value=\"1\">Samsung</option>\n");
      out.write("                                <option value=\"2\">Apple</option>\n");
      out.write("                                <option value=\"3\">Black Berry</option>\n");
      out.write("                                <option value=\"4\">Huwai</option>\n");
      out.write("                                <option value=\"5\">Nokia</option>\n");
      out.write("                                <option value=\"6\">Other</option>\n");
      out.write("                            </select>\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <label>\n");
      out.write("                            <select name=\"display\">\n");
      out.write("                                <option value=\"0\">Choose a Display Size</option>\n");
      out.write("                                <option value=\"1\">Below 4.4\"</option>\n");
      out.write("                                <option value=\"2\">4.5\" - 4.9\"</option>\n");
      out.write("                                <option value=\"3\">5\" - 5.4\"</option>\n");
      out.write("                                <option value=\"4\">5.5\" - 5.9\"</option>\n");
      out.write("                                <option value=\"5\">Above 6\"</option>\n");
      out.write("                            </select>\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <label>\n");
      out.write("                            <select name=\"os\">\n");
      out.write("                                <option value=\"0\">Choose OS</option>\n");
      out.write("                                <option value=\"1\">Android</option>\n");
      out.write("                                <option value=\"2\">IOS</option>\n");
      out.write("                                <option value=\"3\">bb</option>\n");
      out.write("                                <option value=\"4\">Windows</option>\n");
      out.write("                                <option value=\"5\">Other</option>\n");
      out.write("                            </select>\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <label>\n");
      out.write("                            <select name=\"ram\">\n");
      out.write("                                <option value=\"0\">Select RAM</option>\n");
      out.write("                                <option value=\"1\">0 - 1GB</option>\n");
      out.write("                                <option value=\"2\">1.1GB - 2GB</option>\n");
      out.write("                                <option value=\"3\">2.1GB - 4GB</option>\n");
      out.write("                                <option value=\"4\">4.1GB - 6GB</option>\n");
      out.write("                                <option value=\"5\">Above 6.1GB</option>\n");
      out.write("                            </select>\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <label>\n");
      out.write("                            <select name=\"price\">\n");
      out.write("                                <option value=\"0\">Select Price Range</option>\n");
      out.write("                                <option value=\"1\">0 - Rs.10000</option>\n");
      out.write("                                <option value=\"2\">Rs.10000 - Rs.20000</option>\n");
      out.write("                                <option value=\"3\">Rs.20000 - Rs.30000</option>\n");
      out.write("                                <option value=\"4\">Rs.30000 - Rs.50000</option>\n");
      out.write("                                <option value=\"5\">Above Rs.50000</option>\n");
      out.write("                            </select>\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <label>\n");
      out.write("                            <select name=\"battery\">\n");
      out.write("                                <option value=\"0\">Choose a Battery Range</option>\n");
      out.write("                                <option value=\"1\">0 - 1999mah</option>\n");
      out.write("                                <option value=\"2\">2000mah - 2999mah</option>\n");
      out.write("                                <option value=\"3\">3000mah - 3999mah</option>\n");
      out.write("                                <option value=\"4\">Above 4000mah</option>\n");
      out.write("                            </select>\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form-row form-last-row\">\n");
      out.write("                        <button type=\"submit\">Submit Form</button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div> \n");
      out.write("            <!--form mini closing-->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--main content closing here-->\n");
      out.write("        ");

//            ArrayList<mobileDetailsModel> result = (ArrayList<mobileDetailsModel>) request.getAttribute("result");
            ArrayList<mobileDetailsModel> result = (ArrayList<mobileDetailsModel>) session.getAttribute("result");
        
      out.write("\n");
      out.write("\n");
      out.write("        ");

            if (result != null) {
        
      out.write("\n");
      out.write("        <div class=\"container-fluid\" style=\"margin: 5%; background-color: red\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4\" style=\"background-color:lavender;\">\n");
      out.write("                    S.N\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\" style=\"background-color:lavenderblush;\">\n");
      out.write("                    Name\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\" style=\"background-color:lavender;\">.\n");
      out.write("                    Photo\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
} 
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            if (result!= null) {  //printing
                if (result.size() > 0) { //checking size
                
      out.write("  \n");
      out.write("\n");
      out.write("        ");

                    int counter=0;
            for (mobileDetailsModel mdetail : result) { counter++;
        
      out.write("\n");
      out.write("        <div style=\"height: 10px; color: white\"></div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-2\" style=\"background-color:lavender;\">\n");
      out.write("                ");
      out.print(counter);
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-5\" style=\"background-color:lavenderblush; height:150px\">\n");
      out.write("                <div>\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"Nam\">Name</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td class=\"val\">");
out.print(mdetail.getName());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"Nam\">Brand</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td class=\"val\">");
out.print(mdetail.getBrand());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"Nam\">Platform</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td class=\"val\">");
out.print(mdetail.getPlatform());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"Nam\">Display</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td class=\"val\">");
out.print(mdetail.getDisplay());
      out.write("\"</td>\n");
      out.write("                        </tr>   \n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"Nam\">RAM</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td class=\"val\">");
out.print(mdetail.getRam());
      out.write(" G.B</td>\n");
      out.write("                        </tr>   \n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"Nam\">Battery</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td class=\"val\"> ");
out.print(mdetail.getBattery());
      out.write("mah</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"Nam\">Price</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td class=\"val\"> Rs.");
out.print(mdetail.getPrice());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-5\" style=\"background-color:lavender;\">.\n");
      out.write("                <img src=\"mobilePics/");
out.print(mdetail.getPhotoid());
      out.write("\" alt=\"");
out.print(mdetail.getName());
      out.write("\" height=\"200\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
} } 
      out.write(" \n");
      out.write("            \n");
      out.write("    ");
}
      out.write("\n");
      out.write("</div>\n");
      out.write("    </body>\n");
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
