package graphic;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

//import gui.swing.ImageManager;
import tour.TourDB;
import tour.TourManager;

class Wind extends JFrame{

	private Container con = this.getContentPane();
	private JPanel buttonpan = new JPanel();
	private JPanel infopan = new JPanel();
	
	private JMenuBar bar = new JMenuBar();
	private JMenu sizemenu = new JMenu("사이즈");
	private TourManager tour = new TourManager();
	private List <TourDB> list = tour.readFile();
	private JButton [] button = new JButton[list.size()];;
	private int size = 0;
//	private JLabel test_label = new JLabel("테스트");
//	private JLabel[] name_label = new JLabel[list.size()];
//	private JLabel[] address_label = new JLabel[list.size()];
//	private JLabel[] enterfee_label = new JLabel[list.size()];
//	private JLabel[] close_label = new JLabel[list.size()];
	private JLabel name_label;
	private JLabel address_label;
	private JLabel enterfee_label;
	private JLabel close_label;
	private JLabel image_label;
	private JLabel nation_label;
	private JLabel maplink_label;
	private JLabel food_label;
	private JLabel foodlink_label;
	private ImageIcon testimage;
	
	private Font info_font = new Font("",Font.BOLD, 20);
	
//	private JScrollPane scroll = new JScrollPane(infopan);
	private JScrollPane scroll = new JScrollPane(infopan, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	public Wind() {
		this.display();
		this.event();
		this.menu();
		this.setSize(1000, 500);
		this.setTitle("사용자 화면");
		this.setLocationByPlatform(true);
		this.setLocationRelativeTo(null);
		
	}
	
	
	/**
	 * 버튼패널 행,열 정리 메소드
	 */
	public void buttonpanSize() {
		int row;
		size = 3;
		if(list.size() %3 ==0) {
			row = list.size()/size;
		}else {
			row = list.size()/size +1;
		}
		buttonpan.setLayout(new GridLayout(row, size));
	}
	
	public void display() {
		this.setLayout(new GridLayout(1, 2));
		tour.addList(new TourDB("경복궁","서울",15000,20));
		tour.addList(new TourDB("경복","서울",15000,20));
		tour.addList(new TourDB("경","서울",15000,20));
		tour.addList(new TourDB("경복궁1","서울",15000,20));
		tour.addList(new TourDB("경복궁2","서울",15000,20));
		tour.addList(new TourDB("경복궁3","서울",15000,20));
		tour.addList(new TourDB("경복궁4","서울",15000,20));
		tour.addList(new TourDB("경복궁5","서울",15000,20));
		tour.addList(new TourDB("경복궁6","서울",15000,20));
		buttonpanSize();
		
		for(int i = 0; i < list.size(); i++	) {
			button[i] = new JButton(list.get(i).getName());
			buttonpan.add(button[i]);
		}

		
		
		
		
		this.add(buttonpan);
		infopan.setLayout(null);
		name_label = new JLabel(list.get(0).getName());
		this.add(infopan);
		

	}
	

	
	public void event() {
		for(int i = 0; i < button.length; i++) {
			button[i].addActionListener(e -> {
				String name = e.getActionCommand();
				for(int j = 0; j < button.length; j++) {
					// j 와 name을 비교
					if(list.get(j).getName().equals(name)) {
						name_label = new JLabel("이름 : " + list.get(j).getName() );
//						nation_label = new JLabel("국가 : " + list.get(j).getNation());
						address_label = new JLabel("주소 : " + list.get(j).getAddress());
						enterfee_label = new JLabel("입장료 : " + list.get(j).getEnterfee() + "원");
						close_label = new JLabel("마감시간 : " + list.get(j).getClose() + "시");
//						food_label = new JLabel("꼭 먹어야 하는 음식 : " + list.get(j).getFood());
//						maplink_label = new JLabel("지도 링크 : " + list.get(j).getLink());
//						foodlink_babel = new JLabel("맛집 링크 : " + list.get(j).getFoodlink());
						image_label = new JLabel(testimage);
						
						infoSetting(j);

						scroll.setBounds(0, 0, infopan.getWidth(), infopan.getHeight());
						infopan.add(scroll);
					}
				}
			});
		}
		
		
		
	}

	public void infoSetting(int j) {
		infopan.removeAll();
		
		
		name_label.setFont(info_font);
		address_label.setFont(info_font);
		enterfee_label.setFont(info_font);
		close_label.setFont(info_font);
		image_label.setIcon(testimage);

//		image_label.setIcon(testimage);
		
		infopan.add(name_label);
		infopan.add(address_label);
		infopan.add(enterfee_label);
		infopan.add(close_label);
		infopan.add(image_label);
		
		infopan.repaint();
		infopan.revalidate();
		
		
		name_label.setBounds(20,-50, 800,150);
//		nation_label.setBounds(20, -15, 800, 150);
		address_label.setBounds(20, 20, 300, 150);
		enterfee_label.setBounds(20, 55, 800, 150);
		close_label.setBounds(20, 110,800,150);
//		food_label.setBounds(20, 145,800,150);
//		food_label.setBounds(20, 180, 800, 150);
//		foodlink_label.setBounds(20,215,800,150);
		
		image_label.setLocation(20, 200);
		image_label.setSize(300,300);
		
		prepareImage();
	}
	public void menu() {
		this.setJMenuBar(bar);
		bar.add(sizemenu);
		
	}
	
	public void prepareImage() {
		testimage = ImageManager.loadImage("image/namsan.png", image_label.getWidth(), image_label.getHeight());
	}
	
}
public class ButtonGame2{
	
	public static void main(String [] args) {
		Wind window = new Wind();
		window.setVisible(true);
//		window.prepareImage();
	}
}
