package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class F001_Fileoutputstream {
	public static void main(String[] args) {
		
		
		try {
			FileOutputStream fis = new FileOutputStream("D:\\test\\test.txt");
			System.out.println("file created...");
			
			String data = "sun rises in east";
			byte b[] = data.getBytes();
			fis.write(b);
			System.out.println("Data written...");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
