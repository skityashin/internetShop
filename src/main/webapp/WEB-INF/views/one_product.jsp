<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="/resources/css/shoppingCart.css">

<div>

    <div>Title: ${title}</div>
    <div>Price: ${price}</div>
    <div>Description: ${description}</div>
    <input id="cart_btn" class="btn add2card" type="button" value="Add to cart"
           data-product-id="${product.id_prod}"/>
</div>


<div id="shoppingCart">shoppingCart
    <p><a href="cart"><img src="http://www.linestyle.com.ua/ru/images/car.png"
                           width="149" height="110" alt="cart"></a>
    </p>
    <table id="shoppingCart1" border="0">
        <tr>
            <td>TotalCost:</td>
            <td id="totalCost">${totalCost}</td>
        </tr>
        <tr>
            <td>TotalAmount:</td>
            <td id="totalAmount">${totalAmount}</td>
        </tr>
    </table>
</div>
