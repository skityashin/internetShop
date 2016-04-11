<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>

<script src="http://code.jquery.com/jquery-1.8.3.js"></script>
<script language="javascript" type="text/javascript" src="/resources/js/remove.js"></script>
<link rel="stylesheet" type="text/css" href="/resources/css/shoppingCart.css">

<c:forEach var="item" items="${items}">
    <table border="0">
        <tr>
                <%--<td rowspan="4"><img src="/resources/image/tehnika.resized.jpg"></td>--%>
            <td>Title: </td>
            <td>${item.product.title_prod}</td>
        </tr>
        <tr>
            <td>Price: </td>
            <td>${item.product.price}</td>
        </tr>
        <tr>
            <td>description: </td>
            <td>${item.product.description}</td>
        </tr>
        <tr>
            <td rowspan="4"><img height="85" width="128" src="/resources/images/${item.product.id_prod}.jpg"></td>
        </tr>

        <tr>
            <td>
                <input id="quantity" type="input" size="3" name="quantity[${item.product.id_prod}]" value="${item.quantity}"/>
                <input type="button" class="delete" value="Del" data-product-id="${item.product.id_prod}">
            </td>
        </tr>
    </table>
</c:forEach>
<div >
    <table  border="0">
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

