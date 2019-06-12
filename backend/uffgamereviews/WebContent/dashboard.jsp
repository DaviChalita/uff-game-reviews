<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html lang="en">

<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" type="text/css" href="assets/stylesheets/nes.min.css">
    <link rel="stylesheet" type="text/css" href="assets/stylesheets/simple-grid.min.css">
    <link rel="stylesheet" type="text/css" href="assets/stylesheets/shared.css">
    <link rel="stylesheet" type="text/css" href="assets/stylesheets/carousel.css">
    <script type="text/javascript" src="assets/js/carousel.js"></script>
    <title>Login</title>
</head>

<body class="background-image">
    <div class="container">
        <div class="row id-column container-margin">
            <div class="col-4">
                <div class="nes-container id-column bgyellow">
                    <div class="stars">
                        <section class="icon-list">
                            <% for (int i = 0; i < numEstrelasUser; i++) { %>
                                <i class="nes-icon is-medium-50% star"></i>
                            <% } %>
                            <% for (int i = numEstrelasUser; i < 10; i++) { %>
                                <i class="nes-icon is-medium-50% star is-empty"></i>
                            <% } %>
                        </section>
                    </div>
                </div>
            </div>
            <div class="col-8">
                <div class="nes-container with-title is-centered bgyellow margin-28px">
                    <div class="title bgyellow">
                        Jogos
                    </div>
                    <div class="slideshow-container">
                        <div class="mySlides fade">
                            <img class="img-poster" src="assets/games/darksouls1.jpg">
                        </div>

                        <div class="mySlides fade">
                            <img class="img-poster" src="assets/games/dk2.jpg">
                        </div>

                        <div class="mySlides fade">
                            <img class="img-poster" src="assets/games/ffx.jpg">
                        </div>

                        <div class="mySlides fade">
                            <img class="img-poster" src="assets/games/hollowknight.jpg">
                        </div>

                        <div class="mySlides fade">
                            <img class="img-poster" src="assets/games/mgsv.jpg">
                        </div>

                        <div class="mySlides fade">
                            <img class="img-poster" src="assets/games/mhw.jpg">
                        </div>

                        <div class="mySlides fade">
                            <img class="img-poster" src="assets/games/pkx.jpg">
                        </div>

                        <div class="mySlides fade">
                            <img class="img-poster" src="assets/games/re2.jpg">
                        </div>

                        <div class="mySlides fade">
                            <img class="img-poster" src="assets/games/tw3.jpg">
                        </div>

                        <div class="mySlides fade">
                            <img class="img-poster" src="assets/games/undertale.jpg">
                        </div>

                        <div class="slide-controller">
                            <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
                            <a class="next" onclick="plusSlides(1)">&#10095;</a>
                        </div>
                    </div>
                </div>
                <div class="nes-container with-title is-centered bgyellow margin-28px">
                    <div class="title bgyellow">
                        Descrição
                    </div>
                    <div>
                         <c:out value="${descricaoGame}" /> 
                    </div>
                    <div>
                        <% for (int i = 0; i < numEstrelasGame; i++) { %>
                            <i class="nes-icon is-medium-50% star"></i>
                        <% } %>
                    </div>
                    <div class="nes-field form-button">
                        <button type="button" class="nes-btn is-primary">Like</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
