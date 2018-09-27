package nation;

import java.util.ArrayList;
import java.util.List;

import continent.Asia;
/**
 * 언어 : 중국어
 * 수도 : 베이징
 * 국가크기 : 9,596,960㎢
 * GDP 순위 : 2위
 * 축제 : 상하이모터쇼
 * 유명인 : -
 * @author user
 *
 */
public class China extends Nation implements Asia{
	protected String language = null; // 국가언어
	protected String capital = null;	// 국가수도
	protected String countrysize=null; // 국가크기
	protected String gdprank=null; //전세계 기준 GDP순위
	protected List<String>festival = new ArrayList<>(); // 국가 축제
	protected List<String>celeb = new ArrayList<>(); // 국가 유명인
	
}
