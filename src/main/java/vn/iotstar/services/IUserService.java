package vn.iotstar.services;

import vn.iotstar.models.UserModel;

public interface IUserService {

	UserModel login(String username, String password);
	UserModel FindbyUserName(String username);
	boolean checkExistUsername(String username);
	boolean checkExistEmail(String email);
	boolean register(UserModel user);
}
