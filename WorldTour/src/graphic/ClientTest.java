package graphic;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

import tour.TourManager;

//관리자가 추가해놓은 DB들을 가지고 그 DB들을 출력하는 클라이언트(네트워크 연결로 해야할듯...?)
class ClientWindow extends JFrame {

	private Container con = this.getContentPane();
//	private JButton start = new JButton("시작(게임종류)");
	private JButton button1 = new JButton("1시작");
	private JButton button2 = new JButton("2시작");
	
	
	public ClientWindow() {
		this.display();
		this.event();
		this.setSize(400, 200);
		this.setTitle("사용자 화면");
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
