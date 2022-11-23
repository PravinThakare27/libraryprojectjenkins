<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-image: url('https://image.freepik.com/free-vector/illustration-white-brick-wall-seamless-texture-background-flat-art-style-design-cartoon-brick-wall-pattern-continuous-replicate_117177-383.jpg')">
<%



%>
<h1>Update Your Profile</h1>
<form action="Updated" method="post">
<table>

<tr>
<th>
FirstName
</th>
<td><input type="text" name="firstname">
</td>
</tr>
<tr>
<th>
LastName
</th>
<td><input type="text" name="lastname">
</td>
</tr>
<tr>
<th>
Email
</th>
<td><input type="text" name="email">
</td>
</tr>
<tr>
<th>
Password
</th>
<td><input type="text" name="password">
</td>
</tr>
<tr>
<th>
Address
</th>
<td><input type="text" name="address">
</td>
</tr>
<tr>
<th>
Mobile
</th>
<td><input type="text" name="mobile">
</td>
</tr>
<tr>

<td>
<input type="submit" value="Register">
</td>
</tr>
</table>
</form>
</body>
</html>