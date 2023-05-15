<%--
  Created by IntelliJ IDEA.
  User: william
  Date: 15/05/2023
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html lang="en">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Descrição da Viagem</title>
    <!-- Google fonts - NotoSans - Light | Medium | Thin -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans:wght@100;300;500&display=swap" rel="stylesheet">
    <!-- CSS Bootstrap e JS Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <!-- Bootstrap icons -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.4/font/bootstrap-icons.css">
    <!-- CSS do projeto -->
    <link rel="stylesheet" href="/Style/descricaoViagem.css">
</head>
<body>
<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg fixed-top bg-primary-color" id="navbar">
    <div class="container py-3 nav flex-column">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbar-items" aria-controls="navbar-items" aria-expanded="false" aria-label="Toggle navigation">
            <i class="bi bi-list"></i>
        </button>
        <div class="collapse navbar-collapse" id="navbar-items">
            <a href="#" class="navbar-brand secondary-color">
                <img src="/Images/logo2.png" alt="Logo Trip Taker">
            </a>
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a href="#" class="nav-link active secondary-color" aria-current="page">Inicio</a>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link secondary-color">Rotas</a>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link secondary-color">Sobre</a>
                </li>
                <li class="nav-item">
                    <button href="#" class="nav-link primary-color">Login</button>
                </li>
            </ul>
        </div>
        <div class="navbar-text-title">
            <h2>Praia do Gunga - AL</h2>
        </div>
    </div>
</nav>
<!--Fotos-->
<div class="col-12 col-md-10 offset-md-1" id="mini-banners">
    <div class="row">
        <div class="col-12 col-md-4">
            <div class="card text-center">
                <div class="card-body">
                    <img src="/Images/praiadogunga.png" alt="praiadogunga" class="card-img">
                </div>
            </div>
        </div>
        <div class="col-12 col-md-4">
            <div class="card text-center">
                <div class="card-body">
                    <img src="/Images/praiadogunga1.png" alt="praiadogunga" class="card-img">
                </div>
            </div>
        </div>
        <div class="col-12 col-md-4">
            <div class="card text-center">
                <div class="card-body">
                    <img src="/Images/praiadogunga2.png" alt="praiadogunga" class="card-img">
                </div>
            </div>
        </div>
    </div>
</div>

<!--Descrição da viagem-->
<div class="describe-text">
    <h5>Descrição:</h5>
    <p>A Praia do Gunga está localizada a 20 milhas ao sul de Maceió, Alagoas.
        É considerada uma das praias mais bonitas do Brasil. A praia é cercada por coqueiros e fica bem entre o Oceano Atlântico e a Lagoa do Roteiro.
        Esta posição garante uma cor única do oceano ao redor da praia.</p>
</div>

<!--Tabela de preços -->
<div class="container" id="table-price">
    <div class="row align-items-start">
        <div class="col card text-card card-only-text">
            01/03/2023
        </div>
        <div class="col card text-card card-only-text">
            03 dias
        </div>
        <div class="col card text-card card-only-text">
            15 pessoas
        </div>
        <div class="col card text-card">
            <button href="#" class="nav-link bg-third-color secondary-color">Reservar</button>
        </div>
    </div>
    <div class="row align-items-start">
        <div class="col card text-card-2 card-only-text">
            03/03/2023
        </div>
        <div class="col card text-card-2 card-only-text">
            03 dias
        </div>
        <div class="col card text-card-2 card-only-text">
            15 pessoas
        </div>
        <div class="col card text-card-2">
            <button href="#" class="nav-link bg-third-color secondary-color">Reservar</button>
        </div>
    </div>
    <div class="row align-items-start">
        <div class="col card text-card-2 card-only-text">
            15/03/2023
        </div>
        <div class="col card text-card-2 card-only-text">
            03 dias
        </div>
        <div class="col card text-card-2 card-only-text">
            15 pessoas
        </div>
        <div class="col card text-card-2">
            <button href="#" class="nav-link bg-third-color secondary-color">Reservar</button>
        </div>
    </div>
    <div class="row align-items-start">
        <div class="col card text-card-2 card-only-text">
            15/04/2023
        </div>
        <div class="col card text-card-2 card-only-text">
            03 dias
        </div>
        <div class="col card text-card-2 card-only-text">
            15 pessoas
        </div>
        <div class="col card text-card-2">
            <button href="#" class="nav-link bg-third-color secondary-color">Reservar</button>
        </div>
    </div>
</div>

<!--Informações do guia-->

<div class="container" id="guia-information">
    <div class="row align-items-start">
        <div class="col">
            <img src="/Images/guia.png" alt="guia">
        </div>
        <div class="col">
        </div>
        <div class="col">
        </div>
        <div class="col bg-primary-color secondary-color price-guia">
            R$500,00
        </div>
    </div>
</div>

<footer class="container-fluid bg-primary-color secondary-color" id="footer">
    <div class="container">
        <div class="row">
            <!--Footer Top-->
            <div class="col-12" id="footer-top">
                <div class="row">
                    <div class="col-4" id="social-icons2">
                        <img src="/Images/logo2.png" alt="logo2">
                        <br>
                        <i class="bi bi-whatsapp"></i>
                        <h5>(11)93552-8200</h5>
                    </div>
                    <div class="col-4" id="social-icons">
                        <h5>Fique Por Dentro Dos Nossos Conteúdos</h5>
                        <i class="bi bi-facebook"></i>
                        <i class="bi bi-instagram"></i>
                        <i class="bi bi-youtube"></i>
                        <i class="bi bi-twitter"></i>
                    </div>
                    <div class="col-4" id="img-arrow-icons">
                        <img src="/Images/Arrow.png" alt="Arrow">
                    </div>
                </div>
            </div>

            <!--Footer Details-->
            <div class="col-12" id="footer-details"></div>
            <!-- Footer Bottom-->
            <div class="col-12" id="footer-bottom"></div>
        </div>
    </div>
</footer>
</body>
</html>
