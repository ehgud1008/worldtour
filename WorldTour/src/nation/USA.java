package nation;

import java.util.ArrayList;
import java.util.List;

import continent.NorthAmerica;
/**
 * 언어 : 영어
 * 수도 : 워싱턴DC
 * 국가크기 : 9,833,517㎢
 * GDP 순위 : 1위
 * 축제 : 뉴욕코믹콘
 * 유명인 : -
 * @author user
 *
 */
public class USA extends Nation implements NorthAmerica{
	protected String language = null; // 국가언어
	protected String capital = null;	// 국가수도
	protected String countrysize=null; // 국가크기
	protected String gdprank=null; //전세계 기준 GDP순위
	protected List<String>festival = new ArrayList<>(); // 국가 축제
	protected List<String>celeb = new ArrayList<>(); // 국가 유명인
}
