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
	private JLabel name_label = new JLabel("이름");
	private JLabel address_label = new JLabel("주소");
	private JLabel enterfee_label = new JLabel("입장료");
	private JLabel close_label = new JLabel("마감시간");

	private JTextField name = new JTextField();
	private JTextField address = new JTextField();
	private JTextField enterfee = new JTextField();
//	private JTextField season = new JTextField();
	private JTextField close = new JTextField();

	public window1() {

		this.setSize(100, 100);
		this.setTitle("관리자 추가화면");
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
