package nation;

import java.util.ArrayList;
import java.util.List;

public abstract class Nation {
	//����� �θ� Ŭ����(�ֻ���?)
	//���� ������ ��ɵ� ����
	//���, ����, ���� ����, ������ ���� GDP����, ���� ����, ���� ������ 
	protected String language = null; // �������
	protected String capital = null;	// ��������
	protected String countrysize=null; // ����ũ��
	protected String gdprank=null; //������ ���� GDP����
	protected List<String>festival = new ArrayList<>(); // ���� ����
	protected List<String>celeb = new ArrayList<>(); // ���� ������
}
