package org.apache.jsp.Login_005fSignup;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AfterLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=US-ASCII");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function HandleBackFunctionality()\r\n");
      out.write("{\r\n");
      out.write("    alert(\"esrgdf\");\r\n");
      out.write("  if(window.event)\r\n");
      out.write("  {\r\n");
      out.write("      if(window.event.clientX < 40 && window.event.clientY < 0)\r\n");
      out.write("      {\r\n");
      out.write("        alert(\"Browser back button is clicked...\");\r\n");
      out.write("      }\r\n");
      out.write("      else\r\n");
      out.write("      {\r\n");
      out.write("        alert(\"Browser refresh button is clicked...\");\r\n");
      out.write("      }\r\n");
      out.write("   }\r\n");
      out.write("   else\r\n");
      out.write("   {\r\n");
      out.write("      if(event.currentTarget.performance.navigation.type == 1)\r\n");
      out.write("      {\r\n");
      out.write("        alert(\"Browser refresh button is clicked...\");\r\n");
      out.write("      }\r\n");
      out.write("      if(event.currentTarget.performance.navigation.type == 2)\r\n");
      out.write("      {\r\n");
      out.write("        alert(\"Browser back button is clicked...\");\r\n");
      out.write("      }\r\n");
      out.write("   }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=US-ASCII\">\r\n");
      out.write("<title>Login Success Page</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body onbeforeunload=\"HandleBackFunctionality()\">\r\n");
      out.write("<h3>Hi Awesome ");
      out.print((String)session.getAttribute("username") );
      out.write(", Login successful.</h3>\r\n");
      out.write("<br>\r\n");
      out.write("<form action=\"http://localhost:8080/j2ee/Logout\" method=\"post\">\r\n");
      out.write("<input type=\"submit\" value=\"Logout\" >\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
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
