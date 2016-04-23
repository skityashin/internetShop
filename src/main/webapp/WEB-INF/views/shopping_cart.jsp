<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>

<script src="http://code.jquery.com/jquery-1.8.3.js"></script>
<script language="javascript" type="text/javascript" src="/resources/js/remove.js"></script>
<script language="javascript" type="text/javascript" src="/resources/js/shoppingCart.js"></script>
<link rel="stylesheet" type="text/css" href="/resources/css/shoppingCart.css">

<c:forEach var="item" items="${items}">
    <table border="1" style="color: black">
        <tr>
            <td>Title:</td>
            <td  align="center" >${item.product.title_prod}</td>
        </tr>
        <tr>
            <td>Price:</td>
            <td  align="center" >${item.product.price}</td>
        </tr>
        <tr>
            <td>description:</td>
            <td  align="center" >${item.product.description}</td>
        </tr>
        <tr>
            <td rowspan="4"><img height="85" width="128" src="/resources/images/${item.product.id_prod}.jpg"></td>
        </tr>
        <tr>
            <td>
                <div>
                    <a href="" class="minus" name="minus" >
                        <img src="/resources/images/minus.jpg" width="20" height="20" class="minus-icon">
                    </a>
                    <input id="quantity" type="text" style="text-align:center" size="1" max="100" min="1" name="quantity" value="${item.quantity}"/>
                     <a href="${product.id_prod}" type="button" class="btn add2cart" data-product-id="${item.product.id_prod}">
                        <img src="/resources/images/plus.jpg" width="20" height="20" class="plus-icon">
                    </a>
                </div>
            </td>
        </tr>
        <tr>
            <td align="center">
                <input type="button" class="delete" value="Del All" data-product-id="${item.product.id_prod}">
            </td>
        </tr>

        <br>
    </table>
</c:forEach>
<br>
<div>
    <table border="2" style="color: black; background-color: yellow">
        <tr>
            <td>TotalCost:</td>
            <td width="70px" align="center" id="totalCost">${totalCost}</td>
            <td>гривен</td>
        </tr>
        <tr>
            <td>TotalAmount:</td>
            <td align="center" id="totalAmount">${totalAmount}</td>
            <td>шт</td>
        </tr>
    </table>
</div>



