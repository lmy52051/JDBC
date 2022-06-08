<%--
  Created by IntelliJ IDEA.
  User: 15062
  Date: 2022/5/20
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改</title>
</head>
<body>
<center>
<h1>更改水库信息</h1>
<form action="UpdateServlet" method="post">
    <div class="a">
        <span>水库名称：<input type="text" name="name"></span>
        <span>水库经度：<input type="text" name="X"></span>
        <span>水库维度：<input type="text" name="Y"></span>
        <input type="submit" name="修改" id="update">
    </div>
</form>
</center>
</body>
</html>
