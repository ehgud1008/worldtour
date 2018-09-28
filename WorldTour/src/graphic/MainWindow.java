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
 * �⺻ ����
 * @author user
 *
 */
class MainWindow extends JFrame{
	
	//������Ʈ ��ġ�� ����
	private Container con = this.getContentPane();
	private JLabel label = new JLabel();

	private JMenuBar bar = new JMenuBar();
	private JMenu about = new JMenu("About");
	private JMenu map = new JMenu("����");
	private JMenuItem menu_world = new JMenuItem("��ü ����");
	private JMenuItem menu_asia = new JMenuItem("�ƽþ� ����");
	private JMenuItem menu_europe = new JMenuItem("���� ����");
	private JMenuItem menu_n_a = new JMenuItem("�Ϲ� ����");
	private JMenuItem menu_s_a = new JMenuItem("���� ����");
	private JMenuItem menu_ocean = new JMenuItem("�����ƴϾ� ����");
	
	public MainWindow() {
		this.display();
		this.event();
		this.menu();
		this.setTitle("���� ����");
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
			//��ü������ �̵�
		});
		
		menu_asia.addActionListener(e -> {
			//�ƽþ� ��������â���� �̵�
		});
		
		menu_europe.addActionListener(e -> {
			//���� ��������â���� �̵�
		});
		
		menu_n_a.addActionListener(e-> {
			//�Ϲ� ��������â���� �̵�
		});
		
		menu_s_a.addActionListener(e -> {
			//���� ��������â���� �̵�
		});
		
		menu_ocean.addActionListener(e -> {
			//�����ƴϾ� ��������â���� �̵�
		});
		
	}

	
	
	
	
}

