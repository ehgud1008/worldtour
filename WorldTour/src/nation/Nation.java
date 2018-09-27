package nation;

import java.util.ArrayList;
import java.util.List;

public abstract class Nation {
	//나라들 부모 클래스(최상위?)
	//나라별 공통적 기능들 정의
	//언어, 수도, 국가 면적, 전세계 기준 GDP순위, 국가 축제, 국가 유명인 
	protected String language = null; // 국가언어
	protected String capital = null;	// 국가수도
	protected String countrysize=null; // 국가크기
	protected String gdprank=null; //전세계 기준 GDP순위
	protected List<String>festival = new ArrayList<>(); // 국가 축제
	protected List<String>celeb = new ArrayList<>(); // 국가 유명인
}
