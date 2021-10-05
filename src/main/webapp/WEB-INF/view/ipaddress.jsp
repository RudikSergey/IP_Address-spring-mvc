<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <title>IP Address</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/resources/css/tabStyle.css">
    <script>
        function openCity(evt, cityName) {
            // Declare all variables
            var i, tabcontent, tablinks;

            // Get all elements with class="tabcontent" and hide them
            tabcontent = document.getElementsByClassName("tabcontent");
            for (i = 0; i < tabcontent.length; i++) {
                tabcontent[i].style.display = "none";
            }

            // Get all elements with class="tablinks" and remove the class "active"
            tablinks = document.getElementsByClassName("tablinks");
            for (i = 0; i < tablinks.length; i++) {
                tablinks[i].className = tablinks[i].className.replace(" active", "");
            }

            // Show the current tab, and add an "active" class to the button that opened the tab
            document.getElementById(cityName).style.display = "block";
            evt.currentTarget.className += " active";
        }
    </script>
</head>
<body>

<h2>Таблицы IP адресов</h2>
<br>
<!-- Tab links -->
<div class="tab">
    <button class="tablinks" onclick="openCity(event, 'firstView')" id="defaultOpen">10.130.4.0</button>
    <button class="tablinks" onclick="openCity(event, 'secondView')">10.130.5.0</button>
    <button class="tablinks" onclick="openCity(event, 'thirdView')">10.130.6.100</button>
    <button class="tablinks" onclick="openCity(event, 'fourthView')">10.130.7.0</button>
    <button class="tablinks" onclick="openCity(event, 'fifthView')">Склад</button>
</div>

<!-- Tab content -->
<div id="firstView" class="tabcontent">
    <h3>Четвертая подсеть</h3>
    <table>
        <tr>
            <th>Ip Address</th>
            <th>Устройство</th>
            <th>Описание</th>
            <th>Комментарий</th>
            <th>Действие</th>
        </tr>
        <c:forEach var="ips" items="${allIp}">
            <c:url var="updateButton" value="/updateInfo">
                <c:param name="ipId" value="${ips.id}"/>
            </c:url>
            <%--<c:url var="deleteButton" value="/deleteIp">
                <c:param name="ipId" value="${ips.id}"/>
            </c:url>--%>
            <tr>
                <td>${ips.ip_address}</td>
                <td>${ips.device}</td>
                <td>${ips.description}</td>
                <td>${ips.comments}</td>
                <td>
                    <input type="button" value="Редактировать" onclick="window.location.href='${updateButton}'"/>
                        <%--<input type="button" value="Удалить" onclick="window.location.href='${deleteButton}'"/>--%>
                </td>
            </tr>
        </c:forEach>
    </table>
    <%--<input type="button" value="Добавить" onclick="window.location.href='addNewIp'"/>--%>
</div>

<div id="secondView" class="tabcontent">
    <h3>Пятая подсеть</h3>
    <table>
        <tr>
            <th>Ip Address</th>
            <th>Устройство</th>
            <th>Описание</th>
            <th>Комментарий</th>
            <th>Действие</th>
        </tr>
        <c:forEach var="ipsTwo" items="${allIpTwo}">
            <c:url var="updateButton" value="/updateInfoTwo">
                <c:param name="ipIdTwo" value="${ipsTwo.id}"/>
            </c:url>
            <%--<c:url var="deleteButton" value="/deleteIp">
                <c:param name="ipIdTwo" value="${ipsTwo.id}"/>
            </c:url>--%>
            <tr>
                <td>${ipsTwo.ip_address}</td>
                <td>${ipsTwo.device}</td>
                <td>${ipsTwo.description}</td>
                <td>${ipsTwo.comments}</td>
                <td>
                    <input type="button" value="Редактировать" onclick="window.location.href='${updateButton}'"/>
                        <%--<input type="button" value="Удалить" onclick="window.location.href='${deleteButton}'"/>--%>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>

<div id="thirdView" class="tabcontent">
    <h3>Шестая подсеть</h3>
    <table>
        <tr>
            <th>Ip Address</th>
            <th>Устройство</th>
            <th>Описание</th>
            <th>Комментарий</th>
            <th>Действие</th>
        </tr>
        <c:forEach var="ipsThree" items="${allIpThree}">
            <c:url var="updateButton" value="/updateInfoThree">
                <c:param name="ipIdThree" value="${ipsThree.id}"/>
            </c:url>
            <%--<c:url var="deleteButton" value="/deleteIp">
                <c:param name="ipId" value="${ips.id}"/>
            </c:url>--%>
            <tr>
                <td>${ipsThree.ip_address}</td>
                <td>${ipsThree.device}</td>
                <td>${ipsThree.description}</td>
                <td>${ipsThree.comments}</td>
                <td>
                    <input type="button" value="Редактировать" onclick="window.location.href='${updateButton}'"/>
                        <%--<input type="button" value="Удалить" onclick="window.location.href='${deleteButton}'"/>--%>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>

<div id="fourthView" class="tabcontent">
    <h3>Седьмая подсеть</h3>
    <table>
        <tr>
            <th>Ip Address</th>
            <th>Устройство</th>
            <th>Описание</th>
            <th>Комментарий</th>
            <th>Действие</th>
        </tr>
        <c:forEach var="ipsFour" items="${allIpFour}">
            <c:url var="updateButton" value="/updateInfoFour">
                <c:param name="ipIdFour" value="${ipsFour.id}"/>
            </c:url>
            <%--<c:url var="deleteButton" value="/deleteIp">
                <c:param name="ipId" value="${ips.id}"/>
            </c:url>--%>
            <tr>
                <td>${ipsFour.ip_address}</td>
                <td>${ipsFour.device}</td>
                <td>${ipsFour.description}</td>
                <td>${ipsFour.comments}</td>
                <td>
                    <input type="button" value="Редактировать" onclick="window.location.href='${updateButton}'"/>
                        <%--<input type="button" value="Удалить" onclick="window.location.href='${deleteButton}'"/>--%>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>

<div id="fifthView" class="tabcontent">
    <h3>Склад</h3>
    <table>
        <tr>
            <th>Ip Address</th>
            <th>Устройство</th>
            <th>Описание</th>
            <th>Комментарий</th>
            <th>Действие</th>
        </tr>
        <c:forEach var="ipsFive" items="${allIpFive}">
            <c:url var="updateButton" value="/updateInfoFive">
                <c:param name="ipIdFive" value="${ipsFive.id}"/>
            </c:url>
            <%--<c:url var="deleteButton" value="/deleteIp">
                <c:param name="ipId" value="${ips.id}"/>
            </c:url>--%>
            <tr>
                <td>${ipsFive.ip_address}</td>
                <td>${ipsFive.device}</td>
                <td>${ipsFive.description}</td>
                <td>${ipsFive.comments}</td>
                <td>
                    <input type="button" value="Редактировать" onclick="window.location.href='${updateButton}'"/>
                        <%--<input type="button" value="Удалить" onclick="window.location.href='${deleteButton}'"/>--%>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>