package org.apache.jsp.WEB_002dINF.views.AdminImplementation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_005fheader_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div  class=\"row\">\r\n");
      out.write("  <div class=\"header-color col-9 col-sm-9 col-md-9 col-lg-9 col-xl-9\"></div>\r\n");
      out.write("  <div class=\"header-color col-3 col-sm-3 col-md-3 col-lg-3 col-xl-3\">\r\n");
      out.write("    <nav class=\"navbar navbar-expand-sm navbar-dark\">\r\n");
      out.write("      <ul class=\"navbar-nav\">\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"");
      out.print(request.getContextPath() );
      out.write("\">Home</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" data-toggle=\"modal\" id=\"adminLogoutLink\">Logout</a>\r\n");
      out.write("       </li>\r\n");
      out.write("     </ul>\r\n");
      out.write("   </nav>\r\n");
      out.write("</div></div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write(" \r\n");
      out.write(" $(document).ready(function(){\r\n");
      out.write("\t \r\n");
      out.write("\t $(\"#adminLogoutLink\").click(function(e){\r\n");
      out.write("    \t \r\n");
      out.write("  \t\t$.ajax({\r\n");
      out.write(" \t\t\ttype:\"GET\",\r\n");
      out.write(" \t\t\turl:\"");
      out.print(request.getContextPath() );
      out.write("/logout\",\r\n");
      out.write(" \t\t\tsuccess:function(){\r\n");
      out.write(" \t\t\t\twindow.location=\"/OnlinePetShop/admin\";\r\n");
      out.write(" \t\t\t},\r\n");
      out.write(" \t\t\terror:function(){\r\n");
      out.write(" \t\t\t}\r\n");
      out.write(" \t\t});\r\n");
      out.write("     }); \r\n");
      out.write("\t \r\n");
      out.write(" });\r\n");
      out.write("\r\n");
      out.write("</script>");
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
