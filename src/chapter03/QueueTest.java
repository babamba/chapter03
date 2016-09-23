package chapter03;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();	//인터페이스
									//큐는 인터페이스이므로 링크드리스트로 생성
		queue.offer("둘리"); //넣는거
		queue.offer("마이콜"); //
		queue.offer("또치");
		
		while(queue.isEmpty() == false ){ //비어져있지 않으면 반복
			String s = queue.poll();//끄집어내서
			System.out.println(s);//출력
		}
		
		queue.offer("고길동");
		queue.offer("희동이");
		queue.offer("도우넛");
		
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		
		System.out.println(queue.poll());
//		System.out.println(queue.poll());
		
	}
}
