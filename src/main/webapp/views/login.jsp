<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<%@ taglib prefix="fn" uri="jakarta.tags.functions"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login - StarShop</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background: #f2f2f2;
        }
        .login-container {
            background: white;
            padding: 20px 30px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.2);
            text-align: center;
        }
        table {
            margin: auto;
        }
        td {
            padding: 8px;
        }
        input[type="text"], input[type="password"] {
            padding: 6px;
            width: 200px;
        }
        input[type="submit"], input[type="reset"] {
            padding: 6px 12px;
            margin: 4px;
        }
        p {
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <h1>Welcome to StarShop</h1>
        <h3>Please login to continue</h3>

        <form action="login" method="post">
            <table>
                <tr>
                    <td align="right"><b>Username:</b></td>
                    <td><input type="text" name="username" placeholder="Enter username" required></td>
                </tr>
                <tr>
                    <td align="right"><b>Password:</b></td>
                    <td><input type="password" name="password" placeholder="Enter password" required></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center;">
                        <input type="submit" value="Login">
                        <input type="reset" value="Clear">
                    </td>
                </tr>
            </table>
        </form>

        <p>
            Not registered? <a href="${pageContext.request.contextPath}/views/user/register.jsp">Create an account</a>
        </p>

        <!-- Hiển thị alert message -->
        <p style="color:red;">
            ${alert != null ? alert : ""}
        </p>
    </div>
</body>
</html>
