package tour;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

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
			a.remove(target);
			// System.out.println(a);
			// System.out.println(a.contains(target));
			// System.out.println(a.remove(target));
			// System.out.println(a);
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

	List<String> list = new ArrayList<>(); // ���� ��� ���� ����Ʈ
//// ���� ���� �����ϴ� �޼ҵ�	
//	public void savepic(String source) throws IOException {
////		String targetFileName = "pic.dat";
//		TourDB tourdb = new TourDB();
//		int readbyteno;
//		byte[] readbytes = new byte[100];				
//		FileInputStream fi = new FileInputStream(path);
////		FileOutputStream fos = new FileOutputStream(target);
//		while ((readbyteno = fi.read(readbytes)) != -1) {
////			fos.write(readbytes, 0, readbyteno);
//			tourdb.setImage(readbytes);
//		}
////		fos.flush();fos.close();
//	}

	/**
	 * Addpic�κ��� ��θ� �Է� �޾Ƽ�, File i/o ���ؼ�, memberDB�� �����ϴ� �޼ҵ�
	 * 
	 * @return
	 * 
	 * @throws IOException
	 */
	public byte[] BufferedImageToByteArray(String filename) {
		byte[] imagebyte = null;
		try {
			BufferedImage orimage = ImageIO.read(new File(filename));
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(orimage, "jpg", baos);
			byte[] imagebytes = baos.toByteArray();
			imagebyte = imagebytes;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return imagebyte;

	}

	/**
	 * "���ƿ�"�� Ŭ���ϸ� 1�� �ö󰡴� �޼ҵ�
	 */
//	public int Goodplus(String a) {
//		List<TourDB> b = null;
//		int num =0;
//		TourManager tourmanager = new TourManager();
//		b = tourmanager.readFile();
//		for (int i = 0; i < b.size(); i++) {
//			if (a.equals(b.get(i).getName())) {
//				num=b.get(i).getGood()+1;
//				num = num + 1;
//				return num;
//			}
//		}
//		return -1;
//	}
	public void Goodplus(String a) {
		List<TourDB> b = null;
		int num = 0;
		b = this.readFile();
		for (int i = 0; i < b.size(); i++) {
			if (a.equals(b.get(i).getName())) {
				num = b.get(i).getGood() + 1;
				b.get(i).setGood(num);
				// return num;
			}
		}
		try (FileOutputStream fo = new FileOutputStream(target);
				BufferedOutputStream bo = new BufferedOutputStream(fo);
				ObjectOutputStream oo = new ObjectOutputStream(bo);) {
			oo.writeObject(b);
			System.out.println("���� �Ϸ� �Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println("���� �������� ������ �߻��߽��ϴ�.");
			e.printStackTrace();
		}
		// return -1;
	}

}
