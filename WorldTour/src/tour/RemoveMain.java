package tour;


import java.util.Scanner;

public class RemoveMain {
	public static void main(String[] args) {
//		String name = null;
//		Scanner input = new Scanner(System.in);
//		System.out.println("삭제하고 싶은 장소를 입력하세오.");
//		name = input.next();
//		TourManager tourmanager = new TourManager();
//		tourmanager.removeList(name);
//		System.out.println(tourmanager.readFile());
		Scanner input = new Scanner(System.in);
		String name=null;
		TourManager tourmanager = new TourManager();
		System.out.println("삭제원하는 도시이름 입력하시오.");
		name=input.next();
		tourmanager.removeList(name);
		System.out.println(tourmanager.readFile());
	}
}