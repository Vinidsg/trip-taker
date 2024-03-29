/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-29 12:10:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Sobre_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    \n");
      out.write("        <meta name=\"viewport\"\n");
      out.write("            content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Trip Taker - Sobre</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"/Images/LogoTripTaker.ico\" type=\"image/x-icon\">\n");
      out.write("\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans:wght@100;300;500&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("            integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.4/font/bootstrap-icons.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"/Style/sobre.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("            integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\"\n");
      out.write("            crossorigin=\"anonymous\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg fixed-top bg-primary-color\" id=\"navbar\">\n");
      out.write("        <div class=\"container py-3\">\n");
      out.write("            <a href=\"#\" class=\"navbar-brand primary-color\">\n");
      out.write("                <img src=\"/Images/logo.png\" alt=\"\" />\n");
      out.write("            </a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbar-items\"\n");
      out.write("                aria-controls=\"navbar-items\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <i class=\"bi bi-list\"></i>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbar-items\">\n");
      out.write("                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"/index.jsp\" class=\"nav-link primary-color\"> Início </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"/find-all-trips\" class=\"nav-link primary-color\" aria-current=\"page\">Rotas</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"/Sobre.jsp\" class=\"nav-link active primary-color\">Sobre</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <div>\n");
      out.write("                    <button href=\"\" class=\"buttonLogin  btn-primary\" id=\"loginBtn\">Login</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <section class=\"about section-padding-1 Historia\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-lg-12\">\n");
      out.write("                <div class=\"about-text text-black\">\n");
      out.write("                  <h1 class=\"text-start\">História</h1>\n");
      out.write("                  <p>A Trip Taker foi fundada com o objetivo de tornar as viagens uma experiência verdadeiramente memorável e enriquecedora para todos. Desde nossa criação, em 2010, temos nos empenhado em conectar viajantes com guias locais apaixonados e experientes em destinos ao redor do mundo. Com uma combinação de conhecimento local, expertise em viagens e um toque de autenticidade, estamos comprometidos em oferecer aventuras inesquecíveis e imersivas.</p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section class=\"about section-padding-2\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-lg-12\">\n");
      out.write("                <div class=\"about-text\">\n");
      out.write("                  <h1 class=\"text-start\">Missão</h1>\n");
      out.write("                  <p>Nossa missão é proporcionar aos viajantes uma maneira única de explorar os destinos, mergulhar em diferentes culturas e criar laços autênticos com as comunidades locais. Acreditamos que as melhores experiências de viagem são aquelas em que você se conecta verdadeiramente com o local que está visitando. Assim, trabalhamos arduamente para oferecer itinerários personalizados, oportunidades de interação com os moradores e a descoberta de lugares fora do comum, tudo isso com a orientação de guias especializados.</p>\n");
      out.write("                 </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section class=\"about section-padding-3\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col\">\n");
      out.write("                <div class=\"about-text text-black\">\n");
      out.write("                  <h1 class=\"text-start\">Torne-se Um Guia</h1>\n");
      out.write("                  <p>Você é um entusiasta das viagens e possui um amor profundo pelo seu destino local? Junte-se a nós como um guia da Trip Taker! Se você é apaixonado por compartilhar histórias fascinantes, mostrar os segredos escondidos de sua cidade e ajudar os visitantes a vivenciarem experiências autênticas, estamos à procura de você. Como guia da Trip Taker, você terá a oportunidade de fazer parte de uma comunidade global, conhecer pessoas interessantes e, o mais importante, influenciar positivamente as experiências de viagem dos nossos clientes. Entre em contato conosco para saber mais sobre como se tornar um guia da Trip Taker.</p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section class=\"about section-padding-3\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col\">\n");
      out.write("                <div class=\"about-text text-black\">\n");
      out.write("                  <h1 class=\"text-start\">Contate-nos</h1>\n");
      out.write("                  <p>Estamos aqui para ajudar e responder a todas as suas perguntas. Se você tiver dúvidas sobre nossos pacotes de viagem, desejar informações adicionais sobre um destino específico ou quiser entrar em contato com nossa equipe de suporte, fique à vontade para nos contatar. Nossa equipe está disponível para fornecer assistência personalizada e orientação, garantindo que sua experiência de viagem seja tranquila e gratificante. Você pode nos encontrar por meio do telefone, e-mail ou preenchendo o formulário de contato em nosso site. Estamos ansiosos para ouvir você!</p>\n");
      out.write("                  <p>Bem-vindo à família da Trip Taker, onde cada viagem é uma jornada única e memorável. Permita-nos guiá-lo em uma aventura extraordinária e descubra o mundo através de uma nova perspectiva.</p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("    <footer class=\"container-fluid bg-primary-color mt-auto\" id=\"footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12\" id=\"footer-top\">\n");
      out.write("                        <div class=\"row justify-content-between\">\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <img src=\"/Images/logo.png\" alt=\"Logo\" class=\"logoIMG\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-4\" id=\"social-icons\">\n");
      out.write("                                <i class=\"bi bi-facebook\"></i>\n");
      out.write("                                <i class=\"bi bi-instagram\"></i>\n");
      out.write("                                <i class=\"bi bi-youtube\"></i>\n");
      out.write("                                <i class=\"bi bi-twitter\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-4\" id=\"arrow-up\">\n");
      out.write("                                <i class=\"bi bi-arrow-up-circle\"></i>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("            <script>\n");
      out.write("              document.getElementById(\"loginBtn\").addEventListener(\"click\", function() {\n");
      out.write("                window.location.href = \"/login\";\n");
      out.write("              });\n");
      out.write("              document.getElementById('arrow-up').addEventListener('click', function() {\n");
      out.write("                window.scrollTo({ top: 0, behavior: 'smooth' });\n");
      out.write("              });\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
