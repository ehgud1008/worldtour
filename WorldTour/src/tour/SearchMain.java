package tour;

import java.util.Scanner;

public class SearchMain {
	public static void main(String[] args) {
	TourManager tourmanager = new TourManager();
	System.out.println("ã���� �ϴ� �������� �Է��ϼ���.");
	String name=null;
	Scanner input = new Scanner(System.in);
	name=input.next();
	
	TourDB a =tourmanager.findhistoric(name);
	System.out.println(a);
}
}