<html>
<head>
</head>
<body>

	<form action="addnewaccount">

		<fieldset>
			<legend style="font-size: 22px" align="center">Create
				Account</legend>

			<label for="fullname">Enter Full Name :- </label>
			<input type="text"	id="fullname" name="fullname" required="required"><br>
			<br> 
			
			<label for="mail">Enter mail Id :- </label>
			<input type="text" id="mail" name="mail" required="required"><br>
			
			<label for="uname">Enter Username :- </label> 
			<input type="text" id="uname" name="uname" required="required"><br>
			<br>			
			
			<label for="pass">Enter Password :- </label> 
			<input type="text" id="pass" name="pass" required="required"><br>
			
			<label for="pass2">Re-Enter Password :- </label>
			<input type="text" id="pass2" name="pass2" required="required"><br>
			<br> 
			
			<label for="age">Enter Age :- </label> 
			<input type="text" id="age" name="age" required="required"><br>
			<br> 
			
			<input type="submit" value="Sign up"><br>
			<br>

		</fieldset>

	</form>
	
	<h6 style="color:red">${data1}</h6>

	<form action="loginpage" align="center">
		<input type="submit" value="Log-in">
	</form>

</body>
</html>