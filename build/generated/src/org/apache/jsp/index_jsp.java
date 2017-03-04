package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title></title>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t<!-- Latest compiled and minified CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("\t<!-- jQuery library -->\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Latest compiled JavaScript -->\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("\t\n");
      out.write("\t<!--logo-->\n");
      out.write("\t<div class=\"navbar-header\">\n");
      out.write("\t<a href=\"#\" class=\"navbar-brand\">My Bank</a>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!--nav items-->\n");
      out.write("\t<div>\n");
      out.write("\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t<li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("\t\t\t<li ><a href=\"#\">Add Money</a></li>\n");
      out.write("\t\t\t<li ><a href=\"#\">Pay</a></li>\n");
      out.write("\t\t\t<li ><a href=\"#\">Contact Us</a></li>\n");
      out.write("\n");
      out.write("\t\t\t<!--dripdown menu-->\n");
      out.write("\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"dropdown-toogle\" data-toggle=\"dropdown\">My Profile <span class=\"caret\"> </span></a>\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t<li ><a href=\"#\">Settings</a></li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"#\">View History</a></li>\n");
      out.write("\t\t\t\t\t<li ><a href=http://localhost:8080/j2ee/Login_Signup/Login.jsp>Login</a></li>\t\n");
      out.write("                                        <li ><a href=http://localhost:8080/j2ee/Login_Signup/Signup.html>Signup</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"continer-fluid embed-responsive embed-responsive-16by9\"\">\n");
      out.write("<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("  <!-- Indicators -->\n");
      out.write("  <ol class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("  </ol>\n");
      out.write("\n");
      out.write("  <!-- Wrapper for slides -->\n");
      out.write("  <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("    <div class=\"item active\">\n");
      out.write("      <img src=\"1.jpg\" alt=\"Chania\" class=\"img-responsive\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"item\">\n");
      out.write("      <img src=\"2.jpg\" alt=\"Chania\" class=\"img-responsive\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"item\">\n");
      out.write("      <img src=\"3.jpg\" alt=\"Flower\" class=\"img-responsive\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"item\">\n");
      out.write("      <img src=\"4.jpg\" alt=\"Flower\" class=\"img-responsive\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Left and right controls -->\n");
      out.write("  <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"sr-only\">Previous</span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"sr-only\">Next</span>\n");
      out.write("  </a>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
