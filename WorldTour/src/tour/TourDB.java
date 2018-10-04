package tour;

/**
 * 관광지의 정보를 관리
 */
public class TourDB {
//	private String nation;
	private String name;
	private String address;
	private int enterfee;
//	private int season;	//선택옵션
	private int close;
	//이미지
	//주의사항들
	
	public TourDB() {}
	/**
	 * 이름만 추가하는 생성자
	 * @param name
	 */
	public TourDB(String name) {
		this.name = name;
	}
	
	/**
	 * 이름과 주소를 입력하는 생성자
	 * @param name
	 * @param address
	 */
	public TourDB(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	/**
	 * 데이터 전체를 입력해야하는 생성자
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
		return "TourDB [name=" + name + ", address=" + address + ", enterfee=" + enterfee + "원, close=" + close + "시]";
	}
	
	
}
