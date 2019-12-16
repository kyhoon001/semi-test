$(document).ready(function(){

	$('#confirm').hide();
	$('#cancel').hide();

	$('#update').on('click', function(event){
		event.preventDefault();
		changeVis();
	})

	$('#cancel').on('click', function(event){
		event.preventDefault();
		let email = $('#email').val();
		location.href = "userDetail.mc?email="+email;
	})

	$('#userDetail').on('submit',function(){
		alert("회원정보를 수정했습니다. 다시 로그인해주세요 ");
	})
})

function changeVis(){
	if ( $('input').is('[readonly]') ) {

			$('#userDetail input').not('#email').attr('readonly', false);
			$('#userDetail input[type="radio"]').attr('disabled', false);
			$('#update').hide();
			$('#confirm').show();
			$('#cancel').show();
			
		}else{
			
			$('#userDetail input').not('#email').attr('readonly', true);
			$('#userDetail input[type="radio"]').attr('disabled', true);
			$('#update').show();
			$('#confirm').hide();
			$('#cancel').hide();
		}
}



