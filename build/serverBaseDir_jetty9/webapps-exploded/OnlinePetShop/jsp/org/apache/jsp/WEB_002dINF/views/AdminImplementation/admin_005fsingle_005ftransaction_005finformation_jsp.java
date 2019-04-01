package org.apache.jsp.WEB_002dINF.views.AdminImplementation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fsingle_005ftransaction_005finformation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/views/AdminImplementation/../../tagLibraries/tagLibraries.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_name_id_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_form_form_name_id_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_form_form_name_id_action.release();
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
      out.write("\r\n");
      out.write(" ");
      if (_jspx_meth_form_form_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write(" $(document).ready(function(){\r\n");
      out.write("\t $('input').attr('readonly', true);\r\n");
      out.write("\t\r\n");
      out.write("\t $(\"#home\").removeClass(\"active\");\r\n");
      out.write("\t $(\"#unsold_pet\").removeClass(\"active\");\r\n");
      out.write("\t $(\"#user_details\").removeClass(\"active\");\r\n");
      out.write("\t$(\"#transaction_details\").addClass(\"active\");\t\r\n");
      out.write(" });\r\n");
      out.write("</script> ");
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

  private boolean _jspx_meth_form_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_name_id_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_form_0.setPageContext(_jspx_page_context);
    _jspx_th_form_form_0.setParent(null);
    _jspx_th_form_form_0.setId("transaction_information_details");
    _jspx_th_form_form_0.setName("transaction_information_details");
    _jspx_th_form_form_0.setAction("");
    int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
      if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write(" <div class=\"form-body\">\r\n");
          out.write(" \r\n");
          out.write(" <div class=\"row\">\r\n");
          out.write("  <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
          out.write("   <div class=\"form-group\">\r\n");
          out.write("    <label class=\"control-label\">User Id</label>\r\n");
          out.write("    <input type=\"text\" class=\"form-control\" name=\"userId\" id=\"userId\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_transaction_single_transaction_details.userDetailsBean.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>   \r\n");
          out.write("   </div>\r\n");
          out.write("  </div>\r\n");
          out.write("  \r\n");
          out.write("  <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
          out.write("   <div class=\"form-group\">\r\n");
          out.write("    <label class=\"control-label\">User Name</label>\r\n");
          out.write("    <input type=\"text\" class=\"form-control\" name=\"userName\" id=\"userName\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_transaction_single_transaction_details.userDetailsBean.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>   \r\n");
          out.write("   </div>\r\n");
          out.write("  </div>\r\n");
          out.write(" </div>\r\n");
          out.write(" \r\n");
          out.write(" <div class=\"row\">\r\n");
          out.write("  <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
          out.write("   <div class=\"form-group\">\r\n");
          out.write("    <label class=\"control-label\">Pincode</label>\r\n");
          out.write("    <input type=\"text\" class=\"form-control\" name=\"pincode\" id=\"pincode\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_transaction_single_transaction_details.userDetailsBean.pincode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>   \r\n");
          out.write("   </div>\r\n");
          out.write("  </div>\r\n");
          out.write("  \r\n");
          out.write("  <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
          out.write("   <div class=\"form-group\">\r\n");
          out.write("    <label class=\"control-label\">District</label>\r\n");
          out.write("    <input type=\"text\" class=\"form-control\" name=\"district\" id=\"district\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_transaction_single_transaction_details.userDetailsBean.district}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>   \r\n");
          out.write("   </div>\r\n");
          out.write("  </div>\r\n");
          out.write(" </div>\r\n");
          out.write(" \r\n");
          out.write(" <div class=\"row\">\r\n");
          out.write("  <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
          out.write("   <div class=\"form-group\">\r\n");
          out.write("    <label class=\"control-label\">City</label>\r\n");
          out.write("    <input type=\"text\" class=\"form-control\" name=\"city\" id=\"city\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_transaction_single_transaction_details.userDetailsBean.city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>   \r\n");
          out.write("   </div>\r\n");
          out.write("  </div>\r\n");
          out.write("  \r\n");
          out.write("  <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
          out.write("   <div class=\"form-group\">\r\n");
          out.write("    <label class=\"control-label\">State</label>\r\n");
          out.write("    <input type=\"text\" class=\"form-control\" name=\"state\" id=\"state\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_transaction_single_transaction_details.userDetailsBean.state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>   \r\n");
          out.write("   </div>\r\n");
          out.write("  </div>\r\n");
          out.write(" </div>\r\n");
          out.write(" \r\n");
          out.write(" <div class=\"row\">\r\n");
          out.write("  <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
          out.write("   <div class=\"form-group\">\r\n");
          out.write("    <label class=\"control-label\">Breed</label>\r\n");
          out.write("    <input type=\"text\" class=\"form-control\" name=\"userId\" id=\"userId\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_transaction_single_transaction_details.petBean.breed}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>   \r\n");
          out.write("   </div>\r\n");
          out.write("  </div>\r\n");
          out.write("  \r\n");
          out.write("  <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
          out.write("   <div class=\"form-group\">\r\n");
          out.write("    <label class=\"control-label\">Price</label>\r\n");
          out.write("    <input type=\"text\" class=\"form-control\" name=\"userName\" id=\"userName\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_transaction_single_transaction_details.petBean.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>   \r\n");
          out.write("   </div>\r\n");
          out.write("  </div>\r\n");
          out.write(" </div>\r\n");
          out.write(" \r\n");
          out.write("  <div class=\"row\">\r\n");
          out.write("  <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
          out.write("   <div class=\"form-group\">\r\n");
          out.write("    <label class=\"control-label\">Payment Type</label>\r\n");
          out.write("    <input type=\"text\" class=\"form-control\" name=\"paymentType\" id=\"paymentType\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_transaction_single_transaction_details.paymentStatusBean.paymentType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>   \r\n");
          out.write("   </div>\r\n");
          out.write("  </div>\r\n");
          out.write("  \r\n");
          out.write("  <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
          out.write("   <div class=\"form-group\">\r\n");
          out.write("    <label class=\"control-label\">CardHolder Name</label>\r\n");
          out.write("    <input type=\"text\" class=\"form-control\" name=\"cardHolderName\" id=\"cardHolderName\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_transaction_single_transaction_details.paymentStatusBean.cardHolderName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>   \r\n");
          out.write("   </div>\r\n");
          out.write("  </div>\r\n");
          out.write(" </div>\r\n");
          out.write(" \r\n");
          out.write("  <div class=\"row\">\r\n");
          out.write("  <div class=\"col-4 col-sm-4 col-md-4 col-lg-4 col-xl-4\">\r\n");
          out.write("   <div class=\"form-group\">\r\n");
          out.write("    <label class=\"control-label\">Account Number</label>\r\n");
          out.write("    <input type=\"text\" class=\"form-control\" name=\"accountNumber\" id=\"accountNumber\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_transaction_single_transaction_details.paymentStatusBean.accountNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>   \r\n");
          out.write("   </div>\r\n");
          out.write("  </div>\r\n");
          out.write("  \r\n");
          out.write("  <div class=\"col-4 col-sm-4 col-md-4 col-lg-4 col-xl-4\">\r\n");
          out.write("   <div class=\"form-group\">\r\n");
          out.write("    <label class=\"control-label\">Payment Status</label>\r\n");
          out.write("    <input type=\"text\" class=\"form-control\" name=\"paymentStatus\" id=\"paymentStatus\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_transaction_single_transaction_details.paymentStatusBean.paymentStatus}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>   \r\n");
          out.write("   </div>\r\n");
          out.write("  </div>\r\n");
          out.write(" \r\n");
          out.write("  <div class=\"col-4 col-sm-4 col-md-4 col-lg-4 col-xl-4\">\r\n");
          out.write("   <div class=\"form-group\">\r\n");
          out.write("    <label class=\"control-label\">Role Type</label>\r\n");
          out.write("    <input type=\"text\" class=\"form-control\" name=\"roleType\" id=\"roleType\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_transaction_single_transaction_details.userDetailsBean.roleType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>   \r\n");
          out.write("   </div>\r\n");
          out.write("  </div>\r\n");
          out.write(" </div>\r\n");
          out.write(" \r\n");
          out.write("  <div class=\"row\">\r\n");
          out.write("   <div class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12\">\r\n");
          out.write("    <div class=\"form-body\">\r\n");
          out.write("     <div class=\"form-group\">\r\n");
          out.write("      <button type=\"button\" class=\"btn btn-success\" onclick=\"javascript:history.go(-1)\">Back</button>\r\n");
          out.write("     </div>\r\n");
          out.write("   </div></div></div>\r\n");
          out.write(" </div> \r\n");
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
