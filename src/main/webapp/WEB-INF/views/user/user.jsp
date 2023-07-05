<%@ page import="com.naver.domain.entitiy.User" %><%--
  Created by IntelliJ IDEA.
  User: playdata
  Date: 2023-07-05
  Time: 오후 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>번호</td>
        <td>이름</td>
        <td>추가데이터</td>
        <td>조회수</td>
    </tr>
    <% User user = (User)session.getAttribute("user");%>
    <tr>
        <td><%= user.getId()%></td>
        <td><%= user.getName()%></td>
        <td><%= user.getSub_data()%></td>
        <td><%= user.getNum_of_visit()%></td>
    </tr>
<%--    <%--%>
<%--        List<TodoJoinUser> todos_check = (List<TodoJoinUser>)request.getAttribute("checklist");--%>
<%--        if(todos_check!= null &&todos_check.size() != 0){--%>
<%--            for (TodoJoinUser todo :todos_check) {%>--%>
<%--    <tr>--%>
<%--        <%--%>
<%--            if ((int)session.getAttribute("uid") == user.getId()) {--%>
<%--        %><td>--%>
<%--        <a href="/main?keyword=<%= todo.getId() %>">수정</a>--%>
<%--    </td> <%--%>
<%--        }--%>
<%--    %>--%>
<%--        <%--%>
<%--            if (session.getAttribute("uid") == todo.getUid()) {--%>
<%--        %><td>--%>
<%--        <a href="/main?keyword=<%= todo.getId() %>">삭제x</a>--%>
<%--    </td> <%--%>
<%--        }--%>
<%--    %>--%>
<%--    </tr>--%>
<%--    <%--%>
<%--            }--%>
<%--        }--%>
<%--    %>--%>
</table>
<div>
    <form action="/user/user" method="post">
        <input type="text" name="content" placeholder="댓글 추가하기">
        <input type="추가">
    </form>
</div>
<div>
    <form action="/user/user" method="post">
        <input type="text" name="content" placeholder="content을 입력해주세요">
        <input type="submit">
    </form>
</div>
</body>
</html>
