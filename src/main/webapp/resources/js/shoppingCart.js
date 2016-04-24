$(document).ready(function () {


    $('.add2cart').on("click", function () {
        var id_prod = $(this).data('product-id');
        $.ajax({
            url: '/cart/product/' + id_prod,
            dataType: 'JSON',
            type: 'GET',
            success: function (response) {
                $('#quantity').html(response.quantity);
                $('#totalCost').html(response.totalCost);
                $('#totalAmount').html(response.totalAmount);
                // document.location.reload();
            }
        });
    });
    $('.delcart').on("click", function () {
        var id_prod = $(this).data('product-id');
        $.ajax({
            url: '/cart/productdel/' + id_prod,
            dataType: 'JSON',
            type: 'GET',
            success: function (response) {
                $('#quantity').html(response.quantity);
                $('#totalCost').html(response.totalCost);
                $('#totalAmount').html(response.totalAmount);


                // document.location.reload();
            }
        });
    });

    $.ajax({
        url: '/cart/info',
        dataType: 'JSON',
        type: 'GET',
        success: function (response) {
            $('#totalCost').html(response.totalCost);
            $('#totalAmount').html(response.totalAmount);
            $('#quantity').html(response.quantity);
        }
    });
    
});