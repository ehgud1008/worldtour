package tour;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
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

	public TourDB findhistoric(String historic) {
		List<TourDB> a = readFile();
		TourDB target = null;
		for (int i = 0; i < a.size(); i++) {
			if (historic.equals(a.get(i).getName())) {
				target = a.get(i);
				return target;
			}
		}
		return target;
	}

	public void removeList(String historic) {
		List<TourDB> a = readFile();
		TourDB target = this.findhistoric(historic);
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

	public void printList() {
		System.out.println(readFile().toString());
	}

	private File target = new File("files/TourSite.db");

	public List<TourDB> readFile() {
		List<TourDB> list;
		try (FileInputStream fi = new FileInputStream(target);
				BufferedInputStream bi = new BufferedInputStream(fi);
				ObjectInputStream oi = new ObjectInputStream(bi);) {
			list = (List<TourDB>) oi.readObject();
		} catch (Exception e) {
			list = new ArrayList<>();
		}
		return list;
	}

	public void saveFile(List<TourDB> list) {
		try (FileOutputStream fo = new FileOutputStream(target);
				BufferedOutputStream bo = new BufferedOutputStream(fo);
				ObjectOutputStream oo = new ObjectOutputStream(bo);) {
			oo.writeObject(list);
			System.out.println("저장 완료!");
		} catch (Exception e) {
			System.out.println("저장 실패~");
			e.printStackTrace();
		}
	}

//	public void image() {
//		TourDB db = new TourDB();
//		Image image = param;
//		int width = image.getWidth(null);
//		int height = image.getHeight(null);
//		int [] imagePixels = new int [width * height];
//		PixelGrabber g = new PixelGrabber(image, 0, 0, width, height, imagePixels, 0, width);
//		try {
//			g.grabPixels();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		BufferedImage bufImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
//		bufImage.setRGB(0, 0, width, height, imagePixels, 0, width);
//		
//		db.setImage(bufImage);
//	}
//	public void image(String path) {
//		
//		BufferedImage img = null;
//		ByteArrayOutputStream byos = new ByteArrayOutputStream();
//		try{
//		     ImageIO.write(img , "jpg" , byos);
//		 }catch(Exception e){e.printStackTrace();
//		 }finally{
//		      try {
//				byos.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		 }
//		 ByteArrayInputStream byis = new ByteArrayInputStream(byos.toByteArray());
//		
//
//	}
//	

	/** 
	* Addpic로부터 경로를 입력 받아서, File i/o 통해서, memberDB에 저장하는 메소드 
	* @return 이미지의 바이트 정보
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
			}
			catch (IOException e) { 
				e.printStackTrace(); 
			} 	
		return imagebyte; 
	}
	
	
	
	
	
}
