<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>

<script src="http://code.jquery.com/jquery-1.8.3.js"></script>
<script language="javascript" type="text/javascript" src="/resources/js/shoppingCart.js"></script>
<script language="javascript" type="text/javascript" src="/resources/js/select.js"></script>
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


<div id="sort_view">
    <span>Сортировка</span>
    <select class="select_id" onchange="val()"  id="select_id">
        <option  value="0">по названию</option>
        <option  value="1">цена(увеличение)</option>
        <option  value="2">цена(уменьшение)</option>
    </select>
</div>


<c:forEach var="product" items="${products}">
    <table id="ttt" border="1px">
        <tr>
            <td rowspan="4"><img height="85" width="128" src="/resources/images/${product.id_prod}.jpg"></td>
            <td>${product.title_prod}</td>
        </tr>
        <tr>
            <td>Price: ${product.price}</td>
        </tr>
        <tr>
            <td>${product.description}</td>
        </tr>
        <tr>
            <td>
                <input id="cart_btn" class="btn add2card" type="button" value="Add to cart"
                       data-product-id="${product.id_prod}"/>
                <a href='/product/find/${product.id_prod}'>
                    <input id="View" type="button" class="btn" value="View" data-product-id="${product.id_prod}">
                </a>
            </td>
        </tr>
    </table>
</c:forEach>


