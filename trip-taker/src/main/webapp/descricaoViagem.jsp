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
                    <a href="/index.jsp" class="nav-link primary-color" aria-current="page">Inicio</a>
                </li>
                <li class="nav-item">
                    <a href="/find-all-trips" class="nav-link primary-color">Rotas</a>

                </li>
                <li class="nav-item">
                    <a href="/Sobre.jsp" class="nav-link primary-color">Sobre</a>
                </li>
            </ul>
            <div>
                <button href="#" class="buttonLogin  btn-primary" id="loginBtn">Login</button>
            </div>
        </div>
    </div>
</nav>

<!--Fotos & Descrição da viagem-->

<div class="container text-center img-describe">
    <div class="row">
        <div>
            <h2 type="text" name="local" id="local" class="mt-3"><h2/>
        </div>
        <div class="col-lg-12 ">
            <img src="${pageContext.request.contextPath} ${param.image}" class="mx-auto d-block img-fluid" alt="Imagem">
            <p class="mt-3" name="descricao" id="descricao"> </p>
        </div>
    </div>
</div>

<!--Tabela de preços -->
<div class="container" id="table-price">
    <div class="row align-items-start">
        <div class="col-md-3 col-sm-6 card text-card-2 card-only-text bg-secondary-color">
            Guia responsável
        </div>
        <div class="col-md-3 col-sm-6 card text-card-2 card-only-text ">
            <label type="text" name="guiaResponsavel" id="guiaResponsavel"></label>
        </div>
        <div class="col-md-3 col-sm-6 card text-card-2 card-only-text bg-secondary-color">
            Quantidade de pesssoas
        </div>
        <div class="col-md-3 col-sm-6 card text-card-2 card-only-text ">
            <label type="number" name="qtdPessoa" id="qtdPessoa">${param.qtdPessoa}</label>
        </div>
        <div class="col-md-3 col-sm-6 card text-card-2 card-only-text bg-secondary-color">
            Data Início
        </div>
        <div class="col-md-3 col-sm-6 card text-card-2 card-only-text ">
            <label type="date" name="dtInicio" id="dtInicio" required placeholder="DD/MM/AAAA"  mask="99/99/9999">${param.dataInicio}</label>
        </div>
        <div class="col-md-3 col-sm-6 card text-card-2 card-only-text bg-secondary-color">
            Data Final
        </div>
        <div class="col-md-3 col-sm-6 card text-card-2 card-only-text ">
            <label type="date" name="dtFinal" id="dtFinal" required placeholder="DD/MM/AAAA"  mask="99/99/9999">${param.dataFinal}</label>
        </div>
    </div>
    <div class="row align-items-start valor-reserva">

        <div class="col-md-2 col-sm-2 col-0 card text-card-2 card-only-text border-transp">

        </div>
        <div class="col-md-2 col-sm-2 col-10 card text-card-2 card-only-text border-transp bg-primary-color-dv secondary-color-dv valor-viagem">
                <label type="number" inputmode="numeric" name="vlrUnitario" id="vlrUnitario"> R$ ${param.valorUnitario} </label>
        </div>
        <div class="col-md-2 col-sm-2 col-0 card text-card-2 card-only-text border-transp">

        </div>
        <div class="col-md-4 col-sm-2 col-0 card text-card-2 card-only-text border-transp">
            <button id="reservarBtn" href="#" class="nav-link bg-third-color-dv secondary-color-dv">Reservar</button>
        </div>
        <!-- Modal -->
        <div class="modal fade" id="reservarModal" tabindex="-1" role="dialog" aria-labelledby="reservarModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header bg-primary-color">
                        <div href="#" class="navbar-brand primary-color">
                            <img src="/Images/logo.png" alt=""/>
                        </div>
                        <!-- <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button> -->
                    </div>
                    <div class="modal-body">
                        <p>Entre em contato através do número (11)5555-6666</p>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary bg-third-color-dv secondary-color-dv" id="fecharBtn">Fechar</button>
                    </div>
                </div>
            </div>
        </div>

    </div>
</div>


<!-- Footer -->

<footer class="container-fluid bg-primary-color mt-auto" id="footer">
    <div class="container">
        <div class="row">
            <div class="col-12" id="footer-top">
                <div class="row justify-content-between">
                    <div class="col-md-4 col-sm-6">
                        <img src="/Images/logo.png" alt="Logo" class="logoIMG">
                    </div>
                    <div class="col-md-4 col-sm-6" id="social-icons">
                        <i class="bi bi-facebook"></i>
                        <i class="bi bi-instagram"></i>
                        <i class="bi bi-youtube"></i>
                        <i class="bi bi-twitter"></i>
                    </div>
                    <div class="col-md-4 col-sm-12 col-12" id="arrow-up">
                        <i class="bi bi-arrow-up-circle"></i>
                    </div>
                </div>
            </div>
        </div>
    </div>
</footer>
    <script src="Script/script.js"></script>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <script>
      document.getElementById('arrow-up').addEventListener('click', function() {
      window.scrollTo({ top: 0, behavior: 'smooth' });
      });
    </script>
    <!-- Pop up Script -->
    <script>
        $(document).ready(function() {
            $('#reservarBtn').click(function() {
                $('#reservarModal').modal('show');
            });
            $('#fecharBtn').click(function() {
                $('#reservarModal').modal('hide');
            });
        });
    </script>

    <script>
        document.getElementById("loginBtn").addEventListener("click", function() {
            window.location.href = "/login";
        });
        document.getElementById('arrow-up').addEventListener('click', function() {
            window.scrollTo({ top: 0, behavior: 'smooth' });
        });
    </script>
</body>
</html>
