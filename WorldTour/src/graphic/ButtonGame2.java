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

class Wind extends JFrame {

	private Container con = this.getContentPane();
	private JPanel buttonpan = new JPanel();
	private JPanel infopan = new JPanel();

	private JMenuBar bar = new JMenuBar();
	private JMenu sizemenu = new JMenu("사이즈");
	private TourManager tour = new TourManager();
	private List<TourDB> list = tour.readFile();
	private JButton[] button = new JButton[list.size()];;
	private int size = 0;

	private JLabel name_label;
	private JLabel address_label;
	private JLabel enterfee_label;
	private JLabel close_label;
	private JLabel image_label;
	private JLabel maplink_label;
	private JLabel food_label;
	private JLabel foodlink_label;
	
	private ImageIcon image;

	private Font info_font = new Font("", Font.BOLD, 20);

//	private JScrollPane scroll = new JScrollPane(infopan);
//	private JScrollPane scroll = new JScrollPane(infopan, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
//			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

	public Wind() {
		this.display();
		this.event();
		this.menu();
		this.setSize(1000, 800);
		this.setTitle("사용자 화면");
		this.setLocationByPlatform(true);
		this.setLocationRelativeTo(null);

	}

	/**
	 * 버튼패널 생성
	 */
	public void	setButtonpan() {
		int row;
		size = 3;
		if (list.size() % 3 == 0) {
			row = list.size() / size;
		} else {
			row = list.size() / size + 1;
		}
		buttonpan.setLayout(new GridLayout(row, size));
		
	}

	public void display() {
		//버튼패널/정보패널
		this.setLayout(new GridLayout(1, 2));
		setButtonpan();	//버튼패널 생성
		for (int i = 0; i < list.size(); i++) {
			button[i] = new JButton(list.get(i).getName());
			buttonpan.add(button[i]);
		}
		this.add(buttonpan); //버튼패널 추가
		
		infopan.setLayout(null); 
		this.add(infopan);
	}

	public void event() {
		for (int i = 0; i < button.length; i++) {
			button[i].addActionListener(e -> {
				String name = e.getActionCommand();
				for (int j = 0; j < button.length; j++) {
					// j 와 name을 비교
					if (list.get(j).getName().equals(name)) {
						
						name_label = new JLabel("이름 : " + list.get(j).getName());
						address_label = new JLabel("주소 : " + list.get(j).getAddress());
						enterfee_label = new JLabel("입장료 : " + list.get(j).getEnterfee() + "원");
						close_label = new JLabel("마감시간 : " + list.get(j).getClose() + "시");
						maplink_label = new JLabel("지도 링크 : " + list.get(j).getNamelink());

						food_label = new JLabel("꼭 먹어야 하는 음식 : " + list.get(j).getFoodhouse());
						foodlink_label = new JLabel("맛집 링크 : " + list.get(j).getFoodlink());
						
						
						
					
						infoSetting(j);

//						scroll.setBounds(0, 0, infopan.getWidth(), infopan.getHeight());
//						infopan.add(scroll);
						
					}
				}
			});
		}

	}

	
	public void image() {
		
	}
	public void infoSetting(int j) {
		infopan.removeAll();

		name_label.setFont(info_font);
		address_label.setFont(info_font);
		enterfee_label.setFont(info_font);
		close_label.setFont(info_font);
		maplink_label.setFont(info_font);
		food_label.setFont(info_font);
		foodlink_label.setFont(info_font);
		
		
		infopan.add(name_label);
		infopan.add(address_label);
		infopan.add(enterfee_label);
		infopan.add(close_label);
		infopan.add(maplink_label);
		infopan.add(food_label);
		infopan.add(foodlink_label);
		infopan.add(image_label);

		infopan.repaint();
		infopan.revalidate();

		name_label.setBounds(20, -50, 800, 150);
		address_label.setBounds(20, -15, 800, 150);
		enterfee_label.setBounds(20,20,800,150);
		close_label.setBounds(20, 55, 800, 150);
		maplink_label.setBounds(20, 90, 800, 150);		
		food_label.setBounds(20, 145,800,150);
		foodlink_label.setBounds(20, 180, 800, 150);
//		image_label.setBounds(20,280,500,500);
		image_label.setLocation(20,280);
		image_label.setSize(500, 500);
		image = ImageManager.loadImage(list.get(j).getImage(), image_label.getWidth(), image_label.getHeight());
//		image_label = new JLabel();
		image_label.setIcon(image);


		
	}

	public void menu() {
		this.setJMenuBar(bar);
		bar.add(sizemenu);
	}


}

public class ButtonGame2 {

	public static void main(String[] args) {
		Wind window = new Wind();
		window.setVisible(true);
//		window.prepareImage();
	}
}
