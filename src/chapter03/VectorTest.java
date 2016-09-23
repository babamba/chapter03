package chapter03;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {
		public static void main(String[] args) {
			Vector<String> vector = new Vector<String>();
//			Vector<Object> vector = new Vector<String>(); //맞지않음
			
			vector.addElement("둘리"); // 제네릭을 통해 스트링을 넣을 수 있다.스트링만
			vector.addElement("마이콜");
			vector.addElement("도우넛");
			
			//순회1
			int count = vector.size();
			for(int i = 0; i < count; i++){
				String s = vector.elementAt(i);
				System.out.println(s);
			}
			
			vector.remove(1);
			
			//순회2
			Enumeration<String> enumeration = vector.elements();
			while(enumeration.hasMoreElements()){
				String s = enumeration.nextElement();
				System.out.println(s);
			}
			
			
			
			
			
			
			
		}
}
