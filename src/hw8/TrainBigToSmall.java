package hw8;

import java.util.Comparator;
import java.util.HashSet;

public class TrainBigToSmall implements Comparator<Train> {
	
	@Override
	public int compare(Train num1, Train num2) {
        return num2.getNumber() - num1.getNumber(); //大到小排序
    }
	
}
