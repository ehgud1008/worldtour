package tour;
/** 
 * 검색, 추가, 삭제, 목록  모든 기능.
 * @author user
 *cj dhfflqm
 */
public class Main {
public static void main(String[] args) {
	TourDB tourdb1 = new TourDB("남산", "서울", 500, 15);
	TourDB tourdb2 = new TourDB("경복궁","서울",100,15);
	TourDB tourdb3 = new TourDB("숭례문","서울",100,15);
	

	TourManager2 tourmanager = new TourManager2();
	tourmanager.addList(tourdb1);
	tourmanager.addList(tourdb2);
	tourmanager.printList();
	tourmanager.removeList("남산");
	tourmanager.printList();
	tourmanager.removeList("숭례문");
	tourmanager.printList();
	
//	tourmanager.printList();
//	tourmanager.removeList("남산");
//	tourmanager.printList();
//	tourmanager.addList(tourdb2);
//	tourmanager.printList();
//	TourDB target= tourmanager.findhistoric("경복궁");
//	System.out.println(target);
	
//	TourDB tourdb4 = new TourDB("롯데타워","서울",100,15);
//	TourDB tourdb5 = new TourDB("청와대","서울",100,15);
//	TourManager tourmanager = new TourManager();
//	tourmanager.addList(tourdb1);
//	tourmanager.addList(tourdb2);
//	tourmanager.addList(tourdb3);
//	tourmanager.addList(tourdb4);
//	tourmanager.addList(tourdb5);
//	tourmanager.printList();
//	
//	tourmanager.removeList("남산");
//	tourmanager.printList();
//
//	TourManager2 t2 = new TourManager2();
//	TourDB tourdb6 = new TourDB("청와대","서울",100,15);
	
	//	TourDB tourdb6 = new TourDB("청와대","서울",100,15);
//	int i = tourmanager.findhistoric("청와대");
//	System.out.println(i);
//	 i = tourmanager.findhistoric("학교");
//	 System.out.println(i);
//	 i=tourmanager.findhistoric("동사무소");
//	 System.out.println(i);
//	tourmanager.printList();
//	tourmanager.printList();
//	tourmanager.removeList("남산");
//	tourmanager.printList();
//	TourDB tourdb2 = new TourDB("남산", "서울", 500, 15);
//	TourManager tourmanager = new TourManager();
//	tourmanager.addList(tourdb);
//	tourmanager.printList();
//	tourmanager.addList(tourdb);
//	tourmanager.printList();
//	tourmanager.removeList(tourdb);
//	tourmanager.printList();
//	tourmanager.removeList(tourdb2);
//	tourmanager.printList();
//	for(int i=)
//	System.out.println(tourdb.get(i).getName().equals("남산"));
	
//	tourmanager를 제외한 아무것도 이용할 수 없을 때 남산 삭제해보세요
	//tourmanager.removeList("남산");
}
}
