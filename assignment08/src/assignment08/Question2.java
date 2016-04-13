package assignment08;

import java.util.ArrayList;

public class Question2 {
	public static int recursiveSum(ArrayList<Integer> list){
		if(list == null || list.isEmpty()){
			return 0;
		}else if (list.size() == 1){
			if (list.get(0) == null){
				return 0;
			}
			return list.get(0);
		}else{
			if (list.get(0) == null){
				Integer temp = 0;
				list.remove(0);
				temp = temp + recursiveSum(list);
				return temp;
			}else{
			Integer temp = list.get(0);
			list.remove(0);
			temp = temp + recursiveSum(list);
			return temp;
			}
		}
	}
	public static void main(String[] args){
		int [] ints = {1,2,3,4,2,5,2,4};
		ArrayList <Integer> test = new ArrayList<Integer>();
		for(int i : ints){
			test.add(i);
		}
		ArrayList <Integer> test2 = new ArrayList<Integer>();
		System.out.println(recursiveSum(test));
		System.out.println(recursiveSum(test2));
	}
}
