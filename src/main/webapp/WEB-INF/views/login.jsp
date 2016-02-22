<%--
  Created by IntelliJ IDEA.
  User: web
  Date: 22.02.2016
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>




</head>
<body>
<div class="rid-line">
  <label for="createEmail" class="rid-line__label rid-line__label_wide">
    <div class="rid-line__label-line">Укажите почту</div>
  </label>
  <div class="rid-line__content">
    <div class="rid-emailpick">
      <div class="rid-emailpick__name">
        <input type="text" class="g-rid-input" id="createEmail" placeholder="Введите Email">
      </div>
      <div class="rid-emailpick__domain">
        <div class="rid-selectbox rid-selectbox_email">
          <select name="yearpicker" id="domainSelect">
            <option value="rambler.ru">@rambler.ru</option>
            <option value="gmail.com">@gmail.com</option>
            <option value="ukr.net">@ukr.net</option>
            <option value="mail.ru">@mail.ru</option>
            <option value="yandex.ru">@yandex.ru</option>
          </select>
        </div>
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
      <div class="rid-line__label-line">Придумайте пароль</div>
    </label>
    <div class="rid-line__content">
      <div class="rid-line__input rid-line__input_profile-edit rid-line_pass-reliability rid-line_pass-reliability-0">
        <input type="password" class="g-rid-input g-rid-input_password" id="createPassword">
        <span class="g-rid-input__eye g-rid-input__eye_grey" id="createPassword1"></span>
      </div>
    </div>
    <div class="rid-line__tip">
      <div class="rid-line__tip-content">
        <div class="rid-line__tip-line" style="display:none" id="Name7">Пароль должен содержать от 6 символов</div>
        <div class="rid-line__tip-line" id="Name8" style="display:none">ok</div>
      </div>
    </div>
  </div>
</div>




</body>
</html>
