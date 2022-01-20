package placement.service;

import placement.entities.User;

public interface UserService {
	public User addUser(User user);
	public User updateUser(User user);
	public String login(User user);
	public String logOut();

}
