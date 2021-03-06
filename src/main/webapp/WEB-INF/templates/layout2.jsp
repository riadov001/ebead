<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/layout1/css/template.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/jquery/jquery.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/eboutique.js"></script>
</head>
<body>
	<div id="header" class="cadre">
		<tiles:insertAttribute name="header"></tiles:insertAttribute>
	</div>
	<div id="content" class="cadre">
		<div id="menu" class="cadre"><tiles:insertAttribute name="menu"></tiles:insertAttribute> </div>
		<div id="body" class="cadre"><tiles:insertAttribute name="body"></tiles:insertAttribute> </div>
	</div>
	<div>
		<div id="footer" class="cadre"><tiles:insertAttribute name="footer"></tiles:insertAttribute></div>
	</div>
</body>
</html>