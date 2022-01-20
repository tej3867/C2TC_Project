package placement.dao;

import javax.persistence.EntityManager;

import placement.entities.Student;
import placement.entities.User;

public class UserRepoImpl implements UserRepo {
	EntityManager em;
	
	public UserRepoImpl() {
		em=configuration.getEntityManager();
	}

	@Override
	public User addUser(User user) {
		em.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		em.merge(user);
		return user;
	}

	@Override
	public User deleteUser(long id) {
		User u = getUser(id);
		em.remove(u);
		return null;
	}
	
	public User getUser(long id) {
		User u = em.find(User.class, id);
		return u;
	}

	@Override
	public void startTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void endTransaction() {
		em.getTransaction().commit();
		
	}

	

}
