package graphic;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import tour.TourManager;

public class ButtonGame extends JFrame{

	private Container con = this.getContentPane();
	private JPanel buttonpan = new JPanel();
	private JPanel infopan = new JPanel();
	
	private JLabel label = new JLabel("메뉴에서 사이즈를 선택해주세요");
	
	private JMenuBar bar = new JMenuBar();
	private JMenu sizemenu = new JMenu("사이즈");
	private JMenuItem three = new JMenuItem("3x3");
	private JMenuItem four = new JMenuItem("4x4");
	private JMenuItem five = new JMenuItem("5x5");
	
	
	public ButtonGame() {
		this.display();
		this.event();
		this.menu();
		this.setSize(1000, 500);
		this.setTitle("사용자 화면");
		this.setLocationByPlatform(true);
		this.setLocationRelativeTo(null);
		
	}

	public void display() {
		this.setLayout(new GridLayout(1,2));
		this.add(buttonpan);
		this.add(infopan);
		buttonpan.setLayout(new BorderLayout());
		buttonpan.add(label,BorderLayout.CENTER);
		
		
	}

	public void event() {
		three.addActionListener(e -> {
			int size = 3;
			JButton [] button = new JButton[size*size];
			buttonpan.removeAll();
			buttonpan.setLayout(new GridLayout(size, size));
			for(int i = 0; i < button.length; i++) {
				button[i] = new JButton(String.valueOf(i+1 +"정보"));
				buttonpan.add(button[i]);
			}
			buttonpan.repaint();
			buttonpan.revalidate();
		});
		four.addActionListener(e -> {
			int size = 4;
			JButton [] button = new JButton[size*size];
			buttonpan.removeAll();
			buttonpan.setLayout(new GridLayout(size, size));
			for(int i = 0; i < button.length; i++) {
				button[i] = new JButton(String.valueOf(i+1 +"정보"));
				buttonpan.add(button[i]);
			}
			buttonpan.repaint();
			buttonpan.revalidate();
		});
		five.addActionListener(e -> {
			int size = 5;
			JButton [] button = new JButton[size*size];
			buttonpan.removeAll();
			buttonpan.setLayout(new GridLayout(size, size));
			for(int i = 0; i < button.length; i++) {
				button[i] = new JButton(String.valueOf(i+1 +"정보"));
				buttonpan.add(button[i]);
			}
			buttonpan.repaint();
			buttonpan.revalidate();
		});
	}
	public void menu() {
		this.setJMenuBar(bar);
		bar.add(sizemenu);
		sizemenu.add(three);
		sizemenu.add(four);
		sizemenu.add(five);
		
	}
}
