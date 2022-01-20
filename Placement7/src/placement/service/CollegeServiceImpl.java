package placement.service;

import placement.dao.CollegeRepo;
import placement.dao.CollegeRepoImpl;
import placement.dao.StudentRepo;
import placement.dao.StudentRepoImpl;
import placement.entities.College;
import placement.entities.Placement;

public class CollegeServiceImpl implements CollegeService {
CollegeRepo cr;
	
	public CollegeServiceImpl(){
		cr=new CollegeRepoImpl();
	}

	@Override
	public College addCollege(College college) {
		cr.startTransaction();
		cr.addCollege(college);
		cr.endTransaction();
		return college;
		
		
	}

	@Override
	public College updateCollege(College college) {
		cr.startTransaction();
		cr.updateCollege(college);
		cr.endTransaction();
		return college;
	}

	@Override
	public College searchCollege(long id) {
		
		return cr.searchCollege(id);
	}

	@Override
	public boolean deleteCollege(long id) {
		cr.startTransaction();
		cr.deleteCollege(id);
		cr.endTransaction();
		return true;
	}

	@Override
	public String schedulePlacement(Placement placement) {
		return "placement scheduled successfully";
	}

}
