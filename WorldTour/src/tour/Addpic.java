package tour;

import java.io.IOException;
import java.util.Scanner;

public class Addpic {
public static void main(String[] args) throws IOException {
	TourManager tourmanager = new TourManager();
	Scanner s = new Scanner(System.in);
	String path=null;
	System.out.println("경로를 입력하시오.");
	path=s.next();
	tourmanager.byteimage(path);
}
}
