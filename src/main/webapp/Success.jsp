<%@page import="java.util.List"%>
<%@page import="dto.student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
student student=(student)request.getAttribute("student");
List<student> list=(List<student>)request.getAttribute("list");
%>

<div>
<table border="1">
<tr>
<th> Id</th>
<th> Name</th>
<th> Mobile</th>
<th> Email</th>
<th> Password</th>
<th> Edit</th>
<th> Delete</th>
</tr>
<tr>
<th> <%=student.getId() %></th>
<th> <%=student.getName() %></th>
<th> <%=student.getPhone() %></th>
<th> <%=student.getEmail() %></th>
<th> <%=student.getPassword() %></th>
<th><button>Edit</button></th>
<th><button>Delete</button></th>
</tr>
</table>
</div>
</body>
</html>