<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="/resources/css/login.css">
 <script src="/resources/js/login.js"></script>



    <div class="registration_common_block">
        <form action="/user/login" method="post" class="rf">
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



