package tour;

import java.util.Scanner;

public class MainDB {
	public static void add(int num) {
		TourManager tourmanager = new TourManager();
		Scanner input = new Scanner(System.in);
		String city, address = null;
		int enterfee, close = 0;
		if (num == 1) {
			System.out.println("��� �Է�:");
			city = input.next();
			System.out.println("�ּ� �Է�");
			address = input.next();
			System.out.println("����� �Է�");
			enterfee = input.nextInt();
			System.out.println("�����ð� �Է�");
			close = input.nextInt();
			TourDB tourdb = new TourDB(city, address, enterfee, close);
			tourmanager.addList(tourdb);
		} else if (num == 2) {
			System.out.println("��� �Է�:");
			city = input.next();
			System.out.println("�ּ� �Է�");
			address = input.next();
			TourDB tourdb = new TourDB(city, address);
			tourmanager.addList(tourdb);
		} else if (num == 3) {
			System.out.println("��� �Է�:");
			city = input.next();
			TourDB tourdb = new TourDB(city);
			tourmanager.addList(tourdb);

		}
		
			
	}
}
