package tour;

import java.util.Scanner;

public class AddMain {
	public static void main(String [] args) {
		TourManager3 m = new TourManager3();
		m.addList(new TourDB());

		Scanner sc = new Scanner(System.in);
		String city = "";
		String address;
		int enterfee;
		int close;
	
		System.out.println("추가할 관광지 입력(필수입력)");
		city = sc.nextLine();
		
		System.out.println("추가할 주소 입력(필수입력)");
		address = sc.nextLine();
		
		System.out.println("입장료 입력(선택 입력)");
		enterfee = sc.nextInt();
		
		System.out.println("마감시간 입력(선택 입력)");
		close = sc.nextInt();
//		m.addList(city,address,enterfee,close);
		
	}
	
}
