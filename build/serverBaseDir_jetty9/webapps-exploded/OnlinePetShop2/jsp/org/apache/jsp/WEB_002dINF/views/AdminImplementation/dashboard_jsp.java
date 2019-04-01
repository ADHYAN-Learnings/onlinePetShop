package org.apache.jsp.WEB_002dINF.views.AdminImplementation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div class=\"container border-topSpace\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write(" <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
      out.write("   <div class=\"dashboard-stat blue-madison\">\r\n");
      out.write("\t <div class=\"visual\">\r\n");
      out.write("\t\t<i class=\"fa fa-comments\"></i>\r\n");
      out.write("\t </div>\r\n");
      out.write("\t <div class=\"details\">\r\n");
      out.write("\t  <div class=\"number\">\r\n");
      out.write("       ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_product_count_details.totalNotSoldAnimals }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t <div class=\"desc\">\r\n");
      out.write("\t\tTotal # of unsold animals\r\n");
      out.write("\t </div>\r\n");
      out.write("\t </div>\r\n");
      out.write("\t <a class=\"more\" href=\"#\">\r\n");
      out.write("\t  View more <i class=\"m-icon-swapright m-icon-white\"></i>\r\n");
      out.write("\t </a>\r\n");
      out.write("   </div>\r\n");
      out.write("</div>\r\n");
      out.write(" <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
      out.write("   <div class=\"dashboard-stat red-intense\">\r\n");
      out.write("\t <div class=\"visual\">\r\n");
      out.write("\t\t<i class=\"fa fa-bar-chart\"></i>\r\n");
      out.write("\t </div>\r\n");
      out.write("\t <div class=\"details\">\r\n");
      out.write("\t  <div class=\"number\">\r\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_product_count_details.totalUser }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t <div class=\"desc\">\r\n");
      out.write("\t\tTotal # User\r\n");
      out.write("\t </div>\r\n");
      out.write("\t </div>\r\n");
      out.write("\t <a style=\"cursor:pointer;\" class=\"more\" href=\"");
      out.print(request.getContextPath() );
      out.write("/admin_user_details\">\r\n");
      out.write("\t  View more <i class=\"m-icon-swapright m-icon-white\"></i>\r\n");
      out.write("\t </a>\r\n");
      out.write("   </div>\r\n");
      out.write("</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write(" <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
      out.write("   <div class=\"dashboard-stat purple-plum\">\r\n");
      out.write("\t <div class=\"visual\">\r\n");
      out.write("\t\t<i class=\"fa fa-bar-chart\"></i>\r\n");
      out.write("\t </div>\r\n");
      out.write("\t <div class=\"details\">\r\n");
      out.write("\t  <div class=\"number\">\r\n");
      out.write("         ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_product_count_details.totalSoldAnimals }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t <div class=\"desc\">\r\n");
      out.write("\t\tTotal # Transaction animals\r\n");
      out.write("\t </div>\r\n");
      out.write("\t </div>\r\n");
      out.write("\t <a class=\"more\" href=\"");
      out.print(request.getContextPath() );
      out.write("/admin_transaction_details\">\r\n");
      out.write("\t  View more <i class=\"m-icon-swapright m-icon-white\"></i>\r\n");
      out.write("\t </a>\r\n");
      out.write("   </div>\r\n");
      out.write("</div> \r\n");
      out.write("</div>\r\n");
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
