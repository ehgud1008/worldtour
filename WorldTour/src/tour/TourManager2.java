package tour;

import java.util.ArrayList;
import java.util.List;

public class TourManager2 {

	private List<TourDB> tourist = new ArrayList<>();

//	public void addList(TourDB t) { // 매개 TourDB를 통해, historic가 존재하면 추가하지 않고, historic가 있으면 추가한다.
//		for (int i = 0; i < tourist.size(); i++) {
//			if (!t.getName().equals(tourist.get(i).getName())) {
//				this.tourist.add(t);
//			} else {
//				System.out.println("입력된 정보가 존재합니다. (다시 입력 하세요.)");
//			}
//		}
//	}
	public void addList(TourDB t) {
		int num=this.findhistoric(t.getName());
		if(num!=-1) {
			tourist.add(t);
		}
		else {
			System.out.println("이미 목록에 있습니다.");
		}
	}

	/**
	 * 검색 : 매개변수 TourDB의 유적지와 List에 저장된 객체의 유적지 일치여부 판단 후 인덱스 출력
	 * 
	 * @param
	 * @return
	 */
//	public int findhistoric(TourDB t) {
//		int num = 0; // 유적지 일치하는 객체의 순서를 저장하는 변수
//		for (int i = 0; i < tourist.size(); i++) {
//			if (t.getName().equals(tourist.get(i).getName())) {
//				System.out.println(i + "번째에서" + tourist.get(i).getName() + "(가)이 겹친다");
//				num = i;
//			}
//		}
//		return num;
//	}
	/**
	 * 검색 : findhistoric 메소드를 통해서, 매개값 historic을 입력 받아서, list에 저장된 객체 들의 name중 후〈
	 * 객체의 인덱스를 출력한다.
	 * 
	 * @param historic
	 * @return
	 */
	public int findhistoric(String historic) {
	
		int num = -1; // 유적지 일치하는 객체의 순서를 저장하는 변수
		for (int i = 0; i < tourist.size(); i++) {
			if (historic.equals(tourist.get(i).getName())) {
				System.out.println(i + "번째에서" + tourist.get(i).getName() + "(가)이 겹친다");
				num = i;
				return num;
			}

		}
		return num;
	}

	public int findhistoric1(String historic) {
		int num = -1;
		if(isCheck(historic) == false) {
			System.out.println("중복결과 없음");
			num = 1;
		}
		else {
			System.out.println("중복결과 있음");
			num = -1;
		}
		return num;
	}

	public boolean isCheck(String historic) {
		boolean result = false;
		for (int i = 0; i < tourist.size(); i++) {
			if (historic.equals(tourist.get(i).getName())) {
				result = true;
			}
			else {
				result = false;
			}
		}
		return result;
	}
	
	public void add(boolean result) {
		
			
	}
	/**
	 * 삭제 : Main에서 입력 값을 매개 변수로 받아, 삭제
	 * 
	 * @param historic
	 */
//	public void removeList(String historic) {
//		for (int i = 0; i < tourist.size(); i++) {
//			if (tourist.get(i).getName().equals(historic)) { // 매개변수 값과 리스트 객체의 name일치 여부 판단
//				tourist.remove(i);
//			}
//		}
//	}
	/**
	 * 삭제 : Main에서 입력 값을 매개 변수로 받아, 삭제
	 * 
	 * @param historic
	 */
	public void removeList(String historic) {
		int num = this.findhistoric(historic);
		if (num != -1) {// 겹치는 것이 있다면

			tourist.remove(num); // 해당 인덱스(num)으로 들어가서 삭제한다.

		} else {
			System.out.println("해당 유적지(삭제 요청 유적지)는 존재하지 않습니다.");
		}
	}
//	public void addList1(String historic) {
//		int num = this.findhistoric(historic);
//		if(num==-1) {
//			
//		}
//	}

	public List<TourDB> getList() {
		return tourist;
	}
/**
 * 목록 : list의 tourist 값 찾아서 출력
 */
	public void printList() {
		System.out.println(tourist.toString());

	}

}
