<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <%@ page contentType="text/html; charset=UTF-8" %>
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
                        <a href="#" class="nav-link active primary-color" aria-current="page"> Início </a>
                    </li>
                    <li class="nav-item">
                        <a href="/find-all-trips" class="nav-link primary-color">Rotas</a>
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
    <div class="modal fade" id="loginModal" tabindex="-1" aria-labelledby="loginModalLabel" aria-hidden="true">

        <form class="modal-dialog" action= "/login.jsp">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="loginModalLabel">Insira seu Usuário e Senha</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Fechar"></button>
                </div>
                <div class="modal-body">
                    <form>
                        <div class="mb-3">
                            <label for="username" class="form-label">Usuário:</label>
                            <input type="text" class="form-control" id="username" name="username" required>
                        </div>
                        <div class="mb-3">
                            <label for="password" class="form-label">Senha:</label>
                            <input type="password" class="form-control" id="password" name="password" required>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary btnFechar" data-bs-dismiss="modal">Fechar</button>
                    <button type="submit" class="btn btn-primary btnEntrar">Entrar</button>
                </div>
            </div>
        </form>
    </div>
    <div class="carousel" id="slider-container">
        <div class="carousel slide" id="slider" data-bs-ride="carousel">
            <div class="carousel-indicators">
                <button
                        type="button"
                        class="active"
                        data-bs-target="#slider"
                        data-bs-slide-to="0"
                        aria-current="true"
                        aria-label="Slide 1"
                ></button>
                <button
                        type="button"
                        data-bs-target="#slider"
                        data-bs-slide-to="1"
                        aria-label="Slide 2"
                ></button>
                <button
                        type="button"
                        data-bs-target="#slider"
                        data-bs-slide-to="2"
                        aria-label="Slide 3"
                ></button>
                <button
                        type="button"
                        data-bs-target="#slider"
                        data-bs-slide-to="3"
                        aria-label="Slide 4"
                ></button>
            </div>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="/Images/praia.png" alt="Praia" class="d-block w-100">
                    <div class="carousel-caption">
                        <h5>Rotas Disponíveis - Praias</h5>
                        <a href="#" class="btn btn-dark">Ver Rotas</a>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="/Images/trilha.png" alt="Praia" class="d-block w-100">
                    <div class="carousel-caption">
                        <h5>Rotas Disponíveis - Trilhas</h5>
                        <a href="#" class="btn btn-dark">Ver Rotas</a>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="/Images/cachoeira.png" alt="Praia" class="d-block w-100">
                    <div class="carousel-caption">
                        <h5>Rotas Disponíveis - Cachoeiras</h5>
                        <a href="#" class="btn btn-dark">Ver Rotas</a>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="/Images/hotel.png" alt="Praia" class="d-block w-100">
                    <div class="carousel-caption">
                        <h5>Rotas Disponíveis - Hotéis Incríveis</h5>
                        <a href="#" class="btn btn-dark">Ver Rotas</a>
                    </div>
                </div>
            </div>

            <button
                    class="carousel-control-prev"
                    type="button"
                    data-bs-target="#slider"
                    data-bs-slide="prev"
                    >
                <i class="bi bi-chevron-compact-left"></i>
                    <span class="visually-hidden">Previous</span>
            </button>

            <button
                    class="carousel-control-next"
                    type="button"
                    data-bs-target="#slider"
                    data-bs-slide="next"
            >
                <i class="bi bi-chevron-compact-right"></i>
                <span class="visually-hidden">Next</span>
            </button>
        </div>
        <div class="col-12 col-md-10 offset-md-1" id="mini-banners">
            <div class="row">
                <div class="col-12 col-md-4">
                    <div class="card text-center">
                        <i class="bi bi-bullseye secondary-color"></i>
                        <div class="card-body">
                            <h5 class="card-title secondary-color">Objetivo</h5>
                            <p class="card-text secondary-color">Nascemos com o objetivo de fazer com que sua viajem seja incrível, simples, inesquecível e o principal, com segurança.</p>
                            <a href="#" class="btn btn-dark">Saber Mais</a>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-md-4">
                    <div class="card text-center">
                        <i class="bi bi-map secondary-color"></i>
                        <div class="card-body">
                            <h5 class="card-title secondary-color">Rotas</h5>
                            <p class="card-text secondary-color">Com o destino decidido, disponibilizaremos roteiros da sua viagem para que seja aproveitada ao máximo.</p>
                            <a href="#" class="btn btn-dark"> Ver Rotas</a>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-md-4">
                    <div class="card text-center">
                        <i class="bi bi-pin-angle-fill secondary-color"></i>
                        <div class="card-body">
                            <h5 class="card-title secondary-color">Localização</h5>
                            <p class="card-text secondary-color">Estamos localizados em diversos pontos turísticos, com o intuito de uma maior ampliação na hora da escolha do seu destino.</p>
                            <a href="#" class="btn btn-dark"> Ver Rotas</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="container" id="featured-container">
        <div class="col-12">
            <h2 class="title secondary-color">Tipos de Rotas</h2>
            <p class="subtitle secondary-color">Conheça os tipos de rotas que ofereçemos</p>
        </div>
        <div class="col-12" id="featured-images">
            <div class="row g-4">
                <div class="col-12 col-md-4">
                    <img src="/Images/praiaWP.jpg" alt="Projeto Praia" class="img-fluid">
                    <div class="banner-content">
                        <p class="secondary-color">Praias</p>
                        <h3>Veja as Rotas Disponíveis</h3>
                    </div>
                </div>
                <div class="col-12 col-md-4">
                    <img src="/Images/trilhaWP.png" alt="Projeto Trilha" class="img-fluid">
                    <div class="banner-content">
                        <p class="secondary-color">Trilhas</p>
                        <h3>Veja as Rotas Disponíveis</h3>
                    </div>
                </div>
                <div class="col-12 col-md-4">
                    <img src="/Images/cachoeiraWP.jpg" alt="Projeto Cachoeira" class="img-fluid">
                    <div class="banner-content">
                        <p class="secondary-color">Cachoeiras</p>
                        <h3>Veja as Rotas Disponíveis</h3>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="container" id="info-container">
        <div class="col-12">
            <h2 class="title secondary-color">Mais Detalhes Sobre Nós</h2>
            <p class="subtitle secondary-color">Saiba mais sobre nosso objetivo de entrega ao cliente</p>
        </div>
    </div>
    <div class="col-12 container">
        <div class="row">
            <div class="col-12 col-md-5" id="info-banner">
                <img src="/Images/mapa.jpg" alt="Localização da Empresa" class="image-fluid">
            </div>
            <div class="col-12 col-md-7 bg-secondary-color" id="info-content">
                <div class="row">
                    <div class="col-12">
                        <h2 class="title secondary-color">Nós Fazemos a Diferença!</h2>
                        <p class="subtitle secondary-color">Estamos espalhados em pontos turísticos estratégicos ao redor do mundo para oferecer ao nosso cliente uma gama completa de lugares disponíveis para visitar, fazendo com que nosso serviço oferecido seja único e com grande abrangência.</p>
                    </div>
                    <div class="col-12" id="info-numbers">
                        <div class="row">
                            <div class="col-4">
                                <h3 class="secondary-color">10</h3>
                                <p class="secondary-color">Anos No Ramo Turístico</p>
                            </div>
                            <div class="col-4">
                                <h3 class="secondary-color">57</h3>
                                <p class="secondary-color">Países Disponíveis</p>
                            </div>
                            <div class="col-4">
                                <h3 class="secondary-color">335</h3>
                                <p class="secondary-color">Clientes Atendidos</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-12">
                        <a href="#" class="btn btn-dark">Sobre</a>
                    </div>
                </div>
            </div>
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