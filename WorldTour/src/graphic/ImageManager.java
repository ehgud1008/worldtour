package graphic;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import tour.TourDB;
import tour.TourManager;

public class ImageManager {
	
	/**
	 * �̹����� ����ڰ� ���ϴ� ũ��� �����ؼ� ��ȯ�ϴ� �޼ҵ�
	 * @param path - ���
	 * @param width - ��
	 * @param height - ����
	 * @return �̹���
	 * @throws IOException
	 */
	public static ImageIcon loadImage(BufferedImage bufferedImage, int width, int height){
		try {
			
			Image resize = bufferedImage.getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH);
			return new ImageIcon(resize);
		}catch(Exception e) {
			return null;
		}
		
	}
	
}