package tour;

import java.util.ArrayList;
import java.util.List;

public class TourManager {

	private List<TourDB> tourist = new ArrayList<>();
//	private TourDB db = new TourDB();
//	private Map<String, TourManager> tourist = new HashMap<>();
	
	public void addList(TourDB t) {
		tourist.add(t);
	}

	public void removeList(TourDB t) {
		tourist.remove(t);
	}

	
	public void findList() {
		
	}
	
	public List<TourDB> getList() {
		return tourist;
	}
	public void printList() {
		System.out.println(tourist.toString());
	}
	
}
