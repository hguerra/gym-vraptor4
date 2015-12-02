<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="../included/imports.jsp"></jsp:include>
<link href="<%=request.getContextPath()%>/assets/css/jquery-ui.css"
	rel='stylesheet' type='text/css' />

<script type="text/javascript"
	src="<%=request.getContextPath()%>/assets/js/jquery-ui.js"></script>
</head>
<body>
	<jsp:include page="../included/header.jsp"></jsp:include>
	<!-- inicio -->
	<div class="main">
		<div class="row">
			<div class="col-md-8">
				<br> <br>
				<div class="alert alert-dismissable alert-info">
					<button type="button" class="close" data-dismiss="alert"></button>
					<h4>Cadastrar Eventos</h4>
				</div>
				<form action="<%=request.getContextPath()%>/cadastrarEvento" method="post">
					<div class="form-group col-md-4">
						<label> Nome: </label> <input type="text" class="form-control"
							name="evento.nome" />
					</div>
					<div class="form-group col-md-4">
						<label> Descricao: </label> <input type="text" class="form-control"
							name="evento.descricao" />
					</div>
					<div class="form-group col-md-4">
						<label> Data: </label><input type="text" class="form-control"
							id="dataFinalizacao" name="evento.data">
					</div>
					<button type="submit" class="btn btn-default">Cadastrar</button>

				</form>
				<br> <br>
			</div>
		</div>
	</div>
	<!-- fim -->
	<jsp:include page="../included/footer.jsp"></jsp:include>
</body>
</html>