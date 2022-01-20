package placement.dao;

import placement.entities.User;

public interface UserRepo {
	
		public User addUser(User user);
		public User updateUser(User user);
		public User deleteUser(long id);
		public void startTransaction();
		public void endTransaction();
		

}
