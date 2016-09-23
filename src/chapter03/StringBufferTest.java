package chapter03;

public class StringBufferTest {
	public static void main(String[] args) {
		
			StringBuffer sb = new StringBuffer("this");
			System.out.println(sb);
			
			
			//첨부
			sb.append(" is pencil");
			System.out.println(sb);
			
			//7번째 자리에 삽입
			sb.insert(7, " my");
			System.out.println(sb);
			
			//7전과 10자리에 추가
			sb.replace(7, 10, " yours");
			System.out.println(sb);
			
			//length 줄이기
			sb.setLength(3);
			System.out.println(sb);
			
	}
}
