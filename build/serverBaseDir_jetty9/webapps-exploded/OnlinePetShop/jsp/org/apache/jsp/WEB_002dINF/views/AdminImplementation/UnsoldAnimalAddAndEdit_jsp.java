package org.apache.jsp.WEB_002dINF.views.AdminImplementation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UnsoldAnimalAddAndEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/views/AdminImplementation/../../tagLibraries/tagLibraries.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_select_path_class;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_name_modelAttribute_method_id_enctype_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_hidden_path_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_path_class_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_textarea_rows_path_class_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_type_path_class_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_form_select_path_class = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_form_name_modelAttribute_method_id_enctype_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_hidden_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_path_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_textarea_rows_path_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_type_path_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_form_select_path_class.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_form_form_name_modelAttribute_method_id_enctype_action.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_form_hidden_path_nobody.release();
    _jspx_tagPool_c_url_var_value_nobody.release();
    _jspx_tagPool_form_input_path_class_nobody.release();
    _jspx_tagPool_form_option_value.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_form_textarea_rows_path_class_nobody.release();
    _jspx_tagPool_form_input_type_path_class_nobody.release();
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
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_name_modelAttribute_method_id_enctype_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_form_0.setPageContext(_jspx_page_context);
      _jspx_th_form_form_0.setParent(null);
      _jspx_th_form_form_0.setId("product_information_details");
      _jspx_th_form_form_0.setName("product_information_details");
      _jspx_th_form_form_0.setModelAttribute("_product_description_details");
      _jspx_th_form_form_0.setEnctype("multipart/form-data");
      _jspx_th_form_form_0.setMethod("POST");
      _jspx_th_form_form_0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${upload}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
      try {
        int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
        if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write(" <div class=\"form-body\">\r\n");
            out.write("   \r\n");
            out.write("   <div class=\"row\">\r\n");
            out.write("    <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
            out.write("     <div class=\"form-group\">\r\n");
            out.write("     <label class=\"control-label\">Breed</label>\r\n");
            out.write("     ");
            if (_jspx_meth_form_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\r\n");
            out.write("    </div>\r\n");
            out.write("  </div>  \r\n");
            out.write("  \r\n");
            out.write("  <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
            out.write("   <div class=\"form-group\">\r\n");
            out.write("   <label class=\"control-label\">Add Image</label>\r\n");
            out.write("   ");
            if (_jspx_meth_form_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\r\n");
            out.write("   </div>\r\n");
            out.write("  </div> \r\n");
            out.write("      \r\n");
            out.write(" </div> \r\n");
            out.write(" <div class=\"row\"> \r\n");
            out.write(" \r\n");
            out.write("  <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
            out.write("   <div class=\"form-group\">\r\n");
            out.write("   <label class=\"control-label\">Price</label>\r\n");
            out.write("   ");
            if (_jspx_meth_form_input_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\r\n");
            out.write("   </div>\r\n");
            out.write("  </div> \r\n");
            out.write("  \r\n");
            out.write("   <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
            out.write("    <div class=\"form-group\">\r\n");
            out.write("     <label class=\"control-label\">Gender</label>\r\n");
            out.write("   ");
            out.write("\r\n");
            out.write("     ");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_0 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_path_class.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_select_0.setPageContext(_jspx_page_context);
            _jspx_th_form_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_select_0.setDynamicAttribute(null, "class", new String("form-control"));
            _jspx_th_form_select_0.setPath("gender");
            int[] _jspx_push_body_count_form_select_0 = new int[] { 0 };
            try {
              int _jspx_eval_form_select_0 = _jspx_th_form_select_0.doStartTag();
              if (_jspx_eval_form_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("       ");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_0 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_option_0.setPageContext(_jspx_page_context);
                  _jspx_th_form_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
                  _jspx_th_form_option_0.setValue(new String("Male"));
                  int[] _jspx_push_body_count_form_option_0 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_option_0 = _jspx_th_form_option_0.doStartTag();
                    if (_jspx_eval_form_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      if (_jspx_eval_form_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.pushBody();
                        _jspx_push_body_count_form_option_0[0]++;
                        _jspx_th_form_option_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                        _jspx_th_form_option_0.doInitBody();
                      }
                      do {
                        out.write("Male");
                        int evalDoAfterBody = _jspx_th_form_option_0.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                      if (_jspx_eval_form_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                        out = _jspx_page_context.popBody();
                        _jspx_push_body_count_form_option_0[0]--;
                    }
                    if (_jspx_th_form_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_option_0[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_option_0.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_option_0.doFinally();
                    _jspx_tagPool_form_option_value.reuse(_jspx_th_form_option_0);
                  }
                  out.write("\r\n");
                  out.write("       ");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_1 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_option_1.setPageContext(_jspx_page_context);
                  _jspx_th_form_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
                  _jspx_th_form_option_1.setValue(new String("Female"));
                  int[] _jspx_push_body_count_form_option_1 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_option_1 = _jspx_th_form_option_1.doStartTag();
                    if (_jspx_eval_form_option_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      if (_jspx_eval_form_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.pushBody();
                        _jspx_push_body_count_form_option_1[0]++;
                        _jspx_th_form_option_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                        _jspx_th_form_option_1.doInitBody();
                      }
                      do {
                        out.write("Female");
                        int evalDoAfterBody = _jspx_th_form_option_1.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                      if (_jspx_eval_form_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                        out = _jspx_page_context.popBody();
                        _jspx_push_body_count_form_option_1[0]--;
                    }
                    if (_jspx_th_form_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_option_1[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_option_1.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_option_1.doFinally();
                    _jspx_tagPool_form_option_value.reuse(_jspx_th_form_option_1);
                  }
                  out.write("\r\n");
                  out.write("     ");
                  int evalDoAfterBody = _jspx_th_form_select_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_select_0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_select_0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_select_0.doFinally();
              _jspx_tagPool_form_select_path_class.reuse(_jspx_th_form_select_0);
            }
            out.write("\r\n");
            out.write("    </div>\r\n");
            out.write("  </div>\r\n");
            out.write("  \r\n");
            out.write("  </div>\r\n");
            out.write("  <div class=\"row\">\r\n");
            out.write("  \r\n");
            out.write("    <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
            out.write("     <div class=\"form-group\">\r\n");
            out.write("      <label class=\"control-label\">Food</label>\r\n");
            out.write("      ");
            if (_jspx_meth_form_textarea_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\r\n");
            out.write("     </div>\r\n");
            out.write("    </div>\r\n");
            out.write("    \r\n");
            out.write("    <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
            out.write("     <div class=\"form-group\">\r\n");
            out.write("      <label class=\"control-label\">Description</label>\r\n");
            out.write("      ");
            if (_jspx_meth_form_textarea_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\r\n");
            out.write("     </div>\r\n");
            out.write("    </div> \r\n");
            out.write("     \r\n");
            out.write("  </div>\r\n");
            out.write("  <div class=\"row\">\r\n");
            out.write("  \r\n");
            out.write("  <div class=\"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
            out.write("     <div class=\"form-group\">\r\n");
            out.write("      <label class=\"control-label\">Medical Condition</label>\r\n");
            out.write("      ");
            if (_jspx_meth_form_textarea_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\r\n");
            out.write("     </div>\r\n");
            out.write("   </div>\r\n");
            out.write("  \r\n");
            out.write("  </div>  \r\n");
            out.write(" \r\n");
            out.write(" ");
            if (_jspx_meth_form_hidden_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\r\n");
            out.write(" <div class=\"container\">\r\n");
            out.write("    <button type=\"submit\" class=\"btn btn-primary\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${submitButton}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</button>\r\n");
            out.write("    <button type=\"button\" class=\"btn btn-success\" onclick=\"javascript:history.go(-1)\">BACK</button>\r\n");
            out.write(" </div>  \r\n");
            out.write(" </div>\r\n");
            out.write(" \r\n");
            int evalDoAfterBody = _jspx_th_form_form_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_form_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_form_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_form_0.doFinally();
        _jspx_tagPool_form_form_name_modelAttribute_method_id_enctype_action.reuse(_jspx_th_form_form_0);
      }
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("      $(\"#home\").removeClass(\"active\");\r\n");
      out.write("      $(\"#unsold_pet\").addClass(\"active\");\r\n");
      out.write("      $(\"#user_details\").removeClass(\"active\");\r\n");
      out.write("      $(\"#payment_details\").removeClass(\"active\");   \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write(" ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write(" \r\n");
        out.write(" ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write(" \r\n");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty _product_description_details.petBeans.id }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("   ");
        if (_jspx_meth_c_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("   ");
        if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("  \r\n");
        out.write(" ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_url_0.setVar("upload");
    _jspx_th_c_url_0.setValue("/admin_edit_unsold_animals");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_set_0.setVar("submitButton");
    _jspx_th_c_set_0.setValue(new String("UPDATE"));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("  ");
        if (_jspx_meth_c_url_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("  ");
        if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write(" ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_url_1.setVar("upload");
    _jspx_th_c_url_1.setValue("/admin_add_unsold_animals");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_set_1.setVar("submitButton");
    _jspx_th_c_set_1.setValue(new String("SUBMIT"));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_form_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_0.setPageContext(_jspx_page_context);
    _jspx_th_form_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_0.setPath("petBeans.breed");
    _jspx_th_form_input_0.setDynamicAttribute(null, "class", new String("form-control"));
    int[] _jspx_push_body_count_form_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_0 = _jspx_th_form_input_0.doStartTag();
      if (_jspx_th_form_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_0.doFinally();
      _jspx_tagPool_form_input_path_class_nobody.reuse(_jspx_th_form_input_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_1 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_1.setPageContext(_jspx_page_context);
    _jspx_th_form_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_1.setDynamicAttribute(null, "type", new String("file"));
    _jspx_th_form_input_1.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_form_input_1.setPath("petBeans.file");
    int[] _jspx_push_body_count_form_input_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_1 = _jspx_th_form_input_1.doStartTag();
      if (_jspx_th_form_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_1.doFinally();
      _jspx_tagPool_form_input_type_path_class_nobody.reuse(_jspx_th_form_input_1);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_2 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_2.setPageContext(_jspx_page_context);
    _jspx_th_form_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_2.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_form_input_2.setPath("petBeans.price");
    int[] _jspx_push_body_count_form_input_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_2 = _jspx_th_form_input_2.doStartTag();
      if (_jspx_th_form_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_2.doFinally();
      _jspx_tagPool_form_input_path_class_nobody.reuse(_jspx_th_form_input_2);
    }
    return false;
  }

  private boolean _jspx_meth_form_textarea_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_textarea_0 = (org.springframework.web.servlet.tags.form.TextareaTag) _jspx_tagPool_form_textarea_rows_path_class_nobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_textarea_0.setPageContext(_jspx_page_context);
    _jspx_th_form_textarea_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_textarea_0.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_form_textarea_0.setPath("food");
    _jspx_th_form_textarea_0.setRows("5");
    int[] _jspx_push_body_count_form_textarea_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_textarea_0 = _jspx_th_form_textarea_0.doStartTag();
      if (_jspx_th_form_textarea_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_textarea_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_textarea_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_textarea_0.doFinally();
      _jspx_tagPool_form_textarea_rows_path_class_nobody.reuse(_jspx_th_form_textarea_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_textarea_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_textarea_1 = (org.springframework.web.servlet.tags.form.TextareaTag) _jspx_tagPool_form_textarea_rows_path_class_nobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_textarea_1.setPageContext(_jspx_page_context);
    _jspx_th_form_textarea_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_textarea_1.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_form_textarea_1.setPath("description");
    _jspx_th_form_textarea_1.setRows("5");
    int[] _jspx_push_body_count_form_textarea_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_textarea_1 = _jspx_th_form_textarea_1.doStartTag();
      if (_jspx_th_form_textarea_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_textarea_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_textarea_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_textarea_1.doFinally();
      _jspx_tagPool_form_textarea_rows_path_class_nobody.reuse(_jspx_th_form_textarea_1);
    }
    return false;
  }

  private boolean _jspx_meth_form_textarea_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_textarea_2 = (org.springframework.web.servlet.tags.form.TextareaTag) _jspx_tagPool_form_textarea_rows_path_class_nobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_textarea_2.setPageContext(_jspx_page_context);
    _jspx_th_form_textarea_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_textarea_2.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_form_textarea_2.setPath("medicalCondition");
    _jspx_th_form_textarea_2.setRows("5");
    int[] _jspx_push_body_count_form_textarea_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_textarea_2 = _jspx_th_form_textarea_2.doStartTag();
      if (_jspx_th_form_textarea_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_textarea_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_textarea_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_textarea_2.doFinally();
      _jspx_tagPool_form_textarea_rows_path_class_nobody.reuse(_jspx_th_form_textarea_2);
    }
    return false;
  }

  private boolean _jspx_meth_form_hidden_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_hidden_0 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _jspx_tagPool_form_hidden_path_nobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_hidden_0.setPageContext(_jspx_page_context);
    _jspx_th_form_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_hidden_0.setPath("petBeans.id");
    int[] _jspx_push_body_count_form_hidden_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_hidden_0 = _jspx_th_form_hidden_0.doStartTag();
      if (_jspx_th_form_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_hidden_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_hidden_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_hidden_0.doFinally();
      _jspx_tagPool_form_hidden_path_nobody.reuse(_jspx_th_form_hidden_0);
    }
    return false;
  }
}
