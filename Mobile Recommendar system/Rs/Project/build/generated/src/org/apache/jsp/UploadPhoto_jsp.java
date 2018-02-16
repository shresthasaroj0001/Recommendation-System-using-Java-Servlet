package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.model.details.mobileDetailsModel;
import com.upload.controler.UploadDAo;

public final class UploadPhoto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">       \n");
      out.write("        <title>Upload Photo Page</title>\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"vendor/jquery/jquery-3.1.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/test.js\" type=\"text/javascript\"></script>\n");
      out.write("        ");

            UploadDAo dd = new UploadDAo();
            ArrayList<mobileDetailsModel> LeftForUpload = dd.LeftForUpload();
            Boolean isSuces = (Boolean) request.getAttribute("isSuccess");
        
      out.write("\n");
      out.write("\n");
      out.write("        ");
if (isSuces != null) {
                if (isSuces) {
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("            alert(\"Photo Uploaded Succccesfulyy\");\n");
      out.write("        </script>\n");
      out.write("        ");
} else {  
      out.write("\n");
      out.write("        <script>\n");
      out.write("            alert(\"Failed check file and fileName\");\n");
      out.write("        </script>\n");
      out.write("        ");
}
            }
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

            if (LeftForUpload == null) {
        
      out.write("\n");
      out.write("        <h1>Check Connection</h1>\n");
      out.write("        ");
} else { //main closing   
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-md-8 col-md-offset-2\">\n");
      out.write("                ");

                    if (LeftForUpload.size() < 1) { //secondary checking closing
                
      out.write("\n");
      out.write("                <h1>Sorry No Mobile Left for Upload</h1>\n");
      out.write("                ");
} else {
      out.write("\n");
      out.write("                <h3>Upload Here: </h3> \n");
      out.write("                <form method=\"post\" action=\"UploaaadController\" enctype=\"multipart/form-data\" >\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"sel1\">Select Mobile Name:</label>\n");
      out.write("                        <select class=\"form-control\" name=\"photoNAMEE\">\n");
      out.write("                            <option value=\"0\">Select Any One</option>\n");
      out.write("                            ");

                                for (mobileDetailsModel mobile : LeftForUpload) {
                            
      out.write("\n");
      out.write("                            <option value=\"");
out.print(mobile.getId());
      out.write('"');
      out.write('>');
out.print(mobile.getName());
      out.write("</option>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                        <label for=\"sel1\">Select Image file(jpeg,jpgbmp)</label>  \n");
      out.write("                    <input type=\"file\" name=\"photo\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary pull-right\">Submit</button>\n");
      out.write("                        <button type=\"reset\" class=\"btn btn-danger\">Reset</button>\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
}
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
