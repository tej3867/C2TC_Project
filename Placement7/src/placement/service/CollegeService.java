package placement.service;

import placement.entities.College;
import placement.entities.Placement;

public interface CollegeService {
	public College addCollege(College college);
	public College updateCollege(College college);
	public College searchCollege(long id);
	public boolean deleteCollege(long id);
	public String schedulePlacement(Placement placement);

}
