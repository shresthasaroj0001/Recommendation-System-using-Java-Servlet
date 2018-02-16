<%-- 
    Document   : login
    Created on : Aug 31, 2017, 8:10:34 AM
    Author     : Saroj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>              
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mobile Recommender login</title>
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <div class="container">
	<section id="content">
		<form action="userCOntroller" method="POST">
			<h1>Login Form</h1>
			<div>
                            <input type="text" placeholder="Username" required="" id="username" name="user"   />
			</div>
			<div>
                            <input type="password" name = "pass" placeholder="Password" required="" id="password"  />
			</div>
			<div>
				<input type="submit" value="Log in" />
				<a href="#">Lost your password?</a>
                                <a href="signup.jsp">Register</a>
			</div>
		</form><!-- form -->
		
	</section><!-- content -->
</div><!-- container -->
    </body>
</html>