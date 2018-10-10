package tour;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * �������� ������ ����
 */
public class TourDB implements Serializable{
//	private String nation;
	private String name;
	private String address;
	private int enterfee;
//	private int season;	//���ÿɼ�
	private int close;
	//�̹���
	private BufferedImage image;
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
		this.address = address;
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

	
	public void setImage(BufferedImage image) {
		
		this.image = image;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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
	
	public BufferedImage getImage() {
		return image;
	}
	
	
	
	
	@Override
	public String toString() {
		return "TourDB [name=" + name + ", address=" + address + ", enterfee=" + enterfee + ", close=" + close + "]\n";
	}

	
	
	
	
	
	
	
}
