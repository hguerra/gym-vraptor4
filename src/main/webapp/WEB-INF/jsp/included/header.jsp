<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- start header_top -->
<div class="header">
	<div class="container">
		<div class="header-text">
			<h1>Perfect Fitness</h1>
			<br>
			<br>
			<div class="banner_btn">
				<a href="#">Entrar</a>
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
			<i class="phone"> </i><span>1-200-346-2986</span>
		</div>
		<div class="social">
			<ul>
				<li class="facebook"><a href="#"><span> </span></a></li>
				<li class="twitter"><a href="#"><span> </span></a></li>
				<li class="pinterest"><a href="#"><span> </span></a></li>
				<li class="google"><a href="#"><span> </span></a></li>
				<li class="tumblr"><a href="#"><span> </span></a></li>
				<li class="instagram"><a href="#"><span> </span></a></li>
				<li class="rss"><a href="#"><span> </span></a></li>
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
			<a href="index.html"><img
				src="<%=request.getContextPath()%>/assets/images/logo.png" alt="" /></a>
		</div>
		<div class="h_menu4">
			<!-- start h_menu4 -->
			<a class="toggleMenu" href="#">Menu</a>
			<ul class="nav">
				<li class="active"><a href="index.html">Home</a></li>
				<li><a href="about.html">About</a></li>
				<li><a href="trainers.html">Trainers</a></li>
				<li><a href="classes.html">Classes</a></li>
				<li><a href="blog.html">Blog</a></li>
				<li><a href="pricing.html">Pricing</a></li>
				<li><a href="contact.html">Contact</a></li>
			</ul>
			<script type="text/javascript"
				src="<%=request.getContextPath()%>/assets/js/nav.js"></script>
		</div>
		<!-- end h_menu4 -->
		<div class="clear"></div>
	</div>
</div>
<!-- end menu -->