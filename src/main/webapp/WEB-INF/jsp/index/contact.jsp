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
       <iframe width="100%" height="420" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="http://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=United+Kingdom&amp;aq=0&amp;oq=un&amp;sll=37.0625,-95.677068&amp;sspn=48.956293,107.138672&amp;ie=UTF8&amp;hq=&amp;hnear=United+Kingdom&amp;ll=55.378051,-3.435973&amp;spn=135.795411,68.554687&amp;t=m&amp;z=2&amp;output=embed"> </iframe><br /><small><a href="http://maps.google.com/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=United+Kingdom&amp;aq=0&amp;oq=un&amp;sll=37.0625,-95.677068&amp;sspn=48.956293,107.138672&amp;ie=UTF8&amp;hq=&amp;hnear=United+Kingdom&amp;ll=55.378051,-3.435973&amp;spn=135.795411,68.554687&amp;t=m&amp;z=2" style="color:#666;font-size:12px;text-align:left"> </a></small>
        <div class="about_banner_wrap">
      	   <h1 class="m_11">Contact</h1>
      	</div>
      	<div class="border"> </div>
      	<div class="rwo contact">
      	  <div class="container">
      		 <div class="col-md-8 contact-top">
			  <h3>Send us a message</h3>
			  <p class="contact_msg">Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy</p>
			     <form method="post" action="contact-post.jsp">
					<div class="to">
                     	<input type="text" class="text" value="Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name';}">
					 	<input type="text" class="text" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" style="margin-left:20px">
					 	<input type="text" class="text" value="Subject" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Subject';}" style="margin-left:20px">
					</div>
					<div class="text">
	                   <textarea value="Message:" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Message';}">Message:</textarea>
	                </div>
	                <div class="form-submit1">
			           <input name="submit" type="submit" id="submit" value="Submit Your Message"><br>
			           <p class="m_msg">Make sure you put a valid email</p>
					</div>
					<div class="clear"></div>
                 </form>
             </div>
             <div class="col-md-4 contact-top_right">
			  <h3>contact info</h3>
			  <p>diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis.</p>
			  <ul class="contact_info">
			  	<li><i class="mobile"> </i><span>+1-900-235-2456</span></li>
			  	<li><i class="message"> </i><span class="msg">info(at)gym.com</span></li>
			  </ul>
	 		 </div>
      	  </div>
        </div>
         <div class="trainers_middle_bottom">
		 	<div class="container">
			  <div class="col-md-4">
		       <div class="contact_hours">
				 <ul class="times_contact">
				 	<h3>Opening <span class="opening">Hours</span></h3>
				 	<li><i class="calender"> </i><span class="contact_week">Monday</span><div class="hours1">h.6:00-h.24:00</div>  <div class="clear"></div></li>
				 	<li><i class="calender"> </i><span class="contact_week">Tuesday</span><div class="hours1">h.6:00-h.24:00</div>  <div class="clear"></div></li>
				 	<li><i class="calender"> </i><span class="contact_week">Wednesday</span><div class="hours1">h.6:00-h.24:00</div>  <div class="clear"></div></li>
				 	<li><i class="calender"> </i><span class="contact_week">Thrusday</span><div class="hours1">h.6:00-h.24:00</div>  <div class="clear"></div></li>
				 	<li><i class="calender"> </i><span class="contact_week">Friday</span><div class="hours1">h.6:00-h.24:00</div>  <div class="clear"></div></li>
				 	<li><i class="calender"> </i><span class="contact_week">Saturday</span><div class="hours1">h.6:00-h.24:00</div>  <div class="clear"></div></li>
				 	<li><i class="calender"> </i><span class="contact_week">Sunday</span><div class="hours1">h.6:00-h.24:00</div>  <div class="clear"></div></li>
				    <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod</p>
				 	<h4>Enjoy it!</h4>
				 </ul>
		       </div>
            </div>
           <div class="col-md-4">
     	 <h3 class="m_2">Next Events</h3>
     	 <div class="events">
     	 	<div class="event-top">
	     	 	<ul class="event1">
	     	 		<h4>26 April, 2014</h4>
	     	 		<img src="<%=request.getContextPath()%>/assets/images/pic.jpg" alt="">
	     	 	</ul>
	     	 	<ul class="event1_text">
	     	 		<span class="m_5">h.12.00-h.13.00</span>
	     	 		<h4>Aerobics</h4>
	     	 		<p>Lorem ipsum dolor sit. </p>
	     	 		<div class="btn2">
					   <a href="#">Reservation</a>
					</div>
	     	 	</ul>
     	 		<div class="clear"></div>
     	 	</div>
     	 	<div class="event-bottom">
	     	 	<ul class="event1">
	     	 		<h4>26 April, 2014</h4>
	     	 		<img src="<%=request.getContextPath()%>/assets/images/pic.jpg" alt="">
	     	 	</ul>
	     	 	<ul class="event1_text">
	     	 		<span class="m_5">h.12.00-h.13.00</span>
	     	 		<h4>Spinning</h4>
	     	 		<p>Lorem ipsum dolor sit amet, consectetuer. </p>
	     	 		<div class="btn2">
					    <a href="#">Reservation</a>
					</div>
	     	 	</ul>
     	 		<div class="clear"></div>
     	 	</div>
     	 </div>
     </div>
     <div class="col-md-4">
     	 <h3 class="m_2">From the blog</h3>
     	 <div class="blog_events">
     	 	<ul class="tab-left1">
				<span class="tab1-img"><img src="<%=request.getContextPath()%>/assets/images/pic7.jpg" alt=""></span>
				<div class="tab-text1">
				 <p><a href="#">nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip</a></p>
				 <span class="m_date">25 April, 2014</span>
				</div>
				<div class="clear"></div>
			</ul>
			<ul class="tab-left1">
				<span class="tab1-img"><img src="<%=request.getContextPath()%>/assets/images/pic6.jpg" alt=""></span>
				<div class="tab-text1">
				 <p><a href="#">soluta nobis eleifend option congue nihil imperdiet doming id</a></p>
				 <span class="m_date">25 April, 2014</span>
				</div>
				<div class="clear"></div>
			</ul>
			<ul class="tab-last1">
				<span class="tab1-img"><img src="<%=request.getContextPath()%>/assets/images/pic8.jpg" alt=""></span>
				<div class="tab-text1">
				 <p><a href="#">quod mazim placerat facer possim assum. Typi non habent</a></p>
				 <span class="m_date">25 April, 2014</span>
				</div>
				<div class="clear"></div>
			</ul>
     	 </div>
       </div>
       <div class="clear"></div>
     	<div class="contact_bottom">
     	  <ul class="join_text">
	     	  <h3>Why Join ? <span class="m_26"> eleifend option congue nihil</span></h3>
	     	  <p>lius quod ii legunt saepius. Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum.</p>
	      </ul>
     	  <ul class="btn_contact">
			 <a href="#">Join Today</a>
		  </ul>
		  <div class="clear"></div>
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