package chapter03;

public class ObjectTest {
	public static void main(String[] args) {
		Point p = new Point();
		
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());	//이 값은 레퍼런스 값도 아니고 
											//address 주소도 아니고
											//address 기반으로 만든 해싱 값(int)
		System.out.println(System.identityHashCode(p));

		System.out.println(p.toString());
		System.out.println(p);
		
	}
}
