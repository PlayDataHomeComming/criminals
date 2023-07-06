<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-06
  Time: 오후 6:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/add.css"/>
</head>
<%--<body>--%>
<%--<form action="/main/add" method="post">--%>
<%--  <input type="text" name="name" placeholder="이름을 입력해 주세요">--%>
<%--  <input type="text" name="subData" placeholder="추가로 보여줄 정보를 입력하세요" >--%>
<%--  <input type="text" name="imgUrl" placeholder="추가할 사진을 넣어주세요">--%>
<%--  <input type="submit" value="제출하기">--%>
<%--</form>--%>
<%--</body>--%>
<body>
<div id="con">
    <div id="login">
        <div id="login_form"><!--로그인 폼-->
            <form action="/main/add" method="post">
                <h3 class="login" style="letter-spacing:-1px;">Add User</h3>
                <hr>
                <p class="p_text">Username</p>
                <input type="text" name="name" placeholder="이름을 입력해 주세요" class="size">
                <p></p>
                </label><!--아이디-->
                <label>
                    <!-- <span>PW</span> -->
                    <p class="p_text">Subdata</p>
                    <input type="text" name="subData" placeholder="추가로 보여줄 정보를 입력하세요" class="size">
                </label><!--비밀번호-->
                <label>
                    <!-- <span>PW</span> -->
                    <p class="p_text">URL</p>
                    <input type="text" name="imgUrl" placeholder="사진 URL 삽입" class="size">
                </label><!--비밀번호 확인-->
                <br>
                <p>
                    <input type="submit" value="유저 넣기" class="btn">
                </p>
            </form>
            <hr>
        </div>
        <div>
        </div><!--con-->
    </div>
</div>
</body>
</html>
