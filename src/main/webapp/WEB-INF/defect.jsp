<%--
  Created by IntelliJ IDEA.
  User: D N
  Date: 2020/3/28
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>结果查询页面</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<c:forEach items="${list}" var="item" varStatus="vs">
    <h1>ID是：${item.id}</h1>
    <h1>所属系统：${item.ownSystem}</h1>
    <h1>问题描述：${item.description}</h1>
    <h1>是否修复：${item.isRepair}</h1>
    <h1>创建时间：${item.createTime}</h1>
</c:forEach>
</body>
</html>
