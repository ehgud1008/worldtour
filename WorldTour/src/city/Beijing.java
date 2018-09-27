package city;

import java.util.ArrayList;
import java.util.List;

public class Beijing extends City{

	String name=null; // 필드 : 국가명, 크기, 유적지, 음식명 
	int size; // 크기
	List<String>historicsite = new ArrayList<>(); 
	List<String>food = new ArrayList<>();
	
//	@Override
//	public void print() {
//		System.out.println("도시 이름 : " + this.name);
//		System.out.println("도시 크기 : " + this.size);
//		System.out.print("유적지 : ");
//		for(String historicname : this.historicsite) {
//			System.out.println(historicname);
//		}
//	}

}
