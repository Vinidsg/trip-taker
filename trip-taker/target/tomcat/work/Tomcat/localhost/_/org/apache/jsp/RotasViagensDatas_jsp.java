/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-14 15:29:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RotasViagensDatas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\"\r\n");
      out.write("          content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>Trip Taker - Rotas, Viagens e Datas</title>\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"/Images/LogoTripTaker.ico\" type=\"image/x-icon\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans:wght@100;300;500&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.4/font/bootstrap-icons.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/Style/index.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/Style/RotasViagensDatas.css\">\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg fixed-top bg-primary-color\" id=\"navbar\">\r\n");
      out.write("        <div class=\"container py-3\">\r\n");
      out.write("            <a href=\"#\" class=\"navbar-brand primary-color\">\r\n");
      out.write("                <img src=\"/Images/logo.png\" alt=\"\"/>\r\n");
      out.write("            </a>\r\n");
      out.write("            <button\r\n");
      out.write("                    class=\"navbar-toggler\"\r\n");
      out.write("                    type=\"button\"\r\n");
      out.write("                    data-bs-toggle=\"collapse\"\r\n");
      out.write("                    data-bs-target=\"#navbar-items\"\r\n");
      out.write("                    aria-controls=\"navbar-items\"\r\n");
      out.write("                    aria-expanded=\"false\"\r\n");
      out.write("                    aria-label=\"Toggle navigation\">\r\n");
      out.write("            <i class=\"bi bi-list\"></i>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbar-items\">\r\n");
      out.write("                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a href=\"/index.jsp\" class=\"nav-link primary-color\"  > Inicio </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a href=\"#\" class=\"nav-link active primary-color\" aria-current=\"page\">Rotas</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a href=\"#\" class=\"nav-link primary-color\">Sobre</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                    <div>\r\n");
      out.write("                    <button href=\"#\" class=\"buttonLogin  btn-primary\" id=\"loginBtn\">Login</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"RotasViagensDatas.css\" media=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"titlePage\">\r\n");
      out.write("        <h1>Rotas, Viagens e Datas</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("<div class=\"container-principal\">\r\n");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <footer class=\"container-fluid bg-primary-color\" id=\"footer\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-12\" id=\"footer-top\">\r\n");
      out.write("                    <div class=\"row justify-content-between\">\r\n");
      out.write("                        <div class=\"col-4\">\r\n");
      out.write("                            <img src=\"/Images/logo.png\" alt=\"Logo\" class=\"logoIMG\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-4\" id=\"social-icons\">\r\n");
      out.write("                            <i class=\"bi bi-facebook\"></i>\r\n");
      out.write("                            <i class=\"bi bi-instagram\"></i>\r\n");
      out.write("                            <i class=\"bi bi-youtube\"></i>\r\n");
      out.write("                            <i class=\"bi bi-twitter\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-4\" id=\"arrow-up\">\r\n");
      out.write("                            <i class=\"bi bi-arrow-up-circle\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /RotasViagensDatas.jsp(68,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("trip");
    // /RotasViagensDatas.jsp(68,0) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/RotasViagensDatas.jsp(68,0) '${trips}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${trips}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("    <div class=\"col-12 container\">\r\n");
          out.write("            <div class=\"row\">\r\n");
          out.write("                <div class=\"col-12 col-md-5\" id=\"info-banner\">\r\n");
          out.write("                       <img style=\" width: 500px\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.scheme}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(':');
          out.write('/');
          out.write('/');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.serverName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(':');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.serverPort}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('/');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${trip.image}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" alt=\"...\">\r\n");
          out.write("                    </a>\r\n");
          out.write("                </div>\r\n");
          out.write("                <div class=\"col-12 col-md-7 bg-secondary-color\" id=\"info-content\">\r\n");
          out.write("                    <div class=\"row\">\r\n");
          out.write("                        <div class=\"col-12\">\r\n");
          out.write("                            <div class=\"font-descricao\">\r\n");
          out.write("                                <h2 class=\"title secondary-color\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${trip.local}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h2>\r\n");
          out.write("                                <p class=\"subtitle secondary-color\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${trip.descricao}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</p>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                        <div class=\"col-12\" id=\"info-numbers\">\r\n");
          out.write("                            <div class=\"row\">\r\n");
          out.write("                                <div class=\"col-4\">\r\n");
          out.write("                                    <h4 class=\"secondary-color\">Data inicio</h4>\r\n");
          out.write("                                    <p class=\"secondary-color\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${trip.dataInicio}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</p>\r\n");
          out.write("                                </div>\r\n");
          out.write("                                <div class=\"col-4\">\r\n");
          out.write("                                    <h4 class=\"secondary-color\">Data final</h4>\r\n");
          out.write("                                    <p class=\"secondary-color\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${trip.dataFinal}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</p>\r\n");
          out.write("                                </div>\r\n");
          out.write("                                <div class=\"col-4\">\r\n");
          out.write("                                    <h4 class=\"secondary-color\">Quantidade</h4>\r\n");
          out.write("                                    <p class=\"secondary-color\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${trip.qtdPessoas}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</p>\r\n");
          out.write("                                </div>\r\n");
          out.write("                                 <div class=\"col-4\">\r\n");
          out.write("                                   <h4 class=\"secondary-color\">Valor</h4>\r\n");
          out.write("                                   <p class=\"secondary-color\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${trip.valorUnitario}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</p>\r\n");
          out.write("                                 </div>\r\n");
          out.write("                                 <div class=\"col-4\">\r\n");
          out.write("                                    <h4  class=\"secondary-color\">Guia</h4>\r\n");
          out.write("                                     <p  class=\"secondary-color\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${trip.guiaResponsavel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</p>\r\n");
          out.write("                                 </div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                        <div class=\"col-12\">\r\n");
          out.write("                            <a href=\"#\" class=\"btn btn-dark\">Agendar</a>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>\r\n");
          out.write("                </div>\r\n");
          out.write("            </div>\r\n");
          out.write("        </div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
