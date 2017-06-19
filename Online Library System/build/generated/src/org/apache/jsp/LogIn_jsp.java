package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LogIn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Online Library System</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background-color: #f9f9f9;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #pswd_info {\n");
      out.write("                position:absolute;\n");
      out.write("                bottom:-75px;\n");
      out.write("                bottom: -115px\\9; /* IE Specific */\n");
      out.write("                right:55px;\n");
      out.write("                width:250px;\n");
      out.write("                padding:15px;\n");
      out.write("                background:#fefefe;\n");
      out.write("                font-size:.875em;\n");
      out.write("                border-radius:5px;\n");
      out.write("                box-shadow:0 1px 3px #ccc;\n");
      out.write("                border:1px solid #ddd;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #pswd_info h4 {\n");
      out.write("                margin:0 0 10px 0;\n");
      out.write("                padding:0;\n");
      out.write("                font-weight:normal;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #pswd_info::before {\n");
      out.write("                content: \"\\25B2\";\n");
      out.write("                position:absolute;\n");
      out.write("                top:-12px;\n");
      out.write("                left:45%;\n");
      out.write("                font-size:14px;\n");
      out.write("                line-height:14px;\n");
      out.write("                color:#ddd;\n");
      out.write("                text-shadow:none;\n");
      out.write("                display:block;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("        <br/>\n");
      out.write("        \n");
      out.write("        <h3 align=\"center\">REGISTER AN ACCOUNT</h3>\n");
      out.write("        \n");
      out.write("        <br/><br/>\n");
      out.write("        \n");
      out.write("        <form class=\"form-horizontal\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\">First Name</label>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <input class=\"form-control input-sm\" id=\"inputEmail3\">\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\">Middle Initial</label>\n");
      out.write("                <div class=\"col-sm-1\">\n");
      out.write("                    <input class=\"form-control input-sm\" id=\"inputEmail3\">\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\">Last Name</label>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <input class=\"form-control input-sm\" id=\"inputEmail3\">\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\">Date of Birth</label>\n");
      out.write("                <div class=\"col-sm-1\">\n");
      out.write("                    <input class=\"form-control input-sm\" id=\"inputEmail3\" placeholder=\"MM\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-1\">\n");
      out.write("                    <input class=\"form-control input-sm\" id=\"inputEmail3\" placeholder=\"DD\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-1\">\n");
      out.write("                    <input class=\"form-control input-sm\" id=\"inputEmail3\" placeholder=\"YYYY\">\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\">Job Title&nbsp;</label>\n");
      out.write("                <div class=\"col-sm-3 btn-group\" role=\"group\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\">Student</button>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\">Employee</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\">ID Number</label>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <input class=\"form-control input-sm\" id=\"inputEmail3\">\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("            <br/><br/>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">Email</label>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <input type=\"email\" class=\"form-control\" id=\"inputEmail3\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">Username</label>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <input type=\"email\" class=\"form-control\" id=\"inputEmail3\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">Password</label>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <input type=\"password\" class=\"form-control\" id=\"inputEmail3\">\n");
      out.write("                </div>\n");
      out.write("            </div><br/>\n");
      out.write("            <div id=\"pswd_info\">\n");
      out.write("                <h4>Password must meet the following requirements:</h4>\n");
      out.write("                <ul>\n");
      out.write("                    <li id=\"letter\" class=\"invalid\">At least <strong>one letter</strong></li>\n");
      out.write("                    <li id=\"capital\" class=\"invalid\">At least <strong>one capital letter</strong></li>\n");
      out.write("                    <li id=\"number\" class=\"invalid\">At least <strong>one number</strong></li>\n");
      out.write("                    <li id=\"length\" class=\"invalid\">Be at least <strong>8 characters</strong></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </form><br/><br/>\n");
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
