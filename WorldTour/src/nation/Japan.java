package nation;

import java.util.ArrayList;
import java.util.List;

import continent.Asia;
/**
 * ��� : �Ϻ���
 * ���� : ����
 * ����ũ�� : 377,915��
 * GDP ���� : 3��
 * ���� : ����ī�Ϲ�
 * ������ : -
 * @author user
 *
 */
public class Japan extends Nation implements Asia{
	protected String language = null; // �������
	protected String capital = null;	// ��������
	protected String countrysize=null; // ����ũ��
	protected String gdprank=null; //������ ���� GDP����
	protected List<String>festival = new ArrayList<>(); // ���� ����
	protected List<String>celeb = new ArrayList<>(); // ���� ������
}
