<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>

 <div>Title: ${title}</div>
 <div>Price: ${price}</div>
 <div>Description: ${description}</div>
 <input id="cart_btn" class="btn add2card" type="button" value="Add to cart"
        data-product-id="${product.id_prod}"/>

 <div>---------------------------------------------------------------------------------</div>
  <div>shoppingCart</div>
 <p><a href="cart"><img src="http://www.linestyle.com.ua/ru/images/car.png"
                        width="149" height="110" alt="cart"></a>
 </p>
 <table border="0">
  <tr>
   <td>TotalCost: ${totalCost}</td>
  </tr>
  <tr>
   <td>TotalAmount: ${totalAmount}</td>
  </tr>
 </table>


</div>
