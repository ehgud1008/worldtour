
package nation;

import java.util.ArrayList;
import java.util.List;

import continent.SouthAmerica;
/**
 * 언어 : 포르투갈
 * 수도 : 브라질리아
 * 국가크기 : 8,515,770㎢
 * GDP 순위 : 9위
 * 축제 : 리우카니발
 * 유명인 : -
 * @author user
 *
 */
public class Brazil extends Nation implements SouthAmerica{
	protected String language = null; // 국가언어
	protected String capital = null;	// 국가수도
	protected String countrysize=null; // 국가크기
	protected String gdprank=null; //전세계 기준 GDP순위
	protected List<String>festival = new ArrayList<>(); // 국가 축제
	protected List<String>celeb = new ArrayList<>(); // 국가 유명인
}
