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
import java.util.ArrayList;
import java.util.List;



public class TourManager {

	private List<TourDB> tourist = new ArrayList<>();
	private File DBfile = new File("files", "TourSite.db");
	
	/**
	 * 파일을 읽어오는 메소드
	 * (클라이언트에서 정보가 필요하면 가져와서 출력)
	 * @return
	 */
	public List<TourDB> openDB() {
		List<TourDB> db ;
		try {
			ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(DBfile)));
			db = (List<TourDB>) in.readObject();
			
			in.close();
		} catch (Exception e) {
			db = new ArrayList<>();
		}
		
		return db;
	}
	
	/**
	 * 파일을 저장하는 메소드
	 * (관리자 프로그램에서 추가를 시킨 후 이 메소드를 써서 저장시킴)
	 * @param list
	 */
	public void save(List<TourDB> list) {
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(DBfile)));){
			out.writeObject(list);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		//메소드 기능을 써서 있으면/ 없으면을 구분해서 추가할지 안할지 결졍
	}
	public void addList(TourDB t) {	
		tourist.add(t);
	}

	public void removeList(TourDB t) {
		tourist.remove(t);
	}

	public void findList() {
		
	}
	
	
	
	public void printList() {
		System.out.println(tourist.toString());
	}
	
}
