<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
    <form action="/user/join" method="POST" id="add-user">
        Неверно введены ЛОГИН или ПАРОЛЬ.<br>
        Повторите.<br>

        E-mail: <input type="text" value="" name="email"><br>
        Password: <input type="password" value="" name="pass"><br>

        <input type="submit">
    </form>
</div>
