package org.apache.jsp.WEB_002dINF.views.AdminImplementation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sideMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div class=\"wrapper\">\r\n");
      out.write("   <nav id=\"sidebar\">\r\n");
      out.write("     <div class=\"sidebar-header\"><h3>Online Pet Shop</h3></div>\r\n");
      out.write("       <ul class=\"list-unstyled components\">\r\n");
      out.write("         <li id=\"home\">\r\n");
      out.write("           <a href=\"");
      out.print(request.getContextPath() );
      out.write("/admin_index\"><i class=\"fa fa-home\"></i>Home</a>\r\n");
      out.write("         </li>\r\n");
      out.write("         <li id=\"unsold_pet\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/admin_unsold_animals\">\r\n");
      out.write("         <i class=\"fa fa-hand-o-right\">\r\n");
      out.write("         </i>UnSold Animals</a>\r\n");
      out.write("         </li>\r\n");
      out.write("         <li id=\"user_details\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/admin_user_details\">\r\n");
      out.write("         <i class=\"fa fa-hand-o-right\">\r\n");
      out.write("         </i>User Details</a>\r\n");
      out.write("         </li>\r\n");
      out.write("         <li id=\"transaction_details\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/admin_transaction_details\">\r\n");
      out.write("         <i class=\"fa fa-hand-o-right\"></i>Transaction Details</a>\r\n");
      out.write("         </li>\r\n");
      out.write("       </ul>\r\n");
      out.write("   </nav>\r\n");
      out.write("</div>");
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
