package chapter03;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<String, Integer>();
		
		map.put("one", new Integer(1));
		map.put("two", 2 ); //기본타입2가 아니라 오토박싱으로 new Integer(2)로 오토박싱
		map.put("three", 3);
		
		
		Integer i = map.get("two");
		System.out.println(i);
		System.out.println(map);
	
		map.remove("two");
		System.out.println(map.get("two"));
		System.out.println(map);
	
		//동기화를 맞춰준다
	}
}
