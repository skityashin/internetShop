<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="/resources/css/shoppingCart.css">
<script src="http://code.jquery.com/jquery-1.8.3.js"></script>
<script language="javascript" type="text/javascript" src="/resources/js/shoppingCart.js"></script>


<div id="shoppingCart">shoppingCart
    <p><a href="/cart/checkout"><img src="http://www.linestyle.com.ua/ru/images/car.png"
                           width="149" height="110" alt="cart"></a>
    </p>
    <table id="shoppingCart1"border="1" style="color: yellow">
        <tr>
            <td>TotalCost:</td>
            <td width="70px" align="center" id="totalCost">${totalCost}</td>
            <td>гривен</td>
        </tr>
        <tr>
            <td>TotalAmount:</td>
            <td  align="center"  id="totalAmount">${totalAmount}</td>
            <td>шт</td>
        </tr>
    </table>
</div>


<table id="ttt" border="1px" style="color: black">
    <tr>
        <td rowspan="4"><img height="340" width="512" src="/resources/images/${id_prod}.jpg"></td>
        <td  align="center" >${title}</td>
    </tr>
    <tr>
        <td  align="center" >Price: ${price}</td>
    </tr>
    <tr>
        <td  align="center" >${description}</td>
    </tr>
    <tr>
        <td>
            <input var="product" id="cart_btn" class="btn add2cart" type="button" value="Add to cart"
                   data-product-id="${id_prod}"/>
        </td>
    </tr>
    <br>
</table>



