package placement.service;

import placement.entities.Placement;

public interface PlacementService {
	public Placement addPlacement(Placement placement);
	public Placement updatePlacement(Placement placement);
	public Placement searchPlacement(long id);
	public String cancelPlacement(long id);

}
