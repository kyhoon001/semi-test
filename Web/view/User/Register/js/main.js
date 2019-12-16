
(function ($) {
    "use strict";


    /*==================================================================
    [ Validate ]*/
    var input = $('.validate-input .input100');

    $('.validate-form').on('submit',function(){

        for(var i=0; i<input.length; i++) {
            if(validate(input[i]) == false){
                showValidate(input[i]);
                return false;
            }
        }

    });


    $('.validate-form .input100').each(function(){
        $(this).focus(function(){
           hideValidate(this);
        });
    });

    function validate (input) {
        if($(input).attr('type') == 'email' || $(input).attr('name') == 'email') {
            if($(input).val().trim().match(/^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{1,5}|[0-9]{1,3})(\]?)$/) == null) {
                return false;
            }
        }
        else {
            if($(input).val().trim() == ''){
                return false;
            }
        }
    }

    function showValidate(input) {
        var thisAlert = $(input).parent();

        $(thisAlert).addClass('alert-validate');
    }

    function hideValidate(input) {
        var thisAlert = $(input).parent();

        $(thisAlert).removeClass('alert-validate');
    }

    //이메일 중복체크 function
    $('#email').blur(function(){
        var email = $('#email').val();
        $.ajax({
            url : 'duplCheck.mc?email='+email,
            type : 'get',
            success : function(data){
                if(data==1){
                    $('#id_check').text('사용중인 이메일입니다');
                    $('#id_check').css('color','red');
                    $('.login100-form-btn').attr('disabled',true);
                }else {
                    $('#id_check').text('');
                    $('#id_check').css('color','');
                    $('.login100-form-btn').attr('disabled',false);

                }
            }
        })
    })
    
    /*==================================================================
    [ Show pass ]*/
    var showPass = 0;
    $('.btn-show-pass').on('click', function(){
        if(showPass == 0) {
            $(this).next('input').attr('type','text');
            $(this).find('i').removeClass('fa-eye');
            $(this).find('i').addClass('fa-eye-slash');
            showPass = 1;
        }
        else {
            $(this).next('input').attr('type','password');
            $(this).find('i').removeClass('fa-eye-slash');
            $(this).find('i').addClass('fa-eye');
            showPass = 0;
        }
        
    });

    // Re-Password와 password가 맞는지 확인
    $('input[name="pwd2"]').on('blur', function(){
       passwordValidate();
    })

    

})(jQuery);

function passwordValidate(){
    let pass = $('input[name="pwd"]').val();
    let pass2 = $('input[name="pwd2"]').val();
    console.log(pass);
    console.log(pass2);
    
    if(pass!=pass2){
        $('#pw_check').text('비밀번호를 다시 입력해주세요');
        $('#pw_check').css('color','red');
        $('.login100-form-btn').attr('disabled',true);
    }else{
        $('#pw_check').text('');
        $('#pw_check').css('color','');
        $('.login100-form-btn').attr('disabled',false);
    }

}