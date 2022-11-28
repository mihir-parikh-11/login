
<%
String data = (String) request.getAttribute("data1");
out.println(data);
%>
<br>
<form action="loginpage" align="center">
	<input type="submit" value="Log-in">
</form>