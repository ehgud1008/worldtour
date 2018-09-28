package graphic;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * 처음 버튼을 누르면 세계지도 프레임을 소환하는 클래스
 * @author user
 *
 */
class StartWindow extends JFrame{
	
	//컴포넌트 배치용 공간
	private Container con = this.getContentPane();
	private JButton start = new JButton("세계 지도 불러오기");
	
	public StartWindow() {
		this.display();
		this.event();
		this.setTitle("시작 화면");
		this.setSize(300,200);
		this.setLocationByPlatform(true);			
		this.setLocationRelativeTo(null);
	}
	private void display() {
		this.add(start);
	}
	private void event() {
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		start.addActionListener(e -> {
			dispose();
			MainWindow window = new MainWindow();
			window.setVisible(true);
		});
	}
}

