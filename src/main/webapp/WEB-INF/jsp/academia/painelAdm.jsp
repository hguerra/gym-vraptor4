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
					<div class="alert alert-dismissable alert-warning">
						<button type="button" class="close" data-dismiss="alert"></button>
						<h4>Contas</h4>
						<a href="<%=request.getContextPath()%>/cadastrarConta">cadastrar
							contas</a> <br><a href="<%=request.getContextPath()%>/cadastrarEvento">cadastrar
							eventos</a>
					</div>
					<c:if test="${not empty contas}">
						<table class="table table-striped">
							<thead>
								<tr>
									<th>Valor</th>
									<th>Transacao</th>
									<th>Data</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${contas}" var="conta">
									<tr>
										<td>${conta.valor}</td>
										<td>${conta.operacao}</td>
										<td>${conta.data}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</c:if>
				</div>
			</div>

			<div class="row">
				<div class="col-md-12">
					<br> <br>
					<div class="alert alert-dismissable alert-info">
						<button type="button" class="close" data-dismiss="alert"></button>
						<h4>Buscar Aluno</h4>
					</div>
					<form action="<%=request.getContextPath()%>/buscar"
						class="form-inline">
						<div class="form-group">
							<label> Nome: </label> <input type="text" class="form-control"
								id="nome" name="usuario.nome" />
						</div>
						<button type="submit" class="btn btn-default">Buscar</button>
					</form>
					<c:if test="${not empty usuarios}">
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
								<c:forEach items="${usuarios}" var="busca">
									<tr>
										<td>${busca.nome}</td>
										<td>${busca.sobreNome}</td>
										<td>${busca.email}</td>
										<td><a href="buscar/${busca.id}"><i
												class="glyphicon glyphicon-search"></i></a></td>
										<td><a
											href="<%=request.getContextPath()%>/addExercicio/${busca.id}"><i
												class="glyphicon glyphicon-plus"></i></a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</c:if>
					<c:if test="${not empty status}">
						<table class="table table-striped">
							<thead>
								<tr>
									<th>Status</th>
								</tr>
							</thead>
							<tbody>

								<c:forEach items="status" var="str">
									<tr>
										<td><c:out value="${status}" /></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>

					</c:if>
				</div>
			</div>
		</div>
	</div>
	<br>
	<br>
	<!-- fim -->
	<jsp:include page="../included/footer.jsp"></jsp:include>
</body>
</html>