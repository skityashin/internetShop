<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<link rel="stylesheet" type="text/css" href="/resources/css/user.css">
<script src="/resources/js/user.js"></script>

<section class="content">
    <div id="sidebar">
        <p><a href="___.html">Телефизоры</a></p>

        <p><a href="___.html">Смартфоны</a></p>

        <p><a href="___.html">Планшеты</a></p>

        <p><a href="___.html">Ноутбуки</a></p>
    </div>
    <div id="content">
        <h2>АКЦИИ</h2>
        <iframe width="560" height="315" src="https://www.youtube.com/embed/JOMnHaMhoN8?autoplay=1" frameborder="0"
                allowfullscreen></iframe>


    </div>


    <div class="registration_common_block">
        <form action="#" method="post" class="rf">
            <div class="rid-line">
                <label for="typeInName" class="rid-line__label rid-line__label_wide">
                    <div class="rid-line__label-line">Имя</div>
                </label>

                <div class="rid-line__content">
                    <div class="rid-line__input rid-line__input_profile-edit">
                        <input type="text" name="typeInName" class="g-rid-input" id="typeInName"
                               placeholder="Введите Имя">
                    </div>
                </div>
                <div class="rid-line__tip">
                    <div class="rid-line__tip-content">
                        <div class="rid-line__tip-line" id="Name1" style="display:none">Поле должно быть заполненным
                        </div>
                        <div class="rid-line__tip-line" id="Name2" style="display:none">ok</div>
                    </div>
                </div>
            </div>
            <div class="rid-line">
                <label for="secondName" class="rid-line__label rid-line__label_wide">
                    <div class="rid-line__label-line">Фамилия</div>
                </label>

                <div class="rid-line__content">
                    <div class="rid-line__input rid-line__input_profile-edit">
                        <input type="text" class="g-rid-input" id="secondName" placeholder="Введите Фамилию">
                    </div>
                </div>
                <div class="rid-line__tip">
                    <div class="rid-line__tip-content">
                        <div class="rid-line__tip-line" style="display:none" id="Name3">Поле должно быть заполненным
                        </div>
                        <div class="rid-line__tip-line" id="Name4" style="display:none">ok</div>
                    </div>
                </div>
            </div>
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
                        <div class="rid-line__tip-line" style="display:none" id="Name5">Поле должно быть заполненным
                        </div>
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
                            <div class="rid-line__tip-line" style="display:none" id="Name7">Пароль должен содержать от 6
                                символов
                            </div>
                            <div class="rid-line__tip-line" id="Name8" style="display:none">ok</div>
                        </div>
                    </div>
                </div>
                <div class="rid-line">
                    <label for="retypePassword" class="rid-line__label rid-line__label_wide">
                        <div class="rid-line__label-line">Повторите пароль</div>
                    </label>

                    <div class="rid-line__content">
                        <div class="rid-line__input rid-line__input_profile-edit ">
                            <input type="password" class="g-rid-input g-rid-input_password" id="retypePassword">
                            <span class="g-rid-input__eye g-rid-input__eye_grey" id="retypePassword1"></span>
                        </div>
                    </div>
                    <div class="rid-line__tip">
                        <div class="rid-line__tip-content">
                            <div class="rid-line__tip-line" style="display:none" id="Name9">Пароль не совпадает</div>
                            <div class="rid-line__tip-line" id="Name10" style="display:none">ok</div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="rid-line">
                <label for="" class="rid-line__label rid-line__label_wide">
                    <div class="rid-line__label-line">Дата рождения</div>
                </label>

                <div class="rid-line__content">
                    <div class="rid-datepick" id="rid-datepick">
                        <div class="rid-datepick__day">
                            <div class="rid-selectbox rid-selectbox_daypicker">
                                <select name="daypicker" class="birthday_select" id="1">
                                    <option value="-1">День</option>
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                    <option value="6">6</option>
                                    <option value="7">7</option>
                                    <option value="8">8</option>
                                    <option value="9">9</option>
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                    <option value="13">13</option>
                                    <option value="14">14</option>
                                    <option value="15">15</option>
                                    <option value="16">16</option>
                                    <option value="17">17</option>
                                    <option value="18">18</option>
                                    <option value="19">19</option>
                                    <option value="20">20</option>
                                    <option value="21">21</option>
                                    <option value="22">22</option>
                                    <option value="23">23</option>
                                    <option value="24">24</option>
                                    <option value="25">25</option>
                                    <option value="26">26</option>
                                    <option value="27">27</option>
                                    <option value="28">28</option>
                                    <option value="29">29</option>
                                    <option value="30">30</option>
                                    <option value="31">31</option>
                                </select>
                            </div>
                        </div>
                        <div class="rid-datepick__month">
                            <div class="rid-selectbox rid-selectbox_monthpicker">
                                <select name="monthpicker" class="birthday_select" id="2">
                                    <option value="-1">Месяц</option>
                                    <option value="0">Январь</option>
                                    <option value="1">Февраль</option>
                                    <option value="2">Март</option>
                                    <option value="3">Апрель</option>
                                    <option value="4">Май</option>
                                    <option value="5">Июнь</option>
                                    <option value="6">Июль</option>
                                    <option value="7">Август</option>
                                    <option value="8">Сентябрь</option>
                                    <option value="9">Октябрь</option>
                                    <option value="10">Ноябрь</option>
                                    <option value="11">Декабрь</option>
                                </select>
                            </div>
                        </div>
                        <div class="rid-datepick__year">
                            <div class="rid-selectbox rid-selectbox_yearpicker">
                                <select name="yearpicker" class="birthday_select" id="3">
                                    <option value="-1">Год</option>
                                    <option value="2010">2010</option>
                                    <option value="2009">2009</option>
                                    <option value="2008">2008</option>
                                    <option value="2007">2007</option>
                                    <option value="2006">2006</option>
                                    <option value="2005">2005</option>
                                    <option value="2004">2004</option>
                                    <option value="2003">2003</option>
                                    <option value="2002">2002</option>
                                    <option value="2001">2001</option>
                                    <option value="2000">2000</option>
                                    <option value="1999">1999</option>
                                    <option value="1998">1998</option>
                                    <option value="1997">1997</option>
                                    <option value="1996">1996</option>
                                    <option value="1995">1995</option>
                                    <option value="1994">1994</option>
                                    <option value="1993">1993</option>
                                    <option value="1992">1992</option>
                                    <option value="1991">1991</option>
                                    <option value="1990">1990</option>
                                    <option value="1989">1989</option>
                                    <option value="1988">1988</option>
                                    <option value="1987">1987</option>
                                    <option value="1986">1986</option>
                                    <option value="1985">1985</option>
                                    <option value="1984">1984</option>
                                    <option value="1983">1983</option>
                                    <option value="1982">1982</option>
                                    <option value="1981">1981</option>
                                    <option value="1980">1980</option>
                                    <option value="1979">1979</option>
                                    <option value="1978">1978</option>
                                    <option value="1977">1977</option>
                                    <option value="1976">1976</option>
                                    <option value="1975">1975</option>
                                    <option value="1974">1974</option>
                                    <option value="1973">1973</option>
                                    <option value="1972">1972</option>
                                    <option value="1971">1971</option>
                                    <option value="1970">1970</option>
                                </select>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="rid-line__tip">
                    <div class="rid-line__tip-content">
                        <div class="rid-line__tip-line" style="display:none" id="Name13">Укажите дату рождения
                            полностью
                        </div>
                        <div class="rid-line__tip-line" style="display:none" id="Name14">ok</div>
                    </div>
                </div>
            </div>
            <div class="rid-line">
                <div class="rid-line__label rid-line__label_wide">
                    <div class="rid-line__label-line">Пол</div>
                </div>
                <div class="rid-line__content">
                    <div class="rid-radiobtn rid-radiobtn_sex">
                        <input type="radio" id="radio01" name="sex" class="rid-radiobtn__elem gender_radio_button">
                        <label for="radio01" class="rid-radiobtn__label " id="Name15">Мужской</label>
                    </div>
                    <div class="rid-radiobtn rid-radiobtn_sex">
                        <input type="radio" id="radio02" name="sex" class="rid-radiobtn__elem gender_radio_button">
                        <label for="radio02" class="rid-radiobtn__label" id="Name16">Женский</label>
                    </div>
                </div>

                <div class="rid-line__tip">
                    <div class="rid-line__tip-content">
                        <div class="rid-line__tip-line" id="Name11" style="display:none">Выберите пол</div>
                        <div class="rid-line__tip-line" id="Name12" style="display:none">ok</div>
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
</section>