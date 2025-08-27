<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Manager Dashboard</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
    <!-- Thanh navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Manager Panel</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="product-list.jsp">Quản lý Sản phẩm</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="order-list.jsp">Quản lý Đơn hàng</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-danger" href="logout">Đăng xuất</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Nội dung chính -->
    <div class="container mt-5">
        <h2 class="text-center text-primary">Chào mừng Manager!</h2>
        <p class="text-center">Đây là trang quản lý sản phẩm và đơn hàng.</p>

        <div class="row mt-4">
            <div class="col-md-6">
                <div class="card shadow-lg">
                    <div class="card-body text-center">
                        <h5 class="card-title">📦 Quản lý Sản phẩm</h5>
                        <p class="card-text">Thêm mới, chỉnh sửa và theo dõi sản phẩm.</p>
                        <a href="product-list.jsp" class="btn btn-success">Đi tới</a>
                    </div>
                </div>
            </div>

            <div class="col-md-6">
                <div class="card shadow-lg">
                    <div class="card-body text-center">
                        <h5 class="card-title">🛒 Quản lý Đơn hàng</h5>
                        <p class="card-text">Xử lý và theo dõi tình trạng đơn hàng.</p>
                        <a href="order-list.jsp" class="btn btn-warning">Đi tới</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
