$(document).ready(function(){

    $('.delete').on("click",function(){
        alert("GGGG");
        var id_prod = $(this).data('product-id');
        $.ajax({

            url: '/cart/' + id_prod,
            // dataType: 'JSON',
            type: 'POST',
            success: function(){
               document.location.reload();
                // $('#totalCost').html(response.totalCost);
                // $('#totalAmount').html(response.totalAmount);

                // alert( "NEW");

            }
        });


    });


});
