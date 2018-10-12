//package graphic;
//
//import java.awt.Container;
//import java.awt.GridLayout;
//import java.util.List;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//
//import tour.TourDB;
//import tour.TourManager;
//
//class Window2 extends JFrame {
//
////	http://egloos.zum.com/littletrue/v/4000656
////	http://itlove.tistory.com/352
////	http://jp1020.tistory.com/entry/java-image-%EC%A0%80%EC%9E%A5
////	https://m.post.naver.com/viewer/postView.nhn?volumeNo=6974034&memberNo=30800755
////	http://bisuanytime.blogspot.com/2016/10/java-fileinputstream-png.html
//	private Container con = this.getContentPane();
//	private JPanel buttonpan = new JPanel();
//	private JPanel infopan = new JPanel();
//
//	private JLabel[] label;
//	private JMenuBar bar = new JMenuBar();
//	private JMenu sizemenu = new JMenu();
//	private TourManager tour = new TourManager();
//
//	private List<TourDB> a = tour.readFile();
//	private JButton[] button = new JButton[a.size()];
//
//	private JScrollPane scroll1 = new JScrollPane(buttonpan);
//	private JScrollPane scroll2 = new JScrollPane(infopan);
//
//	public Window2() {
//		this.display();
//		this.event();
//		this.menu();
//		this.setSize(1000, 500);
//		this.setTitle("사용자 화면");
//		this.setLocationByPlatform(true);
//		this.setLocationRelativeTo(null);
//
//	}
//
//	public void display() {
//		this.setLayout(new GridLayout(1, 2));
//
//		int rows = 0;
//		int size = 3;
//		if (a.size() % size == 0) {
//			rows = a.size() / 3;
//		} else {
//			rows = a.size() / 3 + 1;
//		}
//		buttonpan.setLayout(new GridLayout(rows, size));// size가 1~3이면 1줄 4~6이면 2줄
//		for (int i = 0; i < a.size(); i++) {
//			button[i] = new JButton(String.valueOf(a.get(i).getName()));
//			buttonpan.add(button[i]);
//		}
//		con.add(buttonpan);
//		con.add(infopan);
//	}
//
//	public void event() {
//
////		for(int = 0; i < )
//
////		for (int i = 0; i < a.size(); i++) {
////			button[i].addActionListener(e -> {
////				for(int j = 0; j < a.size(); j++) {
////					infopan.add(label);
////					label.setText("이름: " + a.get(j).getName() + "\n주소 : " + a.get(j).getAddress() + "\n입장료 : " 
////					+ a.get(j).getEnterfee()  + "원\n마감시간 : " + a.get(j).getClose() + "시");
////				}	
////			});
////		}	
//	}
//
//	public void menu() {
//		this.setJMenuBar(bar);
//		bar.add(sizemenu);
//
//	}
//}
//
//public class ButtonGame {
//	public static void main(String[] args) {
//		Window2 wind = new Window2();
//		wind.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
//
//		JPanel panel = new JPanel();
//		wind.getContentPane().add(panel);
//		panel.setLayout(null);
//
//		JPanel panel_1 = new JPanel();
//		panel_1.setBounds(159, 5, 10, 10);
//		panel.add(panel_1);
//
//		JLabel lblNewLabel = new JLabel("New label");
//		lblNewLabel.setBounds(78, 88, 57, 15);
//		panel.add(lblNewLabel);
//
//		JLabel lblNewLabel_1 = new JLabel("New label");
//		lblNewLabel_1.setBounds(78, 113, 57, 15);
//		panel.add(lblNewLabel_1);
//		wind.setVisible(true);
//
//	}
//}
