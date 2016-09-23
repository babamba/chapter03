package chapter03;

public class WrapperClassTest {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Character c = new Character('c');
		Boolean b = new Boolean(true);
		
//		System.out.println(i);
//		System.out.println(c);
//		System.out.println(b);
	
	
		Integer i2 = new Integer("10");
//		System.out.println(i2);
		
		//auto Boxing\
//		Integer i4 = new Integer(10);
		Integer i4 = 10; //위의 것을 자동으로 해준다 
		System.out.println(i4);
		
//		//Auto UnBoxing
//		int i5 = i4.intValue();
//		System.out.println(i5);
		int i5 = i4 + 10;
		
		
		System.out.println(i4 +  ":" +  i5);
		
		
		
		
		
		
	}
		
		
}
