package nation;

import java.util.ArrayList;
import java.util.List;

import continent.Asia;
/**
 * ��� : �߱���
 * ���� : ����¡
 * ����ũ�� : 9,596,960��
 * GDP ���� : 2��
 * ���� : �����̸��ͼ�
 * ������ : -
 * @author user
 *
 */
public class China extends Nation implements Asia{
	protected String language = null; // �������
	protected String capital = null;	// ��������
	protected String countrysize=null; // ����ũ��
	protected String gdprank=null; //������ ���� GDP����
	protected List<String>festival = new ArrayList<>(); // ���� ����
	protected List<String>celeb = new ArrayList<>(); // ���� ������
	
}
