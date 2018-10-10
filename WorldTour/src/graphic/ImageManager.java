package graphic;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImageManager {
	
	/**
	 * �̹����� ����ڰ� ���ϴ� ũ��� �����ؼ� ��ȯ�ϴ� �޼ҵ�
	 * @param path - ���
	 * @param width - ��
	 * @param height - ����
	 * @return �̹���
	 * @throws IOException
	 */
	public static ImageIcon loadImage(String path, int width, int height){
		try {
			BufferedImage buff = ImageIO.read(new File(path));
			Image resize = buff.getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH);
			return new ImageIcon(resize);
		}catch(Exception e) {
			return null;
		}
		
	}
	
	
	
}
