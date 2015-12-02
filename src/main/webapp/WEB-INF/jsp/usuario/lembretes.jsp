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
				<div class="col-md-8">
					<br> <br>
					<div class="alert alert-dismissable alert-info">
						<button type="button" class="close" data-dismiss="alert"></button>
						<h4>Cadastrar Lembretes</h4>
					</div>
					<form action="<%=request.getContextPath()%>/cadastrarLembrete"
						method="post">
						<div class="form-group col-md-4">
							<label> Lembrete: </label> <input type="text"
								class="form-control" name="evento.nome" />
						</div>
						<div class="form-group col-md-4">
							<label> Data: </label><input type="text" class="form-control"
								id="dataFinalizacao" name="evento.data">
						</div>
						<br>
						<button type="submit" class="btn btn-default">Cadastrar</button>

					</form>
					<br> <br>
				</div>
			</div>

			<div class="row">
				<div class="col-md-12">
					<br> <br>
					<div class="alert alert-dismissable alert-info">
						<button type="button" class="close" data-dismiss="alert"></button>
						<h4>Lembretes</h4>
					</div>
					<c:if test="${empty lembretes}">
						<div class="alert alert-dismissable alert-warning">
							<button type="button" class="close" data-dismiss="alert"></button>
							<h4>Voce Nao Tem Lembretes!</h4>
						</div>

					</c:if>
					<c:if test="${not empty lembretes}">
						<table class="table table-striped">
							<thead>
								<tr>
									<th>Lembretes</th>
									<th>Data</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${lembretes}" var="lembrete">
									<tr>
										<td>${lembrete.lembrete}</td>
										<td>${lembrete.data}</td>
										<td><form
												action="<%=request.getContextPath()%>/removerLembrete/${lembrete.id}"
												method="post">
												<button type="submit" name="lembrete.id"
													value="${lembrete.id}">
													<i class="glyphicon glyphicon-trash"></i>
												</button>
											</form></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</c:if>
				</div>
			</div>
		</div>
	</div>
	<!-- fim -->
	<jsp:include page="../included/footer.jsp"></jsp:include>
</body>
</html>