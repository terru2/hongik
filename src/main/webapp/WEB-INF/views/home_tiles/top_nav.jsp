<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
				<span class="glyphicon glyphicon-user"></span>
			</button>
			<a class="navbar-brand" href="#">공용시설 안내 서비스</a>
		</div>
			<form class="navbar-form navbar-left" action="search.hongik">
		    	<div class="input-group">
					<input type="text" class="form-control" placeholder="원하시는 지역명, 시설명을 입력하세요" name="address" value="${addrss}">
					<div class="input-group-btn">
						<button class="btn btn-default" type="submit">
							<span class="glyphicon glyphicon-search"></span>
						</button>
					</div>
				</div>
		    </form>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>Sign Up</a></li>
			</ul>
		</div>
	</div>
</nav>