package nation;

import java.util.ArrayList;
import java.util.List;

import continent.NorthAmerica;
/**
 * ��� : ����
 * ���� : ������DC
 * ����ũ�� : 9,833,517��
 * GDP ���� : 1��
 * ���� : �����ڹ���
 * ������ : -
 * @author user
 *
 */
public class USA extends Nation implements NorthAmerica{
	protected String language = null; // �������
	protected String capital = null;	// ��������
	protected String countrysize=null; // ����ũ��
	protected String gdprank=null; //������ ���� GDP����
	protected List<String>festival = new ArrayList<>(); // ���� ����
	protected List<String>celeb = new ArrayList<>(); // ���� ������
}
