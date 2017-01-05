<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Categories</title>
</head>
<body>
<div id="formCat" class="cadre">
	<f:form modelAttribute="categorie" action="saveCat" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td>ID Categorie:</td>
				<td>${categorie.idCategorie}<f:input type ="hidden" path="idCategorie"/></td>
				<td><f:errors path="idCategorie"></f:errors></td>
			</tr>
			<tr>
				<td>Category Name:</td><td><f:input path="nomCategorie"/></td>
				<td><f:errors path="nomCategorie"></f:errors></td>
			</tr>
			<tr>
				<td>Description:</td>
				<td><f:textarea path="description"/></td>
				<td><f:errors path="description"></f:errors></td>
			</tr>
			<tr>
				<td>Photo</td>
				<c:if test="${categorie.idCategorie!=null}">
					<td><img alt="Photo de la catégorie" src="photoCat?idCat=${categorie.idCategorie}"></td>
				</c:if>
				<td><input type="file" name="file"></td>				
			</tr>
			<tr>
				<td><input type="submit" value="save"></td>
			</tr>
		</table>
	</f:form>
</div>
<div id="tabCategories" class="cadre">
	<table class="tabStyle1">
		<tr>
			<th>ID</th><th>CAT NAME</th><th>DESCRIPTION</th>PHOTO<th>
			<th></th><th></th>
		</tr>
		<c:forEach items="${categories}" var="cat">
		<tr>
			<td>${cat.idCategorie}</td>
			<td>${cat.nomCategorie}</td>
			<td>${cat.description}</td>
			<td><img alt="img" src="photoCat?idCat=${cat.idCategorie}"></td>
			<td><a href="suppCat?idCat=${cat.idCategorie}">Delete</a></td>
			<td><a href="editCat?idCat=${cat.idCategorie}">Edit</a></td>
		</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>