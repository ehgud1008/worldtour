package tour;

import java.util.Scanner;

public class RemoveMain {
	public static void main(String[] args) {
//		String name = null;
//		Scanner input = new Scanner(System.in);
//		System.out.println("�����ϰ� ���� ��Ҹ� �Է��ϼ���.");
//		name = input.next();
//		TourManager tourmanager = new TourManager();
//		tourmanager.removeList(name);
//		System.out.println(tourmanager.readFile());
		
		TourManager manager = new TourManager();
		manager.removeList("1");
		System.out.println(manager.readFile());
	}
}