<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page errorPage="ErrorPage.html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Guru Registration Form</title>
    <link rel="stylesheet" href="style2.css">
    <link>
</head>

<body>
    <div class="container">

        <form class="login" action="login" method="post">
            <h2 style="font-family: cursive;">Login</h2>

            <input type="email" name="mail" placeholder="Email">

            <br>
            <input type="password" name="pass" placeholder="Password">
            <br>
            <button class="sub" type="submit">Submit</button>
            <br>
            <a href="signup">Signup</a>
            <br>
            ${m}
        </form>
    </div>
</body>

</html>