package graphic;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

import tour.TourManager;

//�����ڰ� �߰��س��� DB���� ������ �� DB���� ����ϴ� Ŭ���̾�Ʈ(��Ʈ��ũ ����� �ؾ��ҵ�...?)
class ClientWindow extends JFrame {

	private Container con = this.getContentPane();
//	private JButton start = new JButton("����(��������)");
	private JButton button1 = new JButton("1����");
	private JButton button2 = new JButton("2����");
	
	
	public ClientWindow() {
		this.display();
		this.event();
		this.setSize(400, 200);
		this.setTitle("����� ȭ��");
		this.setLocationByPlatform(true);
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(null);
	}

	public void display() {
		con.setLayout(new BorderLayout());
		con.add(button1);
		con.add(button2);
	
		button1.setBounds(12, 28, 175, 96);
		this.getContentPane().add(button1);
		button2.setBounds(197, 28, 175, 96);
		this.getContentPane().add(button2);
		
	}

	public void event() {
		TourManager tour = new TourManager();

		button1.addActionListener(e -> {
			ButtonGame buttongame = new ButtonGame();
			dispose();
			buttongame.setVisible(true);
			
		});
	}
}

public class ClientTest {
	public static void main(String[] args) {
		ClientWindow window = new ClientWindow();
	
		window.setVisible(true);
		
	}

}
