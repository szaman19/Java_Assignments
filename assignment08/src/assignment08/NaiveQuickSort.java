package assignment08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NaiveQuickSort implements Sorter {

	/**
	 * Return a list of all the elements that are less than list.get(0)
	 * according to the compareTo of E, i.e. all elements e in list such
	 * that e.compareTo(get(0)) < 0.
	 * @param list the input list from which the elements that are less than are taken
	 * @return a list of all the elements that are less than list.get(0)
	 * according to the compareTo of E 
	 */
	private static <E extends Comparable<? super E>> List<E> less(List<E> list) {
		ArrayList<E> returnVal = new ArrayList<E>();
		
		if(list.size() == 0){
			return list;
		}

		E e = list.get(0);

		for(int i = 0; i < list.size(); i++)
		{
			E comp = list.get(i);
			if(comp.compareTo(e) < 0){
				returnVal.add(comp);
			}
		}		
		return returnVal;
	}

	/**
	 * Return a list of all the elements that are greater than or equal to list.get(0)
	 * according to the compareTo of E, i.e. all elements e in list such
	 * that e.compareTo(get(0)) >= 0. 
	 * @param list the input list from which the elements that are not less than are taken
	 * @return a list of all the elements that are greater than or equal to list.get(0)
	 * according to the compareTo of E 
	 */
	private static <E extends Comparable<? super E>> List<E> gteq(List<E> list) {
		ArrayList<E> returnVal = new ArrayList<E>();
		if(list.size() == 0){
			return list;
		}
		E e = list.get(0);

		for(int i = 0; i < list.size();i++)
		{
			E comp = list.get(i);
			if(comp.compareTo(e) >= 0){
				returnVal.add(comp);
			}
		}
		return returnVal;

	}

	/**
	 * Returns true or false according as the list is already sorted according to the
	 * compareTo of E.
	 * @param list a list to be checked for sorted order
	 * @return true if the list is already sorted, otherwise false
	 */
	private static <E extends Comparable<? super E>> boolean inOrder(List<E> list) {
		boolean returnVal = false;

		if(list.size() == 1){
			return true;
		}
		for(int i = 0; i < list.size() -1; i++)
		{
			if((list.get(i)).compareTo(list.get(i+1)) <= 0){
				returnVal = true;
			}else{
				returnVal = false;
				return returnVal;
			}
		}
		return returnVal;
	}

	/**
	 * Return a sorted copy of the input list, using the compareTo of E
	 * to determine the order of the elements
	 * @param list the input list
	 * @return the same list elements in sorted order
	 */
	public static <E extends Comparable<? super E>> List<E> sort(List<E> list) {
		if (inOrder(list)){
			return list;
		}else if (list.size() < 2){
			return list;
		}
		else{
			List <E> returnVal = new ArrayList<E>();
			List <E> lower = less(list);
			List <E> higher = gteq(list);
			if(higher.size() >= 1){
				lower.add(higher.get(0));
				higher = higher.subList(1, higher.size());
				returnVal.addAll(sort(lower));
				returnVal.addAll(sort(higher));
			}else{
				returnVal.addAll(sort(lower));
			}
//			lower.add(higher.get(0));
//			higher = higher.subList(1, higher.size());
//			returnVal.addAll(sort(lower));
//			returnVal.addAll(sort(higher));
			return returnVal;
		}
		
	}



	@Override
	public <E extends Comparable<? super E>> double timedSort(List<E> list) {
		long start = System.currentTimeMillis();
		list = sort(list);
		long end = System.currentTimeMillis();
		return end - start;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> lst = new ArrayList<Integer>();

		for(int i = 0; i < 1000; i++)
			lst.add(r.nextInt(1000));
//		System.out.println(lst);
		System.out.println(sort(lst));

		for(int i = 0; i < 10000; i++)
			lst.add(r.nextInt(10000));
//		System.out.println(lst);
		System.out.println(sort(lst));
//		ArrayList<Integer> checkIfSorted = (ArrayList<Integer>) sort(lst);
//		System.out.println(inOrder(checkIfSorted));
	}


}