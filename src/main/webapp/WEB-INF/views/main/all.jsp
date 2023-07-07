<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-06
  Time: 오후 9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>all</title>
</head>
<body>
<form method="post" action=/main/all>
<input type="text" name="content" placeholder="내용을 입력하세요">
<input type="text" name="name" placeholder="작성자명을 입력하세요">
<input type="submit" value="작성하기">
</form>
<c:forEach items="${freecomments}" var="content">
    <p>${content.id}</p>
    <p>${content.name}</p>
    <p>${content.content}</p>
    <p>${content.createTime}</p>

</c:forEach>

</body>
</html>
