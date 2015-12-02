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
					<form
						action="<%=request.getContextPath()%>/addExercicio/${user.id}/treino"
						method="post" class="form-inline">
						<div class="form-group">
							<label> Nome do Exercicio: </label> <input type="text"
								class="form-control" id="treino" name="treino.exercicio" />
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
					<c:if test="${empty treinos}">
						<div class="alert alert-dismissable alert-warning">
							<button type="button" class="close" data-dismiss="alert"></button>
							Não há treinos cadastrados
						</div>
					</c:if>

					<c:if test="${not empty  treinos}">
						<table class="table table-striped">
							<thead>
								<tr>
									<th>#</th>
									<th>Exercicio</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${treinos}" var="treino">
									<tr>
										<td>${treino.id}</td>
										<td>${treino.exercicio}</td>
										<td>
											<form
												action="<%=request.getContextPath()%>/removeExercicio/${user.id}/treino/${treino.id}"
												method="post">
												<input name="treino.id" type="hidden">
												<button type="submit">
													<i class="glyphicon glyphicon-trash"></i>
												</button>

											</form>
										</td>
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