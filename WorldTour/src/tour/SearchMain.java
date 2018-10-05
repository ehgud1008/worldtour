package tour;

import java.util.Scanner;

public class SearchMain {
	public static void main(String[] args) {

		TourManager3 m = new TourManager3();
		
		Scanner sc = new Scanner(System.in);
		String search;
		System.out.println("검색할 관광지 입력");
		search = sc.nextLine();
		m.findhistoric(search);
		
		
	}

}
