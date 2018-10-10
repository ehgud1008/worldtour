package tour;


import java.io.Serializable;
import java.util.Arrays;

/**
 * �������� ������ ����
 */
public class TourDB implements Serializable {
//	private static final long serialVersionUID = 1L;
	//	private String nation;
	private String name; //�̸�
	private String address;//�ּ�
	private String namelink; // ������ ��ũ
	private int enterfee;//�����
//	private int season;	//���ÿɼ�
	private int close;//�����ð�
	private byte[] image;
	private String foodhouse;// ����
	private String foodlink;// ������ũ
//	private String path;
	

	//�̹���
	//���ǻ��׵�
	
	
	
	public TourDB(String name, String address, String namelink, int enterfee, int close, byte[] image, String foodhouse,
			String foodlink) {
		super();
		this.name = name;
		this.address = address;
		this.namelink = namelink;
		this.enterfee = enterfee;
		this.close = close;
		this.image = image;
		this.foodhouse = foodhouse;
		this.foodlink = foodlink;
	}
//	public TourDB() {}
//	public TourDB(String name, String address, int enterfee, int close, byte[] image) {
//	super();
//	this.name = name;
//	this.address = address;
//	this.enterfee = enterfee;
//	this.close = close;
//	this.image = image;
//}
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + close;
		result = prime * result + enterfee;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TourDB other = (TourDB) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (close != other.close)
			return false;
		if (enterfee != other.enterfee)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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
		this.address = address;
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
	public void setImage(byte[] image) {
		this.image = image;
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
	public byte[] getImage() {
		return image;
	}
	@Override
	public String toString() {
		return "TourDB [name=" + name + ", address=" + address + ", enterfee=" + enterfee + ", close=" + close
				+ "]";
	}
	
	
	
	
}
