<%@ page language="java" contentType="text/html" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Form</title>
</head>
<body>
    <h2>User Information Form</h2>
    <form action="submitUser" method="post">

        First Name: <input type="text" name="firstName" required/><br/>
        Last Name: <input type="text" name="lastName" required/><br/>
        Email: <input type="email" name="email" required/><br/>
        <input type="submit" value="Submit"/>
        
    </form>
</body>
</html>
