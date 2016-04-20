$(document).ready(function () {

    var location = document.location.href;
    var last = location.length - 1;
    var result = location.charAt(last);

    if (found = result) {
        $('#select_id').val(found);
    }

    $('#select_id').on("change", function () {
        var myTag = $("#select_id :selected").val();
        var url = '/product/getAll' + myTag;
        $.ajax({
            url: url,
            type: 'GET',
            success: function (response) {
                document.location.href = url;
            }
        });
    });

});

