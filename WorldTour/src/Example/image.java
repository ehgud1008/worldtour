package Example;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class image {
	public static void main(String[] args) throws IOException {
		BufferedImage image = ImageIO.read(new File("C:\\Users\\user\\git\\Worldtour_New\\worldtour\\WorldTour\\files\\¼þ·Ê¹®.jpg"));
		System.out.println(image);

	}

	public void BufferedImageToByteArray(String filename) {

		try {
			BufferedImage orimage = ImageIO.read(new File(filename));
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(orimage, "jpg", baos);
			byte[] imagebytes = baos.toByteArray();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}