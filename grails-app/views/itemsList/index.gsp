<%--
  Created by IntelliJ IDEA.
  User: cepe
  Date: 10.02.2015
  Time: 13:00
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="ch.erni.example.Item" %>

<html>
<head>
    <meta name="layout" content="main">
    <title>List of items</title>
</head>

<body>

    <h1>This is list of available items</h1>
    <div class="nav" role="navigation">
        <ul>
            <g:link class="create" action="actionShowDetail" >Add</g:link>
        </ul>
    </div>

    <div id="itemsTableContainer">
        <g:render template="table" model="['items':items]"/>
    </div>


</body>
</html>