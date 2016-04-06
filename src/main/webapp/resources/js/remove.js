$(document).ready(function(){

    $('.btn').on("click",function(){
        var id_prod = $(this).data('product-id');
        $.ajax({
            url: '/cart/' + id_prod,
            dataType: 'JSON',
            type: 'GET',
            success: function(response){
               
                $('#totalCost').html(response.totalCost);
                $('#totalAmount').html(response.totalAmount);

                // alert( "Всего добавлено товаров: " + response.totalAmount + "   На сумму: " + response.totalCost);

            }
        });

    });
});