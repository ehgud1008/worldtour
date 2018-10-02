package tour;

/**
 * 관광지의 정보를 관리
 */
public class TourManager {
	private String name;
	private int enterfee;
	private int season;
	private int close;
	//이미지
	//주의사항들
	
//	public TourManager(String name, int enterfee, int season, int close) {
//		this.name = name;
//		this.enterfee = enterfee;
//		this.season = season;
//		this.close = close;
//	}
//	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setEnterfee(int enterfee) {
		this.enterfee = enterfee;
	}
	public void setSeason(int season) {
		this.season = season;
	}
	public void setClose(int close) {
		this.close = close;
	}
	
	
	
	public String getName() {
		return name;
	}
	public int getEnterfee() {
		return enterfee;
	}
	public int getSeason() {
		return season;
	}
	public int getClose() {
		return close;
	}
	
	
}
