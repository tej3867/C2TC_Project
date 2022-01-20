package placement.service;

import placement.dao.StudentRepo;
import placement.dao.StudentRepoImpl;
import placement.dao.UserRepo;
import placement.dao.UserRepoImpl;
import placement.entities.User;

public class UserServiceImpl implements UserService {
	UserRepo ur;
	
	public UserServiceImpl(){
		ur=new UserRepoImpl();
	}

	@Override
	public User addUser(User user) {
		ur.startTransaction();
		ur.addUser(user);
		ur.endTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		ur.startTransaction();
		ur.updateUser(user);
		ur.endTransaction();
		return user;
	}

	@Override
	public String login(User user) {
		return user + "was successfully Logged In";
	}

	@Override
	public String logOut() {
		return "Logged Out";
	}

}
