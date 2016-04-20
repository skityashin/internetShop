<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
    <form action="/product/add" method="post" id="add-product">
        title_prod: <input type="text" value="" name="title_prod"><br>
        description: <input type="text" value="" name="description"><br>
        price: <input type="text" value="" name="price"><br>
        quantity: <input type="text" value="" name="quantity"><br>
        category:
        <select name="title_category">
            <option selected value="TV">TV</option>
            <option value="MOB">MOB</option>
        </select>
        <br>
        <input type="submit">
    </form>
</div>
