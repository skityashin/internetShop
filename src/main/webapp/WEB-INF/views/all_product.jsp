<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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


