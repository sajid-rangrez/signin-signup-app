<!DOCTYPE html>
<html>

<head>
    <title>User Registration</title>
    <link rel="stylesheet" href="style2.css" />
</head>

<body>
    <div class="container">
        <form class="register" action="register" method="POST">
            <h2 style="font-family: cursive;">SignUp</h2>

            <input type="text" id="username" name="name" placeholder="Name" required /><br /><br />
            <input type="email" id="email" name="email" placeholder="Email" required><br><br>


            <select id="tech" name="tech">
                <option value="web">Web Development</option>
                <option value="mobile">Mobile App Development</option>
                <option value="data">Data Science</option>
                <option value="ai">Artificial Intelligence</option>
                <option value="other">Other</option>
            </select><br /><br />

            <input type="password" id="password" name="password" placeholder="Password" required /><br /><br />

            <input type="password" id="cpassword" name="cpassword" placeholder="Confirm Password"
                required /><br /><br />

            <input class="sub" type="submit" value="Register" />
            <br>
            <a href="signin">Signin</a>
            <br>
            ${m}
        </form>
    </div>
</body>

</html>