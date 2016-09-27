package chapter03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneList2 {
	public static void main(String[] args) {
		Scanner scaner = null;
		
		try {
			File file = new File("phone.txt"); //파일클래스가 더 정확하다.
			if(file.exists() == false){
				System.out.println("파일이 존재하지 않습니다.");
				return;
			}
			
			System.out.println("***************  파일정보 *****************");
			System.out.println(file.getAbsolutePath());	//경로찍어줌
			System.out.println(file.length() + "Bytes");
			SimpleDateFormat sdf =
					new SimpleDateFormat("yyyy-MM-dd-a hh:mm:ss");
			System.out.println(new Date(file.lastModified()));
			
			System.out.println("************** 전화번호 리스트 *****************");
			scaner = new Scanner(file);
			while( scaner.hasNextLine() ){
				String name = scaner.next();
//				String phone01 = scaner.next();
//				String phone02 = scaner.next();
//				String phone03 = scaner.next();
				
				int num1 = scaner.nextInt();
				int num2 = scaner.nextInt();
				int num3 = scaner.nextInt();
				System.out.println(name + ":" + num1 + "-" + num2 + "-" + num3);
				
//				System.out.println(name + ":" + phone01 + "-" + phone02 + "-" + phone03);
			}
			} catch (IOException ex) {
				System.out.println("error : " + ex);
			} finally{
				scaner.close();
			}
	}
}
