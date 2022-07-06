$(document).ready(function(){
	$('#lbtn').click(function(){
		var sid = $('#id').val();
		var spw = $('#pw').val();
		
		$.ajax({
			url: '/web/member/login.esy',
			type: 'post',
			dataType: 'json',
			data: {
				id: sid,
				pw: spw
			},
			success: function(data){
				if(data.result == 'OK'){
					// 처리에 성공한 경우
					$('#frm').attr('action', '/web/main.esy');
					$('#frm').submit();
				}
			},
			error: function(){
				alert('### 통신 에러 ###');
			}
		});
	});
});