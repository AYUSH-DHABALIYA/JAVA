<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Signup Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .signup-form {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
        }
        .signup-form h2 {
            margin-bottom: 20px;
            color: #333;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
            color: #555;
        }
        .form-group input,
        .form-group select {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
            border: 1px solid #ddd;
            border-radius: 3px;
        }
        .form-group input[type="checkbox"] {
            width: auto;
        }
        .form-group .hobbies {
            display: flex;
            flex-wrap: wrap;
        }
        .form-group .hobbies label {
            width: 50%;
            margin-bottom: 10px;
        }
        .signup-button {
            background-color: #5cb85c;
            color: #fff;
            border: none;
            padding: 10px;
            cursor: pointer;
            border-radius: 3px;
            width: 100%;
        }
        .signup-button:hover {
            background-color: #4cae4c;
        }
    </style>
</head>
<body>

    <form class="signup-form" action="LoginServlet">
        <h2>Signup Form</h2>
        <div class="form-group">
            <label for="profile-picture">Profile Picture</label>
            <input type="file" id="profile-picture" name="image">
        </div>
        <div class="form-group">
            <label for="first-name">First Name</label>
            <input type="text" id="first-name" name="fname" required>
        </div>
        <div class="form-group">
            <label for="last-name">Last Name</label>
            <input type="text" id="last-name" name="lname" required>
        </div>
        <div class="form-group">
            <label for="email">Email</label>
            <input type="email" id="email" name="email" required>
        </div>
        <div class="form-group">
            <label>Hobbies</label>
            <div class="hobbies">
                <label><input type="checkbox" name="hobbies" value="reading"> Reading</label>
                <label><input type="checkbox" name="hobbies" value="traveling"> Traveling</label>
                <label><input type="checkbox" name="hobbies" value="sports"> Sports</label>
                <label><input type="checkbox" name="hobbies" value="music"> Music</label>
            </div>
        </div>
        <div class="form-group">
            <label for="city">City</label>
            <select id="city" name="city" required>
                <option value="">Select a city</option>
                <option value="newyork">New York</option>
                <option value="losangeles">Los Angeles</option>
                <option value="chicago">Chicago</option>
                <option value="houston">Houston</option>
            </select>
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" id="password" name="password" required>
        </div>
        <div class="form-group">
            <label for="confirm-password">Confirm Password</label>
            <input type="password" id="confirm-password" name="confirm-password" required>
        </div>
        <button type="submit" class="signup-button">Signup</button>
    </form>

</body>
</html>
