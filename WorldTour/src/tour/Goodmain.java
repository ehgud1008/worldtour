package tour;

import java.util.List;
import java.util.Scanner;

public class Goodmain {
	public static void main(String[] args) {
		TourManager tourmanager = new TourManager();
		Scanner s = new Scanner(System.in);
		String a = null;
		System.out.println("���ƿ並 Ŭ���� ��Ҹ� �Է��Ͻÿ�.");
		a = s.next();
		tourmanager.Goodplus(a);
		tourmanager.toString();
		
	}
}
