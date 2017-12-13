<%-- 
    Document   : page
    Created on : Dec 12, 2017, 1:20:05 PM
    Author     : imam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page = "head.jsp"/>
        <div class ="container"
             align = "center">
        <h1>${message}</h1>
        <h1>I find by Indocyber Controller</h1>
        </div>
        <div align = "center">
        <a href="Welcome/register" >Please Register</a>
        </div>
    </body>
</html>
