package tour;
/** 
 * �˻�, �߰�, ����, ���  ��� ���.
 * @author user
 *cj dhfflqm
 */
public class Main {
public static void main(String[] args) {
	TourDB tourdb1 = new TourDB("����", "����", 500, 15);
	TourDB tourdb2 = new TourDB("�溹��","����",100,15);
	TourDB tourdb3 = new TourDB("���ʹ�","����",100,15);
	

	TourManager2 tourmanager = new TourManager2();
	tourmanager.addList(tourdb1);
	tourmanager.addList(tourdb2);
	tourmanager.printList();
	tourmanager.removeList("����");
	tourmanager.printList();
	tourmanager.removeList("���ʹ�");
	tourmanager.printList();
	
//	tourmanager.printList();
//	tourmanager.removeList("����");
//	tourmanager.printList();
//	tourmanager.addList(tourdb2);
//	tourmanager.printList();
//	TourDB target= tourmanager.findhistoric("�溹��");
//	System.out.println(target);
	
//	TourDB tourdb4 = new TourDB("�Ե�Ÿ��","����",100,15);
//	TourDB tourdb5 = new TourDB("û�ʹ�","����",100,15);
//	TourManager tourmanager = new TourManager();
//	tourmanager.addList(tourdb1);
//	tourmanager.addList(tourdb2);
//	tourmanager.addList(tourdb3);
//	tourmanager.addList(tourdb4);
//	tourmanager.addList(tourdb5);
//	tourmanager.printList();
//	
//	tourmanager.removeList("����");
//	tourmanager.printList();
//
//	TourManager2 t2 = new TourManager2();
//	TourDB tourdb6 = new TourDB("û�ʹ�","����",100,15);
	
	//	TourDB tourdb6 = new TourDB("û�ʹ�","����",100,15);
//	int i = tourmanager.findhistoric("û�ʹ�");
//	System.out.println(i);
//	 i = tourmanager.findhistoric("�б�");
//	 System.out.println(i);
//	 i=tourmanager.findhistoric("���繫��");
//	 System.out.println(i);
//	tourmanager.printList();
//	tourmanager.printList();
//	tourmanager.removeList("����");
//	tourmanager.printList();
//	TourDB tourdb2 = new TourDB("����", "����", 500, 15);
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
//	System.out.println(tourdb.get(i).getName().equals("����"));
	
//	tourmanager�� ������ �ƹ��͵� �̿��� �� ���� �� ���� �����غ�����
	//tourmanager.removeList("����");
}
}
