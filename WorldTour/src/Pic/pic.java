package Pic;

import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class pic {
	public static void main(String[] args) throws IOException {
		String source = "C:\\Users\\user\\git\\Worldtour_New\\worldtour\\WorldTour\\files\\°æº¹±Ã.jpg";
		String targetFileName="pic.dat";
		FileInputStream fi = new FileInputStream(source);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		int readbyteno;
		byte[] readbytes = new byte[100];
		while((readbyteno=fi.read(readbytes))!=-1) {
			fos.write(readbytes, 0, readbyteno);
		}
		
		
	}
}
