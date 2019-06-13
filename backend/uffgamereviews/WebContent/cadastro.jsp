<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet"  type="text/css" href="assets/stylesheets/nes.min.css">
    <link rel="stylesheet"  type="text/css" href="assets/stylesheets/simple-grid.min.css">
    <link rel="stylesheet"  type="text/css" href="assets/stylesheets/shared.css">
    <script type="text/javascript" src="assets/js/popupconfirm.js"></script>   
	<title>Cadastro</title>
</head>
<body class="background-image">
	<div class="container">
		<div class="row">
			<div class="center col-6 container-margin">   
				<div class="nes-container with-title is-rounded is-centered bgyellow">
					<div class="title bgyellow">Cadastro</div>
					<form action="realizaCadastro" method="POST">  
						<div class="nes-field form-item">
							<label for="email">Email</label>
							<input type="Email" id="email" name="email" class="nes-input">
						</div>
						<div class="nes-field form-item">
							<label for="senha">Senha</label>
							<input type="password" id="senha" name="senha" class="nes-input">
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