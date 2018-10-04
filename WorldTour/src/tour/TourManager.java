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
	 * ������ �о���� �޼ҵ�
	 * (Ŭ���̾�Ʈ���� ������ �ʿ��ϸ� �����ͼ� ���)
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
	 * ������ �����ϴ� �޼ҵ�
	 * (������ ���α׷����� �߰��� ��Ų �� �� �޼ҵ带 �Ἥ �����Ŵ)
	 * @param list
	 */
	public void save(List<TourDB> list) {
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(DBfile)));){
			out.writeObject(list);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		//�޼ҵ� ����� �Ἥ ������/ �������� �����ؼ� �߰����� ������ ����
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
