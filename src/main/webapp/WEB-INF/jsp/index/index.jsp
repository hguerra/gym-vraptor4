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
					<img src="<%=request.getContextPath()%>/assets/images/pic.png"
						class="img-responsive" alt="" />
				</div>
				<div class="col-md-7 content_left_text">
					<h3>Se inscreva !</h3>
					<p>Assine já nossos planos.</p>
				</div>
			</div>
		</div>
		<!-- end content-top -->
		<div class="container">
			<div class="row content-middle">
				<!-- start content-middle -->
				<div class="col-md-4">
					<a href="pricing.jsp">
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
					<a href="pricing.jsp">
						<ul class="spinning">
							<li class="live">Gym </li>
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
					<a href="pricing.jsp">
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
			<div class="row about">
				<div class="col-md-8">
					<h3 class="m_2">Galeria</h3>
					<div id="ca-container" class="ca-container">
						<div class="ca-wrapper">
							<div class="ca-item ca-item-1">
								<div class="ca-item-main">
									<div class="ca-icon"></div>
									<div class="ca-icon1"></div>
								</div>
							</div>
							<div class="ca-item ca-item-2">
								<div class="ca-item-main">
									<div class="ca-icon"></div>
									<div class="ca-icon2"></div>
								</div>
							</div>
							<div class="ca-item ca-item-3">
								<div class="ca-item-main">
									<div class="ca-icon"></div>
									<div class="ca-icon3"></div>
								</div>
							</div>
							<div class="ca-item ca-item-4">
								<div class="ca-item-main">
									<div class="ca-icon"></div>
									<div class="ca-icon4"></div>
								</div>
							</div>
							<div class="ca-item ca-item-5">
								<div class="ca-item-main">
									<div class="ca-icon"></div>
									<div class="ca-icon5"></div>
								</div>
							</div>
							<div class="ca-item ca-item-6">
								<div class="ca-item-main">
									<div class="ca-icon"></div>
									<div class="ca-icon6"></div>
								</div>
							</div>
							<div class="ca-item ca-item-7">
								<div class="ca-item-main">
									<div class="ca-icon"></div>
									<div class="ca-icon7"></div>
								</div>
							</div>
							<div class="ca-item ca-item-8">
								<div class="ca-item-main">
									<div class="ca-icon"></div>
									<div class="ca-icon"></div>
								</div>
							</div>
						</div>
					</div>
					<script type="text/javascript">
						$('#ca-container').contentcarousel();
					</script>
				</div>
				<div class="col-md-4">
					<div class="opening_hours">
						<span style="color: white;">Horario de Funcionamento</span> <br>
						<br>
						<ul class="times">
							<li><i class="calender"> </i><span class="week">Monday</span>
								<div class="hours">h.6:00-h.24:00</div>
								<div class="clear"></div></li>
							<li><i class="calender"> </i><span class="week">Tuesday</span>
								<div class="hours">h.6:00-h.24:00</div>
								<div class="clear"></div></li>
							<li><i class="calender"> </i><span class="week">Wednesday</span>
								<div class="hours">h.6:00-h.24:00</div>
								<div class="clear"></div></li>
							<li><i class="calender"> </i><span class="week">Thrusday</span>
								<div class="hours">h.6:00-h.24:00</div>
								<div class="clear"></div></li>
							<li><i class="calender"> </i><span class="week">Friday</span>
								<div class="hours">h.6:00-h.24:00</div>
								<div class="clear"></div></li>
							<li><i class="calender"> </i><span class="week">Saturday</span>
								<div class="hours">h.6:00-h.24:00</div>
								<div class="clear"></div></li>
							<li><i class="calender"> </i><span class="week">Sunday</span>
								<div class="hours">h.6:00-h.24:00</div>
								<div class="clear"></div></li>
						</ul>
					</div>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
	<jsp:include page="../included/footer.jsp"></jsp:include>
</body>
</html>