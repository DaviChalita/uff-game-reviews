<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet"  type="text/css" href="assets/stylesheets/nes.min.css">
    <link rel="stylesheet"  type="text/css" href="assets/stylesheets/simple-grid.min.css">
    <link rel="stylesheet"  type="text/css" href="assets/stylesheets/shared.css">
    <title>Redefinicao de senha</title>
</head>
<body class="background-image">
    <div class="container">
        <div class="row">
            <div class="center col-6 container-margin">   
                    <div class="nes-container with-title bgyellow is-rounded is-centered">
                            <div class="title bgyellow">Recuperar senha</div>
                                <form action="index.jsp" method="POST">
                                    <div class="nes-field form-item">
                                        <label for="dark_field" style="color:black;">Email</label>                                              
                                        <input type="text" id="email" class="nes-input">
                                    </div>
                                    <div class="nes-field form-item">
                                        <label for="password" style="color:black;">Nova senha</label>                                              
                                        <input type="password" id="senha" class="nes-input">
                                    </div>
                                    <div class="form-button">                                                    
                                        <button type="submit" class="nes-btn is-success">Confirmar</button>
                                    </div>                                        
                                </form>
                    </div>       
            </div>
        </div>
    </div>
</body>
</html>