package city;
import java.util.ArrayList;
import java.util.List;
import nation.Nation;
/**
 * ������ �̸�, ũ��, ������, ����  
 * @author user
 *
 */
public abstract class City extends Nation{
	//���õ��� �θ� Ŭ����
	//���õ��� �������� ��� ����
	protected String name=null; // �ʵ� : ������, ũ��, ������, ���ĸ� 
	protected int size; // ũ��
	protected List<String>historicsite = new ArrayList<>(); 
	protected List<String>food = new ArrayList<>();

	
//	public abstract void print();
}
