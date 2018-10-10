//package tour;
//
//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.EOFException;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//
//public class TourManager3 implements Serializable{
//
////	private List<TourDB> tourist = new ArrayList<>();
//
//	/**
//	 * 추가 하는 메소드
//	 * @param t
//	 * 
//	 */
//	public void addList(TourDB t) {
//		TourDB target = findhistoric(t.getName());
//		if (target == null) {
////			readDB(file)
////			List <TourDB> list = readDB(list);
//			list.add(t);
//			writeDB(list);
////			readDB().add(t);
////			writeDB();
////			tourist.add(t);
//		}
//		else {
//			System.out.println("이미 목록에 있습니다.");
//		}
//	}
//	/**
//	 * 검색 : findhistoric 메소드를 통해서, 매개값 historic을 입력 받아서, list에 저장된 객체 들의 name중 후
//	 * 객체의 인덱스를 출력한다.
//	 * @param historic
//	 * @return
//	 */
//	public TourDB findhistoric(String historic) {
//		TourDB target = null;
//		for (int i = 0; i < readDB().size(); i++) {
//			if (historic.equals(readDB().get(i).getName())) {
//				System.out.println(i + "번째에서" + readDB().get(i).getName() + "(가)이 겹친다");
//				target = readDB().get(i);
//				return target; // 겹치는 것이 있다면, 겹치는 객체가 반환된다.
//			}
//		}
//		return target;
////		return target; // 겹치는 것이 없다면, null 값을 갖는 target 객체가 반환된다.}
//	}
////	/**
////	 * 삭제 : Main에서 입력 값을 매개 변수로 받아, 삭제
////	 * @param historic
////	 */
////	public void removeList(String historic) {
////		TourDB target = this.findhistoric(historic); // 겹치는 것이 있는 경우, 해당 객체가 target에 저장된다. 겹치는 것이 없는 경우, null값이 저장된다.
////		if (target != null) {// null값이 아닌경우에는
////			tourist.remove(target); // 해당 객체를 삭제한다.
////		} else {
////			System.out.println("해당 유적지(삭제 요청 유적지)는 존재하지 않습니다.");
////		}
////	}
////	
////	public List<TourDB> getList() {
////		return tourist;
////	}
////	/**
////	 * 목록 : list의 tourist 값 찾아서 출력
////	 */
////	public void printList() {
////		System.out.println(tourist.toString());
////	}
////
////	
////	public String[] getName() {
////		String [] name = new String [tourist.size()];
////		for(int i = 0;i < tourist.size(); i++) {
////			name[i] = tourist.get(i).getName();
////		}
////		System.out.println(tourist.size());
////		return name;
////	}
////	
//	
//	private File file = new File("files/TourSite.db");
//	/**
//	 * DB를 저장하는 메소드
//	 * @param list
//	 * @param file
//	 */
//	public void writeDB(List <TourDB> list){
////		Iterator iter = readDB().iterator();
//	//	byte[] serializedDB;
//		ObjectOutputStream out = null ;
//		try{
//			out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));			
//			out.writeObject(list);
//			
////			for(int i = 0; i < tourist.size(); i++) {
////				out.writeObject(tourist.get(i));
////			}
////			while(iter.hasNext()) {
////				TourDB db = (TourDB) iter.next();
////				out.writeObject(db);
////			} 
//		}catch(Exception e){e.printStackTrace();}
//		finally {
//			try {out.close();
//	//		System.out.println("저장 완료~");
//			} 
//			catch (IOException e) {e.printStackTrace();}
//		}
//	}
//	
//	/**
//	 * DB파일을 가져오는 메소드
//	 * @param file
//	 * @return
//	 */
//	public List<TourDB> readDB(List <TourDB> list) {
//	//	TourDB db = new TourDB();
////		List<TourDB> list = new ArrayList<>();
////		List<TourDB> list = null;
//		
//		ObjectInputStream in = null ;
//		try{
//			in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));			
//	//		for(TourDB db : list) {
//	//			list.add((TourDB) in.readObject());
//	//		}
//			list.add((TourDB) in.readObject());
//	//			db = (TourDB) in.readObject();
//	////		Student stu = (Student) inobj.readObject();
//	//			TourDB db = (TourDB) in.readObject();
//	//			list.add(db);
//			
//		}
//		catch(EOFException e) {}
//		catch(Exception e){
//			e.printStackTrace();
//		}finally {
//			try {in.close();} 
//			catch (IOException e) {e.printStackTrace();}
//		}
//	//	System.out.println(list);
//		return list;
//	}
//	//public void writeDB(File file){
//	//Iterator iter = tourist.iterator();
//	////byte[] serializedDB;
//	//ObjectOutputStream out = null ;
//	//try/*(ByteArrayOutputStream byteout = new ByteArrayOutputStream())*/{
//	//	out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));			
//	//	while(iter.hasNext()) {
//	//		TourDB db = (TourDB) iter.next();
//	//		out.writeObject(db);
//	////		serializedDB = byteout.toByteArray();
//	//	}
//	//}catch(Exception e){e.printStackTrace();}
//	//finally {
//	//	try {out.close();} 
//	//	catch (IOException e) {e.printStackTrace();}
//	//}
//	//}
//	//
//	//
//	//public List<TourDB> readDB(File file) {
//	////TourDB db = new TourDB();
//	//List<TourDB> list = new ArrayList<>();
//	//ObjectInputStream in = null ;
//	//try{
//	//	in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));			
//	//	while(true) {
//	//	
//	////		Student stu = (Student) inobj.readObject();
//	//		TourDB db = (TourDB) in.readObject();
//	//		list.add(db);
//	//	}
//	//}catch(Exception e){
//	//	e.printStackTrace();
//	//}finally {
//	//	try {in.close();} 
//	//	catch (IOException e) {e.printStackTrace();}
//	//}
//	//return list;
//	//}
//	//
//	//}
//
//}