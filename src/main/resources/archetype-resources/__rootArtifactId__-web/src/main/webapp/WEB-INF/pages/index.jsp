#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <!-- Required meta tags always come first -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Fastweb</title>

    <!-- Font Awesome -->
    <link href="${symbol_dollar}{pageContext.request.contextPath}/static/lib/font-awesome/css/font-awesome.min.css"
          rel="stylesheet">
    <!-- Bootstrap -->
    <link href="${symbol_dollar}{pageContext.request.contextPath}/static/lib/bootstrap/css/bootstrap.min.css"
          rel="stylesheet">

</head>
<body>
<h1>Welcome to use ${parentArtifactId}!</h1>

<script type="text/javascript"
        src="${symbol_dollar}{pageContext.request.contextPath}/static/lib/jquery/jquery.min.js"></script>
<script type="text/javascript"
        src="${symbol_dollar}{pageContext.request.contextPath}/static/lib/bootstrap/js/popper.min.js"></script>
<script type="text/javascript"
        src="${symbol_dollar}{pageContext.request.contextPath}/static/lib/bootstrap/js/bootstrap.min.js"></script>

</body>
</html>
