<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<link rel="stylesheet" type="text/css" href="/resources/css/main.css">
<%--<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>--%>
<%--<script src="http://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>--%>
<script  type="text/javascript" src="/resources/js/main.js"></script>

<div id="header">
    <h1>Добро пожаловать!</h1>

    <h3>ПОКУПАЙКА</h3>

    <h2>В интернет магазин</h2>

    <div id="search">

        <form  class="header-search1" method="POST" action="/product/write" role="search">
            <div>
                <input autocomplete="off" type="text" class="header-search-input-text1" placeholder="Поиск"
                       value="" tabindex="1" name="search" autocomplete="off">
            </div>
                <span class="btn-link-green1" >
                    <button class="btn-link-i1" type="submit">Найти</button>
                </span>
        </form>
    </div>


    <div class="registration_common_block1">
        <form action="/user/login" method="POST">
            <div class="rid-line1">
                <label for="createEmail2" class="rid-line__label1 rid-line__label_wide1">
                    <div class="rid-line__label-line1">Email</div>
                </label>

                <div class="rid-line__content1">
                    <div class="rid-emailpick1">
                        <div class="rid-emailpick__name1">
                            <input type="text" class="g-rid-input1" value="" name= "email" id="createEmail2" placeholder="Введите Email">
                        </div>
                    </div>
                </div>
                <div class="rid-line__tip1">
                    <div class="rid-line__tip-content1">
                        <div class="rid-line__tip-line1" style="display:none" id="Name4">Поле должно быть заполненным
                        </div>
                        <div class="rid-line__tip-line1" id="Name1" style="display:none">ok</div>
                    </div>
                </div>
                <div class="rid-line1 rid-line_subline1">
                    <div class="suggest_wrap g-hidden1"></div>
                </div>
            </div>
            <div>
                <div class="rid-line1">
                    <label for="createPassword2" class="rid-line__label1 rid-line__label_wide1">
                        <div class="rid-line__label-line1">Pass</div>
                    </label>

                    <div class="rid-line__content1">
                        <div class="rid-line__input1 rid-line__input_profile-edit1 ">
                            <input type="password" class="g-rid-input1 g-rid-input_password1"  value=""  name= "pass" id="createPassword2">
                            <span class="g-rid-input__eye1 g-rid-input__eye_grey1" id="createPassword11"></span>
                        </div>
                    </div>
                    <div class="rid-line__tip1">
                        <div class="rid-line__tip-content1">
                            <div class="rid-line__tip-line1" style="display:none" id="Name2">Пароль должен содержать от
                                6
                                символов
                            </div>
                            <div class="rid-line__tip-line1" id="Name3" style="display:none">ok</div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="registration_register_block1">
                <div class="rid-line1">
                    <div class="rid-line__content1">
                        <div>
                            <button class="rid-btn1 rid-btn_save1" id="rid-btn__inner">
                                <span>Login</span>
                            </button>
                        </div>
                    </div>
                    <%--<div class="rid-line__tip1">--%>
                    <%--<div class="rid-line__tip-content1">--%>
                    <%--<div class="rid-line__tip-line1">Нажимая «Login»,--%>
                    <%--<br>вы подтверждаете свое <br> согласие с--%>
                    <%--<a class="g-pseudo-link legal_link"> правилами</a>--%>
                    <%--</div>--%>
                    <%--</div>--%>
                    <%--</div>--%>
                </div>
            </div>

        </form>
    </div>


    <ul id="menu">
        <li><a class="sel" href="/product/getAll"><span></span>Каталог</a></li>
        <li><a href="#"><span></span>Админка</a></li>
        <li><a href="/product/find/{id_prod}"><span></span>Продукт</a></li>
        <li><a href="/hello"><span></span>Кредит</a></li>
        <li><a href="/cart/checkout" ><span></span>Корзина</a></li>
    </ul>
</div>
