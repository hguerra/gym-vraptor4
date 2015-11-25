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
		<div class="about_banner_img">
			<img src="<%=request.getContextPath()%>/assets/images/about_img.jpg"
				class="img-responsive" alt="" />
		</div>
		<div class="about_banner_wrap">
			<h1 class="m_11">Eventos</h1>
		</div>
		<div class="about-wrapper">
			<div class="container">
				<div class="row about-top">
					<div class="col-md-5">
						<img
							src="<%=request.getContextPath()%>/assets/images/about_img1.jpg"
							class="img-responsive" alt="" />
					</div>
					<div class="col-md-7 about-left-text">

						<div class="logo">
							<a href="/"><img style="margin-left: 100%; margin-top: 50%"
								src="<%=request.getContextPath()%>/assets/images/logo.png"
								alt="" /></a>
						</div>
					</div>
					<div class="clear"></div>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="about_trainer">
				<h3 class="m_2">Programação</h3>
				<div class="row about_box">

					<c:forEach items="${eventoList}" var="evento">

						<div class="col-md-4">
							<div class="box1">
								<div class="box1_left">
									<img
										src="<%=request.getContextPath()%>/assets/images/about_img6.jpg"
										class="img-responsive" alt="" />
									<div class="desc1">
										<h3>${evento.nome}<br>
										</h3>
										<br>
										<p>
											<i class="glyphicon glyphicon-time"></i>${evento.data}
										</p>
										<div class="clear"></div>
									</div>
								</div>
								<div class="box1_right">
									<h4>Descrição</h4>
									<p>${evento.descricao}</p>
								</div>
								<div class="clear"></div>
							</div>
						</div>
						<div class="clear"></div>

					</c:forEach>
				</div>
				<!-- /linha 1 -->
			</div>
		</div>
	</div>
	<div class="clear"></div>
	<!-- fim -->
	<jsp:include page="../included/footer.jsp"></jsp:include>
</body>
</html>