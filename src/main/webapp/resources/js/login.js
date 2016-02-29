
$(document).ready(function () {
    $(":button").click(function () {
        var val3 = $("#createEmail").val();
        if (val3 != "") //val.length > 2 &&
        {
            $("#Name6").show();
            $("#Name6").hide(5000);
        }
        else {
            $("#Name5").show();
            $("#Name5").hide(5000);
        }
        var val4 = $("#createPassword").val();
        if (val4.length > 5 && val4 != "") {
            $("#Name8").show();
            $("#Name8").hide(5000);
        }
        else {
            $("#Name7").show();
            $("#Name7").hide(5000);
        }
    });
    $("#createPassword1").toggle(
        function () {
            $(this).removeClass('g-rid-input__eye').addClass('g-rid-input__eye_blue');
            $('#createPassword').replaceWith($('#createPassword').clone().attr('type', 'text'));
        },
        function () {
            $(this).removeClass('g-rid-input__eye_blue').addClass('g-rid-input__eye');
            $('#createPassword').replaceWith($('#createPassword').clone().attr('type', 'password'));
        }
    );
});
