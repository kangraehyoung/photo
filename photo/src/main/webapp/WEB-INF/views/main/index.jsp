<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Raestagram</title>
<link rel="stylesheet" href="style/reset.css" />
<link rel="stylesheet" href="style/common.css" />
<link rel="stylesheet" href="style/login.css" />
</head>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
function login(){
	var userId = document.querySelector(".userId").value;
    var password = document.querySelector(".password").value;

    $.ajax({
        type: 'POST',
        async: false,
        data: {
            userId: userId,
            password: password
        },
        url: "/member/login",
        success: function (data) {
	        console.log("success");
	        location.href = 'http://localhost:8080/listPage';
        },
        error: function (data) {
            console.log("fail");
        }
    });
}
</script>
<body>
	<div class="box-all">
		<h1 class="text-title">Raestagram</h1>
		<div class="form-login">
			<input id="input-id" class="userId" type="text" placeholder="전화번호, 사용자 이름 또는 이메일" />
			<input id="input-pw" class="password" type="password" placeholder="비밀번호" />
			<button id="btn-login" onclick="login()" disabled="true">로그인</button>
		</div>
		<p class="message-emailError">*이메일 형식을 다시 확인해주세요.</p>
		<p class="message-pwError">*비밀번호가 5글자 이상인지 확인해주세요.</p>
		<p class="message-forgetPw">비밀번호를 잊으셨나요?</p>
	</div>
	<script src="js/login.js">
		
	</script>
</body>
</html>