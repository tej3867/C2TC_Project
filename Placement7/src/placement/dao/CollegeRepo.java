package placement.dao;

import placement.entities.College;

public interface CollegeRepo {
	public College addCollege(College college);
	public College updateCollege(College college);
	public College searchCollege(long id);
	public boolean deleteCollege(long id);
	public void startTransaction();
	public void endTransaction();

}
