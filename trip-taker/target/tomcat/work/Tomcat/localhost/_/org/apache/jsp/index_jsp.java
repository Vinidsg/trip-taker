/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-29 11:52:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    \n");
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
      out.write("    <link rel=\"stylesheet\" href=\"/Style/index.css\">\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg fixed-top bg-primary-color\" id=\"navbar\">\n");
      out.write("        <div class=\"container py-3\">\n");
      out.write("            <a href=\"#\" class=\"navbar-brand primary-color\">\n");
      out.write("                <img src=\"/Images/logo.png\" alt=\"\"/>\n");
      out.write("            </a>\n");
      out.write("            <button\n");
      out.write("                    class=\"navbar-toggler hamburguer\"\n");
      out.write("                    type=\"button\"\n");
      out.write("                    data-bs-toggle=\"collapse\"\n");
      out.write("                    data-bs-target=\"#navbar-items\"\n");
      out.write("                    aria-controls=\"navbar-items\"\n");
      out.write("                    aria-expanded=\"false\"\n");
      out.write("                    aria-label=\"Toggle navigation\">\n");
      out.write("            <i class=\"bi bi-list \"></i>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbar-items\">\n");
      out.write("                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"/index.jsp\" class=\"nav-link active primary-color\" aria-current=\"page\"> Início </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"/find-all-trips\" class=\"nav-link primary-color\">Rotas</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"/Sobre.jsp\" class=\"nav-link primary-color\">Sobre</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <div>\n");
      out.write("                    <button class=\"buttonLogin  btn-primary\" id=\"loginBtn\">Login</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"carousel\" id=\"slider-container\">\n");
      out.write("        <div class=\"carousel slide\" id=\"slider\" data-bs-ride=\"carousel\">\n");
      out.write("            <div class=\"carousel-indicators\">\n");
      out.write("                <button\n");
      out.write("                        type=\"button\"\n");
      out.write("                        class=\"active\"\n");
      out.write("                        data-bs-target=\"#slider\"\n");
      out.write("                        data-bs-slide-to=\"0\"\n");
      out.write("                        aria-current=\"true\"\n");
      out.write("                        aria-label=\"Slide 1\"\n");
      out.write("                ></button>\n");
      out.write("                <button\n");
      out.write("                        type=\"button\"\n");
      out.write("                        data-bs-target=\"#slider\"\n");
      out.write("                        data-bs-slide-to=\"1\"\n");
      out.write("                        aria-label=\"Slide 2\"\n");
      out.write("                ></button>\n");
      out.write("                <button\n");
      out.write("                        type=\"button\"\n");
      out.write("                        data-bs-target=\"#slider\"\n");
      out.write("                        data-bs-slide-to=\"2\"\n");
      out.write("                        aria-label=\"Slide 3\"\n");
      out.write("                ></button>\n");
      out.write("                <button\n");
      out.write("                        type=\"button\"\n");
      out.write("                        data-bs-target=\"#slider\"\n");
      out.write("                        data-bs-slide-to=\"3\"\n");
      out.write("                        aria-label=\"Slide 4\"\n");
      out.write("                ></button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <img src=\"/Images/praia.png\" alt=\"Praia\" class=\"d-block w-100\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                        <h5>Rotas Disponíveis - Praias</h5>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-dark\">Ver Rotas</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"/Images/trilha.png\" alt=\"Praia\" class=\"d-block w-100\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                        <h5>Rotas Disponíveis - Trilhas</h5>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-dark\">Ver Rotas</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"/Images/cachoeira.png\" alt=\"Praia\" class=\"d-block w-100\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                        <h5>Rotas Disponíveis - Cachoeiras</h5>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-dark\">Ver Rotas</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"/Images/hotel.png\" alt=\"Praia\" class=\"d-block w-100\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                        <h5>Rotas Disponíveis - Hotéis Incríveis</h5>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-dark\">Ver Rotas</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <button\n");
      out.write("                    class=\"carousel-control-prev\"\n");
      out.write("                    type=\"button\"\n");
      out.write("                    data-bs-target=\"#slider\"\n");
      out.write("                    data-bs-slide=\"prev\"\n");
      out.write("                    >\n");
      out.write("                <i class=\"bi bi-chevron-compact-left\"></i>\n");
      out.write("                    <span class=\"visually-hidden\">Previous</span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <button\n");
      out.write("                    class=\"carousel-control-next\"\n");
      out.write("                    type=\"button\"\n");
      out.write("                    data-bs-target=\"#slider\"\n");
      out.write("                    data-bs-slide=\"next\"\n");
      out.write("            >\n");
      out.write("                <i class=\"bi bi-chevron-compact-right\"></i>\n");
      out.write("                <span class=\"visually-hidden\">Next</span>\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-12 col-md-10 offset-md-1\" id=\"mini-banners\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-12 col-md-4\">\n");
      out.write("                    <div class=\"card text-center\">\n");
      out.write("                        <i class=\"bi bi-bullseye secondary-color\"></i>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h5 class=\"card-title secondary-color\">Objetivo</h5>\n");
      out.write("                            <p class=\"card-text secondary-color\">Nascemos com o objetivo de fazer com que sua viajem seja incrível, simples, inesquecível e o principal, com segurança.</p>\n");
      out.write("                            <a href=\"#\" class=\"btn btn-dark\">Saber Mais</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-md-4\">\n");
      out.write("                    <div class=\"card text-center\">\n");
      out.write("                        <i class=\"bi bi-map secondary-color\"></i>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h5 class=\"card-title secondary-color\">Rotas</h5>\n");
      out.write("                            <p class=\"card-text secondary-color\">Com o destino decidido, disponibilizaremos roteiros da sua viagem para que seja aproveitada ao máximo.</p>\n");
      out.write("                            <a href=\"#\" class=\"btn btn-dark\"> Ver Rotas</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-md-4\">\n");
      out.write("                    <div class=\"card text-center\">\n");
      out.write("                        <i class=\"bi bi-pin-angle-fill secondary-color\"></i>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h5 class=\"card-title secondary-color\">Localização</h5>\n");
      out.write("                            <p class=\"card-text secondary-color\">Estamos localizados em diversos pontos turísticos, com o intuito de uma maior ampliação na hora da escolha do seu destino.</p>\n");
      out.write("                            <a href=\"#\" class=\"btn btn-dark\"> Ver Rotas</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container\" id=\"featured-container\">\n");
      out.write("        <div class=\"col-12\">\n");
      out.write("            <h2 class=\"title secondary-color\">Tipos de Rotas</h2>\n");
      out.write("            <p class=\"subtitle secondary-color\">Conheça os tipos de rotas que ofereçemos</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-12\" id=\"featured-images\">\n");
      out.write("            <div class=\"row g-4\">\n");
      out.write("                <div class=\"col-12 col-md-4\">\n");
      out.write("                    <img src=\"/Images/praiaWP.jpg\" alt=\"Projeto Praia\" class=\"img-fluid\">\n");
      out.write("                    <div class=\"banner-content\">\n");
      out.write("                        <p class=\"secondary-color\">Praias</p>\n");
      out.write("                        <h3>Veja as Rotas Disponíveis</h3>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-md-4\">\n");
      out.write("                    <img src=\"/Images/trilhaWP.png\" alt=\"Projeto Trilha\" class=\"img-fluid\">\n");
      out.write("                    <div class=\"banner-content\">\n");
      out.write("                        <p class=\"secondary-color\">Trilhas</p>\n");
      out.write("                        <h3>Veja as Rotas Disponíveis</h3>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-md-4\">\n");
      out.write("                    <img src=\"/Images/cachoeiraWP.jpg\" alt=\"Projeto Cachoeira\" class=\"img-fluid\">\n");
      out.write("                    <div class=\"banner-content\">\n");
      out.write("                        <p class=\"secondary-color\">Cachoeiras</p>\n");
      out.write("                        <h3>Veja as Rotas Disponíveis</h3>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container\" id=\"info-container\">\n");
      out.write("        <div class=\"col-12\">\n");
      out.write("            <h2 class=\"title secondary-color\">Mais Detalhes Sobre Nós</h2>\n");
      out.write("            <p class=\"subtitle secondary-color\">Saiba mais sobre nosso objetivo de entrega ao cliente</p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-12 container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-12 col-md-5\" id=\"info-banner\">\n");
      out.write("                <img src=\"/Images/mapa.jpg\" alt=\"Localização da Empresa\" class=\"image-fluid\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-12 col-md-7 bg-secondary-color\" id=\"info-content\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <h2 class=\"title secondary-color\">Nós Fazemos a Diferença!</h2>\n");
      out.write("                        <p class=\"subtitle secondary-color\">Estamos espalhados em pontos turísticos estratégicos ao redor do mundo para oferecer ao nosso cliente uma gama completa de lugares disponíveis para visitar, fazendo com que nosso serviço oferecido seja único e com grande abrangência.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12\" id=\"info-numbers\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <h3 class=\"secondary-color\">10</h3>\n");
      out.write("                                <p class=\"secondary-color\">Anos No Ramo Turístico</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <h3 class=\"secondary-color\">57</h3>\n");
      out.write("                                <p class=\"secondary-color\">Países Disponíveis</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <h3 class=\"secondary-color\">335</h3>\n");
      out.write("                                <p class=\"secondary-color\">Clientes Atendidos</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <a href=\"#\" class=\"btn btn-dark\">Sobre</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <footer class=\"container-fluid bg-primary-color mt-auto\" id=\"footer\">\n");
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
      out.write("      document.getElementById(\"loginBtn\").addEventListener(\"click\", function() {\n");
      out.write("        window.location.href = \"/login\";\n");
      out.write("      });\n");
      out.write("      document.getElementById('arrow-up').addEventListener('click', function() {\n");
      out.write("        window.scrollTo({ top: 0, behavior: 'smooth' });\n");
      out.write("      });\n");
      out.write("    </script>\n");
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
