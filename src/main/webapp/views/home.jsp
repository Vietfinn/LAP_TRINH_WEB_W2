<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Home</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light shadow-sm">
        <div class="container-fluid">
            <a class="navbar-brand text-primary fw-bold" href="user-home.jsp">🌸 StarShop</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="product-list.jsp">Sản phẩm</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="cart.jsp">Giỏ hàng</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="my-orders.jsp">Đơn hàng của tôi</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-danger" href="${pageContext.request.contextPath}/logout">Đăng xuất</a>

                       
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Nội dung -->
    <div class="container mt-5">
        <h2 class="text-center text-primary">Chào mừng bạn đến với StarShop 🌸</h2>
        <p class="text-center">Khám phá và mua sắm những sản phẩm yêu thích của bạn ngay hôm nay.</p>

        <div class="row mt-4">
            <div class="col-md-4">
                <div class="card shadow-lg">
                    <img src="images/products.jpg" class="card-img-top" alt="Sản phẩm">
                    <div class="card-body text-center">
                        <h5 class="card-title">🛍️ Sản phẩm</h5>
                        <p class="card-text">Xem danh sách sản phẩm mới nhất.</p>
                        <a href="product-list.jsp" class="btn btn-primary">Xem ngay</a>
                    </div>
                </div>
            </div>

            <div class="col-md-4">
                <div class="card shadow-lg">
                    <img src="images/cart.jpg" class="card-img-top" alt="Giỏ hàng">
                    <div class="card-body text-center">
                        <h5 class="card-title">🛒 Giỏ hàng</h5>
                        <p class="card-text">Xem và chỉnh sửa giỏ hàng của bạn.</p>
                        <a href="cart.jsp" class="btn btn-success">Đi tới</a>
                    </div>
                </div>
            </div>

            <div class="col-md-4">
                <div class="card shadow-lg">
                    <img src="images/orders.jpg" class="card-img-top" alt="Đơn hàng">
                    <div class="card-body text-center">
                        <h5 class="card-title">📦 Đơn hàng</h5>
                        <p class="card-text">Theo dõi trạng thái đơn hàng của bạn.</p>
                        <a href="my-orders.jsp" class="btn btn-warning">Xem đơn hàng</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
