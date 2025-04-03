package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class TrainMain{
	public static void main(String[] args) {
		
		Train a = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train b = new Train(1254, "區間", "屏東", "基隆", 700);
		Train c = new Train(118, "自強", "高雄", "台北", 500);
		Train d = new Train(1288, "區間", "新竹", "基隆", 400);
		Train e = new Train(122, "自強", "台中", "花蓮", 600);
		Train f = new Train(1222, "區間", "樹林", "七堵", 300);
		Train g = new Train(1254, "區間", "屏東", "基隆", 700);
		
		
		HashSet<Object> set = new HashSet<>();
		HashMap<String, Object> hashMap = new HashMap<>();
		hashMap.put(a.toString(), 1);
		hashMap.put(b.toString(), 1);
		hashMap.put(c.toString(), 1);
		hashMap.put(d.toString(), 1);
		hashMap.put(e.toString(), 1);
		hashMap.put(f.toString(), 1);
		hashMap.put(g.toString(), 1);
		for (String key : hashMap.keySet()) {
			System.out.println(key); // 2-1小題
		}
		
		
		ArrayList<Train> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		list.add(f);
		list.add(g);
		
		Collections.sort(list, new TrainBigToSmall());
		// 2-2小題
		for (Train t : list) {
			System.out.println(t);
		}
		
		// 2-3小題
		int numTest = 0;
		for (int x = 0; x < list.size(); x++) {
			if (list.get(x).getNumber() != numTest) {
				System.out.println(list.get(x).toString());
				numTest = list.get(x).getNumber();
			}
			
		}
		
	}
}
