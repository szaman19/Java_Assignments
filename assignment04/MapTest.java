package assignment04;
import java.util.Collections;
public class MapTest {
	public static void main(String[] args) {
		TownList towns = new TownList();
		towns.add(new Town("Lima", "Peru",
			Meridional.SOUTH, Zonal.WEST, 12, 2, 36, 77, 1, 30));
		towns.add(new Town("Williamsport, PA", "USA",
			Meridional.NORTH, Zonal.WEST, 41, 14, 40, 77, 1, 30));
		towns.add(new Town("London", "UK",
			Meridional.NORTH, Zonal.WEST, 51, 30, 26, 0, 7, 39));
		towns.add(new Town("Valencia", "Spain",
			Meridional.NORTH, Zonal.WEST, 39, 28, 0, 0, 23, 0));
		towns.add(new Town("Mumbai", "India",
			Meridional.NORTH, Zonal.EAST, 18, 58, 30, 72, 49, 33));
		towns.add(new Town("Beijing", "China",
			Meridional.NORTH, Zonal.EAST, 39, 55, 0, 116, 23, 0));
		towns.add(new Town("Valencia", "Spain",
			Meridional.NORTH, Zonal.WEST, 39, 28, 0, 0, 23, 0));
		towns.add(new Town("Christchurch", "New Zealand",
			Meridional.SOUTH, Zonal.EAST, 43, 31, 48, 172, 37, 13));
		Collections.sort(towns);
		System.out.println(towns);
	}
}
