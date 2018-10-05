package tour;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	
		TourManager3 t = new TourManager3();
		t.addList(new TourDB("����", "����", 15000, 21));
		t.addList(new TourDB("�溹��", "����", 10000, 20));
		t.printList();
		TourDB db = new TourDB();
		File file = new File("files/TourSite.db");
		t.writeDB(file);
		
//		t.readDB(file);
		System.out.println(t.getName());
		
//		
//		Scanner sc = new Scanner(System.in);
//		String city = "";
//		String address;
//		int enterfee;
//		int close;
//		while(true) {
//			System.out.println("�߰��� ������ �Է�(�ʼ��Է�)");
//			city = sc.nextLine();
//			if(city.equals("����")) {
//				break;
//			}
//			System.out.println("�߰��� �ּ� �Է�(�ʼ��Է�)");
//			address = sc.nextLine();
//			
//			System.out.println("����� �Է�(���� �Է�)");
//			enterfee = sc.nextInt();
//			
//			System.out.println("�����ð� �Է�(���� �Է�)");
//			close = sc.nextInt();
//			if(city != null && address != null) {
//				t.addList(new TourDB(city, address, enterfee, close));
//			}else {
//				System.out.println("�̸��� �ּҴ� �ݵ�� �Է��ؾ��մϴ�");
//			}
//			
//			sc.nextLine();
//		}
//		
//		t.resetData("�����", 13000);
//		t.printList();
//		sc.close();
	}
}
