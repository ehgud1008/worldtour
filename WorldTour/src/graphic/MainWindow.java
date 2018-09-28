package graphic;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * 기본 구조
 * @author user
 *
 */
class MainWindow extends JFrame{
	
	//컴포넌트 배치용 공간
	private Container con = this.getContentPane();
	private JLabel label = new JLabel();

	private JMenuBar bar = new JMenuBar();
	private JMenu about = new JMenu("About");
	private JMenu map = new JMenu("지도");
	private JMenuItem menu_world = new JMenuItem("전체 지도");
	private JMenuItem menu_asia = new JMenuItem("아시아 지도");
	private JMenuItem menu_europe = new JMenuItem("유럽 지도");
	private JMenuItem menu_n_a = new JMenuItem("북미 지도");
	private JMenuItem menu_s_a = new JMenuItem("남미 지도");
	private JMenuItem menu_ocean = new JMenuItem("오세아니아 지도");
	
	public MainWindow() {
		this.display();
		this.event();
		this.menu();
		this.setTitle("스윙 예제");
		this.setSize(1150,750);
		this.setLocationByPlatform(true);	
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}
	private void display() {
		WorldMap world = new WorldMap();
		world.worldMap();
		world.worldButton();
		con.add(world);
	}	
	private void menu() {
		this.setJMenuBar(bar);

		bar.add(map);
		bar.add(about);
		
		map.add(menu_world);
		map.addSeparator();
		map.add(menu_asia);
		map.add(menu_europe);
		map.add(menu_n_a);
		map.add(menu_s_a);
		map.add(menu_ocean);
	}
	
	private void event() {
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		
		menu_world.addActionListener(e -> {
			//전체지도로 이동
		});
		
		menu_asia.addActionListener(e -> {
			//아시아 선택지도창으로 이동
		});
		
		menu_europe.addActionListener(e -> {
			//유럽 선택지도창으로 이동
		});
		
		menu_n_a.addActionListener(e-> {
			//북미 선택지도창으로 이동
		});
		
		menu_s_a.addActionListener(e -> {
			//남미 선택지도창으로 이동
		});
		
		menu_ocean.addActionListener(e -> {
			//오세아니아 선택지도창으로 이동
		});
		
	}

	
	
	
	
}

