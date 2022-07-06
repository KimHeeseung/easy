<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jennie Project Main</title>
<link rel="stylesheet" type="text/css" href="/web/css/w3.css">
<link rel="stylesheet" type="text/css" href="/web/css/base.css">
<script type="text/javascript" src="/web/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="/web/js/main.js"></script>
</script>
<style>
	#msgWin {
		display: block;
	}
</style>
<script type="text/javascript">
	var sessionId = '${SID}';
</script>
</head>
<body>
	<form method="POST" action="" id="frm" name="frm">
		<input type="hidden" id="id" name="id" value="${SID}">
	</form>
	
	<div class="w3-content w3-center mw700">
		<h1 class="w3-blue w3-padding w3-card-4" style="margin-bottom: 5px;">GITHRD Project</h1>
		<div class="w3-col">
<c:if test="${empty SID}">
				<div class="w3-col w3-border-bottom pdb3">
					<span class="w3-col m2 w3-button w3-small w3-blue w3-hover-light-blue w3-right" id="lbtn">Login</span>
				</div>
</c:if>


<c:if test="${not empty SID}">
	<div id="msgWin">
	    	<div class="w3-container">
	        	<h3 class="w3-center w3-margin-top w3-margin-bottom" id="ms">${SID} 님 로그인 하셨습니다.</h3>
	    	</div>
 	</div>
</c:if>
</body>
</html>