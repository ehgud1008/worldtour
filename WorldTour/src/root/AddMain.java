package root;

import java.awt.Container;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import tour.TourDB;
import tour.TourManager;

class Windw extends JFrame {

	private Container con = this.getContentPane();

	private JLabel name_label = new JLabel("이름 : ");
	private JLabel address_label = new JLabel("주소 : ");
	private JLabel enterfee_label = new JLabel("입장료 : ");
	private JLabel close_label = new JLabel("마감시간 : ");
	private JLabel maplink_label = new JLabel("위치 링크 : ");
	private JLabel food_label = new JLabel("꼭 먹어야할 음식 : ");
	private JLabel foodlink_label = new JLabel("맛집 링크 : ");
	private JLabel imagePath_label = new JLabel("이미지 경로 : ");

	private JTextField name = new JTextField();
	private JTextField address = new JTextField();
	private JTextField enterfee = new JTextField();
	private JTextField close = new JTextField();
	private JTextField food = new JTextField();
	private JTextField foodlink = new JTextField();
	private JTextField maplink = new JTextField();
	private JTextField imagePath = new JTextField();

	private JButton clear = new JButton("추가");
	private JButton cancel = new JButton("취소");

	private JMenuBar bar = new JMenuBar();
	private JMenu menu = new JMenu("이미지");
	private JMenuItem readImage = new JMenuItem("이미지 저장");

	private TourManager t = new TourManager();

	public Windw() {
		this.display();
		this.event();
		this.menu();
		this.setSize(450, 400);
		this.setTitle("추가화면");
		this.setLocationByPlatform(true);
		this.setLocationRelativeTo(null);

	}

	public void display() {

		clear.setBounds(110, 270, 97, 33);
		cancel.setBounds(225, 270, 97, 33);

		name_label.setBounds(66, 40, 85, 21);
		address_label.setBounds(66, 65, 85, 21);
		enterfee_label.setBounds(66, 90, 85, 21);
		close_label.setBounds(66, 115, 85, 21);
		maplink_label.setBounds(66, 140, 85, 21);
		food_label.setBounds(40, 165, 125, 21);
		foodlink_label.setBounds(66, 190, 85, 21);
		imagePath_label.setBounds(66, 215, 85, 21);

		name.setColumns(10);
		name.setBounds(153, 40, 211, 21);
		address.setColumns(10);
		address.setBounds(153, 65, 211, 21);
		enterfee.setColumns(10);
		enterfee.setBounds(153, 90, 211, 21);
		close.setColumns(10);
		close.setBounds(153, 115, 211, 21);
		maplink.setBounds(153, 140, 211, 21);
		food.setBounds(153, 165, 211, 21);
		foodlink.setBounds(153, 190, 211, 21);
		imagePath.setBounds(153, 215, 211, 21);

		this.add(clear);
		this.add(cancel);

		this.add(name_label);
		this.add(address_label);
		this.add(enterfee_label);
		this.add(close_label);
		this.add(maplink_label);
		this.add(food_label);
		this.add(foodlink_label);
		this.add(imagePath_label);

		this.add(name);
		this.add(address);
		this.add(enterfee);
		this.add(close);
		this.add(maplink);
		this.add(food);
		this.add(foodlink);
		this.add(imagePath);

		this.add(bar);
		bar.add(menu);
		menu.add(readImage);

	}

	public void event() {
		clear.addActionListener(e -> {
			try {
				List<TourDB> list = t.readFile();
				
				String input_name, input_address, input_maplink, input_food, input_foodlink, input_path;
				int input_enterfee, input_close;
				input_name = name.getText();
				input_address = address.getText();
				input_enterfee = Integer.parseInt(enterfee.getText());
				input_close = Integer.parseInt(close.getText());
				input_maplink = maplink.getText();
				input_food = food.getText();
				input_foodlink = foodlink.getText();
				input_path = imagePath.getText();
				
				boolean isContain = false;
				BufferedImage image = file();
				
				for (int i = 0; i < list.size(); i++) {
					if (input_name.equals(list.get(i).getName())) {
						isContain = true;
					}
				}
				if (isContain) {
					JOptionPane.showMessageDialog(null, "이미 등록된 관광지입니다");
					resetData();
				} else {
					t.addList(new TourDB(input_name,input_address,input_maplink,
							input_close,input_enterfee,input_food,input_foodlink,image));
					JOptionPane.showMessageDialog(null, "추가 완료!");
					resetData();
				}
			}
			catch (Exception ex) {
			}

		});

		cancel.addActionListener(e -> {
			System.exit(0);
		});
	}

	public void menu() {

		bar.setBounds(0, 0, 53, 23);
		this.add(bar);

		bar.add(menu);
		menu.add(readImage);

		readImage.addActionListener(e -> {
			JFileChooser chooser = new JFileChooser();

			int ret = chooser.showOpenDialog(null); // 열기창 정의
			if (ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "경로를 선택하지않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				return;
			}

			String path = chooser.getSelectedFile().getPath();
			imagePath.setText(path);
		});
	}

	public void resetData() {
		name.setText("");
		address.setText("");
		enterfee.setText("");
		close.setText("");
		maplink.setText("");
		food.setText("");
		foodlink.setText("");
		imagePath.setText("");

	}

	public BufferedImage file() {
		BufferedImage image = null;
		try {
			image = ImageIO.read(new File(imagePath.getText()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}

}

public class AddMain {

	public static void main(String[] args) {
		Windw window = new Windw();
		window.getContentPane().setLayout(null);

		window.setVisible(true);

	}
}