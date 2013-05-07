$(document).ready(function() {

	$("#submit").click(function() {
		login();
	});

	$("#cancel").click(function() {
		$("#name").val("");
		$("#password").val("");
	});
});

function login() {
	$.ajax({
		url : BASE_PATH + 'user/logon',
		type : 'post',
		data : $("#loginform").serializeArray(),
		dataType : 'json',
		success : function(data) {
			if (data.success == true) {
				window.location.href = BASE_PATH;
			} else {
				alert("用户名或密码错误，请重新登录！");
			}
		}
	});
}