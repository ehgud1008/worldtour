package tour;

import java.io.IOException;
import java.util.Scanner;

public class Addpic {
public static void main(String[] args) throws IOException {
	TourManager tourmanager = new TourManager();
	Scanner s = new Scanner(System.in);
	String path=null;
	System.out.println("��θ� �Է��Ͻÿ�.");
	path=s.next();
	tourmanager.byteimage(path);
}
}
