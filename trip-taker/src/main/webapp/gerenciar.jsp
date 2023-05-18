<%--
  Created by IntelliJ IDEA.
  User: vinicius
  Date: 03/05/2023
  Time: 13:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Trip Taker - Gerenciar Rota</title>
        <link rel="shortcut icon" href="/Images/LogoTripTaker.ico" type="image/x-icon">

        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Noto+Sans:wght@100;300;500&display=swap" rel="stylesheet">

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.4/font/bootstrap-icons.css">
        <link rel="stylesheet" href="/Style/gerenciar.css">

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    </head>
<body class="d-flex flex-column min-vb-100">
    <nav class="navbar navbar-expand-lg fixed-top bg-primary-color" id="navbar">
        <div class="container py-3">
            <a href="#" class="navbar-brand primary-color">
                <img src="/Images/logo.png" alt=""/>
            </a>
            <button
                    class="navbar-toggler"
                    type="button"
                    data-bs-toggle="collapse"
                    data-bs-target="#navbar-items"
                    aria-controls="navbar-items"
                    aria-expanded="false"
                    aria-label="Toggle navigation">
                <i class="bi bi-list"></i>
            </button>
            <div class="collapse navbar-collapse" id="navbar-items">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a href="/index.jsp" class="nav-link primary-color" aria-current="page"> Início </a>
                    </li>
                    <li class="nav-item">
                        <a href="/find-all-trips" class="nav-link primary-color">Rotas</a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link primary-color">Sobre</a>
                    </li>
                </ul>
                <div>
                    <button class="buttonLogin  btn-primary" id="loginBtn">Sair</button>
                </div>
            </div>
        </div>
    </nav>
    <div class="container">
<div class="containerBTN">
  <a href="createEditTrip.jsp" class="btn btn-secondary btnCriar">
       <i class="bi bi-plus"></i>
  </a>
</div>


        <div class="row imagem">
            <c:forEach var="trip" items="${trips}">
                <div class="col-md-4">
                    <div class="card mb-3">
                        <a href="/createEditTrip.jsp?id=${trip.id}&local=${trip.local}&guiaResponsavel=${trip.guiaResponsavel}&qtdPessoa=${trip.qtdPessoas}&valorUnitario=${trip.valorUnitario}&dataInicio=${trip.dataInicio}&dataFinal=${trip.dataFinal}&descricao=${trip.descricao}&image=${trip.image}">
                            <img class="card-img-top" src="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${trip.image}" alt="Imagem da Viagem">
                        </a>
                        <div class="card-body">
                            <form action="/delete-trip" method="post">
                                <input type="hidden" id="id" name="id" value="${trip.id}">
                                <button class="btn btn-danger" type="submit">Deletar</button>
                            </form>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>

    <footer class="container-fluid bg-primary-color mt-auto" id="footer">
        <div class="container">
            <div class="row">
                <div class="col-12" id="footer-top">
                    <div class="row justify-content-between">
                        <div class="col-4">
                            <img src="/Images/logo.png" alt="Logo" class="logoIMG">
                        </div>
                        <div class="col-4" id="social-icons">
                            <i class="bi bi-facebook"></i>
                            <i class="bi bi-instagram"></i>
                            <i class="bi bi-youtube"></i>
                            <i class="bi bi-twitter"></i>
                        </div>
                        <div class="col-4" id="arrow-up">
                            <i class="bi bi-arrow-up-circle"></i>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <script>
      document.getElementById("loginBtn").addEventListener("click", function() {
        window.location.href = "/logout";
      });
    </script>
</body>
</html>
