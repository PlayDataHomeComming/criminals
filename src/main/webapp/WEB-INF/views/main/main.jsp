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
      <a href="/main/all">자유게시판</a>
    </header>

  </div>
</section>

<!-- Main -->
<div id="main">
  <div class="inner">

    <!-- Boxes -->
    <div class="thumbnails">

      <c:forEach items="${users}" var="user">
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

  </div>
</div>

<!-- Footer -->
<footer id="footer">
  <div class="inner">
    <h2>footer</h2>
    <p>Pellentesque eleifend malesuada efficitur. Curabitur volutpat dui mi, ac imperdiet dolor tincidunt nec. Ut erat lectus, dictum sit amet lectus a, aliquet rutrum mauris. Etiam nec lectus hendrerit, consectetur risus viverra, iaculis orci. Phasellus eu nibh ut mi luctus auctor. Donec sit amet dolor in diam feugiat venenatis. </p>
  </div>
</footer>

</body>
</html>