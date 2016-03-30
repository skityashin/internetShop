<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>

<script src="http://code.jquery.com/jquery-1.8.3.js"></script>
<script language="javascript"  type="text/javascript" src="/resources/js/shoppingCart.js"></script>

<c:forEach var="product" items="${products}">
    <table border="0">
        <tr>
                <%--<td rowspan="4"><img src="/resources/image/tehnika.resized.jpg"></td>--%>
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
                    <input type="button" class="btn" value="View" data-product-id="${product.id_prod}">
                </a>
            </td>
        </tr>
    </table>
</c:forEach>
<div>---------------------------------------------------------------------------------</div>
<div>shoppingCart</div>
<p><a href="cart"><img src="http://www.linestyle.com.ua/ru/images/car.png"
                             width="149" height="110" alt="cart"></a>
</p>
<table border="0">
    <tr>
        <td id="totalCost">TotalCost: ${totalCost}</td>
    </tr>
    <tr>
        <td id="totalAmount">TotalAmount: ${totalAmount}</td>
    </tr>
</table>

<%--<script>--%>
    <%--$('#cart_btn').on("click", function(event){--%>
        <%--alert("AAAA");--%>
        <%--var id_prod = $(this).data('product-id');--%>
        <%--alert(id_prod);--%>
        <%--$.ajax({--%>
            <%--url: "/cart/product/" + id_prod,--%>
            <%--dataType: 'JSON',--%>
            <%--type: 'GET',--%>
            <%--success: function(response){--%>
                <%--$('#totalCost').html(response.totalCost);--%>
                <%--$('#totalAmount').html(response.totalAmount);--%>


                <%--alert( "Всего добавлено товаров: " + totalAmount + "На сумму: " + totalAmount);--%>

            <%--}--%>
        <%--});--%>

    <%--});--%>
<%--</script>--%>


