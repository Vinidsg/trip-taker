<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
    <meta charset="UTF-8">
     <%@ page contentType="text/html; charset=UTF-8" %>
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Trip Taker - Rotas, Viagens e Datas</title>
    <link rel="shortcut icon" href="Images/LogoTripTaker.ico" type="image/x-icon">

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans:wght@100;300;500&display=swap" rel="stylesheet">


    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.4/font/bootstrap-icons.css">
    <link rel="stylesheet" href="Style/index.css">
    <link rel="stylesheet" href="Style/RotasViagensDatas.css">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</head>

    <nav class="navbar navbar-expand-lg fixed-top bg-primary-color" id="navbar">
        <div class="container py-3">
            <a href="#" class="navbar-brand primary-color">
                <img src="Images/logo.png" alt=""/>
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
                        <a href="index.jsp" class="nav-link primary-color"  > Início </a>
                    </li>
                    <li class="nav-item">
                        <a href="find-all-trips" class="nav-link active primary-color" aria-current="page">Rotas</a>
                    </li>
                    <li class="nav-item">
                        <a href="Sobre.jsp" class="nav-link primary-color">Sobre</a>
                    </li>
                </ul>
                    <div>
                    <button href="#" class="buttonLogin  btn-primary" id="loginBtn">Login</button>
                </div>
            </div>
        </div>
    </nav>

<body>
    <link rel="stylesheet" type="text/css" href="RotasViagensDatas.css" media="screen" />


    <div class="titlePage">
        <h1>Rotas, Viagens e Datas</h1>
    </div>
<div class="container-principal">
<c:forEach var="trip" items="${trips}">

    <div class="col-12 container">
            <div class="row">

                            <div class="col-12 col-md-5 hover-zoomin" id="info-banner">
                                   <img class=" img-thumbnail" width="500" height="450" src="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${trip.image}" alt="...">
                                </a>
                            </div>

                <div class="col-12 col-md-7 bg-secondary-color" id="info-content">
                    <div class="row">
                        <div class="col-12">
                            <div class="font-descricao">
                                <h2 class="title secondary-color">${trip.local}</h2>
                                <p class="subtitle secondary-color">${trip.descricao}</p>
                            </div>
                        </div>
                        <div class="col-12" id="info-numbers">
                            <div class="row">
                                <div class="col-4">
                                    <h4 class="secondary-color"><b>Data início</b></h4>
                                    <p class="secondary-color">${trip.dataInicio}</p>
                                </div>
                                <div class="col-4">
                                    <h4 class="secondary-color"><b>Data final</b></h4>
                                    <p class="secondary-color">${trip.dataFinal}</p>
                                </div>
                                <div class="col-4">
                                    <h4 class="secondary-color"><b>Quantidade</b></h4>
                                    <p class="secondary-color">${trip.qtdPessoas}</p>
                                </div>
                                 <div class="col-4">
                                   <h4 class="secondary-color"><b>Valor</b></h4>
                                   <p class="secondary-color">${trip.valorUnitario}</p>
                                 </div>
                                 <div class="col-4">
                                    <h4  class="secondary-color"><b>Guia</b></h4>
                                     <p  class="secondary-color">${trip.guiaResponsavel}</p>
                                 </div>


                            </div>
                        </div>
                        <div class="col-12">
                            <a href="#" class="btn btn-dark"><b>Detalhes</b></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>



</c:forEach>
</div>


  <footer class="container-fluid bg-primary-color" id="footer">
        <div class="container">
            <div class="row">
                <div class="col-12" id="footer-top">
                    <div class="row justify-content-between">
                        <div class="col-4">
                            <img src="Images/logo.png" alt="Logo" class="logoIMG">
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
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <script>
          document.getElementById("loginBtn").addEventListener("click", function() {
            window.location.href = "login";
          });
        document.getElementById('arrow-up').addEventListener('click', function() {
          window.scrollTo({ top: 0, behavior: 'smooth' });
        });
        </script>
</body>
</html>