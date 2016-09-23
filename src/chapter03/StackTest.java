package chapter03;

import java.util.Stack;

public class StackTest {
		public static void main(String[] args) {
			Stack<String> stack = new Stack<String>();
											//스택은 클래스 상속으로
			stack.push("둘리");
			stack.push("마이콜");
			stack.push("고길동");
			
			while(stack.empty() == false){
				String s = stack.pop();
				System.out.println(s);
			}
		
//			stack.pop();
			stack.push("희동이");
			stack.push("도우넛");
			stack.push("또치");
			
			
			
			
			System.out.println(stack.pop()); 
			System.out.println(stack.peek()); //그냥 들여다 보기때문에 스택에 남는다.
			System.out.println(stack.pop()); 
//			System.out.println(stack.pop()); //희동이가 스택에 남아있으므로 희동이출력
			
		}
}
