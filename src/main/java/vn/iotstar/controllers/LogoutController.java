package vn.iotstar.controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/logout"})
public class LogoutController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Hủy session
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }

        // Quay lại trang login.jsp
        response.sendRedirect(request.getContextPath() + "/views/login.jsp");

    }

}
