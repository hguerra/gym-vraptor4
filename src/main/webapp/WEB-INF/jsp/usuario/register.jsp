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
          <div class="register-grids">
          	<div class="container">
						<form> 
								<div class="register-top-grid">
										<h3>INFORMAÇAO PESSOAL</h3>
										<div>
											<span>Nome<label>*</label></span>
											<input type="text"> 
										</div>
										<div>
											<span>Sobrenome<label>*</label></span>
											<input type="text"> 
										</div>
										<div>
											<span>Email<label>*</label></span>
											<input type="text"> 
										</div>
										<div class="clear"> </div>
											<a class="news-letter" href="#">
												<label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i> </i>Sign Up for Newsletter</label>
											</a>
										<div class="clear"> </div>
								</div>
								<div class="clear"> </div>
								<div class="register-bottom-grid">
										<h3>INFORMAÇÃO DE LOGIN</h3>
										<div>
											<span>Password<label>*</label></span>
											<input type="text">
										</div>
										<div>
											<span>Confirmar Password<label>*</label></span>
											<input type="text">
										</div>
										<div class="clear"> </div>
								</div>
								<div class="clear"> </div>
								<input type="submit" value="submit">
						</form>
					</div>
				</div>
         </div>
<!-- fim -->
<jsp:include page="../included/footer.jsp"></jsp:include>
</body>
</html>