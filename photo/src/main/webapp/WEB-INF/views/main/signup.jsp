<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Instagram</title>
    <link href='https://fonts.googleapis.com/css?family=Lobster' rel='stylesheet'>
    <link rel="stylesheet" href="style/signup.css">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
        integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous" />
</head>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
function join(){
	var userId = document.querySelector(".username").value;
    var password = document.querySelector(".password").value;
    var nickname = document.querySelector(".nickname").value;
    
    console.log(userId);
    console.log(password);
    console.log(nickname);

    $.ajax({
        type: 'POST',
        async: false,
        data: {
            userId: userId,
            password: password,
            name: nickname
        },
        url: "/member/insert",
        success: function (data) {
        console.log("success");
            location.href = '/signin';
        },
        error: function (data) {
            console.log("fail");
        }
    });
}
</script>
<body>
    <div class="container">
        <main class="loginMain">
           <!--회원가입섹션-->
            <section class="login">
                <article class="login__form__container">
                  
                   <!--회원가입 폼-->
                    <div class="login__form">
                        <!--로고-->
                        <h1>Raestagram</h1>
                         <!--로고end-->
                         
                         <!--회원가입 인풋-->
                        <div class="login__input">
                            <input type="text" class="username" name="username" placeholder="유저네임" required="required"  maxlength="30"/>
                            <input type="password" class="password" name="password" placeholder="패스워드" required="required" />
                            <input type="text" class="nickname" name="name" placeholder="이름" required="required" />
                            <button onclick="join()">가입</button>
                        </div>
                        <!--회원가입 인풋end-->
                    </div>
                    <!--회원가입 폼end-->
                    
                    <!--계정이 있으신가요?-->
                    <div class="login__register">
                        <span>계정이 있으신가요?</span>
                        <a href="/auth/signin">로그인</a>
                    </div>
                    <!--계정이 있으신가요?end-->
                    
                </article>
            </section>
        </main>
    </div>
</body>

</html>