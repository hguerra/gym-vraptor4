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
			<img src="<%=request.getContextPath()%>/assets/images/trine_img.jpg"
				class="img-responsive" alt="">
		</div>
		<div class="about_banner_wrap">
			<h1 class="m_11">Timetable</h1>
		</div>
		<div class="border"></div>
		<div class="container">
			<div class="sap_tabs">
				<div id="horizontalTab"
					style="display: block; width: 100%; margin: 0px;">
					<ul class="resp-tabs-list">
						<li class="resp-tab-item" aria-controls="tab_item-0" role="tab"><span>COMPLETO
								</span></li>
						<li class="resp-tab-item" aria-controls="tab_item-1" role="tab"><span>MUSCULAÇÃO
								</span></li>
						<li class="resp-tab-item" aria-controls="tab_item-2" role="tab"><span>BOXING</span></li>
						<div class="clear"></div>
					</ul>
					<div class="resp-tabs-container">
						<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
							<div class="facts">
								<ul class="tab-left">
									<table class="timetable">
										<thead>
											<tr>
												<th></th>
												<th>SEGUNDA</th>
												<th>TERÇA</th>
												<th>QUARTA</th>
												<th>QUINTA</th>
												<th>SEXTA</th>
												<th>SABADO</th>
												<th>DOMINGO</th>
											</tr>
										</thead>
										<tbody>
											<tr class="row_1 row_gray">
												<td>05.00 - 06.00</td>
												<td class="event"><a href="#" title="Boxing">Boxing</a>05.00
													- 06.00</td>
												<td class="event"><a href="#" title="Boxing">Boxing</a>05.00
													- 06.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_2">
												<td>06.00 - 07.00</td>
												<td class="event"><a href="#" title="Gym Fitness">Gym
														Fitness</a>06.00 - 07.00</td>
												<td class="event"><a href="#" title="Gym Fitness">Gym
														Fitness</a>06.00 - 07.00</td>
												<td class="event" rowspan="3"><a href="#">Gym
														Fitness</a>06.00 - 08.30<br> <br> <a href="#"
													title="Cardio Fitness">Cardio Fitness</a>06.00 - 08.30</td>
												<td class="event" rowspan="3"><a href="#"
													title="Gym Fitness">Gym Fitness</a>06.00 - 08.30<br> <br>
													<a href="#" title="Cardio Fitness">Cardio Fitness</a>06.00
													- 08.30</td>
												<td class="event" rowspan="3"><a href="#"
													title="Gym Fitness">Gym Fitness</a>06.00 - 08.30<br> <br>
													<a href="#" title="Cardio Fitness">Cardio Fitness</a>06.00
													- 08.30</td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_3 row_gray">
												<td>07.00 - 08.00</td>
												<td class="event"><a href="#" title="Cardio Fitness">Cardio
														Fitness</a>07.00 - 08.00</td>
												<td class="event"><a href="#" title="Cardio Fitness">Cardio
														Fitness</a>07.00 - 08.00</td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_4">
												<td>08.00 - 09.00</td>
												<td></td>
												<td></td>
												<td class="event" rowspan="2"><a href="#"
													title="Indoor Cycling">Indoor Cycling</a>08.00 - 09.30</td>
												<td class="event" rowspan="2"><a href="#"
													title="Indoor Cycling">Indoor Cycling</a>08.00 - 09.30</td>
											</tr>
											<tr class="row_5 row_gray">
												<td>09.00 - 10.00</td>
												<td class="event" rowspan="3"><a href="#"
													title="Indoor Cycling">Indoor Cycling</a>09.00 - 11.25</td>
												<td class="event" rowspan="3"><a href="#"
													title="Indoor Cycling">Indoor Cycling</a>09.00 - 11.25</td>
												<td></td>
												<td class="event"><a href="#" title="Indoor Cycling">Indoor
														Cycling</a>09.00 - 10.00</td>
												<td class="event"><a href="#" title="Indoor Cycling">Indoor
														Cycling</a>09.00 - 10.00</td>
											</tr>
											<tr class="row_6">
												<td>10.00 - 11.00</td>
												<td></td>
												<td class="event" rowspan="2"><a href="#"
													title="Cardio Fitness">Cardio Fitness</a>10.00 - 11.30</td>
												<td class="event" rowspan="2"><a href="#"
													title="Cardio Fitness">Cardio Fitness</a>10.00 - 11.30</td>
												<td class="event"><a href="#" title="Gym Fitness">Gym
														Fitness</a>10.00 - 11.00</td>
												<td class="event"><a href="#" title="Gym Fitness">Gym
														Fitness</a>10.00 - 11.00</td>
											</tr>
											<tr class="row_7 row_gray">
												<td>11.00 - 12.00</td>
												<td></td>
												<td class="event"><a href="#" title="Indoor Cycling">Indoor
														Cycling</a>11.00 - 12.00</td>
												<td class="event"><a href="#" title="Indoor Cycling">Indoor
														Cycling</a>11.00 - 12.00</td>
											</tr>
											<tr class="row_8">
												<td>12.00 - 13.00</td>
												<td></td>
												<td></td>
												<td class="event"><a href="#" title="Gym Fitness">Gym
														Fitness</a>12.00 - 13.00</td>
												<td class="event"><a href="#" title="Gym Fitness">Gym
														Fitness</a>12.00 - 13.00</td>
												<td class="event" rowspan="4"><a href="#"
													title="Boxing">Boxing</a>12.00 - 15.45</td>
												<td class="event" rowspan="4"><a href="#"
													title="Gym Fitness">Gym Fitness</a>12.00 - 13.00<br> <br>
													<a href="#" title="Boxing">Boxing</a>12.00 - 15.45<br>
													<br> <a href="#" title="Cardio Fitness">Cardio
														Fitness</a>14.00 - 16.00</td>
												<td class="event"><a href="#" title="Gym Fitness">Gym
														Fitness</a>12.00 - 13.00</td>
											</tr>
											<tr class="row_9 row_gray">
												<td>13.00 - 14.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_10">
												<td>14.00 - 15.00</td>
												<td class="event" rowspan="4"><a href="#"
													title="Gym Fitness">Gym Fitness</a>14.00 - 16.15<br> <br>
													<a href="#" title="Indoor Cycling">Indoor Cycling</a>16.00
													- 17.30</td>
												<td class="event" rowspan="4"><a href="#"
													title="Gym Fitness">Gym Fitness</a>14.00 - 16.15<br> <br>
													<a href="#" title="Indoor Cycling">Indoor Cycling</a>16.00
													- 17.30</td>
												<td></td>
												<td></td>
												<td class="event" rowspan="2"><a href="#"
													title="Cardio Fitness">Cardio Fitness</a>14.00 - 16.00</td>
											</tr>
											<tr class="row_11 row_gray">
												<td>15.00 - 16.00</td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_12">
												<td>16.00 - 17.00</td>
												<td></td>
												<td class="event" rowspan="2"><a href="#"
													title="Indoor Cycling">Indoor Cycling</a>16.00 - 17.30</td>
												<td class="event" rowspan="4"><a href="#"
													title="Indoor Cycling">Indoor Cycling</a>16.00 - 17.30<br>
													<br> <a href="#" title="Gym Fitness">Gym Fitness</a>17.30
													- 20.00<br> <br> <a href="#" title="Boxing">Boxing</a>18.00
													- 20.00</td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_13 row_gray">
												<td>17.00 - 18.00</td>
												<td></td>
												<td class="event"><a href="#" title="Gym Fitness">Gym
														Fitness</a>17.00 - 18.00</td>
												<td class="event"><a href="#" title="Gym Fitness">Gym
														Fitness</a>17.00 - 18.00</td>
											</tr>
											<tr class="row_14">
												<td>18.00 - 19.00</td>
												<td class="event" rowspan="2"><a href="#"
													title="Boxing">Boxing</a>18.00 - 19.00<br> <br> <a
													href="#" title="Yoga Pilates">Yoga Pilates</a>18.30 - 20.00</td>
												<td class="event" rowspan="2"><a href="#"
													title="Boxing">Boxing</a>18.00 - 19.00<br> <br> <a
													href="#" title="Yoga Pilates">Yoga Pilates</a>18.30 - 20.00</td>
												<td class="event" rowspan="2"><a href="#"
													title="Boxing">Boxing</a>18.00 - 20.00<br> <br> <a
													href="#" title="Yoga Pilates">Yoga Pilates</a>18.30 - 20.00</td>
												<td class="event" rowspan="2"><a href="#"
													title="Boxing">Boxing</a>18.00 - 20.00<br> <br> <a
													href="#" title="Yoga Pilates">Yoga Pilates</a>18.30 - 20.00</td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_15 row_gray">
												<td>19.00 - 20.00</td>
												<td class="event" rowspan="2"><a href="#"
													title="Yoga Pilates">Yoga Pilates</a>19.00 - 20.30</td>
												<td class="event" rowspan="2"><a href="#"
													title="Yoga Pilates">Yoga Pilates</a>19.00 - 20.30</td>
											</tr>
											<tr class="row_16">
												<td>20.00 - 21.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
										</tbody>
									</table>
									<div class="timetable_small">
										<ul class="items_list">
											<h3>Monday</h3>
											<li><p>
													<a href>Gym Fitness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cardio Fittness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Boxing</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga Pilates</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cycling</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
										</ul>
										<ul class="items_list">
											<h3>Tuesday</h3>
											<li><p>
													<a href>Gym Fitness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cardio Fittness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Boxing</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga Pilates</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cycling</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
										</ul>
										<ul class="items_list">
											<h3>Wednesday</h3>
											<li><p>
													<a href>Gym Fitness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cardio Fittness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Boxing</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga Pilates</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cycling</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
										</ul>
										<ul class="items_list">
											<h3>Thrusday</h3>
											<li><p>
													<a href>Gym Fitness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cardio Fittness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Boxing</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga Pilates</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cycling</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
										</ul>
										<ul class="items_list">
											<h3>Friday</h3>
											<li><p>
													<a href>Gym Fitness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cardio Fittness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Boxing</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga Pilates</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cycling</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
										</ul>
										<ul class="items_list">
											<h3>Saturday</h3>
											<li><p>
													<a href>Gym Fitness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cardio Fittness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Boxing</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga Pilates</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cycling</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
										</ul>
										<ul class="items_list">
											<h3>Sunday</h3>
											<li><p>
													<a href>Gym Fitness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cardio Fittness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Boxing</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga Pilates</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cycling</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
										</ul>
									</div>
								</ul>
							</div>
						</div>
						<div class="tab-2 resp-tab-content" aria-labelledby="tab_item-1">
							<div class="facts">
								<ul class="tab-left">
									<table class="timetable">
										<thead>
											<tr>
												<th></th>
												<th>SEGUNDA</th>
												<th>TERÇA</th>
												<th>QUARTA</th>
												<th>QUINTA</th>
												<th>SEXTA</th>
												<th>SABADO</th>
												<th>DOMINGO</th>
											</tr>
										</thead>
										<tbody>
											<tr class="row_1 row_gray">
												<td>06.00 - 07.00</td>
												<td class="event"><a href="#" title="Gym Fitness">Gym
														Fitness</a>06.00 - 07.00</td>
												<td class="event"><a href="#" title="Gym Fitness">Gym
														Fitness</a>06.00 - 07.00</td>
												<td class="event" rowspan="3"><a href="#"
													title="Gym Fitness">Gym Fitness</a>06.00 - 08.30</td>
												<td class="event" rowspan="3"><a href="#"
													title="Gym Fitness">Gym Fitness</a>06.00 - 08.30</td>
												<td class="event" rowspan="3"><a href="#"
													title="Gym Fitness">Gym Fitness</a>06.00 - 08.30</td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_2">
												<td>07.00 - 08.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_3 row_gray">
												<td>08.00 - 09.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_4">
												<td>09.00 - 10.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_5 row_gray">
												<td>10.00 - 11.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td class="event"><a href="#" title="Gym Fitness">Gym
														Fitness</a>10.00 - 11.00</td>
												<td class="event"><a href="#" title="Gym Fitness">Gym
														Fitness</a>10.00 - 11.00</td>
											</tr>
											<tr class="row_6">
												<td>11.00 - 12.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_7 row_gray">
												<td>12.00 - 13.00</td>
												<td></td>
												<td></td>
												<td class="event"><a href="#" title="Gym Fitness">Gym
														Fitness</a>12.00 - 13.00</td>
												<td class="event"><a href="#" title="Gym Fitness">Gym
														Fitness</a>12.00 - 13.00</td>
												<td></td>
												<td class="event"><a href="#" title="Gym Fitness">Gym
														Fitness</a>12.00 - 13.00</td>
												<td class="event"><a href="#" title="Gym Fitness">Gym
														Fitness</a>12.00 - 13.00</td>
											</tr>
											<tr class="row_8">
												<td>13.00 - 14.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_9 row_gray">
												<td>14.00 - 15.00</td>
												<td class="event" rowspan="3"><a href="#"
													title="Gym Fitness">Gym Fitness</a>14.00 - 16.15</td>
												<td class="event" rowspan="3"><a href="#"
													title="Gym Fitness">Gym Fitness</a>14.00 - 16.15</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_10">
												<td>15.00 - 16.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_11 row_gray">
												<td>16.00 - 17.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_12">
												<td>17.00 - 18.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td class="event" rowspan="3"><a href="#"
													title="Gym Fitness">Gym Fitness</a>17.30 - 20.00</td>
												<td class="event"><a href="#" title="Gym Fitness">Gym
														Fitness</a>17.00 - 18.00</td>
												<td class="event"><a href="#" title="Gym Fitness">Gym
														Fitness</a>17.00 - 18.00</td>
											</tr>
											<tr class="row_13 row_gray">
												<td>18.00 - 19.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_14">
												<td>19.00 - 20.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
										</tbody>
									</table>
									<div class="timetable_small">
										<ul class="items_list">
											<h3>Monday</h3>
											<li><p>
													<a href>Gym Fitness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cardio Fittness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Boxing</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga Pilates</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cycling</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
										</ul>
										<ul class="items_list">
											<h3>Tuesday</h3>
											<li><p>
													<a href>Gym Fitness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cardio Fittness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Boxing</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga Pilates</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cycling</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
										</ul>
										<ul class="items_list">
											<h3>Wednesday</h3>
											<li><p>
													<a href>Gym Fitness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cardio Fittness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Boxing</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga Pilates</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cycling</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
										</ul>
										<ul class="items_list">
											<h3>Thrusday</h3>
											<li><p>
													<a href>Gym Fitness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cardio Fittness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Boxing</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga Pilates</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cycling</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
										</ul>
										<ul class="items_list">
											<h3>Friday</h3>
											<li><p>
													<a href>Gym Fitness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cardio Fittness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Boxing</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga Pilates</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cycling</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
										</ul>
										<ul class="items_list">
											<h3>Saturday</h3>
											<li><p>
													<a href>Gym Fitness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cardio Fittness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Boxing</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga Pilates</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cycling</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
										</ul>
										<ul class="items_list">
											<h3>Sunday</h3>
											<li><p>
													<a href>Gym Fitness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cardio Fittness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Boxing</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga Pilates</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cycling</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
										</ul>
									</div>
								</ul>
							</div>
						</div>
						<div class="tab-3 resp-tab-content" aria-labelledby="tab_item-2">
							<div class="facts">
								<ul class="tab-left">
									<table class="timetable">
										<thead>
											<tr>
												<th></th>
												<th>SEGUNDA</th>
												<th>TERÇA</th>
												<th>QUARTA</th>
												<th>QUINTA</th>
												<th>SEXTA</th>
												<th>SABADO</th>
												<th>DOMINGO</th>
											</tr>
										</thead>
										<tbody>
											<tr class="row_1 row_gray">
												<td>05.00 - 06.00</td>
												<td class="event"><a href="#" title="Boxing">Boxing</a>05.00
													- 06.00</td>
												<td class="event"><a href="#" title="Boxing">Boxing</a>05.00
													- 06.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_2">
												<td>06.00 - 07.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_3 row_gray">
												<td>07.00 - 08.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_4">
												<td>08.00 - 09.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_5 row_gray">
												<td>09.00 - 10.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_6">
												<td>10.00 - 11.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_7 row_gray">
												<td>11.00 - 12.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_8">
												<td>12.00 - 13.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td class="event" rowspan="4"><a href="#"
													title="Boxing">Boxing</a>12.00 - 15.45</td>
												<td class="event" rowspan="4"><a href="#"
													title="Boxing">Boxing</a>12.00 - 15.45</td>
												<td></td>
											</tr>
											<tr class="row_9 row_gray">
												<td>13.00 - 14.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_10">
												<td>14.00 - 15.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_11 row_gray">
												<td>15.00 - 16.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_12">
												<td>16.00 - 17.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_13 row_gray">
												<td>17.00 - 18.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_14">
												<td>18.00 - 19.00</td>
												<td class="event"><a href="#" title="Boxing">Boxing</a>18.00
													- 19.00</td>
												<td class="event"><a href="#" title="Boxing">Boxing</a>18.00
													- 19.00</td>
												<td class="event" rowspan="2"><a href="#"
													title="Boxing">Boxing</a>18.00 - 20.00</td>
												<td class="event" rowspan="2"><a href="#"
													title="Boxing">Boxing</a>18.00 - 20.00</td>
												<td class="event" rowspan="2"><a href="#"
													title="Boxing">Boxing</a>18.00 - 20.00</td>
												<td></td>
												<td></td>
											</tr>
											<tr class="row_15 row_gray">
												<td>19.00 - 20.00</td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
										</tbody>
									</table>
									<div class="timetable_small">
										<ul class="items_list">
											<h3>Monday</h3>
											<li><p>
													<a href>Gym Fitness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cardio Fittness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Boxing</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga Pilates</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cycling</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
										</ul>
										<ul class="items_list">
											<h3>Tuesday</h3>
											<li><p>
													<a href>Gym Fitness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cardio Fittness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Boxing</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga Pilates</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cycling</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
										</ul>
										<ul class="items_list">
											<h3>Wednesday</h3>
											<li><p>
													<a href>Gym Fitness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cardio Fittness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Boxing</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga Pilates</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cycling</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
										</ul>
										<ul class="items_list">
											<h3>Thrusday</h3>
											<li><p>
													<a href>Gym Fitness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cardio Fittness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Boxing</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga Pilates</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cycling</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
										</ul>
										<ul class="items_list">
											<h3>Friday</h3>
											<li><p>
													<a href>Gym Fitness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cardio Fittness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Boxing</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga Pilates</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cycling</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
										</ul>
										<ul class="items_list">
											<h3>Saturday</h3>
											<li><p>
													<a href>Gym Fitness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cardio Fittness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Boxing</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga Pilates</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cycling</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
										</ul>
										<ul class="items_list">
											<h3>Sunday</h3>
											<li><p>
													<a href>Gym Fitness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cardio Fittness</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Boxing</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Yoga Pilates</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
											<li><p>
													<a href>Cycling</a>
												</p> <span class="m_31">10.00 - 20.00</span>
												<div class="clear"></div></li>
										</ul>
									</div>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
			<script
				src="<%=request.getContextPath()%>/assets/js/easyResponsiveTabs.js"
				type="text/javascript"></script>
			<script type="text/javascript">
				$(document).ready(function() {
					$('#horizontalTab').easyResponsiveTabs({
						type : 'default', //Types: default, vertical, accordion           
						width : 'auto', //auto or any width like 600px
						fit : true
					// 100% fit in a container
					});
				});
			</script>
		</div>
		<!-- fim -->
		<jsp:include page="../included/footer.jsp"></jsp:include>
</body>
</html>