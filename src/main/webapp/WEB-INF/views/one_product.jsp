<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="/resources/css/shoppingCart.css">


<div id="shoppingCart">shoppingCart
    <p><a href="cart"><img src="http://www.linestyle.com.ua/ru/images/car.png"
                           width="149" height="110" alt="cart"></a>
    </p>
    <table id="shoppingCart1" border="0">
        <tr>
            <td>TotalCost:</td>
            <td id="totalCost">${totalCost}</td>
            <td>гривен</td>
        </tr>
        <tr>
            <td>TotalAmount:</td>
            <td id="totalAmount">${totalAmount}</td>
            <td>шт</td>
        </tr>
    </table>
</div>

<div>

    <div>Title: ${title}</div>
    <div>Price: ${price}</div>
    <div>Description: ${description}</div>
    <td rowspan="4"><img height="85" width="128" src="/resources/images/${id_prod}.jpg"></td>
    <input id="cart_btn" class="btn add2card" type="button" value="Add to cart" data-product-id="${id_prod}"/>
</div>



