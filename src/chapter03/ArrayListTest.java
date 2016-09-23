package chapter03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("둘리");
		list.add("마이콜");
		list.add("도우넛");
		
		//순회1
		
		int size = list.size();
		for(int i = 0; i<size; i++){
			String s = list.get(i);
			System.err.println(s);
		}
		list.remove(2);
		
		
		//순회2
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
     	}
		System.out.println("====================");
		list.add(1, "희동이");
		
		
		
		//순회3
		for(String s : list){
			System.out.println(s);
			}
//		배열 ArrayList는 임의위치 삽입성능은 안좋고 서치(조회)에 좋다. ex.DB
//		Linked는 .NODE라는 클래스(객체)에 하나의 객체로 만들어서 가리킨다. 임의위치삽입편함.
//		Array와 Licked 중 사용하는 데이터의 성질, 어떻게 운영(삽입삭제)에 따라 기준마련 
		
//		Array와 Linked는 멀티쓰레드시 락과 언락(동기화)(ex: 야! 호!)을 필요 Vector는 자동으로 동기화 
		
		}
	}
