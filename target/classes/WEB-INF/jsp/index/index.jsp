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
	<div class="main">
		<div class="container">
			<!-- start content-top -->
			<div class="row content-top">
				<div class="col-md-5">
					<div class="opening_hours">
						<span style="color: white;">Horario de Funcionamento</span> <br>
						<br>
						<ul class="times">
							<li><i class="calender"> </i><span class="week">Segunda</span>
								<div class="hours">h.6:00-h.24:00</div>
								<div class="clear"></div></li>
							<li><i class="calender"> </i><span class="week">Terça</span>
								<div class="hours">h.6:00-h.24:00</div>
								<div class="clear"></div></li>
							<li><i class="calender"> </i><span class="week">Quarta</span>
								<div class="hours">h.6:00-h.24:00</div>
								<div class="clear"></div></li>
							<li><i class="calender"> </i><span class="week">Quinta</span>
								<div class="hours">h.6:00-h.24:00</div>
								<div class="clear"></div></li>
							<li><i class="calender"> </i><span class="week">Sexta</span>
								<div class="hours">h.6:00-h.24:00</div>
								<div class="clear"></div></li>
							<li><i class="calender"> </i><span class="week">Sabado</span>
								<div class="hours">h.6:00-h.24:00</div>
								<div class="clear"></div></li>
							<li><i class="calender"> </i><span class="week">Domingo</span>
								<div class="hours">h.6:00-h.24:00</div>
								<div class="clear"></div></li>
						</ul>
					</div>
				</div>
				<div class="col-md-7 content_left_text">
					<h3>Se inscreva !</h3>
					<p>Assine já nossos planos.</p>
				</div>
			</div>
		</div>
		<br> <br> <br> <br>
		<!-- end content-top -->
		<div class="container">
			<div class="row content-middle">
				<!-- start content-middle -->
				<div class="col-md-4">
					<a href="<%=request.getContextPath()%>/pricing">
						<ul class="spinning">
							<li class="live">Spinning</li>
							<div class="clear"></div>
						</ul>
						<div class="view view-fifth">
							<img src="<%=request.getContextPath()%>/assets/images/pic3.jpg"
								class="img-responsive" alt="" />
							<div class="mask">
								<div class="info">Informações</div>
							</div>
						</div>
					</a>
				</div>
				<div class="col-md-4">
					<a href="<%=request.getContextPath()%>/pricing">
						<ul class="spinning">
							<li class="live">Gym</li>
							<div class="clear"></div>
						</ul>
						<div class="view view-fifth">
							<img src="<%=request.getContextPath()%>/assets/images/pic2.jpg"
								class="img-responsive" alt="" />
							<div class="mask">
								<div class="info">Informações</div>
							</div>
						</div>
					</a>
				</div>
				<div class="col-md-4">
					<a href="<%=request.getContextPath()%>/pricing">
						<ul class="spinning">
							<li class="live">Pilates</li>
							<div class="clear"></div>
						</ul>
						<div class="view view-fifth">
							<img src="<%=request.getContextPath()%>/assets/images/pic1.jpg"
								class="img-responsive" alt="" />
							<div class="mask">
								<div class="info">Informações</div>
							</div>
						</div>
					</a>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
	<br>
	<jsp:include page="../included/footer.jsp"></jsp:include>
</body>
</html>