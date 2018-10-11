package root;

import java.util.List;

import tour.TourDB;
import tour.TourManager;

public class main {
	public static void main(String[] args) {
		TourManager m = new TourManager();
		List<TourDB> db = m.readFile();
		
		for(int i = 0; i < db.size(); i++) {
			System.out.println(db.get(i).getImage());
		}
	}
}
