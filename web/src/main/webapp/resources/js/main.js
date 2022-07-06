$(document).ready(function(){
	$('#msgClose').click(function(){
		$('#msgWin').css('display', 'none');
		
		$.ajax({
			url: '/web/mainMsgCheck.esy',
			type: 'post',
			dataType: 'json',
			success: function(data){
				if(data.result == 'OK'){
					// 처리에 성공한 경우
					$('#msgWin').remove();
				}
			},
			error: function(){
				alert('### 통신 에러 ###');
			}
		});
	});
});

