<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Full Motion</title>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
<%--  <link rel="stylesheet" href="css/main.css">--%>
  <link rel="stylesheet" href="/resources/css/main.css">

</head>
<body id="top">
<!-- Banner -->
<!--
    To use a video as your background, set data-video to the name of your video without
    its extension (eg. images/banner). Your video must be available in both .mp4 and .webm
    formats to work correctly.
-->
<section id="banner" data-video="/resources/img/banner.jpg">
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

      <div class="box">
        <a href="#" class="image fit"><img src="/resources/img/pic01.jpg" alt=""/></a>
        <div class="inner">
          <h3>Nascetur nunc varius commodo</h3>
          <p>Interdum amet accumsan placerat commodo ut amet aliquam blandit nunc tempor lobortis nunc non. Mi accumsan.</p>
          <a href="#" class="button fit" onclick="openModal(); return false">Watch</a>
        </div>
      </div>

      <div  class="modal">
        <div class="modal-content">
          <div >
            <p style="color: black;">이름</p>
            <p style="color: black;">dasdasdasdasdasd</p>
            <p style="color: black;">나이</p>
            <p style="color: black;">30살</p>
            <p style="color: black;">특징</p>
            <p style="color: black;">아몰랑</p>
          </div>
        </div>
      </div>

      <div class="box">
        <a href="#" class="image fit"><img src="/resources/img/pic02.jpg" alt="" /></a>
        <div class="inner">
          <h3>Nascetur nunc varius commodo</h3>
          <p>Interdum amet accumsan placerat commodo ut amet aliquam blandit nunc tempor lobortis nunc non. Mi accumsan.</p>
          <a href="#" class="button style2 fit" onclick="openModal(); return false">Watch</a>
        </div>
      </div>

      <div  class="modal">
        <div class="modal-content">
          <div>
            <p style="color: black;">이름</p>
            <p style="color: black;">dasdasdasdasdasd</p>
            <p style="color: black;">나이</p>
            <p style="color: black;">30살</p>
            <p style="color: black;">특징</p>
            <p style="color: black;">아몰랑</p>
          </div>
        </div>
      </div>

      <div class="box">
        <a href="#" class="image fit"><img src="/resources/img/pic03.jpg" alt="" /></a>
        <div class="inner">
          <h3>Nascetur nunc varius commodo</h3>
          <p>Interdum amet accumsan placerat commodo ut amet aliquam blandit nunc tempor lobortis nunc non. Mi accumsan.</p>
          <a href="#" class="button style3 fit" onclick="openModal(); return false">Watch</a>
        </div>
      </div>

      <div  class="modal">
        <div class="modal-content">
          <div >
            <p style="color: black;">이름</p>
            <p style="color: black;">dasdasdasdasdasd</p>
            <p style="color: black;">나이</p>
            <p style="color: black;">30살</p>
            <p style="color: black;">특징</p>
            <p style="color: black;">아몰랑</p>
          </div>
        </div>
      </div>

      <div class="box">
        <a href="#" class="image fit"><img src="/resources/img/pic04.jpg" alt="" /></a>
        <div class="inner">
          <h3>Nascetur nunc varius commodo</h3>
          <p>Interdum amet accumsan placerat commodo ut amet aliquam blandit nunc tempor lobortis nunc non. Mi accumsan.</p>
          <a href="#" class="button style2 fit" onclick="openModal(); return false">Watch</a>
        </div>
      </div>

      <div  class="modal">
        <div class="modal-content">
          <div >
            <p style="color: black;">이름</p>
            <p style="color: black;">dasdasdasdasdasd</p>
            <p style="color: black;">나이</p>
            <p style="color: black;">30살</p>
            <p style="color: black;">특징</p>
            <p style="color: black;">아몰랑</p>
          </div>
        </div>
      </div>

      <div class="box">
        <a href="#" class="image fit"><img src="/resources/img/pic05.jpg" alt="" /></a>
        <div class="inner">
          <h3>Nascetur nunc varius commodo</h3>
          <p>Interdum amet accumsan placerat commodo ut amet aliquam blandit nunc tempor lobortis nunc non. Mi accumsan.</p>
          <a href="#" class="button style3 fit" onclick="openModal(); return false">Watch</a>
        </div>
      </div>

      <div  class="modal">
        <div class="modal-content">
          <div >
            <p style="color: black;">이름</p>
            <p style="color: black;">dasdasdasdasdasd</p>
            <p style="color: black;">나이</p>
            <p style="color: black;">30살</p>
            <p style="color: black;">특징</p>
            <p style="color: black;">아몰랑</p>
          </div>
        </div>
      </div>

      <div class="box">
        <a href="#" class="image fit"><img src="/resources/img/pic06.jpg" alt="" /></a>
        <div class="inner">
          <h3>Nascetur nunc varius commodo</h3>
          <p>Interdum amet accumsan placerat commodo ut amet aliquam blandit nunc tempor lobortis nunc non. Mi accumsan.</p>
          <a href="#" class="button style2 fit" onclick="openModal(); return false">Watch</a>
        </div>
      </div>

      <div id="modal" class="modal">
        <div class="modal-content">
          <div id="modal-text">
            <p style="color: black;">이름</p>
            <p style="color: black;">dasdasdasdasdasd</p>
            <p style="color: black;">나이</p>
            <p style="color: black;">30살</p>
            <p style="color: black;">특징</p>
            <p style="color: black;">아몰랑</p>
          </div>
        </div>
      </div>

    </div>

  </div>
</div>

<!-- Footer -->
<footer id="footer">
  <div class="inner">
    <h2>Etiam veroeros lorem</h2>
    <p>Pellentesque eleifend malesuada efficitur. Curabitur volutpat dui mi, ac imperdiet dolor tincidunt nec. Ut erat lectus, dictum sit amet lectus a, aliquet rutrum mauris. Etiam nec lectus hendrerit, consectetur risus viverra, iaculis orci. Phasellus eu nibh ut mi luctus auctor. Donec sit amet dolor in diam feugiat venenatis. </p>
  </div>
</footer>

<script>
  function openModal() {
    var modal = document.getElementById('modal');
    modal.style.display = 'block';
  }

  function closeModal() {
    var modal = document.getElementById('modal');
    modal.style.display = 'none';
  }
  window.onclick = function(event) {
    var modal = document.getElementById('modal');
    if (event.target == modal) {
      modal.style.display = "none";
    }
  }
  window.addEventListener("click", function(event) {
    var modal = document.querySelector(".modal-content");
    if (event.target === modal) {
      closeModal();
    }
  });
</script>

</body>
</html>
