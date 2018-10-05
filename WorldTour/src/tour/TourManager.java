package tour;

import java.util.ArrayList;
import java.util.List;

public class TourManager {

	private List<TourDB> tourist = new ArrayList<>();

//	public void addList(TourDB t) { // �Ű� TourDB�� ����, historic�� �����ϸ� �߰����� �ʰ�, historic�� ������ �߰��Ѵ�.
//		for (int i = 0; i < tourist.size(); i++) {
//			if (!t.getName().equals(tourist.get(i).getName())) {
//				this.tourist.add(t);
//			} else {
//				System.out.println("�Էµ� ������ �����մϴ�. (�ٽ� �Է� �ϼ���.)");
//			}
//		}
//	}
	public void addList(TourDB t) {
		int num=this.findhistoric(t.getName());
		if(num!=-1) {
			tourist.add(t);
		}
		else {
			System.out.println("�̹� ��Ͽ� �ֽ��ϴ�.");
		}
	}

	/**
	 * �˻� : �Ű����� TourDB�� �������� List�� ����� ��ü�� ������ ��ġ���� �Ǵ� �� �ε��� ���
	 * 
	 * @param
	 * @return
	 */
//	public int findhistoric(TourDB t) {
//		int num = 0; // ������ ��ġ�ϴ� ��ü�� ������ �����ϴ� ����
//		for (int i = 0; i < tourist.size(); i++) {
//			if (t.getName().equals(tourist.get(i).getName())) {
//				System.out.println(i + "��°����" + tourist.get(i).getName() + "(��)�� ��ģ��");
//				num = i;
//			}
//		}
//		return num;
//	}
	/**
	 * �˻� : findhistoric �޼ҵ带 ���ؼ�, �Ű��� historic�� �Է� �޾Ƽ�, list�� ����� ��ü ���� name�� ��ġ��
	 * ��ü�� �ε����� ����Ѵ�.
	 * 
	 * @param historic
	 * @return
	 */
	public int findhistoric(String historic) {
	
		int num = -1; // ������ ��ġ�ϴ� ��ü�� ������ �����ϴ� ����
		for (int i = 0; i < tourist.size(); i++) {
			if (historic.equals(tourist.get(i).getName())) {
				System.out.println(i + "��°����" + tourist.get(i).getName() + "(��)�� ��ģ��");
				num = i;
				return num;
			}

		}
		return num;
	}

	public int findhistoric1(String historic) {
		int num = -1;
		if(isCheck(historic) == false) {
			System.out.println("�ߺ���� ����");
			num = 1;
		}
		else {
			System.out.println("�ߺ���� ����");
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
	 * ���� : Main���� �Է� ���� �Ű� ������ �޾�, ����
	 * 
	 * @param historic
	 */
//	public void removeList(String historic) {
//		for (int i = 0; i < tourist.size(); i++) {
//			if (tourist.get(i).getName().equals(historic)) { // �Ű����� ���� ����Ʈ ��ü�� name��ġ ���� �Ǵ�
//				tourist.remove(i);
//			}
//		}
//	}
	/**
	 * ���� : Main���� �Է� ���� �Ű� ������ �޾�, ����
	 * 
	 * @param historic
	 */
	public void removeList(String historic) {
		int num = this.findhistoric(historic);
		if (num != -1) {// ��ġ�� ���� �ִٸ�

			tourist.remove(num); // �ش� �ε���(num)���� ���� �����Ѵ�.

		} else {
			System.out.println("�ش� ������(���� ��û ������)�� �������� �ʽ��ϴ�.");
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
 * ��� : list�� tourist �� ã�Ƽ� ���
 */
	public void printList() {
		System.out.println(tourist.toString());

	}

}
