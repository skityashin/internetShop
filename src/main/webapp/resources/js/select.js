$(document).ready(function(){
    function val() {
        d = document.getElementById("select_id").value;
        // document.getElementById('select_id').selectedIndex = -1;
    }
    $('#select_id').change(function(){
    // $('#select_id').prop('selected', true);
        var myTag =($(this).val());
alert(myTag);
        $("#select_id [value=myTag]").attr("selected", "selected");

        // var element = $("option:selected", this);
        // var myTag = element.attr("selected");
        //
        // $(this).val(myTag)

        // if($(this).val()=="/product/getAll1"){
        //     $("#select_id :contains('/product/getAll1')").attr("selected", "selected");
            // $(this).attr("selected", "selected");
        // }

    })
});