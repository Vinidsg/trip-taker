/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-23 17:27:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createEditTrip_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("     \n");
      out.write("    <meta name=\"viewport\"\n");
      out.write("          content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Trip Taker - Início</title>\n");
      out.write("    <link rel=\"shortcut icon\" href=\"/Images/LogoTripTaker.ico\" type=\"image/x-icon\">\n");
      out.write("\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans:wght@100;300;500&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.4/font/bootstrap-icons.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/Style/create.css\">\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg fixed-top bg-primary-color\" id=\"navbar\">\n");
      out.write("        <div class=\"container py-3\">\n");
      out.write("            <a href=\"#\" class=\"navbar-brand primary-color\">\n");
      out.write("                <img src=\"/Images/logo.png\" alt=\"\"/>\n");
      out.write("            </a>\n");
      out.write("            <button\n");
      out.write("                    class=\"navbar-toggler\"\n");
      out.write("                    type=\"button\"\n");
      out.write("                    data-bs-toggle=\"collapse\"\n");
      out.write("                    data-bs-target=\"#navbar-items\"\n");
      out.write("                    aria-controls=\"navbar-items\"\n");
      out.write("                    aria-expanded=\"false\"\n");
      out.write("                    aria-label=\"Toggle navigation\">\n");
      out.write("            <i class=\"bi bi-list\"></i>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbar-items\">\n");
      out.write("                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"/index.jsp\" class=\"nav-link primary-color\" aria-current=\"page\"> Início </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"/find-all-trips\" class=\"nav-link primary-color\">Rotas</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"/Sobre.jsp\" class=\"nav-link primary-color\">Sobre</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <div>\n");
      out.write("                    <button class=\"buttonLogin  btn-primary\" id=\"loginBtn\">Sair</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"container tituloPg\">\n");
      out.write("      <div class=\"row justify-content-center\">\n");
      out.write("        <div class=\"col-lg-6 col-md-8 col-sm-10\">\n");
      out.write("          <h2 class=\"text-center\">Cadastro de Viagem/Rota</h2>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <form action=\"/create-trip\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row justify-content-center\">\n");
      out.write("          <div class=\"col-lg-6 col-md-8 col-sm-10 formulario\">\n");
      out.write("            <input type=\"hidden\" id=\"id\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("              <label for=\"local\" class=\"form-label\">Local</label>\n");
      out.write("              <input type=\"text\" name=\"local\" id=\"local\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("              <label for=\"qtdPessoa\" class=\"form-label\">Quantidade de Pessoas</label>\n");
      out.write("              <input type=\"number\" name=\"qtdPessoa\" id=\"qtdPessoa\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.qtdPessoa}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("              <label for=\"guiaResponsavel\" class=\"form-label\">Guia Responsável</label>\n");
      out.write("              <input type=\"text\" name=\"guiaResponsavel\" id=\"guiaResponsavel\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.guiaResponsavel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("              <label for=\"vlrUnitario\" class=\"form-label\">Valor Unitário</label>\n");
      out.write("              <input type=\"number\" inputmode=\"numeric\" name=\"vlrUnitario\" id=\"vlrUnitario\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.valorUnitario}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("              <label for=\"dtInicio\" class=\"form-label\">Data Início</label>\n");
      out.write("              <input type=\"date\" name=\"dtInicio\" id=\"dtInicio\" class=\"form-control\" placeholder=\"DD/MM/AAAA\" mask=\"99/99/9999\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.dataInicio}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("              <label for=\"dtFinal\" class=\"form-label\">Data Final</label>\n");
      out.write("              <input type=\"date\" name=\"dtFinal\" id=\"dtFinal\" class=\"form-control\" required placeholder=\"DD/MM/AAAA\" mask=\"99/99/9999\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.dataFinal}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("              <label for=\"descricao\" class=\"form-label\">Descrição</label>\n");
      out.write("              <textarea required class=\"form-control descricao\" name=\"descricao\" id=\"descricao\" required>  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.descricao}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" </textarea>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("              <div class=\"image\">\n");
      out.write("                  <img class=\"img-fluid\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.image}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" alt=\"Imagem\">\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("            <div class=\"mb-3 upload-image\">\n");
      out.write("              <label for=\"file\" class=\"form-label\">Upload de Imagem</label>\n");
      out.write("              <div class=\"input-group\">\n");
      out.write("                <input type=\"file\" class=\"form-control\" name=\"file\" id=\"file\">\n");
      out.write("                <span class=\"input-group-text\"><i class=\"bi bi-upload\"></i></span>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mb-3 text-center\">\n");
      out.write("              <button type=\"submit\" class=\"btn btn-primary btnSalvar\">Salvar</button>\n");
      out.write("              <button class=\"btn btn-secondary btnCancelar\">Cancelar</button>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <footer class=\"container-fluid bg-primary-color\" id=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-12\" id=\"footer-top\">\n");
      out.write("                    <div class=\"row justify-content-between\">\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <img src=\"/Images/logo.png\" alt=\"Logo\" class=\"logoIMG\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\" id=\"social-icons\">\n");
      out.write("                            <i class=\"bi bi-facebook\"></i>\n");
      out.write("                            <i class=\"bi bi-instagram\"></i>\n");
      out.write("                            <i class=\"bi bi-youtube\"></i>\n");
      out.write("                            <i class=\"bi bi-twitter\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\" id=\"arrow-up\">\n");
      out.write("                            <i class=\"bi bi-arrow-up-circle\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("      document.addEventListener('DOMContentLoaded', function() {\n");
      out.write("        document.querySelector('button[type=\"submit\"]').addEventListener('click', function() {\n");
      out.write("          var inputs = document.querySelectorAll('form input[required], form textarea[required]');\n");
      out.write("\n");
      out.write("          for (var i = 0; i < inputs.length; i++) {\n");
      out.write("            if (inputs[i].value.trim() === '') {\n");
      out.write("              inputs[i].classList.add('is-invalid');\n");
      out.write("            } else {\n");
      out.write("              inputs[i].classList.remove('is-invalid');\n");
      out.write("            }\n");
      out.write("          }\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("      document.getElementById(\"loginBtn\").addEventListener(\"click\", function() {\n");
      out.write("              window.location.href = \"/logout\";\n");
      out.write("            });\n");
      out.write("      document.getElementById('arrow-up').addEventListener('click', function() {\n");
      out.write("      window.scrollTo({ top: 0, behavior: 'smooth' });\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
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
}
