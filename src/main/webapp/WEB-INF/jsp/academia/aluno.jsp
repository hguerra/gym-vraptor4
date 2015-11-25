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
						<h4>Adicionar Exercicio</h4>
					</div>
					<form action="addExercicio" class="form-inline">
						<div class="form-group">

							<label> Nome do Exercicio: </label> <input type="text"
								class="form-control" id="nome" name="usuario.nome" />
						</div>
						<button type="submit" class="btn btn-default">Add</button>
					</form>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<br> <br>
					<div class="alert alert-dismissable alert-sucess">

						<button type="button" class="close" data-dismiss="alert"></button>
						<h4>Treino</h4>
					</div>

					<table class="table table-striped">
						<thead>
							<tr>
								<th>#</th>
								<th>Exercicio</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${treinoList}" var="treino">
								<tr>
									<td>${treino.id}</td>
									<td>${treino.exercicio}</td>
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