package vn.iotstar.dao;

import java.util.List;

import vn.iotstar.models.UserModel;

public interface IUserDao {
	
	List<UserModel> findAll();

	UserModel findbyId(int id);
	
	void insert(UserModel user);
	
	UserModel findbyUserName(String username);

	Object findbyEmail(String email);
}
