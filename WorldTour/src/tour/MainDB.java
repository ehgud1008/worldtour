package tour;

import java.util.Scanner;

public class MainDB {
	public static void add(int num) {
		TourManager tourmanager = new TourManager();
		Scanner input = new Scanner(System.in);
		String city, address = null;
		int enterfee, close = 0;
		if (num == 1) {
			System.out.println("장소 입력:");
			city = input.next();
			System.out.println("주소 입력");
			address = input.next();
			System.out.println("입장료 입력");
			enterfee = input.nextInt();
			System.out.println("폐점시간 입력");
			close = input.nextInt();
			TourDB tourdb = new TourDB(city, address, enterfee, close);
			tourmanager.addList(tourdb);
		} else if (num == 2) {
			System.out.println("장소 입력:");
			city = input.next();
			System.out.println("주소 입력");
			address = input.next();
			TourDB tourdb = new TourDB(city, address);
			tourmanager.addList(tourdb);
		} else if (num == 3) {
			System.out.println("장소 입력:");
			city = input.next();
			TourDB tourdb = new TourDB(city);
			tourmanager.addList(tourdb);

		}
		
			
	}
}
