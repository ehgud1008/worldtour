package Example;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public void BufferedImageToByteArray(String filename){
	  try{
	   
	  BufferedImage orImage=ImageIO.read(new File(filename));
	  ByteArrayOutputStream baos=new ByteArrayOutputStream();
	  ImageIO.write(orImage, "jpg", baos );
	  byte[] imageBytes=baos.toByteArray();
	  //do something with the byte array
	  
	  }catch(IOException ie){}
	 }