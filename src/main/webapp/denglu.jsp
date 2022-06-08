
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <style type="text/css">
        *{
            margin: 0;
            padding: 0;
        }
        .from {
            overflow: hidden;
            position: relative;
        }
        .submit {
            position: absolute;
            z-index: 9;
            left: 0;
            top: 0;
            right: 0;
            bottom: 0;
            margin: auto;
            margin-top: 150px;
            width: 500px;
            height: 500px;
            background: rgba(255, 255, 255, 0.2);
            border-radius: 10px;
            color: #fff;
            display: flex;
            flex-direction: column;
        }
        .from_title {
            text-align: center;
            margin-top: 40px;
            font-size: 18px;
        }
        .from_input {
            padding: 0 30px;
            box-sizing: border-box;
            display: flex;
            margin-top: 20px;
        }
        .inputs {
            height: 40px;
            width: 300px;
            border-radius: 5px;
            border: none;
            background-color: #eee;
            color: #666;
            padding-left: 20px;
        }
        .form_input span {
            width: 85px;
            align-self: center;
        }
        .btn {
            align-self: center;
            border: none;
            width: 80px;
            height: 40px;
            color: #fff;
            border-radius: 5px;
            background: #999;
            margin-top: 40px;
        }
    </style>
</head>
<body>
<form action="DengluServlet" method="post">
    <center>
        <div class="from">
            <img class="bgc" src="./img/1.jpg" alt="">
            <div class="submit">
        <span class="from_title">水库管理系统</span>
                <div class="from_input">
                    <span>用户名：</span>
                    <input class="inputs" type="text" name="username">
                </div>
                <div class="from_input">
                    <span>密 码：&nbsp;&nbsp;&nbsp;</span>
                    <input class="inputs" type="password" name="password">
                </div>
                <input type="submit" value="登录" class="btn">
            </div>
        </div>
    </center>
</form>
</body>
</html>
