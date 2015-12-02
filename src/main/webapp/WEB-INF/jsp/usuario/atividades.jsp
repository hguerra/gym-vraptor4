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

				<div class="row">
					<div class="col-md-8">
						<br> <br>
						<div class="alert alert-dismissable alert-info">
							<button type="button" class="close" data-dismiss="alert"></button>
							<h4>Cadastrar Atividades</h4>
						</div>
						<form action="<%=request.getContextPath()%>/cadastrarAtividade"
							method="post">
							<div class="form-group col-md-4">
								<label> Nome: </label> <input type="text" class="form-control"
									name="atividade.nome" />
							</div>
							<div class="form-group col-md-4">
								<label> Descricao: </label> <input type="text"
									class="form-control" name="atividade.descricao" />
							</div>
							<br>
							<button type="submit" class="btn btn-default">Cadastrar</button>

						</form>
						<br> <br>
					</div>
				</div>
				<div class="col-md-12">
					<br> <br>
					<div class="alert alert-dismissable alert-info">
						<button type="button" class="close" data-dismiss="alert"></button>
						<h4>Atividades!</h4>
					</div>
					<c:if test="${empty atividades}">
						<div class="alert alert-dismissable alert-warning">
							<button type="button" class="close" data-dismiss="alert"></button>
							<h4>Voce Nao Tem Atividades!</h4>
						</div>

					</c:if>

					<c:if test="${not empty atividades}">

						<table class="table table-striped">
							<thead>
								<tr>
									<th>Nome</th>
									<th>Descricao</th>
									<th>Concluido</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${atividades}" var="atividade">
									<tr>
										<td>${atividade.nome}</td>
										<td>${atividade.descricao}</td>
										<td>${atividade.concluido}</td>
										<td><form
												action="<%=request.getContextPath()%>/removerAtividade/${atividade.id}"
												method="post">
												<button type="submit" name="atividade.id"
													value="${atividade.id}">
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