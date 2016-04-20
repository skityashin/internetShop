$(document).ready(function () {

    $('.delete').click(function () {

        var id_prod = $(this).data('product-id');
        $.ajax({
            url: '/cart/' + id_prod,
            type: 'POST',
            success: function () {
                location.reload();
            }
        });
    });
});
