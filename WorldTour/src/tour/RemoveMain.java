package tour;

import java.util.Scanner;

public class RemoveMain {
	public static void main(String[] args) {
		
		TourManager3 m = new TourManager3();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삭제할 관광지 입력");
		String remove = sc.nextLine();
		
		m.removeList(remove);
		
		
	}
}
