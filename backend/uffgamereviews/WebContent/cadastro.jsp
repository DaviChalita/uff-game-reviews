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
	<title>Cadastro</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="center col-6 container-margin">   
				<div class="nes-container with-title is-rounded is-centered bgyellow">
					<div class="title bgyellow">Cadastro</div>
					<form action="" method="POST">
						<div class="nes-field form-item">
							<label for="username">Username</label>
							<input type="text" id="username" class="nes-input">
						</div>                        
						<div class="nes-field form-item">
							<label for="name">Nome</label>
							<input type="text" id="name" class="nes-input">
						</div>
						<div class="nes-field form-item">
							<label for="email">Email</label>
							<input type="Email" id="email" class="nes-input">
						</div>
						<div class="nes-field form-item">
							<label for="password">Senha</label>
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