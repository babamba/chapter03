package chapter03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("one", new Integer(1));
		map.put("two", 2 ); //기본타입2가 아니라 오토박싱으로 new Integer(2)로 오토박싱
		map.put("three", 3);
		
		Integer i = map.get("two");
		System.out.println(i);
		System.out.println(map);
	
		map.remove("two");
		System.out.println(map.get("two"));
		System.out.println(map);
		
		//중복테스트  키가 중복되면 Value를 바꾼다(덮는다) 
//		map.put("one", 10);
//		System.out.println(map.get("one")); 
//		System.out.println(map); //10으로 덮여져보인다.
		
		//순회
		Set<String> keyset = map.keySet();  //선택한 키값 리턴용
		Iterator<String> it = keyset.iterator();
		
		while(it.hasNext()){
			String key = it.next();
			Integer v = map.get(key);
			System.out.println(v);

		}	//순서는 모르고 키값을 배경(순회)으로 밸류 뽑아내는
	}
}

//동기화를 해줘야함=쓰레드를 직접 맞추겠다.