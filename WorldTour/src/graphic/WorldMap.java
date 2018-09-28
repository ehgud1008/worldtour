package graphic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 세계지도 화면
 * @author user
 *
 */
public class WorldMap extends JPanel{
	
	private JButton asia = new JButton("아시아");
	private JButton europe = new JButton("유럽");
	private JButton n_america = new JButton("북아메리카");
	private JButton s_america = new JButton("남아메리카");
	private JButton oceania = new JButton("오세아니아");
	private ImageIcon worldmap = new ImageIcon("image/worldmap.png");
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(worldmap.getImage(),0,0,getWidth(),getHeight(),this);
	}
	
	public void worldMap() {
	
		this.setLayout(null);
		this.add(asia);
		this.add(europe);
		this.add(n_america);
		this.add(s_america);
		this.add(oceania);
		
		worldButton();
		
	}
	
	public void worldButton() {
		Font button_font = new Font("",Font.BOLD,30);
		
		asia.setBounds(300, 250, 200, 50);
		europe.setBounds(80, 270, 200, 50);
		n_america.setBounds(780,270,200,50);
		s_america.setBounds(950,480,200,50);
		oceania.setBounds(400,500,200,50);
		
		asia.setFont(button_font);
		asia.setBackground(Color.white);
		asia.setOpaque(false);
		asia.setBorder(null);
		
		europe.setFont(button_font);
		europe.setBackground(Color.white);
		europe.setOpaque(false);
		europe.setBorder(null);

		n_america.setFont(button_font);
		n_america.setBackground(Color.white);
		n_america.setOpaque(false);
		n_america.setBorder(null);
		
		s_america.setFont(button_font);
		s_america.setBackground(Color.white);
		s_america.setOpaque(false);
		s_america.setBorder(null);
		
		oceania.setFont(button_font);
		oceania.setBackground(Color.white);
		oceania.setOpaque(false);
		oceania.setBorder(null);
		
	}
	
	public void event() {
		
		europe.addActionListener(e -> {
			EuropeMap europe = new EuropeMap();
			
		});		
		
		
		
		
	}
}
