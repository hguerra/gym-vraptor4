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
			<img src="<%=request.getContextPath()%>/assets/images/price.jpg"
				class="img-responsive" alt="" />
		</div>
		<div class="about_banner_wrap">
			<h1 class="m_11">Pricing</h1>
		</div>
		<div class="border"></div>
		<div class="container">
			<div class="row price_plans">
				<h3 class="m_2">Pricing and plans</h3>
				<div class="price_plans_box">
					<div class="col-md-4">
						<ul class="price1">
							<h4>1 mês</h4>
							<h2 class="m_25">
								R$50<small>.50</small>
							</h2>
							<ul class="price_list">
								<a class="popup-with-zoom-anim" href="#small-dialog"><li
									class="price_but">Assine já</li></a>
								<div class="clear"></div>
							</ul>
						</ul>
					</div>
					<div class="col-md-4">
						<ul class="price2">
							<h4>3 meses</h4>
							<h2 class="m_26">
								R$135<small>.00</small>
							</h2>
							<ul class="price_list1">
								<a class="popup-with-zoom-anim" href="#small-dialog"><li
									class="price_but1">Buy Now</li></a>
								<div class="clear"></div>
							</ul>
						</ul>
					</div>
					<div class="col-md-4">
						<ul class="price1">
							<h4>12 meses</h4>
							<h2 class="m_25">
								R$510<small>.00</small>
							</h2>
							<ul class="price_list">
								<a class="popup-with-zoom-anim" href="#small-dialog"><li
									class="price_but">Buy Now</li></a>
								<div class="clear"></div>
							</ul>
						</ul>
					</div>
					<div class="clear"></div>
				</div>
			</div>
		</div>

		<div class="container">
			<div class="row pricing">
				<div class="col-md-8">
					<h3 class="m_2">Modalidades</h3>
					<div class="classes">
						<div class="cardio_list">
							<div class="cardio_sublist">
								<ul class="cardio">
									<li><i class="clock"> </i><span>Cardio Fitness</span></li>
								</ul>
								<div class="clear"></div>
							</div>
							<div class="cardio_sublist">
								<ul class="cardio">
									<li><i class="clock"> </i><span>Spinning</span></li>
								</ul>
								
								<div class="clear"></div>
							</div>
							<div class="clear"></div>
							<div class="cardio_sublist">
								<ul class="cardio">
									<li><i class="clock"> </i><span>Pilates</span></li>
								</ul>
							
								<div class="clear"></div>
							</div>
							<div class="cardio_sublist">
								<ul class="cardio">
									<li><i class="clock"> </i><span>Boxing</span></li>
								</ul>
								<div class="clear"></div>
							</div>
							<div class="clear"></div>
						</div>
						<div class="cardio_list1">
							<div class="cardio_sublist">
								<ul class="cardio">
									<li><i class="clock"> </i><span>Aerobics</span></li>
								</ul>
								<div class="clear"></div>
							</div>
							<div class="cardio_sublist">
								<ul class="cardio">
									<li><i class="clock"> </i><span>Kik Boxing</span></li>
								</ul>
								<div class="clear"></div>
							</div>
							<div class="cardio_sublist">
								<ul class="cardio">
									<li><i class="clock"> </i><span>CrossFit</span></li>
								</ul>

								<div class="clear"></div>
							</div>
							<div class="cardio_sublist">
								<ul class="cardio">
									<li><i class="clock"> </i><span>Yoga</span></li>
								</ul>
								<div class="clear"></div>
							</div>
						</div>
						<div class="clear"></div>
					</div>
				</div>
				<div class="clear"></div>
			</div>
		</div>

		<!-- fim -->
		<jsp:include page="../included/footer.jsp"></jsp:include>
</body>
</html>