package nation;

import java.util.ArrayList;
import java.util.List;

import continent.Europe;
/**
 * ��� : ����
 * ���� : ����
 * ����ũ�� : 243,610��
 * GDP ���� : 5��
 * ���� : ������ ī�Ϲ�
 * ������ : -
 * @author user
 *
 */
public class UK extends Nation implements Europe{
	protected String language = null; // �������
	protected String capital = null;	// ��������
	protected String countrysize=null; // ����ũ��
	protected String gdprank=null; //������ ���� GDP����
	protected List<String>festival = new ArrayList<>(); // ���� ����
	protected List<String>celeb = new ArrayList<>(); // ���� ������
}
