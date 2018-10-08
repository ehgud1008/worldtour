package graphic;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Tour_del extends JFrame {
	private JTextField textField;
	public Tour_del() {
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\uC0AD\uC81C\uD560 \uB2E8\uC5B4 \uC785\uB825 :");
		label.setFont(new Font("±¼¸²", Font.BOLD, 20));
		label.setBounds(12, 53, 186, 84);
		getContentPane().add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(196, 80, 226, 35);
		getContentPane().add(textField);
		
		JButton button_1 = new JButton("\uC0AD\uC81C");
		button_1.setFont(new Font("±¼¸²", Font.BOLD, 12));
		button_1.setBounds(157, 140, 89, 42);
		getContentPane().add(button_1);
	}

}
