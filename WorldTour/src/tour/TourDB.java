package tour;

/**
 * �������� ������ ����
 */
public class TourDB {
//	private String nation;
	private String name;
	private String address;
	private int enterfee;
//	private int season;	//���ÿɼ�
	private int close;
	//�̹���
	//���ǻ��׵�
	
	public TourDB() {}
	/**
	 * �̸��� �߰��ϴ� ������
	 * @param name
	 */
	public TourDB(String name) {
		this.name = name;
	}
	
	/**
	 * �̸��� �ּҸ� �Է��ϴ� ������
	 * @param name
	 * @param address
	 */
	public TourDB(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	/**
	 * ������ ��ü�� �Է��ؾ��ϴ� ������
	 * @param name
	 * @param address
	 * @param enterfee
	 * @param close
	 */
	public TourDB(String name, String address, int enterfee/*, int season*/, int close) {
		this.name = name;
		this.enterfee = enterfee;
//		this.season = season;
		this.close = close;
	}
	
	
	/**
	 * Setter
	 */
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEnterfee(int string) {
		this.enterfee = string;
	}
//	public void setSeason(int season) {
//		this.season = season;
//	}
	public void setClose(int close) {
		this.close = close;
	}
	
	
	/**
	 * getter
	 */
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getEnterfee() {
		return enterfee;
	}
//	public int getSeason() {
//		return season;
//	}
	public int getClose() {
		return close;
	}
	
	@Override
	public String toString() {
		return "TourDB [name=" + name + ", address=" + address + ", enterfee=" + enterfee + "��, close=" + close + "��]";
	}
	
	
}
