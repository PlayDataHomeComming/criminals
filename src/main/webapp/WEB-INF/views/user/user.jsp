<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Back Talking</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="/resources/css/user.css" />
</head>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <h1>프로필</h1>
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

<table>
    <tr>
        <td>닉네임</td>
        <td>내용</td>
    </tr>
    <h1>댓글</h1>
    <c:forEach items="${comments}" var="comment">
        <tr>
            <td>${comment.nickName}</td>
            <td>${comment.content}</td>
        </tr>
    </c:forEach>
</table>


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
