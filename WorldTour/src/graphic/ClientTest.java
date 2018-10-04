package graphic;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import tour.TourManager;

//�����ڰ� �߰��س��� DB���� ������ �� DB���� ����ϴ� Ŭ���̾�Ʈ(��Ʈ��ũ ����� �ؾ��ҵ�...?)
class ClientWindow extends JFrame {

	private Container con = this.getContentPane();
//	private JButton start = new JButton("����(��������)");
	private JButton button = new JButton("����");
	private JDialog dialog = new JDialog();

	public ClientWindow() {
		this.display();
		this.event();
		this.setSize(400, 400);
		this.setTitle("����� ȭ��");
		this.setLocationByPlatform(true);
		this.setLocationRelativeTo(null);

	}

	public void display() {
		con.add(button);
	}

	public void event() {
		TourManager tour = new TourManager();

		button.addActionListener(e -> {
			tour.getList();
			tour.printList();
		});
	}
}

public class ClientTest {
	public static void main(String[] args) {
		ClientWindow window = new ClientWindow();
		window.setVisible(true);
	}

}
