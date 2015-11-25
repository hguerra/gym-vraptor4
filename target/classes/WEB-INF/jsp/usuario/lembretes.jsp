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
						<c:if test="${usuario.logado}">
							<h4>${usuario.nome}</h4>
						</c:if>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<br> <br>
					<div class="alert alert-dismissable alert-sucess">

						<button type="button" class="close" data-dismiss="alert"></button>
						<h4>Lembretes</h4>
					</div>

					<table class="table table-striped">
						<thead>
							<tr>
								<th>#id</th>
								<th>Lembretes</th>
								<th>Data</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${lembreteList}" var="lembrete">
								<tr>
									<td>${treino.id}</td>
									<td>${lembrete.lembrete}</td>
									<td>${lembrete.data}</td>
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