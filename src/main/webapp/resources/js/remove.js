$(document).ready(function(){

    $('.delete').click(function(){

        var id_prod = $(this).data('product-id');
        $.ajax({
            url: '/cart/' + id_prod,
            // dataType: 'JSON',
            type: 'POST',
            success: function(){
               location.reload();
                // $('#totalCost').html(response.totalCost);
                // $('#totalAmount').html(response.totalAmount);
            }
        });
        // $.ajax({
        //     url: '/cart/checkout',
        //     // dataType: 'JSON',
        //     type: 'POST',
        //     success: function(){
        //         location.reload();
        //     }
        // });

    });

});
