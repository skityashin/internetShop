$(document).ready(function () {
    // function val() {
    //     d = document.getElementById("select_id").value;
    // }

    $('#select_id').on("change",function () {
        var myTag = $("#select_id :selected").val();
        alert(myTag);
        $.ajax({
            url: 'product/getAll' + myTag,
            dataType: 'JSON',
            type: 'GET',
            success: function () {
                location.reload();
            }
        });

    });

});