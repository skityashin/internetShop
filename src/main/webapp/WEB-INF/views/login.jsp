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

<br>

<div class="registration_common_block">
    <form action="#" method="post" class="rf">
        <div class="rid-line">
            <label for="createEmail" class="rid-line__label rid-line__label_wide">
                <div class="rid-line__label-line">Почта</div>
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
                    <div class="rid-line__label-line">Пароль</div>
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
                    <span class="rid-btn__inner">Зарегистрироваться</span>
                </button>
            </div>
        </div>
        <div class="rid-line__tip">
            <div class="rid-line__tip-content">
                <div class="rid-line__tip-line">Нажимая кнопку «Зарегистрироваться»,
                    <br>вы подтверждаете свое согласие<br> с
                    <a class="g-pseudo-link legal_link">Моими правилами</a>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
