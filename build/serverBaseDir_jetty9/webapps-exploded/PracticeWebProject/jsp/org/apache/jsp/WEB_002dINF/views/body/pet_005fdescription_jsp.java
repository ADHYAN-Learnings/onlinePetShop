package org.apache.jsp.WEB_002dINF.views.body;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pet_005fdescription_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/views/body/../../tagLibraries/tagLibraries.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_spring_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_spring_url_var_value_nobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" ");
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col-1 col-sm-1 col-md-1 col-lg-1 col-xl-1\"></div>\r\n");
      out.write("    <div class=\"col-5 col-sm-5 col-md-5 col-lg-5 col-xl-5\">\r\n");
      out.write("     <div class=\"large-image\">\r\n");
      out.write("       <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"Mountains\" style=\"width:100%;height:100%;\">\r\n");
      out.write("       <h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_pet_Description_Beans.pet.breed }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\r\n");
      out.write("       <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_pet_Description_Beans.pet.price }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p> \r\n");
      out.write("       <div class=\"container\">\r\n");
      out.write("           <a class=\"btn btn-danger\" href=\"");
      out.print(request.getContextPath() );
      out.write("/payment?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_pet_Description_Beans.description_Id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("           &imagePath=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_pet_Description_Beans.pet.imagePath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&price=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_pet_Description_Beans.pet.price }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&breed=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_pet_Description_Beans.pet.breed}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Buy</a>\r\n");
      out.write("         \r\n");
      out.write("           <button type=\"button\" class=\"btn btn-success\" onclick=\"javascript:history.go(-1)\">Back</button>             \r\n");
      out.write("       </div>  \r\n");
      out.write("     </div></div>\r\n");
      out.write("     \r\n");
      out.write("    <div class=\"col-5 col-sm-5 col-md-5 col-lg-5 col-xl-5\">\r\n");
      out.write("    <div style=\"padding-top:20%;padding-bottom:10%;text-align:left;\">\r\n");
      out.write("       <div id=\"OverviewDescription\" class=\"row\"><h4>overview:</h4><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_pet_Description_Beans.description }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p></div>\r\n");
      out.write("       <div class=\"row\"><h4>Gender: </h4><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_pet_Description_Beans.gender }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p></div>\r\n");
      out.write("       <div class=\"row\"><h4>Food: </h4><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_pet_Description_Beans.food }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p></div>\r\n");
      out.write("       <div class=\"row\"><h4>MedicalCondition: </h4><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_pet_Description_Beans.medicalCondition }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-1 col-sm-1 col-md-1 col-lg-1 col-xl-1\"></div>\r\n");
      out.write("   \r\n");
      out.write(" </div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  $(document).ready(function(){\r\n");
      out.write("\t var description =$(\"#OverviewDescription\").html().replace(\"02\",\"<br/><br/>02\");\r\n");
      out.write("\t $(\"#OverviewDescription\").html(description);\r\n");
      out.write("\t \r\n");
      out.write("  });\r\n");
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

  private boolean _jspx_meth_spring_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_0.setParent(null);
    _jspx_th_spring_url_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_pet_Description_Beans.pet.imagePath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_spring_url_0.setVar("image");
    int[] _jspx_push_body_count_spring_url_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_0 = _jspx_th_spring_url_0.doStartTag();
      if (_jspx_th_spring_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_0.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_0);
    }
    return false;
  }
}
