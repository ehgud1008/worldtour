package tour;

import java.util.ArrayList;

import java.util.List;

public class TourManager2 {

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

			tourist.add(t);

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

		TourDB target=null;
		for (int i = 0; i < tourist.size(); i++) {

			if (historic.equals(tourist.get(i).getName())) {

				System.out.println(i + "��°����" + tourist.get(i).getName() + "(��)�� ��ģ��");

				target = tourist.get(i);
				return target; // ��ġ�� ���� �ִٸ�, ��ġ�� ��ü�� ��ȯ�ȴ�.
				
			}
			
		}
		return target;
//		return target; // ��ġ�� ���� ���ٸ�, null ���� ���� target ��ü�� ��ȯ�ȴ�.}
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

		TourDB target = this.findhistoric(historic); // ��ġ�� ���� �ִ� ���, �ش� ��ü�� target�� ����ȴ�. ��ġ�� ���� ���� ���, null���� ����ȴ�.

		if (target != null) {// null���� �ƴѰ�쿡��

			tourist.remove(target); // �ش� ��ü�� �����Ѵ�.

		} else {

			System.out.println("�ش� ������(���� ��û ������)�� �������� �ʽ��ϴ�.");

		}

	}

	public List<TourDB> getList() {

		return tourist;

	}

	/**
	 * 
	 * ��� : list�� tourist �� ã�Ƽ� ���
	 * 
	 */

	public void printList() {

		System.out.println(tourist.toString());

	}

}