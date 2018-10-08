package graphic;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
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

import tour.TourDB;
import tour.TourManager3;

public class ButtonGame2 extends JFrame{

	private Container con = this.getContentPane();
	private JPanel buttonpan = new JPanel();
	private JPanel infopan = new JPanel();
	
	private JLabel label = new JLabel("메뉴에서 사이즈를 선택해주세요");
	
	private JMenuBar bar = new JMenuBar();
	private JMenu sizemenu = new JMenu("사이즈");
	private JMenuItem three = new JMenuItem("3x3");
	private JMenuItem four = new JMenuItem("4x4");
	private JMenuItem five = new JMenuItem("5x5");
	private TourManager3 tourm = new TourManager3();
//	private List<String> info = new ArrayList<>();
//	private List <JButton> button = new ArrayList<>();
//	private JButton [] button = new JButton[9];
	private int size = 3;
	
	private JButton button1;
	private JButton button2;
	
	private JButton [] button = new JButton[tourm.getName().length];
//	private String [] info = new String [tourm.getName().length];
//	private List <String> info = new ArrayList<>();
	
	public ButtonGame2() {
		this.display();
		this.event();
		this.menu();
		this.setSize(1000, 500);
		this.setTitle("사용자 화면");
		this.setLocationByPlatform(true);
		this.setLocationRelativeTo(null);
		
	}

	
	public void display() {
		//tourist의 0번째 인덱스들 
		con.setLayout(new GridLayout(1,2));
		con.add(buttonpan);
		con.add(infopan);
		buttonpan.setLayout(new GridLayout(tourm.getName().length/size,size));
//		buttonpan.setLayout(new GridLayout(tourm.getName().length/size, size));
//		buttonpan.setLayout(new FlowLayout());

		
		tourm.addList(new TourDB("남산", "서울", 15000, 21));
		tourm.addList(new TourDB("경복궁", "서울", 10000, 20));
		tourm.printList();
//		for(int i = 0; i < button.length; i++) {
//			button[i] = new JButton(String.valueOf(i+1));
////			button[i] = new Button(""+(i+1));
//			buttonpan.add(button[i]);
//		}
//		info.add(getName());
//		
//		for(int i = 0; i < button.size(); i++) {
//			button.add(new JButton(info.get(i)));
//			buttonpan.add(button.get(i));
//			
//		}
		
		for(int i = 0; i < button.length; i++) {
			String [] info = new String[tourm.getName().length];
			button[i] = new JButton(info[i]);
			buttonpan.add(button[i]);
		}
		
//		buttonpan.setLayout(new GridLayout(3, 3));
//		
//		for(int i = 0; i < button.length; i++) {
//			button[i] = new JButton(String.valueOf(i+1));
//			
////			Collections.shuffle(info);
////			button[i] = new JButton(info);
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
