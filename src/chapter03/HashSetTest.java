package chapter03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
	//순서가 없이 저장되있기때문에 원하는 순서로 빼낼수 없다.
		//키와 맵이 매핑되있지 않기때문에 add, 있는지없는지 루프돌며 꺼내달라 요청만 할수있음.
		set.add("둘리");
		set.add("마이콜");
		set.add("고길동");
		
		System.out.println(set.contains("둘리"));
		System.out.println(set.size());
		
		set.add("둘리");
		System.out.println(set.size()); //결과가 같으므로 중복은 안된다.
		System.out.println(set);
		
		set.remove("마이콜");
		System.out.println(set);
		
		//순회 링크드처럼 
		Iterator<String> it = set.iterator(); //훑는거
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		System.out.println(set);
		
	}
}
