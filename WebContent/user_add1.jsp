<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>用户信息添加</h1>
<form action="user/test/add1" method="post">
	账号：<input  type="text" name="userNumber" /><br/>
	密码：<input  type="text" name="passWord" /><br/>
	<input type="submit" value="提交"/>
</form>
${user }
${name}
${list}
    <%  
                List list = new ArrayList();  
                List list1 = new ArrayList();  
                List list2 = new ArrayList();  
                list1.add("1-a");  
                list1.add("1-b");  
                list2.add("2-d");  
                list2.add("2-c");  
                list.add(list1);  
                list.add(list2);  
                request.setAttribute("list1", list1);  
                request.setAttribute("list", list);  
            %>  
            <c:forEach items="${list }" var="item">  
                <c:forEach items="${item }" var="item2">  
                    <tr>  
                        <td>${item2 }</td>  
                    </tr>  
            </c:forEach>  
</body>
</html>