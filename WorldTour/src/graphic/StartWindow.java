package graphic;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * ó�� ��ư�� ������ �������� �������� ��ȯ�ϴ� Ŭ����
 * @author user
 *
 */
class StartWindow extends JFrame{
	
	//������Ʈ ��ġ�� ����
	private Container con = this.getContentPane();
	private JButton start = new JButton("���� ���� �ҷ�����");
	
	public StartWindow() {
		this.display();
		this.event();
		this.setTitle("���� ȭ��");
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

