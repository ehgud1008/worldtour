package graphic;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tour3 extends JFrame{
	public Tour3() {
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\uAC80\uC0C9\uACB0\uACFC\uAC00 \uC874\uC7AC\uD558\uC9C0 \uC54A\uC2B5\uB2C8\uB2E4.");
		label.setFont(new Font("±¼¸²", Font.BOLD, 14));
		label.setBounds(100, 10, 230, 63);
		getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("\uC7A5\uC18C\uCD94\uAC00\uAC00 \uAC00\uB2A5\uD569\uB2C8\uB2E4.");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 14));
		lblNewLabel.setBounds(129, 58, 177, 55);
		getContentPane().add(lblNewLabel);
		
		JButton button_1 = new JButton("\uCD94\uAC00");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setFont(new Font("±¼¸²", Font.BOLD, 12));
		button_1.setBounds(163, 112, 89, 42);
		getContentPane().add(button_1);
	}

}
