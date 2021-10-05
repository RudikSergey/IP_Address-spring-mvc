<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<head>
    <title>IP Address</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/resources/css/tabStyle.css">
</head>

<body>

<h2>IP адрес</h2>
<br>

<form:form action="saveIpAddressTwo" modelAttribute="ipAddressTwo">
    <form:hidden path="id"/>
    <table>
        <tr>
            <th width="10%">IP адресс</th>
            <th width="10%">Устройство</th>
            <th width="15%">Описание</th>
            <th width="15%">Комментарий</th>
            <th width="50%">Сохранить/обновить</th>
        </tr>
        <tr>
            <td width="10%"><form:input path="ip_address"/></td>
            <td width="10%"><form:input path="device"/></td>
            <td width="15%"><form:textarea path="description" cols="40" rows="8"/></td>
            <td width="15%"><form:textarea path="comments" cols="40" rows="8"/></td>
            <td width="50%"><input type="submit" value="OK"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>