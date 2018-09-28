package graphic;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class EuropeMap extends JPanel{
	
	private ImageIcon europemap = new ImageIcon("image/europemap.png");
	private JButton uk = new JButton("영국");
	private JButton france = new JButton("프랑스");
	private JButton germany = new JButton("독일");
	
	private JButton london = new JButton("런던");
	private JButton birmingham= new JButton("버밍엄");
	private JButton cardiff = new JButton("카디프");
	
	private JButton paris = new JButton("파리");
	private JButton nice = new JButton("니스");
	private JButton lyon = new JButton("리옹");
	
	private JButton berlin = new JButton("베를린");
	private JButton munchen = new JButton("뮌헨");
	private JButton Dresden = new JButton("드레스덴");

	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(europemap.getImage(),0,0,getWidth(),getHeight(),this);
	}
	
	public EuropeMap() {
		this.setLayout(null);
		this.add(uk);
		this.add(france);
		this.add(germany);
		
	}
	
}
