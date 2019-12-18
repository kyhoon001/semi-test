$(document).ready(function(){

	$('#confirm').hide();
	$('#cancel').hide();

	$('#update').on('click', function(event){
		event.preventDefault();
		let email = $('#email').val();
		location.href = "userDetail.mc?email="+email;
	})

	$('#cancel').on('click', function(event){
		event.preventDefault();
		changeVis();
		
	})
	
	$('#withdrawl').on('click', function(event){
		event.preventDefault();
		let email = $('#email').val();
		location.href = "userDelete.mc?email="+email;
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



