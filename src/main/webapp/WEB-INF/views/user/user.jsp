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
    <form action="/user/insertComment" method="post">
        <p>댓글을 까먹지 말아주세요(수정시 닉네임 패스워드 필요)</p>
        <input type="hidden" name="userId" value="${userId}">
        <input type="text" name="nickName" placeholder="닉네임">
        <input type="text" name="passWord" placeholder="패스워드">
        <input type="text" name="comment" placeholder="내용">
        <input type="submit" placeholder="댓글달기">
    </form>
</div>
</body>
</html>
