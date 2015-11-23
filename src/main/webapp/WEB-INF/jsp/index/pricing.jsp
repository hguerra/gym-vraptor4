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
       <div class="about_banner_img"><img src="<%=request.getContextPath()%>/assets/images/price.jpg" class="img-responsive" alt=""/></div>
		 <div class="about_banner_wrap">
      	    <h1 class="m_11">Pricing</h1>
      	 </div>
      	<div class="border"> </div>
      	  <div class="container">
      		<div class="row price_plans">
		 		<h3 class="m_2">Pricing and plans</h3>
		 		<div class="price_plans_box">
		 	 <div class="col-md-3">
		 		<ul class="price1">
		 			<h4>One day training</h4>
		 			<h3>Free</h3>
		 			<ul class="price_list">
						<p><img src="<%=request.getContextPath()%>/assets/images/tick.png" alt="" align="middle" width="16" height="14"/><a href="#">soluta nobis eleifend</a></p>
						<p><img src="<%=request.getContextPath()%>/assets/images/tick.png" alt="" align="middle" width="16" height="14"/><a href="#">soluta nobis eleifend</a></p>
						<p><img src="<%=request.getContextPath()%>/assets/images/tick.png" alt="" align="middle" width="16" height="14"/><a href="#">soluta nobis eleifend</a></p>
						<p><img src="<%=request.getContextPath()%>/assets/images/tick.png" alt="" align="middle" width="16" height="14"/><a href="#">soluta nobis eleifend</a></p>
						<p><img src="<%=request.getContextPath()%>/assets/images/tick.png" alt="" align="middle" width="16" height="14"/><a href="#">soluta nobis eleifend</a></p>
						<a class="popup-with-zoom-anim" href="#small-dialog"><li class="price_but">Buy Now</li></a>
						<!-----pop-up-grid---->
								 <div id="small-dialog" class="mfp-hide">
									<div class="pop_up">
									 	<div class="payment-online-form-left">
											<form>
												<h4><span class="shipping"> </span>Shipping</h4>
												<ul>
													<li><input class="text-box-dark" type="text" value="Frist Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Frist Name';}"></li>
													<li><input class="text-box-dark" type="text" value="Last Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Last Name';}"></li>
												</ul>
												<ul>
													<li><input class="text-box-dark" type="text" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}"></li>
													<li><input class="text-box-dark" type="text" value="Company Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Company Name';}"></li>
												</ul>
												<ul>
													<li><input class="text-box-dark" type="text" value="Phone" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Phone';}"></li>
													<li><input class="text-box-dark" type="text" value="Address" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Address';}"></li>
													<div class="clear"> </div>
												</ul>
												<div class="clear"> </div>
											<ul class="payment-type">
												<h4><span class="payment"> </span> Payments</h4>
												<li>
													<span class="col_checkbox">
													<input id="3" class="css-checkbox1" type="checkbox">
													<label for="3" name="demo_lbl_1" class="css-label1"> </label>
													<a class="visa" href="#"> </a>
													</span>
												</li>
												<li>
													<span class="col_checkbox">
														<input id="4" class="css-checkbox2" type="checkbox">
														<label for="4" name="demo_lbl_2" class="css-label2"> </label>
														<a class="paypal" href="#"> </a>
													</span>
												</li>
												<div class="clear"> </div>
											</ul>
												<ul>
													<li><input class="text-box-dark" type="text" value="Card Number" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Card Number';}"></li>
													<li><input class="text-box-dark" type="text" value="Name on card" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name on card';}"></li>
													<div class="clear"> </div>
												</ul>
												<ul>
													<li><input class="text-box-light hasDatepicker" type="text" id="datepicker" value="Expiration Date" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Expiration Date';}"><em class="pay-date"> </em></li>
													<li><input class="text-box-dark" type="text" value="Security Code" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Security Code';}"></li>
													<div class="clear"> </div>
												</ul>
												<ul class="payment-sendbtns">
													<li><input type="reset" value="Cancel"></li>
													<li><input type="submit" value="Process order"></li>
												</ul>
												<div class="clear"> </div>
											</form>
										</div>
						  			</div>
								</div>
								<!-----pop-up-grid---->
						<div class="clear"></div>
					</ul>
		 		</ul>
		 	 </div>
		 	 <div class="col-md-3">
		 		<ul class="price1">
		 			<h4>6 months membership</h4>
		 			<h2 class="m_25">$33<small>.33</small></h2>
		 			<ul class="price_list">
						<p><img src="<%=request.getContextPath()%>/assets/images/tick.png" alt="" align="middle" width="16" height="14"/><a href="#">soluta nobis eleifend</a></p>
						<p><img src="<%=request.getContextPath()%>/assets/images/tick.png" alt="" align="middle" width="16" height="14"/><a href="#">soluta nobis eleifend</a></p>
						<p><img src="<%=request.getContextPath()%>/assets/images/tick.png" alt="" align="middle" width="16" height="14"/><a href="#">soluta nobis eleifend</a></p>
						<p><img src="<%=request.getContextPath()%>/assets/images/tick.png" alt="" align="middle" width="16" height="14"/><a href="#">soluta nobis eleifend</a></p>
						<p><img src="<%=request.getContextPath()%>/assets/images/tick.png" alt="" align="middle" width="16" height="14"/><a href="#">soluta nobis eleifend</a></p>
						<a class="popup-with-zoom-anim" href="#small-dialog"><li class="price_but">Buy Now</li></a>
						<div class="clear"></div>
					</ul>
		 		</ul>
		 	 </div>
		 	 <div class="col-md-3">
		 		<ul class="price2">
		 			<h4>3 months membership</h4>
		 			<h2 class="m_26">$59<small>.00</small></h2>
		 			<ul class="price_list1">
						<p><img src="<%=request.getContextPath()%>/assets/images/tick1.png" alt="" align="middle" width="16" height="14"/><a href="#">soluta nobis eleifend</a></p>
						<p><img src="<%=request.getContextPath()%>/assets/images/tick1.png" alt="" align="middle" width="16" height="14"/><a href="#">soluta nobis eleifend</a></p>
						<p><img src="<%=request.getContextPath()%>/assets/images/tick1.png" alt="" align="middle" width="16" height="14"/><a href="#">soluta nobis eleifend</a></p>
						<p><img src="<%=request.getContextPath()%>/assets/images/tick1.png" alt="" align="middle" width="16" height="14"/><a href="#">soluta nobis eleifend</a></p>
						<p><img src="<%=request.getContextPath()%>/assets/images/tick1.png" alt="" align="middle" width="16" height="14"/><a href="#">soluta nobis eleifend</a></p>
						<a class="popup-with-zoom-anim" href="#small-dialog"><li class="price_but1">Buy Now</li></a>
						<div class="clear"></div>
					</ul>
		 		</ul>
		 	</div>
		 	<div class="col-md-3">
		 		<ul class="price1">
		 			<h4>12 months membership</h4>
		 			<h2 class="m_25">$120<small>.00</small></h2>
		 			<ul class="price_list">
						<p><img src="<%=request.getContextPath()%>/assets/images/tick.png" alt="" align="middle" width="16" height="14"/><a href="#">soluta nobis eleifend</a></p>
						<p><img src="<%=request.getContextPath()%>/assets/images/tick.png" alt="" align="middle" width="16" height="14"/><a href="#">soluta nobis eleifend</a></p>
						<p><img src="<%=request.getContextPath()%>/assets/images/tick.png" alt="" align="middle" width="16" height="14"/><a href="#">soluta nobis eleifend</a></p>
						<p><img src="<%=request.getContextPath()%>/assets/images/tick.png" alt="" align="middle" width="16" height="14"/><a href="#">soluta nobis eleifend</a></p>
						<p><img src="<%=request.getContextPath()%>/assets/images/tick.png" alt="" align="middle" width="16" height="14"/><a href="#">soluta nobis eleifend</a></p>
						<a class="popup-with-zoom-anim" href="#small-dialog"><li class="price_but">Buy Now</li></a>
						<div class="clear"></div>
					</ul>
		 		</ul>
		 	 </div>
     		<div class="clear"></div>
     	    </div>
     	  </div>
      	</div>
      	<ul class="price_question">
		   <div class="container">
		 	 <li class="question_left"><h4>Have a question</h4><p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt.</p></li>
		 	  <li class="question_right">1-300-248-2456</li>
		 	 <div class="clear"></div>
		   </div>
	    </ul>
	    <div class="container">
	    	<div class="row pricing">
		      <div class="col-md-8">
		     	 <h3 class="m_2">All Classes</h3>
		     	 <div class="classes">
		     	 	<div class="cardio_list">
		     	 	  <div class="cardio_sublist">
			     	 	<ul class="cardio">
			     	 		<li><i class="clock"> </i><span>Cardio Fitness</span></li>
			     	 	</ul>
			     	 	<div class="social-media">
						     <ul>
						        <li> <span class="simptip-position-bottom simptip-movable" data-tooltip="timetable"><a href="#" target="_blank"> </a></span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="Send to"><a href="#" target="_blank"> </a> </span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="like it"><a href="#" target="_blank"> </a></span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="share"><a href="#" target="_blank"> </a></span></li>
						    </ul>
					   </div>
			     	 	<div class="clear"></div>
		     	 	  </div>
		     	 	  <div class="cardio_sublist">
			     	 	<ul class="cardio">
			     	 		<li><i class="clock"> </i><span>Spinning</span></li>
			     	 	</ul>
			     	 	<div class="social-media">
						     <ul>
						        <li> <span class="simptip-position-bottom simptip-movable" data-tooltip="timetable"><a href="#" target="_blank"> </a></span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="Send to"><a href="#" target="_blank"> </a> </span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="like it"><a href="#" target="_blank"> </a></span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="share"><a href="#" target="_blank"> </a></span></li>
						    </ul>
					   </div>
			     	 	<div class="clear"></div>
		     	 	  </div>
		     	 	  <div class="clear"></div>
		     	 	  <div class="cardio_sublist">
			     	 	<ul class="cardio">
			     	 		<li><i class="clock"> </i><span>Pilates</span></li>
			     	 	</ul>
			     	 	<div class="social-media">
						     <ul>
						        <li> <span class="simptip-position-bottom simptip-movable" data-tooltip="timetable"><a href="#" target="_blank"> </a></span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="Send to"><a href="#" target="_blank"> </a> </span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="like it"><a href="#" target="_blank"> </a></span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="share"><a href="#" target="_blank"> </a></span></li>
						    </ul>
					   </div>
			     	 	<div class="clear"></div>
		     	 	  </div>
		     	 	   <div class="cardio_sublist">
			     	 	<ul class="cardio">
			     	 		<li><i class="clock"> </i><span>Boxing</span></li>
			     	 	</ul>
			     	 	<div class="social-media">
						     <ul>
						        <li> <span class="simptip-position-bottom simptip-movable" data-tooltip="timetable"><a href="#" target="_blank"> </a></span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="Send to"><a href="#" target="_blank"> </a> </span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="like it"><a href="#" target="_blank"> </a></span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="share"><a href="#" target="_blank"> </a></span></li>
						    </ul>
					   </div>
			     	 	<div class="clear"></div>
		     	 	  </div>
		     	 	  <div class="clear"></div>
		     	 	</div>
		     	 	<div class="cardio_list1">
		     	 	  <div class="cardio_sublist">
			     	 	<ul class="cardio">
			     	 		<li><i class="clock"> </i><span>Aerobics</span></li>
			     	 	</ul>
			     	 	<div class="social-media">
						     <ul>
						        <li> <span class="simptip-position-bottom simptip-movable" data-tooltip="timetable"><a href="#" target="_blank"> </a></span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="Send to"><a href="#" target="_blank"> </a> </span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="like it"><a href="#" target="_blank"> </a></span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="share"><a href="#" target="_blank"> </a></span></li>
						    </ul>
					   </div>
			     	 	<div class="clear"></div>
		     	 	  </div>
		     	 	  <div class="cardio_sublist">
			     	 	<ul class="cardio">
			     	 		<li><i class="clock"> </i><span>Kik Boxing</span></li>
			     	 	</ul>
			     	 	<div class="social-media">
						     <ul>
						        <li> <span class="simptip-position-bottom simptip-movable" data-tooltip="timetable"><a href="#" target="_blank"> </a></span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="Send to"><a href="#" target="_blank"> </a> </span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="like it"><a href="#" target="_blank"> </a></span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="share"><a href="#" target="_blank"> </a></span></li>
						    </ul>
					   </div>
			     	 	<div class="clear"></div>
		     	 	  </div>
		     	 	  <div class="cardio_sublist">
			     	 	<ul class="cardio">
			     	 		<li><i class="clock"> </i><span>CrossFit</span></li>
			     	 	</ul>
			     	 	<div class="social-media">
						     <ul>
						        <li> <span class="simptip-position-bottom simptip-movable" data-tooltip="timetable"><a href="#" target="_blank"> </a></span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="Send to"><a href="#" target="_blank"> </a> </span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="like it"><a href="#" target="_blank"> </a></span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="share"><a href="#" target="_blank"> </a></span></li>
						    </ul>
					   </div>
			     	 	<div class="clear"></div>
		     	 	  </div>
		     	 	   <div class="cardio_sublist">
			     	 	<ul class="cardio">
			     	 		<li><i class="clock"> </i><span>Yoga</span></li>
			     	 	</ul>
			     	 	<div class="social-media">
						     <ul>
						        <li> <span class="simptip-position-bottom simptip-movable" data-tooltip="timetable"><a href="#" target="_blank"> </a></span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="Send to"><a href="#" target="_blank"> </a> </span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="like it"><a href="#" target="_blank"> </a></span></li>
						        <li><span class="simptip-position-bottom simptip-movable" data-tooltip="share"><a href="#" target="_blank"> </a></span></li>
						    </ul>
					   </div>
			     	 	<div class="clear"></div>
		     	 	  </div>
		     	 	</div>
		     	 	<div class="clear"></div>
		     	 </div>
				</div>
				<div class="col-md-4">
				  <h3 class="m_4">Membership Prices</h3>
				  <div class="members">
				   <h4 class="m_3">25% Discount of for all members</h4>
				   <p>Discount on services and <br>treatments at the GymBase for<br> all membership cards holders.</p>
				   <div class="btn1">
				    <a href="#">More</a>
			       </div>
				  </div>
			    </div>
			    <div class="clear"></div>
			</div>
	    </div>
	    <div class="about_gallery">
		 	<div class="container">
		 	  <div class="col-md-8">
		     	 <h3 class="m_2">Gallery</h3>
		     	 <div id="ca-container" class="ca-container">
				    <div class="ca-wrapper">
				         <div class="ca-item ca-item-1">
						   <div class="ca-item-main">
								<div class="ca-icon"> </div>
								<div class="ca-icon1"> </div>
							</div>
						  </div>
						<div class="ca-item ca-item-2">
							<div class="ca-item-main">
								<div class="ca-icon"> </div>
								<div class="ca-icon2"> </div>
							</div>
						</div>
						<div class="ca-item ca-item-3">
							<div class="ca-item-main">
								<div class="ca-icon"> </div>
								<div class="ca-icon3"> </div>
							</div>
						</div>
						<div class="ca-item ca-item-4">
							<div class="ca-item-main">
								<div class="ca-icon"> </div>
								<div class="ca-icon4"> </div>
						     </div>
						</div>
						<div class="ca-item ca-item-5">
							<div class="ca-item-main">
								<div class="ca-icon"> </div>
								<div class="ca-icon5"> </div>
							</div>
						</div>
						<div class="ca-item ca-item-6">
							<div class="ca-item-main">
								<div class="ca-icon"> </div>
								<div class="ca-icon6"> </div>
							</div>
						</div>
						<div class="ca-item ca-item-7">
							<div class="ca-item-main">
								<div class="ca-icon"> </div>
								<div class="ca-icon7"> </div>
							</div>
						</div>
						<div class="ca-item ca-item-8">
							<div class="ca-item-main">
								<div class="ca-icon"> </div>
								<div class="ca-icon"> </div>
							</div>
						</div>
			    </div>
			 </div>
				    <script type="text/javascript">
						$('#ca-container').contentcarousel();
					</script>
		   </div>
		   <div class="col-md-4">
		   	 <h3 class="m_2">Partner</h3>
			  <ul class="partner">
			  	<li><img src="<%=request.getContextPath()%>/assets/images/p6.png" alt=""/></li>
			  	<li><img src="<%=request.getContextPath()%>/assets/images/p5.png" alt=""/></li>
			  	<li><img src="<%=request.getContextPath()%>/assets/images/p4.png" alt=""/></li>
			  	<li><img src="<%=request.getContextPath()%>/assets/images/p3.png" alt=""/></li>
			  	<li><img src="<%=request.getContextPath()%>/assets/images/p2.png" alt=""/></li>
			  	<li><img src="<%=request.getContextPath()%>/assets/images/p1.png" alt=""/></li>
			  	 <div class="clear"></div>
			  </ul>
		    </div>
	       <div class="clear"></div>
	       </div>
		  </div>
         </div>
         <div class="footer-top">
		 	<ul class="twitter_footer">
		 	 <li>
		 	   <i class="twt_icon"> </i><p>aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel  <span class="m_6">2 days ago</span></p>
		 	   <div class="clear"></div>
		 	 </li>
		 	</ul>
		 </div>
<!-- fim -->
<jsp:include page="../included/footer.jsp"></jsp:include>
</body>
</html>