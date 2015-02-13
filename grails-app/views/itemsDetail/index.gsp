<%--
  Created by IntelliJ IDEA.
  User: cepe
  Date: 11.02.2015
  Time: 08:45
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="ch.erni.example.Item" %>
<html>
<head>
    <meta name="layout" content="main">
    <title>Detail of item</title>
</head>

<body>
    <g:form action="save">
        <g:hiddenField name="id" value="${itemObj?.id}" />
        <g:hiddenField name="version" value="${itemObj?.version}" />

        <div class="fieldcontain ${hasErrors(bean: itemObj, field: 'name', 'error')} required">
            <label for="itemName">
                <g:message code="item.name.label" default="Name of item" />
                <span class="required-indicator">*</span>
            </label>
            <g:textField id="itemName" name="name" required="" value="${itemObj?.name}"/>
        </div>

        <div class="fieldcontain ${hasErrors(bean: itemObj, field: 'description', 'error')} required">
            <label for="itemDescription">
                <g:message code="item.description.label" default="Description of item" />
                <span class="required-indicator">*</span>
            </label>
            <g:textField id="itemDescription" name="description" required="" value="${itemObj?.description}"/>
        </div>

        <div class="fieldcontain ${hasErrors(bean: itemObj, field: 'text', 'error')} required">
            <label for="itemText">
                <g:message code="item.text.label" default="Text of item" />
                <span class="required-indicator">*</span>
            </label>
            <g:textField id="itemText" name="text" required="" value="${itemObj?.text}"/>
        </div>

        <div class="buttons nav">
            <g:if test="${itemObj != null && itemObj.id > 0}">
                <g:submitButton class="edit" value="Update" name="saveButton"/>
            </g:if>
            <g:else>
                <g:submitButton class="save" value="Save" name="saveButton"/>
            </g:else>

            <g:link class="home" action="index" controller="itemsList">Back</g:link>
        </div>

    </g:form>
</body>
</html>