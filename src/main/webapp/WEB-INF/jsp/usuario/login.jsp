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
          <div class="login_top">
          	<div class="container">
			  <div class="col-md-6">
				 <div class="login-page">
					<h4 class="title">Novo Cliente?</h4>
					<div class="button1">
					   <a href="<c:url value="/register"/>"><input type="submit" name="Submit" value="Criar conta"></a>
					 </div>
					 <div class="clear"></div>
				  </div>
				</div>
				<div class="col-md-6">
				 <div class="login-page">
				  <div class="login-title">
	           		<h4 class="title">Clientes Registrados</h4>
					<div id="loginbox" class="loginbox">
						<form action="login" method="post" id="login-form">
						  <fieldset class="input">
						    <p id="login-form-username">
						      <label for="modlgn_username">Email</label>
						      <input id="modlgn_username" type="text" name="usuario.email" id = "email"class="inputbox" size="18" autocomplete="off">
						    </p>
						    <p id="login-form-password">
						      <label for="modlgn_passwd">Password</label>
						      <input id="modlgn_passwd" type="password" id = "password" name="usuario.senha" class="inputbox" size="18">
						    </p>
						    <div class="remember">
<!-- 							    <p id="login-form-remember"> -->
<!-- 							      <label for="modlgn_remember"><a href="#">Forget Your Password ? </a></label> -->
<!-- 							   </p> -->
							    <input type="submit" name="Submit" class="button" value="Login"><div class="clear"></div>
							 </div>
						  </fieldset>
						 </form>
					</div>
			      </div>
				</div>
				<div class="clear"></div>
			  </div>
			</div>
		  </div>
         </div>
<!-- fim -->
<jsp:include page="../included/footer.jsp"></jsp:include>
</body>
</html>