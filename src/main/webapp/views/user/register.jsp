<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Đăng ký tài khoản</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5 col-md-6">
        <h2 class="text-center text-primary">Đăng ký</h2>

        <form action="${pageContext.request.contextPath}/register" method="post">
            <div class="mb-3">
                <label class="form-label">Tên đăng nhập</label>
                <input type="text" name="username" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Họ và tên</label>
                <input type="text" name="fullname" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Email</label>
                <input type="email" name="email" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Mật khẩu</label>
                <input type="password" name="password" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Số điện thoại</label>
                <input type="text" name="phone" class="form-control">
            </div>

            <button type="submit" class="btn btn-success w-100">Đăng ký</button>
        </form>

        <p class="mt-3 text-center">Đã có tài khoản?
            <a href="${pageContext.request.contextPath}/views/login.jsp">Đăng nhập</a>
        </p>
    </div>
</body>
</html>
