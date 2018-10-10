package root;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

class Window extends JFrame{
	
	
	private Container con = this.getContentPane();

	
	
	
	public Window(){
		this.display();
		this.event();
		this.menu();
		this.setSize(450, 400);
		this.setTitle("추가화면");
		this.setLocationByPlatform(true);
		this.setLocationRelativeTo(null);
		
		
		
	}
	
	public void display() {
		
	}
	public void event() {
		
	}
	public void menu() {
		
	}
}

public class AddMain {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	public static void main(String [] args) {
		Window window = new Window();
		window.getContentPane().setLayout(null);
		
		JButton clear = new JButton("확인");
		clear.setBounds(110, 248, 97, 33);
		window.getContentPane().add(clear);
		
		JButton cancel = new JButton("취소");
		cancel.setBounds(225, 248, 97, 33);
		window.getContentPane().add(cancel);
		
		JLabel lblNewLabel = new JLabel("\uC774\uB984 : ");
		lblNewLabel.setBounds(66, 67, 85, 21);
		window.getContentPane().add(lblNewLabel);
		
		
		JLabel label = new JLabel("\uC8FC\uC18C");
		label.setBounds(66, 98, 85, 21);
		window.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\uC785\uC7A5\uB8CC");
		label_1.setBounds(66, 129, 85, 21);
		window.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\uB9C8\uAC10\uC2DC\uAC04");
		label_2.setBounds(66, 160, 85, 21);
		window.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(66, 191, 85, 21);
		window.getContentPane().add(label_3);
		
		textField = new JTextField();
		textField.setBounds(153, 67, 211, 21);
		window.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(153, 98, 211, 21);
		window.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(153, 129, 211, 21);
		window.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(153, 160, 211, 21);
		window.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(153, 191, 211, 21);
		window.getContentPane().add(textField_4);
		window.setVisible(true);
	}
}