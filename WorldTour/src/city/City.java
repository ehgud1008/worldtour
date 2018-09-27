package city;
import java.util.ArrayList;
import java.util.List;
import nation.Nation;
/**
 * 도시의 이름, 크기, 유적지, 음식  
 * @author user
 *
 */
public abstract class City extends Nation{
	//도시들의 부모 클래스
	//도시들의 공통적인 기능 정의
	protected String name=null; // 필드 : 국가명, 크기, 유적지, 음식명 
	protected int size; // 크기
	protected List<String>historicsite = new ArrayList<>(); 
	protected List<String>food = new ArrayList<>();

	
//	public abstract void print();
}
