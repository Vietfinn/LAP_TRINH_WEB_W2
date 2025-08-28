package vn.iotstar.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vn.iotstar.configs.DBConnectMySQL;
import vn.iotstar.dao.IUserDao;
import vn.iotstar.models.UserModel;

public class UserDaoImpl extends DBConnectMySQL implements IUserDao {

	public Connection conn = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;

	@Override
	public List<UserModel> findAll() {
		String sql = "SELECT * FROM users ";
		List<UserModel> list = new ArrayList<UserModel>(); // tao list de truyen du lieu
		try {
			conn = super.getDatabaseConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(
						new UserModel(
							    rs.getInt("id"),
							    rs.getString("username"),
							    rs.getString("email"),
							    rs.getString("fullname"),
							    rs.getString("images"),
							    rs.getString("password"),
							    rs.getString("phone"),
							    rs.getInt("roleid"),
							    rs.getDate("createDate"))
						);

				}
				return list;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UserModel findbyId(int id) {
		String sql = "SELECT * FROM users WHERE id = ? ";
	    try {
	        conn = super.getDatabaseConnection();
	        ps = conn.prepareStatement(sql);
	        ps.setInt(1, id);
	        rs = ps.executeQuery();
	        if (rs.next()) {
	            UserModel user = new UserModel();
	            user.setId(rs.getInt("id"));
	            user.setUsername(rs.getString("username"));
	            user.setPassword(rs.getString("password"));
	            user.setImages(rs.getString("images"));
	            user.setFullname(rs.getString("fullname"));
	            user.setEmail(rs.getString("email"));
	            user.setPhone(rs.getString("phone"));
	            user.setRoleid(rs.getInt("roleid"));
	            user.setCreateDate(rs.getDate("createDate"));
	            return user;
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return null;
	}

	@Override
	public void insert(UserModel user) {
	    String sql = "INSERT INTO users (username, password, images, fullname, email, phone, roleid, createDate) "
	               + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

	    try {
	        conn = super.getDatabaseConnection();
	        ps = conn.prepareStatement(sql);

	        ps.setString(1, user.getUsername());
	        ps.setString(2, user.getPassword());
	        ps.setString(3, user.getImages());   // có thể null
	        ps.setString(4, user.getFullname()); // có thể null
	        ps.setString(5, user.getEmail());
	        ps.setString(6, user.getPhone());
	        ps.setInt(7, user.getRoleid());
	        
	        if (user.getCreateDate() != null) {
	            ps.setDate(8, new java.sql.Date(user.getCreateDate().getTime()));
	        } else {
	            ps.setNull(8, java.sql.Types.DATE);
	        }

	        ps.executeUpdate();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public UserModel findbyUserName(String username) {
		String sql = "SELECT * FROM users WHERE username = ? ";
	    try {
	        conn = super.getDatabaseConnection();
	        ps = conn.prepareStatement(sql);
	        ps.setString(1, username);
	        rs = ps.executeQuery();
	        if (rs.next()) {
	            UserModel user = new UserModel();
	            user.setId(rs.getInt("id"));
	            user.setUsername(rs.getString("username"));
	            user.setPassword(rs.getString("password"));
	            user.setImages(rs.getString("images"));
	            user.setFullname(rs.getString("fullname"));
	            user.setEmail(rs.getString("email"));
	            user.setPhone(rs.getString("phone"));
	            user.setRoleid(rs.getInt("roleid"));
	            user.setCreateDate(rs.getDate("createDate"));
	            return user;
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	public void testFindById(int id) {
	    UserModel user = findbyId(id);
	    if (user != null) {
	        System.out.println("Tìm thấy user: " + user);
	    } else {
	        System.out.println("Không tìm thấy user với id = " + id);
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//UserDaoImpl userDao = new UserDaoImpl();
		//userDao.insert(new UserModel(2, "abc2", "abs2@gmail.com", "12", "", "ab2"));
		//List<UserModel> list = userDao.findAll();
		// userDao.testFindById(3);
	//	for (UserModel user : list) {
	//		System.out.println(user);
	//	}
	try {
		IUserDao userDao= new UserDaoImpl();
		System.out.println(userDao.findbyUserName("vietfinn"));
		
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
	}

	@Override
	public Object findbyEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
