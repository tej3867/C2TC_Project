package placement.service;

import placement.dao.CollegeRepo;
import placement.dao.CollegeRepoImpl;
import placement.dao.PlacementRepo;
import placement.dao.PlacementRepoImpl;
import placement.entities.Placement;

public class PlacementServiceImpl implements PlacementService {
	PlacementRepo pr;
	
	public PlacementServiceImpl(){
		pr=new PlacementRepoImpl();
	}

	@Override
	public Placement addPlacement(Placement placement) {
		pr.startTransaction();
		pr.addPlacement(placement);
		pr.endTransaction();
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		pr.startTransaction();
		pr.addPlacement(placement);
		pr.endTransaction();
		return placement;
	}

	@Override
	public Placement searchPlacement(long id) {
		
		return pr.searchPlacement(id);
	}

	@Override
	public String cancelPlacement(long id) {
		return id + "placement cancelled";
	}

}
