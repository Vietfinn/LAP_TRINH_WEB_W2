package vn.iotstar.controllers;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.iotstar.models.UserModel;
import vn.iotstar.services.impl.UserService;


@WebServlet( urlPatterns = {"/register"})
public class RegisterController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	UserService service = new UserService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    req.getRequestDispatcher("/views/register.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    resp.setContentType("text/html");
	    resp.setCharacterEncoding("UTF-8");
	    req.setCharacterEncoding("UTF-8");

	    String username = req.getParameter("username");
	    String password = req.getParameter("password");
	    String email = req.getParameter("email");
	    String phone = req.getParameter("phone");

	    String alertMsg = "";

	    if (username.isEmpty() || password.isEmpty() || email.isEmpty() || phone.isEmpty()) {
	        alertMsg = "Không được để trống thông tin!";
	        req.setAttribute("alert", alertMsg);
	        req.getRequestDispatcher("/views/register.jsp").forward(req, resp);
	        return;
	    }

	    // check trùng username
	    if (service.checkExistUsername(username)) {
	        alertMsg = "Tài khoản đã tồn tại!";
	        req.setAttribute("alert", alertMsg);
	        req.getRequestDispatcher("/views/register.jsp").forward(req, resp);
	        return;
	    }

	    // check trùng email
	    if (service.checkExistEmail(email)) {
	        alertMsg = "Email đã được sử dụng!";
	        req.setAttribute("alert", alertMsg);
	        req.getRequestDispatcher("/views/register.jsp").forward(req, resp);
	        return;
	    }

	    // tạo user mới: fullname = null, images = null, roleid = 1, createDate = null
	    UserModel user = new UserModel(
	    	    0,          // id (auto-increment, placeholder)
	    	    username,   // username
	    	    email,      // email
	    	    password,   // password
	    	    null,       // fullname
	    	    null,       // images
	    	    phone,      // phone
	    	    1,          // roleid = 1 (user mặc định)
	    	    null        // createDate
	    	);


	    boolean isSuccess = service.register(user);

	    if (isSuccess) {
	        resp.sendRedirect(req.getContextPath() + "/login");
	    } else {
	        alertMsg = "Đăng ký thất bại!";
	        req.setAttribute("alert", alertMsg);
	        req.getRequestDispatcher("/views/register.jsp").forward(req, resp);
	    }
	}

}
