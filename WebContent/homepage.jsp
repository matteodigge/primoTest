<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
     Il nome inserito �: <%= request.getAttribute("nomeAttr") %><br>
     Il cognome inserito �: <%= request.getAttribute("cognomeAttr") %>
</body>
</html>