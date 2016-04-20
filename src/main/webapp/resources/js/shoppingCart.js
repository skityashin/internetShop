$(document).ready(function () {

    $.ajax({
        url: '/cart/info',
        dataType: 'JSON',
        type: 'GET',
        success: function (response) {
            $('#totalCost').html(response.totalCost);
            $('#totalAmount').html(response.totalAmount);
        }
    });


    $('.add2card').on("click", function () {
        var id_prod = $(this).data('product-id');
        $.ajax({
            url: '/cart/product/' + id_prod,
            dataType: 'JSON',
            type: 'GET',
            success: function (response) {
                $('#totalCost').html(response.totalCost);
                $('#totalAmount').html(response.totalAmount);
            }
        });

    });

});