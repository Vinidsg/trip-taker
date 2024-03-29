<!DOCTYPE html>
<html lang="pt-br">

<head>
<meta charset="UTF-8">
    <%@ page contentType="text/html; charset=UTF-8" %>

    <title>LogIn</title>
    <link rel="shortcut icon" href="/Images/LogoTripTaker.ico" type="image/x-icon">

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans:wght@100;300;500&display=swap" rel="stylesheet">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.4/font/bootstrap-icons.css">
    <link rel="stylesheet" href="/Style/telaLogin.css">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</head>

<body>
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
                          <a href="/index.jsp" class="nav-link primary-color" aria-current="page"> Início </a>
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
      <div class="container loginBox">
        <form action="/login" method="post">
            <span>${requestScope.message}</span>
            <span class="error-message">${requestScope.errorMessage}</span>


          <div class="mb-3">
            <label for="username" class="form-label">Usuário</label>
            <input type="text" class="form-control" id="username" name="username" required>
          </div>
          <div class="mb-3">
            <label for="password" class="form-label">Senha</label>
            <input type="password" class="form-control" id="password" name="password" required>
          </div>
          <button type="submit" class="btn btn-primary btnEntrar">Entrar</button>
        </form>
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
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
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
    document.getElementById('arrow-up').addEventListener('click', function() {
      window.scrollTo({ top: 0, behavior: 'smooth' });
    });
    </script>
</body>
</html>
