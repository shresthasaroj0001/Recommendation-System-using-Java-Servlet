package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.model.details.mobileDetailsModel;
import com.Pcc.col.PCCDAO;

public final class Recommendation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
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
      out.write("    <body style=\"margin: 50px;\">\n");
      out.write("         <a href=\"index.jsp\" style=\"font-size: x-large; text-decoration: underline;\">Back to Home</a>\n");
      out.write("    \n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
if (!found_tablename && !found_userName) {
                response.sendRedirect("login.jsp");
            } else {
                PCCDAO v = new PCCDAO();
                Result = v.FromJsp(Table_Name);
            }
      out.write("\n");
      out.write("\n");
      out.write("        ");

            if (Result.size() < 1) {
        
      out.write("\n");
      out.write("        <h1>e</h1>\n");
      out.write("        ");

        } else {
                int counter=0;
            for (mobileDetailsModel mdetail : Result) { counter++;
        
      out.write("\n");
      out.write("        <div style=\"height: 10px; color: white\"></div>\n");
      out.write("        <div class=\"row\" style=\"border-bottom:1px solid #ccc;\">\n");
      out.write("            <div class=\"col-sm-2\" style=\"background-color:#fff;\">\n");
      out.write("                ");
      out.print(counter);
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-5\" style=\"background-color:#fff; \">\n");
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
      out.write("            <div class=\"col-sm-5\" style=\"background-color:#fff;\">.\n");
      out.write("                <img src=\"mobilePics/");
out.print(mdetail.getPhotoid());
      out.write("\" alt=\"");
out.print(mdetail.getName());
      out.write("\" height=\"200\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
}  
      out.write(" \n");
      out.write("        \n");
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
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
