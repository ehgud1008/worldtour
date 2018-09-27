package nation;

import java.util.ArrayList;
import java.util.List;

import continent.Europe;
/**
 * 언어 : 영어
 * 수도 : 런던
 * 국가크기 : 243,610㎢
 * GDP 순위 : 5위
 * 축제 : 노팅힐 카니발
 * 유명인 : -
 * @author user
 *
 */
public class UK extends Nation implements Europe{
	protected String language = null; // 국가언어
	protected String capital = null;	// 국가수도
	protected String countrysize=null; // 국가크기
	protected String gdprank=null; //전세계 기준 GDP순위
	protected List<String>festival = new ArrayList<>(); // 국가 축제
	protected List<String>celeb = new ArrayList<>(); // 국가 유명인
}
