<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Trip Taker - Início</title>
    <link rel="shortcut icon" href="/Images/LogoTripTaker.ico" type="image/x-icon">

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans:wght@100;300;500&display=swap" rel="stylesheet">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.4/font/bootstrap-icons.css">
    <link rel="stylesheet" href="/Style/index.css">
    <link rel="stylesheet" href="/Style/createEditTrip.css">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</head>
<body>
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
                        <a href="#" class="nav-link active primary-color" aria-current="page"> Início </a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link primary-color">Rotas</a>
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

    <form action="/create-trip" method="post" enctype="multipart/form-data">
        <div class="titlePage">
            <h1>Criar/ Editar Rotas</h1>
        </div>
        <div class="formularioCER">
            <div>
                <input type="hidden" id="id" name="id" value="${param.id}">
                <label>Local</label>
                <input type="text" name="local" id="local" value="${param.local}">

                <label>Quantidade de Pessoas</label>
                <input type="number" name="qtdPessoa" id="qtdPessoa" value="${param.qtdPessoa}">

                <label>Guia Responsável</label>
                <input type="text" name="guiaResponsavel" id="guiaResponsavel" value="${param.guiaResponsavel}">

                <label>Valor Unitário</label>
                <input type="number" inputmode="numeric" name="vlrUnitario" id="vlrUnitario" value="${param.valorUnitario}">

                <label>Data Início</label>
                <input type="date" name="dtInicio" id="dtInicio" required placeholder="DD/MM/AAAA"  mask="99/99/9999" value="${param.dataInicio}">

                <label>Data Final</label>
                <input type="date" name="dtFinal" id="dtFinal" required placeholder="DD/MM/AAAA"  mask="99/99/9999" value="${param.dataFinal}">

                <label>Descrição</label>
                <textarea class="descricao" type="text" name="descricao" id="descricao">${param.descricao}</textarea>

                <label for="file"> Choose file</label>
                <input type="file" name="file" id="file" value="${param.file}">>

                <div class="buttons">
                    <button type="submit" class="laranja">Salvar</button>
                    <button class="azul">Cancelar</button>
                </div>
            </div>
        </div>
    </form>

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
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <script>
      $(function() {
        $('#loginBtn').click(function() {
          $('#loginModal').modal('show');
        });
      });
    </script>
</body>
</html>