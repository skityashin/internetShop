<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
    <form action="/product/add" method="post" id="add-product">

    <%--id_prod:  <input type="text" value=${id_prod}><br>--%>
    title_prod:  <input type="text" value="" name="title_prod" ><br>
    <%--description:  <input type="text" value=${description}><br>--%>
    price:  <input type="text" value="" name="price"><br>
    quantity:  <input type="text" value="" name="quantity"><br>
    <%--category:  <input type="text" value=${category}><br>--%>
    <input type="submit">
    </form>
</div>
