<!DOCTYPE html>
<html>
<head>
<title><b><u>Log In Page</u></b></title>
</head>
<body>
	<form action="checklogin">
		<fieldset>

			<legend style="font-size:22px" align="center"><b><u>Log In</u></b></legend>

			<label for="uname" >User Name :- </label> 
			<input type="text" id="uname" name="uname" required="required"><br>
			<br> 
			<label for="password">Password :- </label> 
			<input type="password" id="password" name="pass" required="required"><br>
			<br>
			 <input type="submit" value="Login">

			<h6 style="color:red" >${data1}</h6><br>
			
			

		</fieldset>
	</form>
	<br>
	<br>
	<form action="signuppage" align="center">
	<input type="submit" value="Sign-up">
	</form>
	
	
</body>
</html>