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

			tourist.add(t);

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

		TourDB target=null;
		for (int i = 0; i < tourist.size(); i++) {

			if (historic.equals(tourist.get(i).getName())) {

				System.out.println(i + "번째에서" + tourist.get(i).getName() + "(가)이 겹친다");

				target = tourist.get(i);
				return target; // 겹치는 것이 있다면, 겹치는 객체가 반환된다.
				
			}
			
		}
		return target;
//		return target; // 겹치는 것이 없다면, null 값을 갖는 target 객체가 반환된다.}
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

		TourDB target = this.findhistoric(historic); // 겹치는 것이 있는 경우, 해당 객체가 target에 저장된다. 겹치는 것이 없는 경우, null값이 저장된다.

		if (target != null) {// null값이 아닌경우에는

			tourist.remove(target); // 해당 객체를 삭제한다.

		} else {

			System.out.println("해당 유적지(삭제 요청 유적지)는 존재하지 않습니다.");

		}

	}

	public List<TourDB> getList() {

		return tourist;

	}

	/**
	 * 
	 * 목록 : list의 tourist 값 찾아서 출력
	 * 
	 */

	public void printList() {

		System.out.println(tourist.toString());

	}

}