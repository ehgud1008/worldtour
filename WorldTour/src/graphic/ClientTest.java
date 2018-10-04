package graphic;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import tour.TourManager;

//관리자가 추가해놓은 DB들을 가지고 그 DB들을 출력하는 클라이언트(네트워크 연결로 해야할듯...?)
class ClientWindow extends JFrame {

	private Container con = this.getContentPane();
//	private JButton start = new JButton("시작(게임종류)");
	private JButton button = new JButton("정보");
	private JDialog dialog = new JDialog();

	public ClientWindow() {
		this.display();
		this.event();
		this.setSize(400, 400);
		this.setTitle("사용자 화면");
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
