package graphic;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import tour.TourDB;
import tour.TourManager;


class Window extends JFrame{
	private Container con = this.getContentPane();
	
	private JLabel name_label = new JLabel("이름");
	private JLabel address_label = new JLabel("주소");
	private JLabel enterfee_label = new JLabel("입장료");
	private JLabel close_label = new JLabel("마감시간");
	
	private JTextField name = new JTextField();
	private JTextField address = new JTextField();
	private JTextField enterfee = new JTextField();
//	private JTextField season = new JTextField();
	private JTextField close = new JTextField();
	
	
	private JButton complete = new JButton("추가");
	
	public Window() {
		this.display();
		this.event();
		this.setSize(400,400);
		this.setTitle("관리자 추가화면");
		this.setLocationByPlatform(true);			
		this.setLocationRelativeTo(null);
		
	}
	public void display() {
		GridLayout grid = new GridLayout(2, 4);
		BorderLayout bord = new BorderLayout();
		con.setLayout(bord);
		JPanel pan = new JPanel();
		pan.setLayout(grid);
		pan.add(name_label);
		pan.add(name);
		pan.add(address_label);
		pan.add(address);
		pan.add(enterfee_label);
		pan.add(enterfee);
//		pan.add(season);
		pan.add(close_label);
		pan.add(close);
		con.add(pan, BorderLayout.CENTER);
		
		con.add(complete,BorderLayout.EAST);
		
	}
	public void event() {
		TourManager tour = new TourManager();
		
		complete.addActionListener(e -> {
			try {
				tour.addList(new TourDB(name.getText(), address.getText(), Integer.parseInt(enterfee.getText()),
						Integer.parseInt(close.getText())));
//				tour.setName(name.getText());
//				tour.setAddress(address.getText());
//				tour.setEnterfee(Integer.parseInt(enterfee.getText()));
////				tour.setSeason(Integer.parseInt(season.getText()));
//				tour.setClose(Integer.parseInt(close.getText()));
				tour.printList();
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "추가 완료");
			
			
		});
	
	}
	
}

public class RootTest{
	public static void main(String [] args) {
		Window window = new Window();
		window.setVisible(true);
		
		TourManager tour = new TourManager();
		
	}
}
