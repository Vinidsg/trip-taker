<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
     <%@ page contentType="text/html; charset=UTF-8" %>
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Trip Taker - Início</title>
    <link rel="shortcut icon" href="Images/LogoTripTaker.ico" type="image/x-icon">

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans:wght@100;300;500&display=swap" rel="stylesheet">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.4/font/bootstrap-icons.css">
    <link rel="stylesheet" href="Style/create.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</head>
<body>
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
                        <a href="index.jsp" class="nav-link primary-color" aria-current="page"> Início </a>
                    </li>
                    <li class="nav-item">
                        <a href="find-all-trips" class="nav-link primary-color">Rotas</a>
                    </li>
                    <li class="nav-item">
                        <a href="Sobre.jsp" class="nav-link primary-color">Sobre</a>
                    </li>
                </ul>
                <div>
                    <button class="buttonLogin  btn-primary" id="loginBtn">Sair</button>
                </div>
            </div>
        </div>
    </nav>
    <div class="container tituloPg">
      <div class="row justify-content-center">
        <div class="col-lg-6 col-md-8 col-sm-10">
          <h2 class="text-center">Cadastro de Viagem/Rota</h2>
        </div>
      </div>
    </div>

    <form action="create-trip" method="post" enctype="multipart/form-data">
      <div class="container">
        <div class="row justify-content-center">
          <div class="col-lg-6 col-md-8 col-sm-10 formulario">
            <input type="hidden" id="id" name="id" value="${param.id}">
            <div class="mb-3">
              <label for="local" class="form-label">Local</label>
              <input type="text" name="local" id="local" class="form-control" value="${param.local}" required>
            </div>
            <div class="mb-3">
              <label for="qtdPessoa" class="form-label">Quantidade de Pessoas</label>
              <input type="number" name="qtdPessoa" id="qtdPessoa" class="form-control" value="${param.qtdPessoa}" required>
            </div>
            <div class="mb-3">
              <label for="guiaResponsavel" class="form-label">Guia Responsável</label>
              <input type="text" name="guiaResponsavel" id="guiaResponsavel" class="form-control" value="${param.guiaResponsavel}" required>
            </div>
            <div class="mb-3">
              <label for="vlrUnitario" class="form-label">Valor Unitário</label>
              <input type="number" inputmode="numeric" name="vlrUnitario" id="vlrUnitario" class="form-control" value="${param.valorUnitario}" required>
            </div>
            <div class="mb-3">
              <label for="dtInicio" class="form-label">Data Início</label>
              <input type="date" name="dtInicio" id="dtInicio" class="form-control" placeholder="DD/MM/AAAA" mask="99/99/9999" value="${param.dataInicio}" required>
            </div>
            <div class="mb-3">
              <label for="dtFinal" class="form-label">Data Final</label>
              <input type="date" name="dtFinal" id="dtFinal" class="form-control" required placeholder="DD/MM/AAAA" mask="99/99/9999" value="${param.dataFinal}" required>
            </div>
            <div class="mb-3">
              <label for="descricao" class="form-label">Descrição</label>
              <textarea required class="form-control descricao" name="descricao" id="descricao" required>  ${param.descricao} </textarea>
            </div>

              <div class="image">
                  <img class="img-fluid" src="${param.image}" alt="Imagem">
              </div>

            <div class="mb-3 upload-image">
              <label for="file" class="form-label">Upload de Imagem</label>
              <div class="input-group">
                <input type="file" class="form-control" name="file" id="file">
                <span class="input-group-text"><i class="bi bi-upload"></i></span>
              </div>
            </div>
            <div class="mb-3 text-center">
              <button type="submit" class="btn btn-primary btnSalvar">Salvar</button>
              <button class="btn btn-secondary btnCancelar">Cancelar</button>
            </div>
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
      document.addEventListener('DOMContentLoaded', function() {
        document.querySelector('button[type="submit"]').addEventListener('click', function() {
          var inputs = document.querySelectorAll('form input[required], form textarea[required]');

          for (var i = 0; i < inputs.length; i++) {
            if (inputs[i].value.trim() === '') {
              inputs[i].classList.add('is-invalid');
            } else {
              inputs[i].classList.remove('is-invalid');
            }
          }
        });
      });
      document.getElementById("loginBtn").addEventListener("click", function() {
              window.location.href = "logout";
            });
      document.getElementById('arrow-up').addEventListener('click', function() {
      window.scrollTo({ top: 0, behavior: 'smooth' });
      });
    </script>

</body>
</html>