package placement.dao;

import placement.entities.Placement;

public interface PlacementRepo {
	public Placement addPlacement(Placement placement);
	public Placement updatePlacement(Placement placement);
	public Placement searchPlacement(long id);
	public void startTransaction();
	public void endTransaction();

}
