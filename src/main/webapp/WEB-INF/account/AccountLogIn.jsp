<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Banking Log-in page</title>
</head>
<body>
	
	<br>
	<br>
	<h1 style="color: blue" align="center">
		<b><u>Online Banking</u></b>
	</h1>
<h6 style="color:green;margin-inline-start: 630px; font-size: medium; margin-bottom: 10px;">${data1}</h6>
	<table border=1 bgcolor="lightgreen" align="center" width=30%>
		<tr>
			<th>
				<p align="center" Style="font-size: 30px;margin-top: 10px;
    margin-bottom: 5px;">
					<b><u>Log-in</u></b>
				</p>
				<br>

			</th>
		</tr>
	</table>

	<table border=1 bgcolor="lightgray" align="center" width=30%>

		<tr>
			<td>

				<form action="checklogedin" Style="font-size: 20px;margin-top: 25px;
    margin-bottom: -10px;">

<h6 style="color: red;margin-inline-start: 170px;font-size: 11px; margin-bottom: -5px; margin-top: -15px;"> ${UNAME}</h6>
					<label for="uname" style="position: relative; left: 45px;margin-top: 10px; margin-bottom: 0px;"><b>User
							Name :- </b></label>
					<input type="text" id="uname" name="uname"
						style="width: 50%; font-size: 16px; position: relative; left: 51px;margin-top: 10px; margin-bottom: 0px;"
						placeholder="User Name" required><br> <br> 
						
<h6 style="color: red;margin-inline-start: 170px;font-size: 11px; margin-bottom: -5px; margin-top: -15px;"> ${PASS}</h6>						
					<label
						for="pass" style="position: relative; left: 59px;margin-top: 10px; margin-bottom: 0px;"><b>Password
							:- </b></label> 
					<input type="password" id="pass" name="pass"
						placeholder="Password"
						style="width: 50%; font-size: 16px; position: relative; left: 62px;margin-top: 10px; margin-bottom: 0px;"
						required><br> <br> 
						
					<input type="submit"
						Value="Log-In"
						style="width: 25%; height: 25%; margin-inline-start: 160px; font-size: 20px; background-color: lightblue; border-color: gray">


				</form>

				<form action="AccountCreate">
					<br> <input type="submit" value="Sign-up"
						style="width: 25%; height: 25%; font-size: 20px; background-color: lightGreen; border-color: gray;margin-inline-start: 160px;">
				</form>

			</td>
		</tr>

	</table>
	<h6 style="color:green;margin-inline-start: 630px;font-size: medium;margin-top: 10px;">${data}</h6>
</body>
</html>