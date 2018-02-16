package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.controller.userLogin.User_Model;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            html{\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                padding: 60px 15px;\n");
      out.write("                min-height: 100%;\n");
      out.write("                background-image: linear-gradient(61deg, #ff512f 0%, #dd2476 100%);\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Form */\n");
      out.write("            .form{\n");
      out.write("                max-width: 460px;\n");
      out.write("                padding: 30px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                box-shadow: 0 0 10px rgba(0,0,0,.2);\n");
      out.write("                background: #ffffff;\n");
      out.write("            }\n");
      out.write("            /* Row */\n");
      out.write("            .form__row{\n");
      out.write("                display: flex;\n");
      out.write("                width: 100%;\n");
      out.write("                justify-content: center;\n");
      out.write("            }\n");
      out.write("            .form__row:not(:first-child){\n");
      out.write("                margin-top: 15px;\n");
      out.write("            }\n");
      out.write("            /* Field */\n");
      out.write("            .form__input{\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 10px 15px;\n");
      out.write("                border: 0;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                background-color: #eee;\n");
      out.write("                font-size: 14px;\n");
      out.write("                line-height: 20px;\n");
      out.write("                color: #7a7b7f;\n");
      out.write("                transition: box-shadow 0.2s ease;\n");
      out.write("            }\n");
      out.write("            .form__input:focus{\n");
      out.write("                outline: none;\n");
      out.write("                box-shadow: 0 0 3px rgba(0,0,0,0.3);  \n");
      out.write("            }\n");
      out.write("            .form__input ~ .form__input{\n");
      out.write("                margin-left: 15px;\n");
      out.write("            }\n");
      out.write("            /* Submit */\n");
      out.write("            .form__submit{\n");
      out.write("                position: relative;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 50px;\n");
      out.write("                border: 0;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                background-color: #ea355a;\n");
      out.write("                box-shadow: 0 3px #bd1962;\n");
      out.write("                font-size: 18px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: #fff;\n");
      out.write("                cursor: pointer;\n");
      out.write("                outline: none;\n");
      out.write("                transition: background 0.5s ease;\n");
      out.write("            }\n");
      out.write("            .form__submit:hover{\n");
      out.write("                background: #ff512f;\n");
      out.write("            }\n");
      out.write("            .form__submit:active{\n");
      out.write("                box-shadow: none;\n");
      out.write("                top: 2px;\n");
      out.write("                box-shadow: 0 1px #bd1962;\n");
      out.write("            }\n");
      out.write("            /* Reset */\n");
      out.write("            .form__reset{\n");
      out.write("                border: 1px solid #eee;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                background-color: transparent;\n");
      out.write("                font-size: 12px;\n");
      out.write("                line-height: 20px;\n");
      out.write("                color: #7a7b7f;\n");
      out.write("                outline: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                transition: border-color 0.5s ease;\n");
      out.write("            }\n");
      out.write("            .form__reset:hover{\n");
      out.write("                border-color: #7a7b7f;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Boolean isSuccess = (Boolean) request.getAttribute("isSuccess");
            User_Model u = (User_Model) request.getAttribute("enteredData");
            Boolean ReturnData = false;
        
      out.write("\n");
      out.write("\n");
      out.write("        ");

            if (isSuccess != null) {
                if (isSuccess) {
                    ReturnData = !ReturnData;
        
      out.write("\n");
      out.write("        ");
 response.sendRedirect("index.jsp");
                }
            }
      out.write("\n");
      out.write("        <form action=\"SignUpController\" method=\"post\" class=\"form\">\n");
      out.write("            <div class=\"form__row\">\n");
      out.write("                <input class=\"form__input\" value=\"");
if(ReturnData) out.println(u.getStaff_first_name());
      out.write("\" required=\"\" type=\"text\" name=\"first-name\" placeholder=\"First name\">\n");
      out.write("                <input class=\"form__input\" value=\"");
if(ReturnData) out.println(u.getStaff_middle_name());
      out.write("\"  type=\"text\" name=\"middle-name\" placeholder=\"Middle name\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form__row\">\n");
      out.write("                <input class=\"form__input\" type=\"text\" name=\"last-name\" placeholder=\"Last Name\" required=\"\" value=\"");
if(ReturnData) out.println(u.getStaff_last_name());
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form__row\">\n");
      out.write("                <input class=\"form__input\" type=\"password\" name=\"password\" placeholder=\"password\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form__row\">\n");
      out.write("                <button class=\"form__submit\" type=\"submit\">Sign up for free</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form__row\">\n");
      out.write("                <button class=\"form__reset\" type=\"reset\">Reset form</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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
