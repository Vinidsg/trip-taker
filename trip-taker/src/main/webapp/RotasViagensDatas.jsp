<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Trip Taker - Rotas, Viagens e Datas</title>
    <link rel="shortcut icon" href="/Images/LogoTripTaker.ico" type="image/x-icon">

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans:wght@100;300;500&display=swap" rel="stylesheet">


    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.4/font/bootstrap-icons.css">
    <link rel="stylesheet" href="/Style/index.css">
    <link rel="stylesheet" href="/Style/RotasViagensDatas.css">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</head>

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
                        <a href="/index.jsp" class="nav-link primary-color"  > Inicio </a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link active primary-color" aria-current="page">Rotas</a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link primary-color">Sobre</a>
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

<c:forEach var="trip" items="${trips}">
<div class="sessao-02">
    <div class="foto_praia_gunga">
    <img alt="foto_praia_gunga" src="/Images/praia-gunga.jpeg">
    </div>

    <div class="titulo_foto_praia_do_gunga">
        <h2>Praia do Gunga - AL</h2>
    </div>

    <style>
     border: 1px solid black;
     border-collapse: collapse;
     th, td
     {
        padding-top: 10px;
        padding-bottom: 20px;
        padding-left: 30px;
        padding-right: 40px;
     }
    </style>

    <div class="btnAndTable">
    <table class="tabela">
                <tr class="tabela-coluna">

                    <th class="local">Local</th>
                    <th class="qtdPessoa">Capacidade</th>
                    <th class="guia">Guia</th>
                    <th class="valorUnitario">Valor</th>
                    <th class="dataIda">Ida</th>
                    <th class="dataVolta">Volta</th>
                    <th class="descricao">Descricao</th>



                </tr>

                        <tr class="tabela-coluna-js">

                                <td>${trip.local}</td>
                                <td>${trip.qtdPessoas}</td>
                                <td>${trip.guiaResponsavel}</td>
                                <td>${trip.valorUnitario}</td>
                                <td>${trip.dataInicio}</td>
                                <td>${trip.dataFinal}</td>
                                <td>${trip.descricao}</td>

                        </tr>



        </table>

       <div class="container-buttons">
                <div class="btnLogin">
                    <button class="buttonLogin2">Agendar</button>
                </div>

            <div class="container-btnDelete">
                <form action="/delete-trip" method="post">
                <input type="hidden" id="id" name="id" value="${trip.id}">
                <button type="submit" class="btnDelete">Deletar</button>
                </form>
            </div>

       </div>
        </div>

        </div>
    </div>
</c:forEach>


  <footer class="container-fluid bg-primary-color" id="footer">
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
</body>
</html>