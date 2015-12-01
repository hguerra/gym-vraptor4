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
					<div class="alert alert-dismissable alert-danger">

						<button type="button" class="close" data-dismiss="alert"></button>
						<h4>Alunos Inadimplentes</h4>
					</div>
					<c:if test="${not empty devedores}">
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
								<c:forEach items="${devedores}" var="devedor">
									<tr>
										<td>${devedor.id}</td>
										<td>${devedor.nome}</td>
										<td>${devedor.sobreNome}</td>
										<td>${devedor.email}</td>
										<td><form action="<c:url value="/academia/cobrar"/>"
												method="post">
												<input type="hidden" name="email" value="${devedor.email}" />
												<button type="submit" class="btn btn-primary">
													<span class="glyphicon glyphicon-envelope"></span>
												</button>
											</form></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</c:if>
					<c:if test="${empty devedores}">
						<div class="alert alert-dismissable alert-info">
							<button type="button" class="close" data-dismiss="alert"></button>
							<h4>Não há alunos devedores =)</h4>
						</div>
					</c:if>
				</div>
			</div>
		</div>
	</div>
	<!-- fim -->
	<jsp:include page="../included/footer.jsp"></jsp:include>
</body>
</html>