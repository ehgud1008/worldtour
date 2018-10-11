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
	 * 이미지를 사용자가 원하는 크기로 편집해서 반환하는 메소드
	 * @param path - 경로
	 * @param width - 폭
	 * @param height - 높이
	 * @return 이미지
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
