package chapter03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
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
			
			
			// 기반 스트림(byte기반)
			FileInputStream fis = new FileInputStream("phone.txt");			
			// 보조 스트림(byte -> char)
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
			//보조스트림(line 단위 입력)
			BufferedReader br = new BufferedReader(isr);
			
			String line = null;
			while( (line = br.readLine()) != null){
				StringTokenizer st = new StringTokenizer(line, "\t ");
				
				int index = 0;
				while(st.hasMoreTokens() ){
					String token = st.nextToken();
					
					if(index == 0){//이름
						System.out.print(token + " : ");
					}else if(index == 3){ //번호들
						System.out.print(token);
					}else{
						System.out.print(token + "-");
					}
					index++;
				}
				System.out.println("");
			}
			
			} catch (IOException ex) {
			System.out.println("error : " + ex);
			}

	}

}
