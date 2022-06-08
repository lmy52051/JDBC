<%--
  Created by IntelliJ IDEA.
  User: 15062
  Date: 2022/5/20
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
    <style type="text/css">
        *{
            margin: 0;
            padding: 0;
        }
        .from_title {
            text-align: center;
            margin-top: 40px;
            font-size: 18px;
        }
        #add{
            margin: 20px;
        }
    </style>
</head>
<body>
<center>
<form action="AddServlet" method="post">
    <div class="from">
        <span class="from_title">添加水库信息</span>
        <div class="from_input">
            <span>水库名称：</span>
            <input type="text" name="name" class="inputs">
        </div>
        <div class="from_input">
            <span>水库经度：</span>
            <input type="text" name="X" class="inputs">
        </div>
        <div class="from_input">
            <span>水库维度：</span>
            <input type="text" name="Y" class="inputs">
        </div>
        <div class="from_input">
            <span>备 注：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
            <input type="text" name="bz" class="inputs">
        </div>
            <input type="submit" name="添加" id="add">

    </div>
</form>
</center>
</body>
</html>
