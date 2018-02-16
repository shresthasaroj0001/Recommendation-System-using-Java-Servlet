package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.model.details.mobileDetailsModel;
import java.util.ArrayList;
import java.util.List;
import com.rating.coln.ViewDAO;

public final class RatingPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Bootstrap Example</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"vendor/jquery/jquery-3.1.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            ArrayList<mobileDetailsModel> list = new ArrayList<mobileDetailsModel>();
        
      out.write("\n");
      out.write("\n");
      out.write("        ");

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
      out.write("        ");
if (!found_tablename && !found_userName) {
                response.sendRedirect("login.jsp");
            } else {
                ViewDAO v = new ViewDAO();
                list = v.findthoseMObileThatAreNotRated(Table_Name);
                v.mobileRated(Table_Name);
            }
      out.write("\n");
      out.write("\n");
      out.write("        ");

            if (list.size() < 1) {
        
      out.write("\n");
      out.write("        <h1>Sorry YOu have Rated all mobile</h1>\n");
      out.write("        ");

        } else {
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\"margin: 50px;\">\n");
      out.write("            <form class=\"form-inline\" action=\"testControler\" method=\"post\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                ");
 int i = 0;
                    for (mobileDetailsModel m : list) {
                        String mobileNo = "mobileNo";
                        mobileNo = mobileNo.concat(String.valueOf(i));
//                        mobileNo = mobileNo.concat(String.valueOf(m.getId()));
                
      out.write("\n");
      out.write("                <style>\n");
      out.write("/*                    .form-inline .single-line {\n");
      out.write("                        display:inline-block;\n");
      out.write("                        width:100%;\n");
      out.write("                    }*/\n");
      out.write(".form-group.single-line {\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write(".form-group.single-line select {\n");
      out.write("    float: right;\n");
      out.write("}\n");
      out.write(".inline{\n");
      out.write("    display: inline-block;\n");
      out.write("    width:100%;\n");
      out.write("}\n");
      out.write("                    </style>\n");
      out.write("                    \n");
      out.write("                        <div class=\"col-sm-4\">\n");
      out.write("                            <div class=\"form-group  single-line\" style=\"margin: 13px\">\n");
      out.write("                    <label for=\"sel1\">");
out.print(m.getName());
      out.write(" </label>\n");
      out.write("                    <select class=\"form-control\" name=\"");
out.print(mobileNo);
      out.write("\">\n");
      out.write("                        <option value=\"0\">Select Any Value</option>\n");
      out.write("                        <option value=\"1\">1</option>\n");
      out.write("                        <option value=\"2\">2</option>\n");
      out.write("                        <option value=\"3\">3</option>\n");
      out.write("                        <option value=\"4\">4</option>\n");
      out.write("                        <option value=\"5\">5</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                ");
i++;}
      out.write("\n");
      out.write("                <div class=\"myduc\" style=\"padding: 15px\">\n");
      out.write("                    <div class=\"form-group inline\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\" style=\" margin-right:50px;\">Submit</button>\n");
      out.write("                        <button type=\"reset\" class=\"btn btn-danger\" style=\" margin-right: 50px;\">Reset</button>\n");
      out.write("                    </div>     \n");
      out.write("                </div> \n");
      out.write("            </form>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
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
