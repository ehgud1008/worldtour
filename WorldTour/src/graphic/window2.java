package graphic;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class window1 extends JFrame {
	private Container con = this.getContentPane();
	private JLabel name_label = new JLabel("�̸�");
	private JLabel address_label = new JLabel("�ּ�");
	private JLabel enterfee_label = new JLabel("�����");
	private JLabel close_label = new JLabel("�����ð�");

	private JTextField name = new JTextField();
	private JTextField address = new JTextField();
	private JTextField enterfee = new JTextField();
//	private JTextField season = new JTextField();
	private JTextField close = new JTextField();

	public window1() {

		this.setSize(100, 100);
		this.setTitle("������ �߰�ȭ��");
		this.setLocationByPlatform(true);
		this.setLocationRelativeTo(null);

	}

	public void display() {
		GridLayout grid = new GridLayout(2, 4);
		BorderLayout bord = new BorderLayout();
		con.setLayout(bord);
		JPanel pan = new JPanel();
		pan.setLayout(grid);
		pan.add(name_label);
		pan.add(name);
		pan.add(name_label);
		pan.add(address_label);

	}
}
