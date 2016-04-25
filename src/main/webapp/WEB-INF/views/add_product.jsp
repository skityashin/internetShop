<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<div>
    <form action="/product/add" method="post" id="add-product">
        <table border="1px" style="color: black">
            <tr>
                <td  align="center" >title_prod:</td>
                <td  align="center" ><input type="text" value="" name="title_prod"></td>
            </tr>
            <tr>
                <td  align="center" >description:</td>
                <td  align="center" ><input type="text" value="" name="description"></td>
            </tr>
            <tr>
                <td  align="center" >price:</td>
                <td  align="center" ><input type="text" value="" name="price"></td>
            </tr>
            <tr>
                <td  align="center" >quantity:</td>
                <td  align="center" ><input type="text" value="" name="quantity"></td>
            </tr>
            <tr>
                <td  align="center" >category:</td>
                <td  align="center" >
                <select name="title_category">
                    <option selected value="TV">TV</option>
                    <option value="MOB">MOB</option>
                </select>
                </td>
            </tr>
            <tr >
                <td rowspan="4" align="center" > <input type="submit"></td>
            </tr>
        </table>
    </form>
</div>
