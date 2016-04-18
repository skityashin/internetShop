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
                // $('#totalCost').html(response.totalCost);
                // $('#totalAmount').html(response.totalAmount);
            }
        });
    });

});


// $('#select_id').change(function(){
// $('#select_id').prop('selected', true);
// var myTag =($(this).val());
// alert(myTag);
// $("#select_id [value=myTag]").attr("selected", "selected");

// var element = $("option:selected", this);
// var myTag = element.attr("selected");
//
// $(this).val(myTag)

// if($(this).val()=="/product/getAll1"){
//     $("#select_id :contains('/product/getAll1')").attr("selected", "selected");
// $(this).attr("selected", "selected");
// }
//
// })
// });