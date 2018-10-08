package tour;

import java.util.Scanner;

/**
 * 검색, 추가, 삭제, 목록 모든 기능.
 * 
 * @author user
 */
public class AddMain {
	public static void main(String[] args) {
		TourManager tourmanager = new TourManager();
		Scanner input = new Scanner(System.in);
		String city, address = null;
		int enterfee, close = 0;
		int num;
		System.out.println("*원하는 기능의 번호를 입력하세요.");
		System.out.println("1. 장소, 주소, 입장료, 폐점시간");
		System.out.println("2. 장소, 주소");
		System.out.println("3. 장소");
		num = input.nextInt();
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