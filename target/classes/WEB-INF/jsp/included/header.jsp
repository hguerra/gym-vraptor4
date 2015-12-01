<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- start header_top -->
<div class="header">
	<div class="container">
		<div class="header-text">
			<h1>Perfect Fitness</h1>
			<br> <br>
			<div class="banner_btn">
				<a href="<c:url value="/login"/>">Entrar</a>
			</div>
		</div>
		<div class="header-arrow">
			<a href="#menu" class="class scroll"><span> </span></a>
		</div>
	</div>
</div>
<!-- end header_top -->
<!-- start header_bottom -->
<div class="header-bottom">
	<div class="container">
		<%--Colocar 
	informacoes 
	do usuario--%>
		<div class="header-bottom_left">
			<c:if test="${usuario.logado}">
				<span style="color: #fff;"><p>Seja bem vindo, ${usuario.nome}.</p></span>
			</c:if>
		</div>
		<div class="social">
			<ul> 
			<c:if test="${usuario.logado}">
				<c:if test="${not usuario.aluno}">
					<li><a href="<c:url value="/adm"/>"><i class = "glyphicon glyphicon-plus" style="color: #fff;"></i></a></li>
					<li><a href="<c:url value="/inadimplentes"/>"><i class = "glyphicon glyphicon-usd" style="color: #fff;"></i></a></li>
				</c:if>
				<li><a href="<c:url value="/lembretes"/>"><i class = "glyphicon glyphicon-bell" style="color: #fff;"></i></a></li>
				<li><a href="<c:url value="/atividades"/>"><i class = "glyphicon glyphicon-list-alt" style="color: #fff;"></i></a></li>
				<li><a href="<c:url value="/perfil"/>"><i class="glyphicon glyphicon-user" style="color: #fff;"> </i></a></li>
				<li><a href="<c:url value="/logout"/>"><i class = "glyphicon glyphicon-log-out" style="color: #fff;"></i></a></li>
			</c:if>
				
				<c:if test="${empty usuario or not usuario.logado}">
					<li><a href="<c:url value="/login"/>"><i class="glyphicon glyphicon-log-in"  style="color: #fff;"> Login </i></a></li>
					<li><a href="<c:url value="/register"/>"><i class = "glyphicon glyphicon-plus-sign"  style="color: #fff;"> Cadastre-se</i></a></li>
				</c:if>
			</ul>
		</div>
		<div class="clear"></div>
		<%--/informacoes 
	do usuario--%>
	</div>
</div>
<!-- end header_bottom -->
<!-- start menu -->
<div class="menu" id="menu">
	<div class="container">
		<div class="logo">
			<a href="<c:url value="/"/>"><img
				src="<%=request.getContextPath()%>/assets/images/logo.png" alt="" /></a>
		</div>
		<div class="h_menu4">
			<!-- start h_menu4 -->
			<a class="toggleMenu" href="#">Menu</a>
			<ul class="nav">
				<li class="active"><a href="<%=request.getContextPath()%>/">Inicio</a></li>
				<li><a href="<c:url value='/eventos'/>">Eventos</a></li>
				<li><a href="<c:url value='/trainers'/>">Horarios</a></li>
				<li><a href="<c:url value='/pricing'/>">Preços</a></li>
			</ul>
			<script type="text/javascript"
				src="<%=request.getContextPath()%>/assets/js/nav.js"></script>
		</div>
		<!-- end h_menu4 -->
		<div class="clear"></div>
	</div>
</div>
<!-- end menu -->