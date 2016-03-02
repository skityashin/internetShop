$(document).ready(function () {
    $(":button").click(function (e) {
        e.preventDefault();
        var val3 = $("#createEmail2").val();
        if (val3 != "") //val.length > 2 &&
        {
            $("#Name1").show();
            $("#Name1").hide(5000);
        }
        else {
            $("#Name4").show();
            $("#Name4").hide(5000);
        }
        var val4 = $("#createPassword11").val();
        if (val4.length > 5 && val4 != "") {
            $("#Name3").show();
            $("#Name3").hide(5000);
        }
        else {
            $("#Name2").show();
            $("#Name2").hide(5000);
        }
    });
    $("#createPassword11").toggle(
        function (e) {
            e.preventDefault();
            $(this).removeClass("g-rid-input__eye1").addClass("g-rid-input__eye_blue1");
            $("#createPassword1").replaceWith($("#createPassword1").clone().attr("type", "text"));
        },
        function (e) {
            e.preventDefault();
            $(this).removeClass("g-rid-input__eye_blue").addClass("g-rid-input__eye");
            $("#createPassword1").replaceWith($("#createPassword1").clone().attr("type", "password"));
            //$(id).clone().attr("id", "newId").find("#input_1").attr("id", "input_2");
        }
    );
});


