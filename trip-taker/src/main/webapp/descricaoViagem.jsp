<%--
  Created by IntelliJ IDEA.
  User: william
  Date: 15/05/2023
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <%@ page contentType="text/html; charset=UTF-8" %>
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
    <link rel="stylesheet" href="/Style/index.css">
</head>
<body>
<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg fixed-top bg-primary-color" id="navbar">
    <div class="container py-3">
        <a href="#" class="navbar-brand primary-color">
            <img src="/Images/logo.png" alt=""/>
        </a>
        <button
                class="navbar-toggler hamburguer"
                type="button"
                data-bs-toggle="collapse"
                data-bs-target="#navbar-items"
                aria-controls="navbar-items"
                aria-expanded="false"
                aria-label="Toggle navigation">
            <i class="bi bi-list "></i>
        </button>
        <div class="collapse navbar-collapse" id="navbar-items">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a href="#" class="nav-link primary-color" aria-current="page"> Início </a>
                </li>
                <li class="nav-item">
                    <a href="/find-all-trips" class="nav-link primary-color">Rotas</a>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link primary-color">Sobre</a>
                </li>
            </ul>
            <div>
                <button class="buttonLogin  btn-primary" id="loginBtn">Login</button>
            </div>
        </div>
    </div>
</nav>

<div class="image">
    <img class="img-fluid" src="${pageContext.request.contextPath} ${param.image}" alt="Imagem">
</div>


<!--Fotos & Descrição da viagem-->
<div class="imageBanner-dv card">



    </div>
    <div class="card-body describe-text">
        <h5>Descrição:</h5>
        <p class="card-text">A Praia do Gunga está localizada a 20 milhas ao sul de Maceió, Alagoas.
            É considerada uma das praias mais bonitas do Brasil. A praia é cercada por coqueiros e fica bem entre o Oceano Atlântico e a Lagoa do Roteiro.
            Esta posição garante uma cor única do oceano ao redor da praia.</p>
    </div>


</div>

<!--Tabela de preços -->
<div class="container" id="table-price">
    <div class="row align-items-start">
        <div class="col card text-card-2 card-only-text">
            Data Início
        </div>
        <div class="col card text-card-2 card-only-text">
            Data Final
        </div>
        <div class="col card text-card-2 card-only-text">
            Quantidade de pesssoas
        </div>
    </div>
    <div class="row align-items-start">
        <div class="col card text-card card-only-text">
            <label type="date" name="dtInicio" id="dtInicio" required placeholder="DD/MM/AAAA"  mask="99/99/9999">${param.dataInicio}</label>
        </div>
        <div class="col card text-card card-only-text">
            <label type="date" name="dtFinal" id="dtFinal" required placeholder="DD/MM/AAAA"  mask="99/99/9999">${param.dataFinal}</label>
        </div>
        <div class="col card text-card card-only-text">
            <label>Quantidade de Pessoas</label>
            <label type="number" name="qtdPessoa" id="qtdPessoa">${param.qtdPessoa}</label>

        </div>
    </div>

    <div class="row align-items-start guia-information">
        <div class="col card text-card-2 card-only-text">
            <div class="col">
                <label>Guia Responsável</label>
                <label type="text" name="guiaResponsavel" id="guiaResponsavel">${param.guiaResponsavel}</label>
        </div>
        </div>
        <div class="col card text-card-2 card-only-text">
            <div class="col bg-primary-color-div secondary-color-dv price-guia">
                <label>Valor Unitário</label>
                <label type="number" inputmode="numeric" name="vlrUnitario" id="vlrUnitario"> ${param.valorUnitario} </label>
            </div>
        </div>
        <div class="col card text-card-2 card-only-text">
                <button href="#" class="nav-link bg-third-color-dv secondary-color-dv">Reservar</button>
            </div>
        </div>
    </div>

</div>

<!-- Footer -->

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
