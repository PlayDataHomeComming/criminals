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
    <link rel="stylesheet" href="/resources/css/all.css" />
</head>

</html>

<section class="notice">
    <div class="page-title">
        <div class="container">
            <h3>자유게시판</h3>
        </div>
    </div>

    <!-- board seach area -->
    <div id="board-search">
        <div class="container">
            <div class="search-window">
                <form method="post" action=/main/all>
                    <input type="text" name="content" placeholder="내용을 입력하세요">
                    <input type="text" name="name" placeholder="작성자명을 입력하세요">
                    <input type="submit" value="작성하기">
                </form>
            </div>
        </div>
    </div>
    <c:forEach items="${freecomments}" var="content">
        <div id="board-list">
            <div class="container">
                <table class="board-table">
                    <thead>
                    <tr>
                        <th scope="col" class="th-num">번호</th>
                        <th scope="col" class="th-title">내용</th>
                        <th scope="col" class="th-nickname">닉네임</th>
                        <th scope="col" class="th-date">등록일</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>${content.id}</td>
                        <th><p>${content.content}</p></th>
                        <td>${content.name}</td>
                        <td>${content.createTime}</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </c:forEach>
</section>
