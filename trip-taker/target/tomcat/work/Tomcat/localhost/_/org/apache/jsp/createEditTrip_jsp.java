/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-01 02:47:35 UTC
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\"\r\n");
      out.write("          content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>Trip Taker - InÃ­cio</title>\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"/Images/LogoTripTaker.ico\" type=\"image/x-icon\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans:wght@100;300;500&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.4/font/bootstrap-icons.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/Style/index.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/Style/createEditTrip.css\">\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
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
      out.write("                        <a href=\"#\" class=\"nav-link active primary-color\" aria-current=\"page\"> InÃ­cio </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a href=\"#\" class=\"nav-link primary-color\">Rotas</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a href=\"#\" class=\"nav-link primary-color\">Sobre</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <button href=\"#\" class=\"buttonLogin  btn-primary\" id=\"loginBtn\">Login</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <form action=\"/create-trip\" method=\"post\">\r\n");
      out.write("        <div class=\"titlePage\">\r\n");
      out.write("            <h1>Criar/ Editar Rotas</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"formularioCER\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <label>Local</label>\r\n");
      out.write("                <input type=\"text\" name=\"local\" id=\"local\">\r\n");
      out.write("\r\n");
      out.write("                <label>Quantidade de Pessoas</label>\r\n");
      out.write("                <input type=\"number\" name=\"qtdPessoa\" id=\"qtdPessoa\">\r\n");
      out.write("\r\n");
      out.write("                <label>Guia ResponsÃ¡vel</label>\r\n");
      out.write("                <input type=\"text\" name=\"guiaResponsavel\" id=\"guiaResponsavel\">\r\n");
      out.write("\r\n");
      out.write("                <label>Valor UnitÃ¡rio</label>\r\n");
      out.write("                <input type=\"number\" inputmode=\"numeric\" name=\"vlrUnitario\" id=\"vlrUnitario\">\r\n");
      out.write("\r\n");
      out.write("                <label>Data InÃ­cio</label>\r\n");
      out.write("                <input type=\"date\" name=\"dtInicio\" id=\"dtInicio\" required placeholder=\"DD/MM/AAAA\"  mask=\"99/99/9999\">\r\n");
      out.write("\r\n");
      out.write("                <label>Data Final</label>\r\n");
      out.write("                <input type=\"date\" name=\"dtFinal\" id=\"dtFinal\" required placeholder=\"DD/MM/AAAA\"  mask=\"99/99/9999\">\r\n");
      out.write("\r\n");
      out.write("                <label>DescriÃ§Ã£o</label>\r\n");
      out.write("                <textarea class=\"descricao\" type=\"text\" name=\"descricao\" id=\"descricao\"></textarea>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"buttons\">\r\n");
      out.write("                    <button type=\"submit\" class=\"laranja\">Salvar</button>\r\n");
      out.write("                    <button class=\"azul\">Cancelar</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("    <footer class=\"container-fluid bg-primary-color\" id=\"footer\">\r\n");
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
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("      $(function() {\r\n");
      out.write("        $('#loginBtn').click(function() {\r\n");
      out.write("          $('#loginModal').modal('show');\r\n");
      out.write("        });\r\n");
      out.write("      });\r\n");
      out.write("    </script>\r\n");
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
}
