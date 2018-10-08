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

	/**
	 * �߰� �ϴ� �޼ҵ�
	 * 
	 * 
	 * 
	 * @param t
	 * 
	 */

	public void addList(TourDB t) {

		TourDB target = this.findhistoric(t.getName());

		if (target == null) {

			List<TourDB> a = readFile();
			a.add(t);
			saveFile(a);
			System.out.println(a.size());

		}

		else {

			System.out.println("�̹� ��Ͽ� �ֽ��ϴ�.");

		}

	}

	/**
	 * 
	 * �˻� : findhistoric �޼ҵ带 ���ؼ�, �Ű��� historic�� �Է� �޾Ƽ�, list�� ����� ��ü ���� name�� ��ġ��
	 * 
	 * ��ü�� �ε����� ����Ѵ�.
	 * 
	 * 
	 * 
	 * @param historic
	 * 
	 * @return
	 * 
	 */

	public TourDB findhistoric(String historic) {
		List<TourDB> a = readFile();
		TourDB target = null;
		for (int i = 0; i < a.size(); i++) {

			if (historic.equals(a.get(i).getName())) {

				// System.out.println(i + "��°����" + this.readFile().get(i).getName() + "(��)��
				// ��ģ��");

				target = a.get(i);

				return target; // ��ġ�� ���� �ִٸ�, ��ġ�� ��ü�� ��ȯ�ȴ�.

			}
		}
		return target;
		// return target; // ��ġ�� ���� ���ٸ�, null ���� ���� target ��ü�� ��ȯ�ȴ�.}
	}

	/**
	 * 
	 * ���� : Main���� �Է� ���� �Ű� ������ �޾�, ����
	 * 
	 * 
	 * 
	 * @param historic
	 * 
	 */

	public void removeList(String historic) {

		List<TourDB> a = readFile();
		TourDB target = this.findhistoric(historic); // ��ġ�� ���� �ִ� ���, �ش� ��ü�� target�� ����ȴ�. ��ġ�� ���� ���� ���, null���� ����ȴ�.
		System.out.println(target);

		// if(target.getName().equals(historic)) {
		if (target != null) {

			System.out.println(a);
			System.out.println(a.contains(target));
			System.out.println(a.remove(target));
			System.out.println(a);
//			saveFile(a);
			saveFile(a);

			// if (target != null) {// null���� �ƴѰ�쿡��
			/*
			 * for (int i = 0; i < readFile().size(); i++) { if
			 * (readFile().get(i).getName().equals(target.getName())) {
			 * this.readFile().remove(i); } }
			 */

		} else {

			System.out.println("�ش� ������(���� ��û ������)�� �������� �ʽ��ϴ�.");

		}
		// System.out.println(target);
	}

	public List<TourDB> getList() {

		return this.readFile();

	}

	/**
	 * 
	 * ��� : list�� tourist �� ã�Ƽ� ���
	 * 
	 */

	public void printList() {

		System.out.println(readFile().toString());

	}

	private File target = new File("member.db");

// ������ �Է��ϴ� �޼ҵ�(���α׷��� ǥ��) 
	public List<TourDB> readFile() {
		List<TourDB> list;
		try (FileInputStream fi = new FileInputStream(target);
				BufferedInputStream bi = new BufferedInputStream(fi);
				ObjectInputStream oi = new ObjectInputStream(bi);) {

			list = (List<TourDB>) oi.readObject();
//			oi.close();

		} catch (Exception e) {
			list = new ArrayList<>();
		}
		return list;
	}

// ������ ����ϴ� �޼ҵ�(���� �� ����)
	public void saveFile(List<TourDB> list) {
		try (FileOutputStream fo = new FileOutputStream(target);
				BufferedOutputStream bo = new BufferedOutputStream(fo);
				ObjectOutputStream oo = new ObjectOutputStream(bo);) {
			oo.writeObject(list);
			System.out.println("���� �Ϸ� �Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println("���� �������� ������ �߻��߽��ϴ�.");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		TourManager manager = new TourManager();
		
//		manager.addList(new TourDB("���ʹ�", "����", 1500, 1500));
		List<TourDB> a = manager.readFile();
		System.out.println(a);
		
		TourDB find = manager.findhistoric("1");
		System.out.println(find);
		
//		System.out.println(find.equals(a.get(0)));
		System.out.println(a.contains(find));
		System.out.println(a.remove(find));
		
		manager.saveFile(a);
		
	}

}