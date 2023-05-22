/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-22 23:25:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class descricaoViagem_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    \n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Descrição da Viagem</title>\n");
      out.write("    <!-- Google fonts - NotoSans - Light | Medium | Thin -->\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans:wght@100;300;500&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <!-- CSS Bootstrap e JS Bootstrap -->\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <!-- Bootstrap icons -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.4/font/bootstrap-icons.css\">\n");
      out.write("    <!-- CSS do projeto -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"/Style/descricaoViagem.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/Style/index.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- NAVBAR -->\n");
      out.write("<nav class=\"navbar navbar-expand-lg fixed-top bg-primary-color\" id=\"navbar\">\n");
      out.write("    <div class=\"container py-3\">\n");
      out.write("        <a href=\"#\" class=\"navbar-brand primary-color\">\n");
      out.write("            <img src=\"/Images/logo.png\" alt=\"\"/>\n");
      out.write("        </a>\n");
      out.write("        <button\n");
      out.write("                class=\"navbar-toggler hamburguer\"\n");
      out.write("                type=\"button\"\n");
      out.write("                data-bs-toggle=\"collapse\"\n");
      out.write("                data-bs-target=\"#navbar-items\"\n");
      out.write("                aria-controls=\"navbar-items\"\n");
      out.write("                aria-expanded=\"false\"\n");
      out.write("                aria-label=\"Toggle navigation\">\n");
      out.write("            <i class=\"bi bi-list \"></i>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbar-items\">\n");
      out.write("            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a href=\"#\" class=\"nav-link primary-color\" aria-current=\"page\"> Início </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a href=\"/find-all-trips\" class=\"nav-link primary-color\">Rotas</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a href=\"#\" class=\"nav-link primary-color\">Sobre</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <div>\n");
      out.write("                <button class=\"buttonLogin  btn-primary\" id=\"loginBtn\">Login</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"image\">\n");
      out.write("    <img class=\"img-fluid\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.image}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" alt=\"Imagem\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--Fotos & Descrição da viagem-->\n");
      out.write("<div class=\"imageBanner-dv card\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"card-body describe-text\">\n");
      out.write("        <h5>Descrição:</h5>\n");
      out.write("        <p class=\"card-text\">A Praia do Gunga está localizada a 20 milhas ao sul de Maceió, Alagoas.\n");
      out.write("            É considerada uma das praias mais bonitas do Brasil. A praia é cercada por coqueiros e fica bem entre o Oceano Atlântico e a Lagoa do Roteiro.\n");
      out.write("            Esta posição garante uma cor única do oceano ao redor da praia.</p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!--Tabela de preços -->\n");
      out.write("<div class=\"container\" id=\"table-price\">\n");
      out.write("    <div class=\"row align-items-start\">\n");
      out.write("        <div class=\"col card text-card-2 card-only-text\">\n");
      out.write("            Data Início\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col card text-card-2 card-only-text\">\n");
      out.write("            Data Final\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col card text-card-2 card-only-text\">\n");
      out.write("            Quantidade de pesssoas\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row align-items-start\">\n");
      out.write("        <div class=\"col card text-card card-only-text\">\n");
      out.write("            <label type=\"date\" name=\"dtInicio\" id=\"dtInicio\" required placeholder=\"DD/MM/AAAA\"  mask=\"99/99/9999\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.dataInicio}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col card text-card card-only-text\">\n");
      out.write("            <label type=\"date\" name=\"dtFinal\" id=\"dtFinal\" required placeholder=\"DD/MM/AAAA\"  mask=\"99/99/9999\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.dataFinal}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col card text-card card-only-text\">\n");
      out.write("            <label>Quantidade de Pessoas</label>\n");
      out.write("            <label type=\"number\" name=\"qtdPessoa\" id=\"qtdPessoa\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.qtdPessoa}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</label>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"row align-items-start guia-information\">\n");
      out.write("        <div class=\"col card text-card-2 card-only-text\">\n");
      out.write("            <div class=\"col\">\n");
      out.write("                <label>Guia Responsável</label>\n");
      out.write("                <label type=\"text\" name=\"guiaResponsavel\" id=\"guiaResponsavel\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.guiaResponsavel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</label>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col card text-card-2 card-only-text\">\n");
      out.write("            <div class=\"col bg-primary-color-div secondary-color-dv price-guia\">\n");
      out.write("                <label>Valor Unitário</label>\n");
      out.write("                <label type=\"number\" inputmode=\"numeric\" name=\"vlrUnitario\" id=\"vlrUnitario\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.valorUnitario}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" </label>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col card text-card-2 card-only-text\">\n");
      out.write("                <button href=\"#\" class=\"nav-link bg-third-color-dv secondary-color-dv\">Reservar</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("\n");
      out.write("<footer class=\"container-fluid bg-primary-color secondary-color\" id=\"footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <!--Footer Top-->\n");
      out.write("            <div class=\"col-12\" id=\"footer-top\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-4\" id=\"social-icons2\">\n");
      out.write("                        <img src=\"/Images/logo2.png\" alt=\"logo2\">\n");
      out.write("                        <br>\n");
      out.write("                        <i class=\"bi bi-whatsapp\"></i>\n");
      out.write("                        <h5>(11)93552-8200</h5>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-4\" id=\"social-icons\">\n");
      out.write("                        <h5>Fique Por Dentro Dos Nossos Conteúdos</h5>\n");
      out.write("                        <i class=\"bi bi-facebook\"></i>\n");
      out.write("                        <i class=\"bi bi-instagram\"></i>\n");
      out.write("                        <i class=\"bi bi-youtube\"></i>\n");
      out.write("                        <i class=\"bi bi-twitter\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-4\" id=\"img-arrow-icons\">\n");
      out.write("                        <img src=\"/Images/Arrow.png\" alt=\"Arrow\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--Footer Details-->\n");
      out.write("            <div class=\"col-12\" id=\"footer-details\"></div>\n");
      out.write("            <!-- Footer Bottom-->\n");
      out.write("            <div class=\"col-12\" id=\"footer-bottom\"></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
}
