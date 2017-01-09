<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table width="100%" border=1>
    <tr>
        <td><input type="submit" value="查询"/></td>
    </tr>
</table>
商品列表：${test}
<table width="100%" border=1>
    <tr>
        <td>商品名称</td>
        <td>商品价格</td>
    </tr>
    <c:forEach items="${itemsList }" var="item">
        <tr>
            <td>${item}</td>
            <td>${item.name }</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
