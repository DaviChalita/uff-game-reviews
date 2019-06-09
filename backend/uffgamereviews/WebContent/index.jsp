<%
%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://fonts.googleapis.com/css?family=Press+Start+2P&display=swap" rel="stylesheet">
    <link href="https://unpkg.com/nes.css@2.2.0/css/nes.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="css/simple-grid.min.css">
    <link rel="stylesheet" href="css/shared.css">
    <link rel="stylesheet" href="css/popup.css">
    <script type="text/javascript" src="js/popupconfirm.js"></script>
    <title>Login</title>
</head>

<body class="background-image">
    <div class="container">
        <div class="row">
            <div class="center col-6 container-margin ">
                <div class="nes-container with-title is-centered bgyellow">
                    <div class="title bgyellow">Login</div>
                    <form action="" method="POST" name="formLogin">
                        <div class="nes-field form-item">
                            <div><label for="dark_field" class="form-item" style="color:black;">Email</label>
                                <input type="text" id="email" class="nes-input">
                            </div>
                            <div class="nes-field form-item">
                                <label for="dark_field" class="form-item" style="color:black;">Senha</label>
                                <input type="password" id="email" class="nes-input">
                            </div>
                            <div class="nes-field form-button">
                                <button type="button" class="nes-btn is-success form-button" onclick="openForm()">Confirmar</button>
                            </div>
                            <div class="bgyellow nes-container is-centered form-popup" id="formPopUp">
                                <p>Est� certo disso?</p>
                                <label>
                                    <input type="radio" class="nes-radio" name="answer" onclick="submitForm()" checked/>
                                    <span>Sim</span>
                                </label>
                                <label>
                                    <input type="radio" class="nes-radio" name="answer" onclick="closeForm()"/>
                                    <span>N�o</span>
                                </label>
                            </div>
                            <div class='form-item font-size-8px'>
                                <a href="esqueceusenha.html" class="form-item">Esqueceu sua senha?</a>
                            </div>
                            <div class='form-item font-size-8px'>
                                <a href="cadastro.html" class="form-item">Criar conta</a>
                                <!-- coin -->
                                <i class="nes-icon coin is-small"></i>
                            </div>
                    </form>
                    </div>
                </div>
            </div>
        </div>
</body>

</html>