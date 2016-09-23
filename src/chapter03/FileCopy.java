package chapter03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try{
			fis = new FileInputStream("p2.jpg");
			fos = new FileOutputStream("p2.back.jpg");
			
			int data = -1;
			while((data = fis.read() ) != -1){
				fos.write(data);
			}
			
			
		}catch(FileNotFoundException ex){
			System.out.println("error:" + ex);
		}catch(IOException ex){
			System.out.println("error:" + ex);
		}finally{
			try{
				if(fis != null){
					fis.close();
				}
				if(fos != null){
					fos.close();
				}
//				fis.close();	
//				fos.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}
}
