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
	
		System.out.println("�߰��� ������ �Է�(�ʼ��Է�)");
		city = sc.nextLine();
		
		System.out.println("�߰��� �ּ� �Է�(�ʼ��Է�)");
		address = sc.nextLine();
		
		System.out.println("����� �Է�(���� �Է�)");
		enterfee = sc.nextInt();
		
		System.out.println("�����ð� �Է�(���� �Է�)");
		close = sc.nextInt();
//		m.addList(city,address,enterfee,close);
		
	}
	
}
