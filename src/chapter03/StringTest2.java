package chapter03;

public class StringTest2 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		
		String s3 = s2;
		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//	
		s2 = s1.toUpperCase();
		
		String s4 = s2.concat("??");
		String s5 = "!".concat(s2).concat("@");	//메소드를 연달아하는것 체인
					//객체한번쓰고 버린다
		//String class 메모리 그림 직접 그려보기
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		
	}
}
