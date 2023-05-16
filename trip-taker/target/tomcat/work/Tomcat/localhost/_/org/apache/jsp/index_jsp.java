/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-16 04:09:05 UTC
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    \r\n");
      out.write("    <meta name=\"viewport\"\r\n");
      out.write("          content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>Trip Taker - Início</title>\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"/Images/LogoTripTaker.ico\" type=\"image/x-icon\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans:wght@100;300;500&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.4/font/bootstrap-icons.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/Style/index.css\">\r\n");
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
      out.write("                    class=\"navbar-toggler hamburguer\"\r\n");
      out.write("                    type=\"button\"\r\n");
      out.write("                    data-bs-toggle=\"collapse\"\r\n");
      out.write("                    data-bs-target=\"#navbar-items\"\r\n");
      out.write("                    aria-controls=\"navbar-items\"\r\n");
      out.write("                    aria-expanded=\"false\"\r\n");
      out.write("                    aria-label=\"Toggle navigation\">\r\n");
      out.write("            <i class=\"bi bi-list \"></i>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbar-items\">\r\n");
      out.write("                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a href=\"/index.jsp\" class=\"nav-link active primary-color\" aria-current=\"page\"> Início </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a href=\"/find-all-trips\" class=\"nav-link primary-color\">Rotas</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a href=\"#\" class=\"nav-link primary-color\">Sobre</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <button class=\"buttonLogin  btn-primary\" id=\"loginBtn\">Login</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"carousel\" id=\"slider-container\">\r\n");
      out.write("        <div class=\"carousel slide\" id=\"slider\" data-bs-ride=\"carousel\">\r\n");
      out.write("            <div class=\"carousel-indicators\">\r\n");
      out.write("                <button\r\n");
      out.write("                        type=\"button\"\r\n");
      out.write("                        class=\"active\"\r\n");
      out.write("                        data-bs-target=\"#slider\"\r\n");
      out.write("                        data-bs-slide-to=\"0\"\r\n");
      out.write("                        aria-current=\"true\"\r\n");
      out.write("                        aria-label=\"Slide 1\"\r\n");
      out.write("                ></button>\r\n");
      out.write("                <button\r\n");
      out.write("                        type=\"button\"\r\n");
      out.write("                        data-bs-target=\"#slider\"\r\n");
      out.write("                        data-bs-slide-to=\"1\"\r\n");
      out.write("                        aria-label=\"Slide 2\"\r\n");
      out.write("                ></button>\r\n");
      out.write("                <button\r\n");
      out.write("                        type=\"button\"\r\n");
      out.write("                        data-bs-target=\"#slider\"\r\n");
      out.write("                        data-bs-slide-to=\"2\"\r\n");
      out.write("                        aria-label=\"Slide 3\"\r\n");
      out.write("                ></button>\r\n");
      out.write("                <button\r\n");
      out.write("                        type=\"button\"\r\n");
      out.write("                        data-bs-target=\"#slider\"\r\n");
      out.write("                        data-bs-slide-to=\"3\"\r\n");
      out.write("                        aria-label=\"Slide 4\"\r\n");
      out.write("                ></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"carousel-inner\">\r\n");
      out.write("                <div class=\"carousel-item active\">\r\n");
      out.write("                    <img src=\"/Images/praia.png\" alt=\"Praia\" class=\"d-block w-100\">\r\n");
      out.write("                    <div class=\"carousel-caption\">\r\n");
      out.write("                        <h5>Rotas Disponíveis - Praias</h5>\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-dark\">Ver Rotas</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"carousel-item\">\r\n");
      out.write("                    <img src=\"/Images/trilha.png\" alt=\"Praia\" class=\"d-block w-100\">\r\n");
      out.write("                    <div class=\"carousel-caption\">\r\n");
      out.write("                        <h5>Rotas Disponíveis - Trilhas</h5>\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-dark\">Ver Rotas</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"carousel-item\">\r\n");
      out.write("                    <img src=\"/Images/cachoeira.png\" alt=\"Praia\" class=\"d-block w-100\">\r\n");
      out.write("                    <div class=\"carousel-caption\">\r\n");
      out.write("                        <h5>Rotas Disponíveis - Cachoeiras</h5>\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-dark\">Ver Rotas</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"carousel-item\">\r\n");
      out.write("                    <img src=\"/Images/hotel.png\" alt=\"Praia\" class=\"d-block w-100\">\r\n");
      out.write("                    <div class=\"carousel-caption\">\r\n");
      out.write("                        <h5>Rotas Disponíveis - Hotéis Incríveis</h5>\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-dark\">Ver Rotas</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <button\r\n");
      out.write("                    class=\"carousel-control-prev\"\r\n");
      out.write("                    type=\"button\"\r\n");
      out.write("                    data-bs-target=\"#slider\"\r\n");
      out.write("                    data-bs-slide=\"prev\"\r\n");
      out.write("                    >\r\n");
      out.write("                <i class=\"bi bi-chevron-compact-left\"></i>\r\n");
      out.write("                    <span class=\"visually-hidden\">Previous</span>\r\n");
      out.write("            </button>\r\n");
      out.write("\r\n");
      out.write("            <button\r\n");
      out.write("                    class=\"carousel-control-next\"\r\n");
      out.write("                    type=\"button\"\r\n");
      out.write("                    data-bs-target=\"#slider\"\r\n");
      out.write("                    data-bs-slide=\"next\"\r\n");
      out.write("            >\r\n");
      out.write("                <i class=\"bi bi-chevron-compact-right\"></i>\r\n");
      out.write("                <span class=\"visually-hidden\">Next</span>\r\n");
      out.write("            </button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-12 col-md-10 offset-md-1\" id=\"mini-banners\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-12 col-md-4\">\r\n");
      out.write("                    <div class=\"card text-center\">\r\n");
      out.write("                        <i class=\"bi bi-bullseye secondary-color\"></i>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <h5 class=\"card-title secondary-color\">Objetivo</h5>\r\n");
      out.write("                            <p class=\"card-text secondary-color\">Nascemos com o objetivo de fazer com que sua viajem seja incrível, simples, inesquecível e o principal, com segurança.</p>\r\n");
      out.write("                            <a href=\"#\" class=\"btn btn-dark\">Saber Mais</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-12 col-md-4\">\r\n");
      out.write("                    <div class=\"card text-center\">\r\n");
      out.write("                        <i class=\"bi bi-map secondary-color\"></i>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <h5 class=\"card-title secondary-color\">Rotas</h5>\r\n");
      out.write("                            <p class=\"card-text secondary-color\">Com o destino decidido, disponibilizaremos roteiros da sua viagem para que seja aproveitada ao máximo.</p>\r\n");
      out.write("                            <a href=\"#\" class=\"btn btn-dark\"> Ver Rotas</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-12 col-md-4\">\r\n");
      out.write("                    <div class=\"card text-center\">\r\n");
      out.write("                        <i class=\"bi bi-pin-angle-fill secondary-color\"></i>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <h5 class=\"card-title secondary-color\">Localização</h5>\r\n");
      out.write("                            <p class=\"card-text secondary-color\">Estamos localizados em diversos pontos turísticos, com o intuito de uma maior ampliação na hora da escolha do seu destino.</p>\r\n");
      out.write("                            <a href=\"#\" class=\"btn btn-dark\"> Ver Rotas</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container\" id=\"featured-container\">\r\n");
      out.write("        <div class=\"col-12\">\r\n");
      out.write("            <h2 class=\"title secondary-color\">Tipos de Rotas</h2>\r\n");
      out.write("            <p class=\"subtitle secondary-color\">Conheça os tipos de rotas que ofereçemos</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-12\" id=\"featured-images\">\r\n");
      out.write("            <div class=\"row g-4\">\r\n");
      out.write("                <div class=\"col-12 col-md-4\">\r\n");
      out.write("                    <img src=\"/Images/praiaWP.jpg\" alt=\"Projeto Praia\" class=\"img-fluid\">\r\n");
      out.write("                    <div class=\"banner-content\">\r\n");
      out.write("                        <p class=\"secondary-color\">Praias</p>\r\n");
      out.write("                        <h3>Veja as Rotas Disponíveis</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-12 col-md-4\">\r\n");
      out.write("                    <img src=\"/Images/trilhaWP.png\" alt=\"Projeto Trilha\" class=\"img-fluid\">\r\n");
      out.write("                    <div class=\"banner-content\">\r\n");
      out.write("                        <p class=\"secondary-color\">Trilhas</p>\r\n");
      out.write("                        <h3>Veja as Rotas Disponíveis</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-12 col-md-4\">\r\n");
      out.write("                    <img src=\"/Images/cachoeiraWP.jpg\" alt=\"Projeto Cachoeira\" class=\"img-fluid\">\r\n");
      out.write("                    <div class=\"banner-content\">\r\n");
      out.write("                        <p class=\"secondary-color\">Cachoeiras</p>\r\n");
      out.write("                        <h3>Veja as Rotas Disponíveis</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container\" id=\"info-container\">\r\n");
      out.write("        <div class=\"col-12\">\r\n");
      out.write("            <h2 class=\"title secondary-color\">Mais Detalhes Sobre Nós</h2>\r\n");
      out.write("            <p class=\"subtitle secondary-color\">Saiba mais sobre nosso objetivo de entrega ao cliente</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-12 container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-12 col-md-5\" id=\"info-banner\">\r\n");
      out.write("                <img src=\"/Images/mapa.jpg\" alt=\"Localização da Empresa\" class=\"image-fluid\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-12 col-md-7 bg-secondary-color\" id=\"info-content\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <h2 class=\"title secondary-color\">Nós Fazemos a Diferença!</h2>\r\n");
      out.write("                        <p class=\"subtitle secondary-color\">Estamos espalhados em pontos turísticos estratégicos ao redor do mundo para oferecer ao nosso cliente uma gama completa de lugares disponíveis para visitar, fazendo com que nosso serviço oferecido seja único e com grande abrangência.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-12\" id=\"info-numbers\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-4\">\r\n");
      out.write("                                <h3 class=\"secondary-color\">10</h3>\r\n");
      out.write("                                <p class=\"secondary-color\">Anos No Ramo Turístico</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-4\">\r\n");
      out.write("                                <h3 class=\"secondary-color\">57</h3>\r\n");
      out.write("                                <p class=\"secondary-color\">Países Disponíveis</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-4\">\r\n");
      out.write("                                <h3 class=\"secondary-color\">335</h3>\r\n");
      out.write("                                <p class=\"secondary-color\">Clientes Atendidos</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-dark\">Sobre</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <footer class=\"container-fluid bg-primary-color mt-auto\" id=\"footer\">\r\n");
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
      out.write("      document.getElementById(\"loginBtn\").addEventListener(\"click\", function() {\r\n");
      out.write("        window.location.href = \"/login\";\r\n");
      out.write("      });\r\n");
      out.write("      document.getElementById('arrow-up').addEventListener('click', function() {\r\n");
      out.write("        window.scrollTo({ top: 0, behavior: 'smooth' });\r\n");
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
