package tour;

import java.util.Scanner;

public class SearchMain {
	public static void main(String[] args) {
	TourManager tourmanager = new TourManager();
	System.out.println("찾고자 하는 여행지를 입력하세요.");
	String name=null;
	Scanner input = new Scanner(System.in);
	name=input.next();
	
	TourDB a =tourmanager.findhistoric(name);
	System.out.println(a);
}
}