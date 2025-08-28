package vn.iotstar.services.impl;

import vn.iotstar.dao.IUserDao;
import vn.iotstar.dao.impl.UserDaoImpl;
import vn.iotstar.models.UserModel;
import vn.iotstar.services.IUserService;

public class UserService implements IUserService{
	IUserDao userDao = new UserDaoImpl();

	@Override
	public UserModel login(String username, String password) {
		UserModel user = this.FindbyUserName(username);
		if (user != null && password.equals(user.getPassword())) {
			return user;	
		}
		return null;
	}

	@Override
	public UserModel FindbyUserName(String username) {
		
		return userDao.findbyUserName(username) ;
	}

	@Override
    public boolean checkExistUsername(String username) {
        return userDao.findbyUserName(username) != null;
    }

    @Override
    public boolean checkExistEmail(String email) {
        return userDao.findbyEmail(email) != null;
    }

    @Override
    public boolean register(UserModel user) {
        // Kiểm tra tồn tại username
        if (checkExistUsername(user.getUsername())) {
            return false; // Username đã tồn tại
        }

        // Kiểm tra tồn tại email
        if (checkExistEmail(user.getEmail())) {
            return false; // Email đã tồn tại
        }

        // Nếu hợp lệ thì insert user mới
        try {
            userDao.insert(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
	

}
