package placement.dao;

import javax.persistence.EntityManager;




import placement.entities.College;

public class CollegeRepoImpl implements CollegeRepo{
	EntityManager em;
	public CollegeRepoImpl()
{
	em=configuration.getEntityManager();
}

	@Override
	public College addCollege(College college) {
		em.persist(college);
		return college;
	}

	@Override
	public College updateCollege(College college) {
		em.merge(college);
		return college;
	}

	@Override
	public College searchCollege(long id) {
		College col =em.find(College.class, id);
		return col;
	}

	@Override
	public boolean deleteCollege(long id) {
		College coll = searchCollege(id);
		em.remove(coll);
		return true;
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
