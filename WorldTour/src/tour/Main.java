package tour;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	
		TourManager m = new TourManager();
		List <TourDB> list = new ArrayList<>();
		list.add(new TourDB("남산","서울"));
		m.save(list);
		
	}
}
