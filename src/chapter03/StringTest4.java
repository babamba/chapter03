package chapter03;

public class StringTest4 {
		public static void main(String[] args) {
			String s = "aBcAbCabcABC";//1
			
			System.out.println(s.length());//4
			System.out.println(s.charAt(2));//2
			System.out.println(s.indexOf("abcd"));
			System.out.println(s.replace("a", "R"));//5
			System.out.println(s.replaceAll("abc", "123")); //6
			System.out.println(s.substring(3));	//3번까지 자르고 출력
			System.out.println(s.substring(3,6));// 3전까지 자르고 5까지 출력
			
			String a = " ab    cd      ";
			String b = "f!efg!dfasdf";
			
			String c = a.concat(b);
			System.out.println(c);
			System.out.println(a + b);
			
			System.out.println("----" + a.trim() + "----");
			//a.trim 양쪽옆만 공백제거
			System.out.println("----" + a.replaceAll(" ","") + "----");
			//안쪽 공백 제거 (제거할 요소)
			
			//
			//	[0-9]+	0 1 2 3 345 4123	//정규표현식 
			//	[a-z]+	소문자로 된 문자를 정규표현식
			//	[a-zA-Z]	모든소문자를 표현
			
			String [] t = b.split("!");
			//split 분리해주는 기준을 가지고 분리
			for( String k : t){
				System.out.println(k);
			}
			
			
			// + 연산자
			String[] arr = {"Hello", "World", "java"};
			String str = "";
			for(String str2: arr){
				str += str2;
			}
			
			//String str2 = "Hello" + "World" + "java";
			StringBuffer sb = new StringBuffer("Hello");
			sb.append("World");
			sb.append("java");
			
			String str2 = new StringBuffer("Hello").
									append(" World").
									append(" java").
									toString();
							
			System.out.println(str2);
		}

}
