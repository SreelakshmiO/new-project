<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Adduser-success.jsp">
<a href="Viewrecords.jsp">View All Records</a></br>
<h1>Add New User</h1></br>
<table>
<tr>
<td>Name:</td>
<td><input type="text" name="uname"></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="pass" name="upass"></td>
</tr>
<tr>
<td>Email:</td>
<td><input type="text" name="email"></td>
</tr>
<tr>
<td>Sex:</td>
<td><input type="radio" name="gender" value="male">Male
<input type="radio" name="gender" value="female">Female</td>
</tr>
<tr>
<td>Country:</td>
<td>
<select>
<option>India</option>
<option>USA</option>
<option>UK</option>
<option>Australia</option>
</select>
</td>
</tr>
<tr>
<td colspan="2">
<input type="submit" value="Add User">
</td>
</tr>
</table>
</form></form>
</body>
</html>