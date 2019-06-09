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
    <title>Redefinicao de senha</title>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="center col-6 container-margin">   
                    <div class="nes-container with-title bgyellow is-rounded is-centered">
                            <div class="title bgyellow">Recuperar senha</div>
                                <form action="" method="POST">
                                    <div class="nes-field form-item">
                                        <label for="dark_field" style="color:black;">Email</label>                                              
                                        <input type="text" id="email" class="nes-input">
                                    </div>
                                    <div class="nes-field form-item">
                                        <label for="dark_field" style="color:black;">Senha antiga</label>                                              
                                        <input type="password" id="email" class="nes-input"> 
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