package graphic;

import java.awt.Button;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import tour.TourManager3;

public class ButtonGame2 extends JFrame{

	private Container con = this.getContentPane();
	private JPanel buttonpan = new JPanel();
	private JPanel infopan = new JPanel();
	
	private JLabel label = new JLabel("메뉴에서 사이즈를 선택해주세요");
	//private TourManager3 tourm = new TourManager3();

//	private JButton [] button = new JButton[tourm.getName().length];
	private Button [] button = new Button[9];

	private JMenuBar bar = new JMenuBar();
	private JMenu sizemenu = new JMenu("사이즈");
	private JMenuItem three = new JMenuItem("3x3");
	private JMenuItem four = new JMenuItem("4x4");
	private JMenuItem five = new JMenuItem("5x5");
	
//	private String [] info = new String [tourm.getName().length];
	
	public ButtonGame2() {
		this.display();
		this.event();
		this.menu();
		this.setSize(1000, 500);
		this.setTitle("사용자 화면");
		this.setLocationByPlatform(true);
		this.setLocationRelativeTo(null);
		
	}

//	public void button() {
//		//만약 관광지 정보가 10개인데
//		//버튼은 9개이면?
////		List <String> info = new ArrayList<>();
//		String [] info = new String[tourm.getName().length];
//		info = tourm.getName();
//		for(int i = 0; i < button.length; i++) {
//			
////			Collections.shuffle(info);
//			button[i] = new JButton(info[i]);
//			buttonpan.add(button[i]);
//		}
//	}
	public void display() {
		//tourist의 0번째 인덱스들 
		this.setLayout(new GridLayout(1,2));
		this.add(buttonpan);
		this.add(infopan);
		buttonpan.setLayout(new GridLayout(3,3));//(tourm.getName().length/2,tourm.getName().length/2));
		for(int i = 0; i < button.length; i++) {
			button[i] = new Button(String.valueOf(i+1));
//			button[i] = new Button(""+(i+1));
			this.add(button[i]);
		}
		//button();
		
//		String [] info = new String[tourm.getName().length];
//		info = tourm.getName();
//		for(int i = 0; i < button.length; i++) {
//			
////			Collections.shuffle(info);
//			button[i] = new JButton(info[i]);
//			buttonpan.add(button[i]);
//		}
		
		
//		buttonpan.setLayout(new BorderLayout());
//		buttonpan.add(label,BorderLayout.CENTER);
	}
	
	

	public void event() {
//		three.addActionListener(e -> {
//			int size = 3;
//			JButton [] button = new JButton[size*size];
//			buttonpan.removeAll();
//			buttonpan.setLayout(new GridLayout(size, size));
//			for(int i = 0; i < button.length; i++) {
//				button[i] = new JButton(String.valueOf(db.getName()));
//				buttonpan.add(button[i]);
//			}
//			buttonpan.repaint();
//			buttonpan.revalidate();
//		});
//		four.addActionListener(e -> {
//			int size = 4;
//			JButton [] button = new JButton[size*size];
//			buttonpan.removeAll();
//			buttonpan.setLayout(new GridLayout(size, size));
//			for(int i = 0; i < button.length; i++) {
//				button[i] = new JButton(String.valueOf(i+1 +"정보"));
//				buttonpan.add(button[i]);
//			}
//			buttonpan.repaint();
//			buttonpan.revalidate();
//		});
//		five.addActionListener(e -> {
//			int size = 5;
//			JButton [] button = new JButton[size*size];
//			buttonpan.removeAll();
//			buttonpan.setLayout(new GridLayout(size, size));
//			for(int i = 0; i < button.length; i++) {
//				button[i] = new JButton(String.valueOf(i+1 +"정보"));
//				buttonpan.add(button[i]);
//			}
//			buttonpan.repaint();
//			buttonpan.revalidate();
//		});
		
	}
	public void menu() {
		this.setJMenuBar(bar);
		bar.add(sizemenu);
		sizemenu.add(three);
		sizemenu.add(four);
		sizemenu.add(five);
		
	}
}
