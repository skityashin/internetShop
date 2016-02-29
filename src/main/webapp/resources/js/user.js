$(document).ready(function(){

    $(":button").click(function(){
        var val1 = $("#typeInName").val();
        if(val1 != "") //val.length > 2 &&
        {
            $("#Name2").show();
            $("#Name2").hide(5000);
        }
        else
        {
            $("#Name1").show();
            $("#Name1").hide(5000);
        }
        var val2 = $("#secondName").val();
        if(val2 != "") //val.length > 2 &&
        {
            $("#Name4").show();
            $("#Name4").hide(5000);
        }
        else
        {
            $("#Name3").show();
            $("#Name3").hide(5000);
        }
        var val3 = $("#createEmail").val();
        if(val3 != "") //val.length > 2 &&
        {
            $("#Name6").show();
            $("#Name6").hide(5000);
        }
        else
        {
            $("#Name5").show();
            $("#Name5").hide(5000);
        }
        var val4 = $("#createPassword").val();
        if(val4.length > 5 && val4 != "")
        {
            $("#Name8").show();
            $("#Name8").hide(5000);
        }
        else
        {
            $("#Name7").show();
            $("#Name7").hide(5000);
        }
        var val5 = $("#retypePassword").val();
        if(val5 === val4 && val4 != "")
        {
            $("#Name10").show();
            $("#Name10").hide(5000);
        }
        else
        {
            $("#Name9").show();
            $("#Name9").hide(5000);
        }


        var inputCheck = $("#radio01").is(":checked");
        if (inputCheck == true) {
            $("#Name12").show();
            $("#Name12").hide(5000);
        } else {
            $("#Name11").show();
            $("#Name11").hide(5000);
        };



        if ($("#1").val() >0 && $("#2").val() >0 && $("#3").val() >0) {
            $("#Name14").show();
            $("#Name14").hide(5000);
        } else {
            $("#Name13").show();
            $("#Name13").hide(5000);
        };

        if ($("#1").val() >0 && $("#2").val() >0 && $("#3").val() >0 && inputCheck == true && val5 === val4 &&
            val4 != "" && val4.length > 5 && val3 != "" && val2 != "" && val1 != "") {
            window.location.href = "https://www.youtube.com/";
        }


    });

    $("#radio01").click(function(){
        $("#Name15").css("background-color","red");
        $("#Name16").css("background-color","#fff");
    });
    $("#radio02").click(function(){
        $("#Name16").css("background-color","red");
        $("#Name15").css("background-color","#fff");

    });



    $("#createPassword1").toggle(
        function(){
            $(this).removeClass('g-rid-input__eye').addClass('g-rid-input__eye_blue');
            $('#createPassword').replaceWith($('#createPassword').clone().attr('type', 'text'));
        },
        function(){
            $(this).removeClass('g-rid-input__eye_blue').addClass('g-rid-input__eye');
            $('#createPassword').replaceWith($('#createPassword').clone().attr('type', 'password'));
        }
    );
    $("#retypePassword1").toggle(
        function(){
            $(this).removeClass('g-rid-input__eye').addClass('g-rid-input__eye_blue');
            $('#retypePassword').replaceWith($('#retypePassword').clone().attr('type', 'text'));
        },
        function(){
            $(this).removeClass('g-rid-input__eye_blue').addClass('g-rid-input__eye');
            $('#retypePassword').replaceWith($('#retypePassword').clone().attr('type', 'password'));
        }
    );

});