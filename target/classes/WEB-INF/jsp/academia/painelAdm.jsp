<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="../included/imports.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="../included/header.jsp"></jsp:include>
	<!-- inicio -->
	<div class="main">
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-12">
					<br> <br>
					<div class="alert alert-dismissable alert-info">
						<button type="button" class="close" data-dismiss="alert"></button>
						<h4>Buscar Aluno</h4>
					</div>
					<form action="buscar" class="form-inline">
						<div class="form-group">

							<label> Nome: </label> <input type="text" class="form-control"
								id="nome" name="usuario.nome" />
						</div>
						<button type="submit" class="btn btn-default">Buscar</button>
					</form>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<br> <br>
					<div class="alert alert-dismissable alert-danger">

						<button type="button" class="close" data-dismiss="alert"></button>
						<h4>Alunos Inadimplentes</h4>
					</div>
					<table class="table table-striped">
						<thead>
							<tr>
								<th>#id</th>
								<th>Nome</th>
								<th>Sobrenome</th>
								<th>Email</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${treinoList}" var="treino">
								<tr>
									<td>${treino.id}</td>
									<td>${treino.nome}</td>
									<td>${treino.sobreNome}</td>
									<td>${treino.email}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<!-- fim -->
	<jsp:include page="../included/footer.jsp"></jsp:include>
</body>
</html>