package tour;

import java.util.Scanner;

/**
 * �˻�, �߰�, ����, ��� ��� ���.
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
		System.out.println("*���ϴ� ����� ��ȣ�� �Է��ϼ���.");
		System.out.println("1. ���, �ּ�, �����, �����ð�");
		System.out.println("2. ���, �ּ�");
		System.out.println("3. ���");
		num = input.nextInt();
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