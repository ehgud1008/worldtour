package tour;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class TourManager {
	private File target = new File("TourSite.db");

	/**
	 * 추가 하는 메소드
	 * 
	 * @param t
	 */

	public void addList(TourDB t) {
		TourDB target = this.findhistoric(t.getName());
		if (target == null) {
			List<TourDB> a = readFile();
			a.add(t);
			saveFile(a);
			System.out.println(a.size());
		} else {
			System.out.println("이미 목록에 있습니다.");
		}
	}

	/**
	 * 검색 : findhistoric 메소드를 통해서, 매개값 historic을 입력 받아서, list에 저장된 객체 들의 name중 후
	 * 객체의 인덱스를 출력한다.
	 * 
	 * @param historic
	 * @return
	 */
	public TourDB findhistoric(String historic) {
		List<TourDB> a = readFile();
		TourDB target = null;
		for (int i = 0; i < a.size(); i++) {
			if (historic.equals(a.get(i).getName())) {
				target = a.get(i);
				return target; // 겹치는 것이 있다면, 겹치는 객체가 반환된다.
			}
		}
		return target;
	}

	/**
	 * 삭제 : Main에서 입력 값을 매개 변수로 받아, 삭제
	 * 
	 * @param historic
	 */
	public void removeList(String historic) {
		List<TourDB> a = readFile();
		TourDB target = this.findhistoric(historic); // 겹치는 것이 있는 경우, 해당 객체가 target에 저장된다. 겹치는 것이 없는 경우, null값이 저장된다.
		System.out.println(target);
		if (target != null) {
			a.remove(target);
			saveFile(a);
		} else {
			System.out.println("해당 유적지(삭제 요청 유적지)는 존재하지 않습니다.");
		}
	}

	public List<TourDB> getList() {
		return this.readFile();
	}

	/**
	 * 목록 : list의 tourist 값 찾아서 출력
	 */
	public void printList() {
		System.out.println(readFile().toString());
	}

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


	
	/**
	 * "좋아요"를 클릭하면 1씩 올라가는 메소드
	 */
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
			System.out.println("저장 완료 되었습니다.");
		} catch (Exception e) {
			System.out.println("저장 과정에서 오류가 발생했습니다.");
			e.printStackTrace();
		}
		// return -1;
	}

}
