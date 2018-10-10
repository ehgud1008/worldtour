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
	 * 추가 하는 메소드
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

			System.out.println("이미 목록에 있습니다.");

		}

	}

	/**
	 * 
	 * 검색 : findhistoric 메소드를 통해서, 매개값 historic을 입력 받아서, list에 저장된 객체 들의 name중 곂치는
	 * 
	 * 객체의 인덱스를 출력한다.
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

				// System.out.println(i + "번째에서" + this.readFile().get(i).getName() + "(가)이
				// 겹친다");

				target = a.get(i);

				return target; // 겹치는 것이 있다면, 겹치는 객체가 반환된다.

			}
		}
		return target;
		// return target; // 겹치는 것이 없다면, null 값을 갖는 target 객체가 반환된다.}
	}

	/**
	 * 
	 * 삭제 : Main에서 입력 값을 매개 변수로 받아, 삭제
	 * 
	 * 
	 * 
	 * @param historic
	 * 
	 */

	public void removeList(String historic) {

		List<TourDB> a = readFile();
		TourDB target = this.findhistoric(historic); // 겹치는 것이 있는 경우, 해당 객체가 target에 저장된다. 겹치는 것이 없는 경우, null값이 저장된다.
		System.out.println(target);

		// if(target.getName().equals(historic)) {
		if (target != null) {
			a.remove(target);
			// System.out.println(a);
			// System.out.println(a.contains(target));
			// System.out.println(a.remove(target));
			// System.out.println(a);
			saveFile(a);

			// if (target != null) {// null값이 아닌경우에는
			/*
			 * for (int i = 0; i < readFile().size(); i++) { if
			 * (readFile().get(i).getName().equals(target.getName())) {
			 * this.readFile().remove(i); } }
			 */

		} else {

			System.out.println("해당 유적지(삭제 요청 유적지)는 존재하지 않습니다.");

		}
		// System.out.println(target);
	}

	public List<TourDB> getList() {

		return this.readFile();

	}

	/**
	 * 
	 * 목록 : list의 tourist 값 찾아서 출력
	 * 
	 */

	public void printList() {

		System.out.println(readFile().toString());

	}

	private File target = new File("member.db");

// 정보를 입력하는 메소드(프로그램상에 표시) 
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

// 정보를 출력하는 메소드(파일 상에 저장)
	public void saveFile(List<TourDB> list) {
		try (FileOutputStream fo = new FileOutputStream(target);
				BufferedOutputStream bo = new BufferedOutputStream(fo);
				ObjectOutputStream oo = new ObjectOutputStream(bo);) {
			oo.writeObject(list);
			System.out.println("저장 완료 되었습니다.");
		} catch (Exception e) {
			System.out.println("저장 과정에서 오류가 발생했습니다.");
			e.printStackTrace();
		}
	}

	List<String> list = new ArrayList<>(); // 사진 경로 저장 리스트
//// 정보 사진 관리하는 메소드	
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
	 * Addpic로부터 경로를 입력 받아서, File i/o 통해서, memberDB에 저장하는 메소드
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
}
