package placement.dao;

import javax.persistence.EntityManager;

import placement.entities.Placement;
import placement.entities.Student;

public class PlacementRepoImpl implements PlacementRepo{
EntityManager em;
	
	public PlacementRepoImpl() {
		em=configuration.getEntityManager();
	}

	@Override
	public Placement addPlacement(Placement placement) {
		em.persist(placement);
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		em.merge(placement);
		return placement;
	}

	@Override
	public Placement searchPlacement(long id) {
		Placement place=em.find(Placement.class,id);
		return place;
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
