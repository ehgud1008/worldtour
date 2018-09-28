package graphic;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class EuropeMap extends JPanel{
	
	private ImageIcon europemap = new ImageIcon("image/europemap.png");
	private JButton uk = new JButton("����");
	private JButton france = new JButton("������");
	private JButton germany = new JButton("����");
	
	private JButton london = new JButton("����");
	private JButton birmingham= new JButton("���־�");
	private JButton cardiff = new JButton("ī����");
	
	private JButton paris = new JButton("�ĸ�");
	private JButton nice = new JButton("�Ͻ�");
	private JButton lyon = new JButton("����");
	
	private JButton berlin = new JButton("������");
	private JButton munchen = new JButton("����");
	private JButton Dresden = new JButton("�巹����");

	
	
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
