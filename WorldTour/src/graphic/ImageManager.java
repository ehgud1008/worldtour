package graphic;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImageManager {
	
	/**
	 * 이미지를 사용자가 원하는 크기로 편집해서 반환하는 메소드
	 * @param path - 경로
	 * @param width - 폭
	 * @param height - 높이
	 * @return 이미지
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
