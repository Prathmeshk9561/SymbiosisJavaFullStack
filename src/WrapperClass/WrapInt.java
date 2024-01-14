package WrapperClass;

import java.util.*;

public class WrapInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<>();
		
			arr.add(12);
			arr.add(54);
			arr.add(null);
			arr.add(54);
			
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
	}

}
