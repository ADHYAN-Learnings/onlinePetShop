package org.apache.jsp.WEB_002dINF.views.AdminImplementation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UnsoldAnimalInformation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/views/AdminImplementation/../../tagLibraries/tagLibraries.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("   <div class=\"row\">\r\n");
      out.write("     <div class=\"col-10 col-sm-10 col-md-10 col-lg-10 col-xl-10\"></div>\r\n");
      out.write("     <div class=\"col-2 col-sm-2 col-md-2 col-lg-2 col-xl-2\">\r\n");
      out.write("     <a style=\"cursor:pointer;\" href=\"");
      out.print(request.getContextPath() );
      out.write("/add_product_Information\">\r\n");
      out.write("     <i Style=\"font-size:150%;\" class=\"fa fa-plus\"></i></a></div>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div style=\"overflow-x:auto;height:34em;\">\r\n");
      out.write("\t<table  class=\"VanderTable\">\r\n");
      out.write("\t  <thead>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <th>Actions</th>\r\n");
      out.write("\t      <th>Id</th>\r\n");
      out.write("\t      <th>Breed</th>\r\n");
      out.write("\t      <th>Price</th>\r\n");
      out.write("\t      <th>Status</th>\r\n");
      out.write("\t      <th>Gender</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </thead>\r\n");
      out.write("\t  <tbody>\r\n");
      out.write(" \t   ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("item");
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_unsold_animal.list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("         <tr>\r\n");
            out.write("         <td><a href=\"");
            out.print(request.getContextPath());
            out.write("/Unsold_pet_edit_details?petBeans.id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.petBeans.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\r\n");
            out.write("         <i style=\"cursor:pointer\" class=\"fa fa-pencil\"></i></a></td>\r\n");
            out.write("         <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.petBeans.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("         <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.petBeans.breed}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("         <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.petBeans.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("         <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.petBeans.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("         <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.gender}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>  \r\n");
            out.write("        </tr>     \r\n");
            out.write("       ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write(" \r\n");
      out.write("      </tbody>\r\n");
      out.write("     </table>\r\n");
      out.write("     </div>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(\"#home\").removeClass(\"active\");\r\n");
      out.write("\t\t$(\"#unsold_pet\").addClass(\"active\");\r\n");
      out.write("\t\t$(\"#user_details\").removeClass(\"active\");\r\n");
      out.write("\t\t$(\"#payment_details\").removeClass(\"active\");   \r\n");
      out.write("\t</script>");
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
