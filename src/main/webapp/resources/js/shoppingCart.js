$(document).ready(function(){

    $('#cart_btn').on("click",function(){
        alert("AAAA");
        var id_prod = $(this).data('product-id');
        alert(id_prod);
        $.ajax({
            url: '/cart/product/' + id_prod,
            dataType: 'JSON',
            type: 'GET',
            success: function(response){
                $('#totalCost').html(response.totalCost);
                $('#totalAmount').html(response.totalAmount);

                
                alert( "Всего добавлено товаров: " + totalAmount + "На сумму: " + totalAmount);

            }
        });

    });
});