package graphic;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 사용자 : 해당 장소를 삭제할 때 쓰는 GUI
 * @author hoje
 *
 */
public class Tour2 extends JFrame {
	public Tour2() {
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\uAC80\uC0C9 \uACB0\uACFC\uAC00 \uC874\uC7AC\uD569\uB2C8\uB2E4.");
		label.setFont(new Font("굴림", Font.BOLD, 14));
		label.setBounds(100, 22, 180, 54);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\uC0AD\uC81C \uBC0F \uAC80\uC0C9\uC774 \uAC00\uB2A5\uD569\uB2C8\uB2E4.");
		label_1.setFont(new Font("굴림", Font.BOLD, 14));
		label_1.setBounds(90, 67, 202, 54);
		getContentPane().add(label_1);
		
		JButton button = new JButton("\uC0AD\uC81C");
		button.setFont(new Font("굴림", Font.BOLD, 12));
		button.setBounds(63, 125, 89, 42);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("\uAC80\uC0C9");
		button_1.setFont(new Font("굴림", Font.BOLD, 12));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(208, 125, 89, 42);
		getContentPane().add(button_1);
	}
public static void main(String[] args) {
	Tour2 tour2 = new Tour2();
	tour2.setSize(453,100);
	tour2.setVisible(true);

}
}
