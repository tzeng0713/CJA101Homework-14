package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

public class Hw8_1 {
	public static void main(String[] args) {
		
		ArrayList<Object> arr = new ArrayList<>();
		
		Integer a = 100;
		Double b = 3.14, e = 5.1;
		Long c = 21L;
		Short d = 100;
		String f = "Kitty", h = "Snoopy";
		BigInteger i = new BigInteger("987654321098765432109876543210");
		Object g = new Object();
		
		
		arr.add(a);
		arr.add(b);
		arr.add(c);
		arr.add(d);
		arr.add(e);
		arr.add(f);
		arr.add(a);
		arr.add(g);
		arr.add(h);
		arr.add(i);
//		第一小題
//		for (Object obj : arr) {
//			System.out.println(obj);
//		}

//		第二小題
//		for (int n = 0; n < arr.size(); n++) {
//			System.out.println(arr.get(n));
//		}
		
//		第三小題
		Iterator<Object> it = arr.iterator();
		while (it.hasNext()) {
			Object item = it.next();
			
			if (!(item instanceof Number)) {
				it.remove();
				System.out.println(item);	
			}
			
		}
//		for (Object obj : arr) {
//			if (!(obj instanceof Number)) {
//				arr.remove(obj);
//				System.out.println(obj);	
//			}
//		}
		
	}
}




//請建立一個Collection物件並將以下資料加入:
//Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//Object物件、“Snoopy”、BigInteger(“1000”)