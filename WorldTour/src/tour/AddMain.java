package tour;

import java.io.IOException;
import java.util.Scanner;

/**
 * 검색, 추가, 삭제, 목록 모든 기능.
 * 
 * @author user
 */




/**
 * 검색, 추가, 삭제, 목록 모든 기능.
 * 
 * @author user
 */
public class AddMain {
	public static void main(String[] args) {
		TourManager tourmanager = new TourManager();
		Scanner input = new Scanner(System.in);
		String city, address = null; // 이름, 주소
		int enterfee, close = 0; // 입장료, 폐점시간
		int num;
		String path ="";// 사진 링크 경로
		String namelink, foodhouse, foodlink; // 이름경로, 맛집, 맛집경로
		
		
		System.out.println("*원하는 기능의 번호를 입력하세요.");
		System.out.println("1. 장소, 주소, 입장료, 폐점시간");
		System.out.println("2. 장소, 주소");
		System.out.println("3. 장소");
		num = input.nextInt();
		if (num == 1) {
			System.out.println("장소 입력:");
			city = input.next();
			System.out.println("주소 입력");
			address = input.next();
			System.out.println("입장료 입력");
			enterfee = input.nextInt();
			System.out.println("폐점시간 입력");
			close = input.nextInt();
			System.out.println("장소링크 입력");
			namelink = input.next();
			System.out.println("경로");
			path = input.next();
			byte[] a=tourmanager.BufferedImageToByteArray(path);
			System.out.println("맛집입력: ");
			foodhouse = input.next();
			System.out.println("맛집링크: ");
			foodlink = input.next();
			
			
			TourDB tourdb = new TourDB(city, address, namelink, enterfee, close, a, foodhouse, foodlink);
			tourmanager.addList(tourdb);
		} else if (num == 2) {
			System.out.println("장소 입력:");
			city = input.next();
			System.out.println("주소 입력");
			address = input.next();
			TourDB tourdb = new TourDB(city, address);
			tourmanager.addList(tourdb);
		} else if (num == 3) {
			System.out.println("장소 입력:");
			city = input.next();
			TourDB tourdb = new TourDB(city);
			tourmanager.addList(tourdb);

		}

	}
}