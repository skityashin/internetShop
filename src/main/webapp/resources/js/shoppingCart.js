$(document).ready(function(){

    $('.add2card').on("click",function(){
        var id_prod = $(this).data('product-id');
        $.ajax({
            url: '/cart/product/' + id_prod,
            dataType: 'JSON',
            type: 'GET',
            success: function(response){
                // $('#totalCost').html(response.totalCost);
                // $('#totalAmount').html(response.totalAmount);
                $('#totalCost').val(response.totalAmount);
                $('#totalAmount').val(response.totalAmount);
                
                alert( "Всего добавлено товаров: " + totalAmount + "На сумму: " + totalAmount);

            }
        });

    });
});