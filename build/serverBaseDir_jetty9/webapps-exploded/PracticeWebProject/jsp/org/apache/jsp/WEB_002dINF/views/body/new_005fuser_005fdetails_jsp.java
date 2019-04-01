package org.apache.jsp.WEB_002dINF.views.body;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new_005fuser_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/views/body/../../tagLibraries/tagLibraries.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_name_id_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_form_form_name_id_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_form_form_name_id_action.release();
    _jspx_tagPool_c_url_var_value_nobody.release();
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
      out.write("\r\n");
      out.write(" <meta charset=\"utf-8\" />\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write(" <div class=\"modal fade\" id=\"newUserDetails\">\r\n");
      out.write("   <div class=\"modal-dialog modal-dialog-centered\">\r\n");
      out.write("    <div class=\"modal-content bg-warning border-warning\">\r\n");
      out.write("        ");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("       ");
      if (_jspx_meth_form_form_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("   </div>\r\n");
      out.write(" </div>\r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write("  \r\n");
      out.write("   $(document).ready(function(){\r\n");
      out.write("\t \t $(\"#newUserDetailsSubmit\").click(function (){\r\n");
      out.write("\t \t\tvar userName = $(\"#userName\").val();\r\n");
      out.write("\t \t\tvar password = $(\"#password\").val();\r\n");
      out.write("\t \t\tvar landMark = $(\"#LandMark\").val();\r\n");
      out.write("\t \t\tvar pincode  = parseInt($(\"#Pincode\").val());\r\n");
      out.write("\t \t\tvar district = $(\"#district\").val();\r\n");
      out.write("\t \t\tvar city     = $(\"#city\").val();\r\n");
      out.write("\t \t\tvar state     = $(\"#state\").val();\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\t$.ajax({\r\n");
      out.write("\t \t\t\ttype:\"POST\",\r\n");
      out.write("\t \t\t\turl:\"");
      out.print(request.getContextPath() );
      out.write("/loginDetails/saveNewUserDetails\",\r\n");
      out.write("\t \t\t    data:{\"userName\":userName,\r\n");
      out.write("\t \t\t    \t  \"password\":password,\r\n");
      out.write("\t \t\t    \t  \"LandMark\":landMark,\r\n");
      out.write("\t \t\t    \t  \"Pincode\":pincode,\r\n");
      out.write("\t \t\t    \t  \"district\":district,\r\n");
      out.write("\t \t\t    \t  \"city\":city,\r\n");
      out.write("\t \t\t    \t  \"state\":state\r\n");
      out.write("\t \t\t    \t \r\n");
      out.write("\t \t\t    \t  },\r\n");
      out.write("\t \t\t\tsuccess:function(){\r\n");
      out.write("\t \t\t\t\t\r\n");
      out.write("\t \t\t\t},\r\n");
      out.write("\t \t\t\terror:function(){\r\n");
      out.write("\t \t\t\t\talert(\"Not successfull\");\r\n");
      out.write("\t \t\t\t},complete:function(){\r\n");
      out.write("\t \t\t\t\t $(\"#newUserDetails\").modal(\"hide\");\r\n");
      out.write("\t \t\t\t\t $(\"#login\").modal();\r\n");
      out.write("\t \t\t\t}\r\n");
      out.write("\t \t\t});\r\n");
      out.write("\t \t}); \r\n");
      out.write("   });\r\n");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write(" </script>\r\n");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setVar("saveUserDetails");
    _jspx_th_c_url_0.setValue("/loginDetails/saveNewUserDetails");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_form_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_name_id_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_form_0.setPageContext(_jspx_page_context);
    _jspx_th_form_form_0.setParent(null);
    _jspx_th_form_form_0.setId("userDetailsForm");
    _jspx_th_form_form_0.setName("userDetailsForm");
    _jspx_th_form_form_0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${saveUserDetails }", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
      if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("        \r\n");
          out.write("        <div class=\"modal-header\">\r\n");
          out.write("          <h4 class=\"modal-title\">User Details</h4>\r\n");
          out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
          out.write("        </div>\r\n");
          out.write("        \r\n");
          out.write("        <div class=\"row\">\r\n");
          out.write("        <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
          out.write("        <div class=\"form-body\">\r\n");
          out.write("         <div class=\"form-group\">\r\n");
          out.write("          <label for=\"userName\" class=\"badge badge-pill\"><b>Username/EmailId</b></label>\r\n");
          out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Enter Username or EmailId\" id=\"userName\" name=\"userName\" required>\r\n");
          out.write("         </div></div></div>\r\n");
          out.write("         \r\n");
          out.write("         <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
          out.write("         <div class=\"form-group\">\r\n");
          out.write("          <label for=\"password\" class=\"badge badge-pill\"><b>Password</b></label>\r\n");
          out.write("          <input type=\"password\" class=\"form-control\" placeholder=\"Enter LandMark\" id=\"password\"  name=\"password\" required>\r\n");
          out.write("         </div></div></div>\r\n");
          out.write("         \r\n");
          out.write("         <div class=\"form-group\">\r\n");
          out.write("          <label for=\"LandMark\" class=\"badge badge-pill\"><b>LandMark</b></label>\r\n");
          out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Enter LandMark\" id=\"LandMark\" name=\"LandMark\" required>\r\n");
          out.write("         </div>\r\n");
          out.write("         \r\n");
          out.write("         <div class=\"form-group\">\r\n");
          out.write("          <label for=\"Pincode\" class=\"badge badge-pill\"><b>Pincode</b></label>\r\n");
          out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Enter Pincode\" id=\"Pincode\" name=\"Pincode\" required>\r\n");
          out.write("         </div>\r\n");
          out.write("         \r\n");
          out.write("         <div class=\"form-group\">\r\n");
          out.write("          <label for=\"district\" class=\"badge badge-pill\"><b>District</b></label>\r\n");
          out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Enter District\" id=\"district\" name=\"district\" required>\r\n");
          out.write("         </div>\r\n");
          out.write("         \r\n");
          out.write("         <div class=\"form-group\">\r\n");
          out.write("          <label for=\"city\" class=\"badge badge-pill\"><b>City</b></label>\r\n");
          out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Enter City\" id=\"city\" name=\"city\" required>\r\n");
          out.write("         </div>\r\n");
          out.write("         \r\n");
          out.write("         <div class=\"form-group\">\r\n");
          out.write("          <label for=\"state\" class=\"badge badge-pill\"><b>state</b></label>\r\n");
          out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Enter state\" id=\"state\" name=\"state\" required>\r\n");
          out.write("         </div>\r\n");
          out.write("         \r\n");
          out.write("         <div class=\"form-group\">\r\n");
          out.write("               <button type=\"button\" id=\"newUserDetailsSubmit\" class=\"form-control btn btn-primary\">Submit</button>\r\n");
          out.write("             </div>\r\n");
          out.write("        \r\n");
          out.write("       ");
          int evalDoAfterBody = _jspx_th_form_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_form_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_form_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_form_0.doFinally();
      _jspx_tagPool_form_form_name_id_action.reuse(_jspx_th_form_form_0);
    }
    return false;
  }
}
