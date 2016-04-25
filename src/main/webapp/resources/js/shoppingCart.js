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




    $("a[data-type='delcart']").click(function() {
        var input = $(this).parent().find('input');
        var num = input.val();
        if (num > 0) {
            num--;
            input.val(num);
            // ajax here
            console.log('delete item id: ' + input.data('item'));
        }
        return false;
    });
    $("a[data-type='add2cart']").click(function() {
        var input = $(this).parent().find('input');
        var num = input.val();
        if (num < 100) {
            num++;
            input.val(num);
            // ajax here
            console.log('add item id: ' + input.data('item'));
        }
        return false;
    });
    $("input[data-item]").change(function() {
        var num = $(this).val() - 0;
        if (isNaN(num)) {
            num = 0;
        }
        if (num > 100) {
            num = 100;
        } else if (num < 0) {
            num = 0;
        }
        $(this).val(num);
        // ajax here
        console.log('change item id: ' + $(this).data('item') + ' to ' + num  + ' value');
    });


});