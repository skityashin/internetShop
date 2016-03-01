<%--


http://localhost:8080/hello/greeting


  Created by IntelliJ IDEA.
  User: Skityashin Vladimir
  Date: 22.02.2016
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title></title>


  <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>
  <script type="text/javascript">

    $(document).ready(function () {
      $(":button").click(function () {
        var val3 = $("#createEmail").val();
        if (val3 != "") //val.length > 2 &&
        {
          $("#Name6").show();
          $("#Name6").hide(5000);
        }
        else {
          $("#Name5").show();
          $("#Name5").hide(5000);
        }
        var val4 = $("#createPassword").val();
        if (val4.length > 5 && val4 != "") {
          $("#Name8").show();
          $("#Name8").hide(5000);
        }
        else {
          $("#Name7").show();
          $("#Name7").hide(5000);
        }
      });
      $("#createPassword1").toggle(
              function () {
                $(this).removeClass('g-rid-input__eye').addClass('g-rid-input__eye_blue');
                $('#createPassword').replaceWith($('#createPassword').clone().attr('type', 'text'));
              },
              function () {
                $(this).removeClass('g-rid-input__eye_blue').addClass('g-rid-input__eye');
                $('#createPassword').replaceWith($('#createPassword').clone().attr('type', 'password'));
              }
      );
    });
  </script>

</head>
<body>


<div id="cart_block">
  <p><img width="20" height="20" class="imgn" src="http://s1.iconbird.com/ico/1112/DiagramPreview/w128h1281354121025diagram61.png"></p>
  <a class="hub-i-link" href="" >
    <span>Корзина</span>
  </a>
</div>

<br>

<div id="header">
  <h1>Добро пожаловать!</h1>
  <h3>ПОКУПАЙКА</h3>
  <h2>В интернет магазин</h2>


  <div class="header-search-wrap" id="search">
    <form name="search-form" class="header-search" method="get" action="http://" onsubmit="document.fireEvent('searchButton');" data-secure-csrf="0">

      <div name="header-search-input-text-wrap" class="header-search-input-text-wrap ">
        <input autocomplete="off" type="text" name="text" class="header-search-input-text" placeholder="Поиск" value="" tabindex="1">
      </div>

				<span class="btn-link btn-link-green">
					<button name="search-button" class="btn-link-i" type="submit">Найти</button>
				</span>
    </form>
  </div>


  <div class="header-search-wrap" id="search">
    <form name="search-form" class="header-search" method="get" action="http://" onsubmit="document.fireEvent('searchButton');" data-secure-csrf="0">

      <div name="header-search-input-text-wrap" class="header-search-input-text-wrap ">
        <input autocomplete="off" type="text" name="text" class="header-search-input-text passive" placeholder="Поиск" value="" tabindex="1">
      </div>

				<span class="btn-link btn-link-green">
					<button name="search-button" class="btn-link-i" type="submit">Найти</button>
				</span>
    </form>
  </div>

  <div class="registration_common_block">
    <form action="#" method="post" class="rf">
      <div class="rid-line">
        <label for="createEmail" class="rid-line__label rid-line__label_wide">
          <div class="rid-line__label-line">Email</div>
        </label>

        <div class="rid-line__content">
          <div class="rid-emailpick">
            <div class="rid-emailpick__name">
              <input type="text" class="g-rid-input" id="createEmail" placeholder="Введите Email">
            </div>
          </div>
        </div>
        <div class="rid-line__tip">
          <div class="rid-line__tip-content">
            <div class="rid-line__tip-line" style="display:none" id="Name5">Поле должно быть заполненным</div>
            <div class="rid-line__tip-line" id="Name6" style="display:none">ok</div>
          </div>
        </div>
        <div class="rid-line rid-line_subline">
          <div class="suggest_wrap g-hidden"></div>
        </div>
      </div>
      <div>
        <div class="rid-line">
          <label for="createPassword" class="rid-line__label rid-line__label_wide">
            <div class="rid-line__label-line">Pass</div>
          </label>

          <div class="rid-line__content">
            <div class="rid-line__input rid-line__input_profile-edit rid-line_pass-reliability rid-line_pass-reliability-0">
              <input type="password" class="g-rid-input g-rid-input_password" id="createPassword">
              <span class="g-rid-input__eye g-rid-input__eye_grey" id="createPassword1"></span>
            </div>
          </div>
          <div class="rid-line__tip">
            <div class="rid-line__tip-content">
              <div class="rid-line__tip-line" style="display:none" id="Name7">Пароль должен содержать от 6
                символов
              </div>
              <div class="rid-line__tip-line" id="Name8" style="display:none">ok</div>
            </div>
          </div>
        </div>
      </div>
    </form>
  </div>
  <div class="registration_register_block">
    <div class="rid-line rid-line_without-label">
      <div class="rid-line__content">
        <div class="rid-line__save-btn register_button_wrap">
          <button class="rid-btn rid-btn_common rid-btn_save rid-btn_signup" id="rid-btn__inner">
            <span class="rid-btn__inner">Login</span>
          </button>
        </div>
      </div>
      <div class="rid-line__tip">
        <div class="rid-line__tip-content">
          <div class="rid-line__tip-line">Нажимая  «Login»,
            <br>вы подтверждаете свое <br> согласие с
            <a class="g-pseudo-link legal_link"> правилами</a>
          </div>
        </div>
      </div>
    </div>
  </div>




</div>
<ul id="menu">
  <li><a class="sel" href="#"><span></span>Каталог</a></li>
  <li><a href="#"><span></span>Доставка</a></li>
  <li><a href="#"><span></span>Гарантия</a></li>
  <li><a href="#"><span></span>Кредит</a></li>
  <li><a href="#"><span></span>Контакты</a></li>
</ul>


<div id="content">
  <h2>АКЦИИ</h2>
  <iframe width="560" height="315" src="https://www.youtube.com/embed/JOMnHaMhoN8?autoplay=1" frameborder="0"
          allowfullscreen></iframe>


</div>

<div id="footer">
  Copyright © Skityashin;
  <a href="#">Каталог</a> |
  <a href="#">Доставка</a> |
  <a href="#">Гарантия</a> |
  <a href="#">Кредит</a> |
  <a href="#">Контакты</a>
</div>

</body>
</html>
