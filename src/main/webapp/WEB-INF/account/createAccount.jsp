<!DOCTYPE html>
<html>
<head>
<title>create account</title>
</head>
<body>
	<br>
	<br>

	<h1 align=center Style="color: blue">
		<b><u> Create Account </u></b>
	</h1>

	<table border=1 style="width: 55%" align=center bgcolor=lightgray>
		<tr>
			<td>
				<form action="addNewUserDetails" Style="font-size: 20px;" autocomplete="off">
					<br> <br> 
					
					<label for="AcName" style="position: relative;
    left: 20px;"> Enter Account
						Holder Name:- </label> <input type="text" id="AcName" name="accountHolderName"
						placeholder="Enter Account Holder Name"
						style="width: 50%; font-size: 16px;position: relative;
    left: 20px;"  required> <br> <br>
					
	&nbsp;<h6 style="color: red;margin-inline-start: 225px;font-size: 11px; margin-bottom: 0px; margin-top: -30px;">${accountNumber}</h6>
					<label for="AcNo" style="position: relative;
    left: 20px;"> Enter Account Number:- </label> <input
						type="text" id="AcNo" name="accountNumber"
						placeholder="Enter Account Number"
						style="width: 50%; font-size: 16px;position: relative;
    left: 20px;"minlength="9" maxlength="9" required> <br> <br>
					
					&nbsp;<h6 style="color: red;margin-inline-start: 251px;font-size: 11px; margin-bottom: 0px; margin-top: -30px;">${accountNumber}</h6>
					<label for="AcNo2"style="position: relative;
    left: 20px;"> Re-enter Account Number:- </label> <input
						type="text" id="AcNo2" name="accountNumber2"
						placeholder="Re-enter Account Number"
						style="width: 50%; font-size: 16px;position: relative;
    left: 20px;" minlength="9" maxlength="9" required> <br> <br>
					
					<label for="gender"style="position: relative;
    left: 20px;"> Gender:- </label> <input type="radio"
						id="Male" name="gender" value="Male" style="position: relative;
    left: 20px;"required="gender"> <label for="Male" style="position: relative;
    left: 20px;">Male</label>
					<input type="radio" id="Female" name="gender" value="Female" style="position: relative;
    left: 20px;" required="gender">
					<label for="Female" style="position: relative;
    left: 20px;">Female</label> <input type="radio" id="Other"
						name="gender" value="Other" style="position: relative;
    left: 20px;" required="gender"> <label for="Other" style="position: relative;
    left: 20px;">Other</label><br>
					<br> 
					
					&nbsp;<h6 style="color: red;margin-inline-start: 179px;font-size: 11px; margin-bottom: 0px; margin-top: -30px;">${Username}</h6>
					<label for="uname" style="position: relative;
    left: 20px;"> Enter User Name:- </label> <input
						type="text" id="uname" name="userName" placeholder="Enter User Name"
						style="width: 50%; font-size: 16px;position: relative;
    left: 20px;" minlength="5" required> <br> <br>
				
				&nbsp;<h6 style="color: red;margin-inline-start: 164px;font-size: 11px; margin-bottom: 0px; margin-top: -30px;">${Password}</h6>
					<label for="pass" style="position: relative;
    left: 20px;" > Enter Password:- </label> <input type="text"
						id="pass" name="password" placeholder="Enter Password"
						style="width: 50%; font-size: 16px;position: relative;
    left: 20px;" minlength="5" required> <br> <br>
					
					&nbsp;<h6 style="color: red;margin-inline-start: 189px;font-size: 11px; margin-bottom: 0px; margin-top: -30px;">${Password}</h6>
					<label for="pass2" style="position: relative;
    left: 20px;"> Re-enter Password:- </label> <input
						type="password" id="pass2" name="password2"
						placeholder="Re-enter Password"
						style="width: 50%; font-size: 16px;position: relative;
    left: 20px;" minlength="5" required> <br> <br>
				
					<input type="Submit" value="Register" align="center"
						Style="width: 25%; height: 30%; font-size: 20px; background-color: lightgreen; border-color: gray; position: relative; left: 279px;"><br>
					<br>

				</form>

				<form action="AccountLogin">
					<input type="submit" value="Log-In" align="center"
						style="width: 25%; height: 25%; font-size: 20px; position: relative; left: 279px; background-color: lightblue; border-color: gray">
					<br>
				</form>


			</td>
		</tr>
	</table>
	
	<h4 Style="margin-block-start: 0.3em; margin-block-end: -0.5em; margin-inline-start: 340px;color:red"><b><u>Note</u> :-</b></h4>
	<ul Style="margin-inline-start: 340px;color:red" >
		<li>Account Number must be 9 Digit.</li>
		<li>Username must be lowercase and minimum 5 characters.</li>
		<li>Password must be lowercase and minimum 5 characters.</li>
	</ul>
	
		
</body>
</html>