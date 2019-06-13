<%

%>

<html>

<head>
    <meta charset="UTF-8">    
    <title>Login</title>
     <meta name="viewport"  content="width=device-width, initial-scale=1">   
    <link rel="stylesheet"  type="text/css" href="assets/stylesheets/nes.min.css">
    <link rel="stylesheet"  type="text/css" href="assets/stylesheets/simple-grid.min.css">
    <link rel="stylesheet"  type="text/css" href="assets/stylesheets/shared.css">
    <link rel="stylesheet"  type="text/css" href="assets/stylesheets/popup.css">
    <script type="text/javascript" src="assets/js/popupconfirm.js"></script>    
</head>

<body class="background-image">
    <div class="container">
        <div class="row">
            <div class="center col-6 container-margin">
                <div class="nes-container with-title is-centered bgyellow">
                    <div class="title bgyellow">Login</div>
                    <form action="realizaLogin" method="POST" name="formLogin">
                        <div class="nes-field form-item">
                            <div>
                            	<label for="dark_field" class="form-item" style="color:black;">Email</label>
                                <input type="text" name="email" class="nes-input">
                            </div>
                            <div class="nes-field form-item">
                                <label for="dark_field" class="form-item" style="color:black;">Senha</label>
                                <input type="password" name="senha" class="nes-input">
                            </div>
                            <div class="nes-field form-button">
                                <button type="button" class="nes-btn is-success form-button" onclick="openForm()">Confirmar</button>
                            </div>
                            <div class="bgyellow nes-container is-centered form-popup" id="formPopUp">
                                <p>Está certo disso?</p>
                                <label>
                                    <input type="radio" class="nes-radio" name="answer" onclick="submitForm()" checked/>
                                    <span>Sim</span>
                                </label>
                                <label>
                                    <input type="radio" class="nes-radio" name="answer" onclick="closeForm()"/>
                                    <span>Não</span>
                                </label>
                            </div>
                            <div class='form-item font-size-8px'>
                                <a href="esqueceusenha.jsp" class="form-item">Esqueceu sua senha?</a>
                            </div>
                            <div class='form-item font-size-8px'>
                                <a href="cadastro" class="form-item">Criar conta</a>
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