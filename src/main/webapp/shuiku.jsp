<%@ page import="Model.Shuiku" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主界面</title>
    <style type="text/css">
        *{
            margin: 0;
            padding: 0;
        }
        .a{
            background: aquamarine;
        }
        .btn_all{
            margin-top: 20px;
        }
        .btn{
            padding:10px;
            background: yellow;
        }

    </style>
<%--    cellspacing表格单元格间距--%>
<%--    cellpadding单元格与内容的间距--%>
</head>
<body>
<center>
    <h1><font size="18"><strong>水库管理系统</strong></font></h1>
    <table border="2px"cellspacing="0" cellpadding="0" width="600px">
        <tr class="a">
            <th>水库名</th><th>坐标-X</th><th>坐标-Y</th><th>简介</th>
        </tr>
        <%
        //   ArrayList<Shuiku> list = new ArrayList<>();
            ArrayList<Shuiku> list = (ArrayList<Shuiku>) request.getAttribute("list");
        %>
            <%
            for (Shuiku shuiku:list){
                String name, bz;
                float x, y;
                name = shuiku.getName();
                x = shuiku.getX();
                y = shuiku.getY();
                bz = shuiku.getBz();
                System.out.println();
                System.out.println();
                System.out.println();
        %>
        <tr class="b">
            <td><%=name%></td>
            <td><%=x%></td>
            <td><%=y%></td>
            <td><%=bz%></td>
        </tr>
            <%
            }
        %>
    </table>
    <div class="btn_all">
        <a href="add.jsp"><input type="submit" value="添加" class="btn"></a>
        <a href="del.jsp"><input type="submit" value="删除" class="btn"></a>
        <a href="update.jsp"><input type="submit" value="修改" class="btn"></a>
        <a href="search.jsp"><input type="submit" value="查询" class="btn"></a>
    </div>
</center>
</body>
</html>
