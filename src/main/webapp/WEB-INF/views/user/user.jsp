<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>특징</td>
        <td>내용</td>
    </tr>
    <c:forEach items="${contents}" var="content">
        <tr>
            <td>${content.attribute}</td>
            <td>${content.value}</td>
        </tr>
    </c:forEach>
    </table>
<div>
    <form action="/user/addAttribute" method="post">
        <input type="hidden" name="userId" value="${userId}">
        <input type="text" name="attribute" placeholder="특징">
        <input type="text" name="value" placeholder="내용">
        <input type="submit" 추가>
    </form>
</div>
<div>
    <form action="/user/user" method="post">
        <input type="text" name="content" placeholder="댓글을 입력해주세요">
        <input type="submit">
    </form>
</div>
</body>
</html>
