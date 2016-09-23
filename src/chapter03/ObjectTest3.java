package chapter03;

public class ObjectTest3 {
	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		Point p3 = p2;
		
		// ==  -> 두 객체의 동일성
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		
		//equals() -> 두 객체의 동등성(내용비교)
		System.out.println(p1.equals("hello"));
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode() + ":" + s2.hashCode());
		//오버라이드 되있어서 내용으로 해쉬코드가 되어있어서 둘의 내용은 같다.
		System.out.println(System.identityHashCode(s1) + ":" +
							System.identityHashCode(s2));
							//주소기반의 해쉬코드. 
							//레퍼런스 값과 다른 주소값이다. 오해 노노
							//유일한 주소값
		
		
		String s3 = "ABC";
		String s4 = "ABC";
		
		System.out.println( s3 == s4);
		System.out.println(s3.equals(s4));
		
		
		
	}
}
