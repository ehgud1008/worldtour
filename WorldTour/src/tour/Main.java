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
		t.addList(new TourDB("남산", "서울", 15000, 21));
		t.addList(new TourDB("경복궁", "서울", 10000, 20));
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
//			System.out.println("추가할 관광지 입력(필수입력)");
//			city = sc.nextLine();
//			if(city.equals("종료")) {
//				break;
//			}
//			System.out.println("추가할 주소 입력(필수입력)");
//			address = sc.nextLine();
//			
//			System.out.println("입장료 입력(선택 입력)");
//			enterfee = sc.nextInt();
//			
//			System.out.println("마감시간 입력(선택 입력)");
//			close = sc.nextInt();
//			if(city != null && address != null) {
//				t.addList(new TourDB(city, address, enterfee, close));
//			}else {
//				System.out.println("이름과 주소는 반드시 입력해야합니다");
//			}
//			
//			sc.nextLine();
//		}
//		
//		t.resetData("입장료", 13000);
//		t.printList();
//		sc.close();
	}
}
