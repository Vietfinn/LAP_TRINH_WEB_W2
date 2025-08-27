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
	

}
