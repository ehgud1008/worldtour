package graphic;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import tour.TourManager;

public class PrintInfo extends JFrame{
	private Container con = this.getContentPane();
	private TourManager manager = new TourManager();
	private JLabel label = new JLabel();//""�ȿ� ������ �о�� ������ ���
	private JScrollPane scroll = new JScrollPane(label);
	 
	public PrintInfo() {
		this.display();
		this.event();
		this.setSize(450, 450);
		this.setTitle("����� ȭ��");
		this.setLocationByPlatform(true);
		this.setLocationRelativeTo(null);
		this.setAlwaysOnTop(true);
		
	}
	
	public void display() {
//		label.set(manager.openDB());
		scroll.setViewportView(label);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		con.add(label);
	}
	public void event() {
		
	}
}
