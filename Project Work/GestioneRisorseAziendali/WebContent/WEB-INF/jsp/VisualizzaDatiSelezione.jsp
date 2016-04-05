<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Visualizzazione dati</title>
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>
<div id="global">

    <c:if test="${requestScope.list}!= null">
       </c:if> 
         
        <ul>
        <c:forEach var="elem" items="${requestScope.list}">
            <li>
            ${elem}
            
           
            </li>
        </c:forEach>
        </ul>
        

</div>
</body>
</html>