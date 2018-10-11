package tour;

import java.util.List;
import java.util.Scanner;

public class Goodmain {
	public static void main(String[] args) {
		TourManager tourmanager = new TourManager();
		Scanner s = new Scanner(System.in);
		String a = null;
		System.out.println("좋아요를 클릭할 장소를 입력하시오.");
		a = s.next();
		tourmanager.Goodplus(a);
		tourmanager.toString();
		
	}
}
