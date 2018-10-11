package tour;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

/**
 
 * 
 * @author user
 */




/**
 * �˻�, �߰�, ����, ��� ��� ���.
 * 
 * @author user
 */
public class AddMain {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		TourManager tourmanager = new TourManager();
		Scanner input = new Scanner(System.in);
		String city, address = null; // �̸�, �ּ�
		int enterfee, close = 0; // �����, �����ð�
		int num;
		String path ="";// ���� ��ũ ���
		String namelink, foodhouse, foodlink; // �̸����, ����, �������
		
		
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
			System.out.println("��Ҹ�ũ �Է�");
			namelink = input.next();
			System.out.println("���");
			path = input.next();
			File f = new File(path);
			BufferedImage image = ImageIO.read(new FileInputStream(f));
			System.out.println("�����Է�: ");
			foodhouse = input.next();
			System.out.println("������ũ: ");
			foodlink = input.next();
			TourDB tourdb = new TourDB(city, address, namelink, enterfee, close, foodhouse, foodlink, image);
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