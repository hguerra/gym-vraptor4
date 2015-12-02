<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<title>Gym</title>

<link href="<%=request.getContextPath()%>/assets/css/bootstrap.css"
	rel='stylesheet' type='text/css' />
<link href="<%=request.getContextPath()%>/assets/css/jquery-ui.css"
	rel='stylesheet' type='text/css' />
<link href="<%=request.getContextPath()%>/assets/css/style.css"
	rel='stylesheet' type='text/css' />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800'
	rel='stylesheet' type='text/css'>
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700'
	rel='stylesheet' type='text/css'>
<script type="application/x-javascript">
	
	
	
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 





</script>
<script src="<%=request.getContextPath()%>/assets/js/jquery.min.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event) {
			event.preventDefault();
			$('html,body').animate({
				scrollTop : $(this.hash).offset().top
			}, 1200);
		});
	});
</script>
<!-- grid-slider -->
<script type="text/javascript"
	src="<%=request.getContextPath()%>/assets/js/jquery.mousewheel.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/assets/js/jquery.contentcarousel.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/assets/js/jquery.easing.1.3.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/assets/js/jquery-ui.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/assets/js/jquery.validate.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/assets/proj-js/validate.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/assets/proj-js/model.js"></script>