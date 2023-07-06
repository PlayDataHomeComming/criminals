<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Document</title>
    <link rel="stylesheet" href="/resources/css/user.css"/>
    <link rel="stylesheet" href="/resources/css/main.css"/>
</head>
<body class="body_bg">
<header class="header_container">
    <form action="/main" method="post">
        <input class="input_container" type="submit" value="메인으로">
    </form>
</header>
<h1 class="profile">Profile</h1>
<!-- 맨위에 홈으로 버튼 -->
<table class="table_container">
    <tr>
        <td class="key key_bold">특징</td>
        <td class="key_bold">내용</td>
    </tr>
    <c:forEach items="${contents}" var="content">
        <tr>
            <td class="key">${content.attribute}</td>
            <td class="content_text">${content.value}</td>
        </tr>
        <tr>
            <td class="key">${content.attribute}</td>
            <td>${content.value}</td>
        </tr>


    </c:forEach>
</table>
<div>
    <form class="form_box" action="/user/addAttribute" method="post">
        <input type="hidden" name="userId" value="${userId}">
        <input class="contents_box" type="text" name="attribute" placeholder="특징">
        <input class="contents_box" type="text" name="value" placeholder="내용">
        <input type="submit" value="추가">
    </form>
</div>
<div>
    <form class="form_box" action="/user/deleteAttribute" method="post">
        <p class="comment_text">속성 이름을 입력하여 제거</p>
        <input class="contents_box" type="hidden" name="userId" value="${userId}">
        <input class="contents_box" type="text" name="attribute" placeholder="특징">
        <input type="submit" 추가>
    </form>
</div>
<table class="table_container">
    <tr>
        <td class="key key_bold key_size">번호</td>
        <td class="key key_bold key_size">닉네임</td>
        <td class="key_bold">내용</td>
    </tr>
    <h1 class="profile">Comment</h1>
    <c:forEach items="${comments}" var="comment">

        <tr>
            <td>${comment.id}</td>
            <td>${comment.nickName}</td>
            <td>${comment.content}</td>
        </tr>


    </c:forEach>
</table>
<div class="div_box">
    <form class="form_box" action="/user/insertComment" method="post">
        <p class="comment_text">댓글을 까먹지 말아주세요(수정시 닉네임 패스워드 필요)</p>
        <input type="hidden" name="userId" value="${userId}">
        <input class="contents_box" type="text" name="nickName" placeholder="닉네임">
        <input class="contents_box" type="text" name="passWord" placeholder="패스워드">
        <input class="contents_box" type="text" name="comment" placeholder="내용">
        <input type="submit" value="추가">
    </form>
    <form class="form_box" action="/user/updateComment" method="post">
        <p class="comment_text">댓글수정(댓글번호에 숫자만 넣어주세요)</p>
        <input type="hidden" name="userId" value="${userId}">
        <input class="contents_box" type="text" name="commentId" placeholder="댓글번호">
        <input class="contents_box" type="text" name="passWord" placeholder="패스워드">
        <input class="contents_box" type="text" name="comment" placeholder="내용">
        <input type="submit" placeholder="댓글수정">
    </form>
</div>
</body>
</html>
