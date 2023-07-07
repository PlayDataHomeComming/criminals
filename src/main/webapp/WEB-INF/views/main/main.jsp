<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Back Talking</title>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <link rel="stylesheet" href="/resources/css/main.css" />
</head>
<body id="top">

<section id="banner" data-video="img/banner">
  <div class="inner">
    <header>
      <h1>경쟁자는 가시오</h1>

    </header>

  </div>
</section>

<!-- Main -->
<div id="main">
  <div class="inner">

    <!-- Boxes -->
    <div class="thumbnails">

      <c:forEach items="${users}" var="user" >

        <div class="box">
          <a href="#" class="image fit"><img  src="${user.imgUrl}" /></a>
          <div class="inner">
            <h3>${user.name}</h3>
            <p>${user.subData}</p>
            <p>방문자 수:  <strong>${user.numOfVisit}</strong></p>
            <form action="/user" method="get">
              <input type="hidden" name="userId" value="${user.id}" >
              <input class="button fit"  type="submit" value="Watch">
            </form>
            <form action="/main" method="post">
              <input type="hidden" name="userId" value="${user.id}" >
              <input style="color: #1b1b1f;cursor:default; z-index: 1; margin-bottom: 10px" type="text" name="imgUrl" placeholder="이미지 주소 넣어주세요"  >
              <input class="button fit"  type="submit" value="사진 수정">
            </form>

          </div>
        </div>
      </c:forEach>

    </div>

    <form class="form_box" action="/main/add" method="get">
      <input class="button input_location" value="유저추가하기" type="submit">
    </form>
  </div>
</div>
<!-- Footer -->
<footer id="footer">
  <div class="inner">
    <h2>이 footer는</h2>
    <p>이 footer는 영국에서 최초로 시작되어 일년에 한바퀴 돌면서 보는 사람에게 행운을 주었고 지금은 당신에게로 옮겨진 이 footer는 프로젝트안에 한번은 써야 합니다. 이 홈페이지 footer를 포함해서 6조는을 행운이 필요한 사람에게 보여 주셔야 합니다. 복사를 해도 좋습니다. 혹 미신이라 하실지 모르지만 사실입니다.  </p>
  </div>
</footer>

</body>
</html>