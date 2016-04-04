<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:forEach var="product" items="${products}">
    <table border="0">
        <tr>
                <%--<td rowspan="4"><img src="/resources/image/tehnika.resized.jpg"></td>--%>
            <td>Title: ${product.title_prod}</td>
        </tr>
        <tr>
            <td>

                <a href='/product/find/${product.id_prod}'>
                    <input type="button" class="btn" value="Dell" data-product-id="${product.id_prod}">
                </a>
            </td>
        </tr>
    </table>
</c:forEach>



<c:forEach var="cart" items="${totalCost}">
    <table border="0">
        <tr>
            <td>TotalCost:</td>
            <td id="totalCost">${totalCost}</td>
        </tr>
    </table>
</c:forEach>

<c:forEach var="cart" items="${totalAmount}">
    <table border="0">
        <tr>
            <td>TotalAmount:</td>
            <td id="totalAmount">${totalAmount}</td>
        </tr>
    </table>
</c:forEach>

