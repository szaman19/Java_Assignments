package assignment04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class TownList implements List<Town>{
	private ArrayList<Town> list = new ArrayList<>();

	public boolean add(Town e) {
// TODO: this only works because we have defined "equals" in Town
// ArrayList has a method "list.contains(e)" that uses "equals" to see if r is already in list
// If e is in list, return false, else add e to list and return true
		boolean returnVal = true;
		if (list.contains(e)) {
			returnVal = false;
		}else{
			list.add(e);
		}
		return returnVal;
	}
	public void add(int index, Town element) {
// TODO if e is not in list, add e to list at the given index
		if(!(add(element))){
			list.set(index,element);
		}
	}
	public boolean addAll(Collection<? extends Town> c) {
// TODO track the size of list before and after the operation. Use an enhanced loop for(Town t : c)
// to add t to list using the add(t) method above. If the size increases, return true, else return false.
// Note that every element in c may already be in list.
		int initialSize = list.size();
		for (Town t : c) {
			add(t);
		}
		int finalSize = list.size();
		return initialSize != finalSize;
	}
	public boolean addAll(int index, Collection<? extends Town> c) {
// TODO again track the size of list. This one is even trickier. Use for(Town t : c)
// and for each t use add(index, t) above. Only IF the list gets bigger by 1, then increase index by 1
// and add the next element. Return true if overall list has increased in size otherwise false
		int initialSize = list.size();
		for (Town t : c) {
			int temp = list.size()-1;
			add(temp,t);
		}
		int finalSize = list.size();
		return initialSize != finalSize;
	}
	public void clear() {
		list.clear();
	}
	public Object clone() {
		return list.clone();
	}
	public boolean contains(Object o) {
		return list.contains(o);
	}
	public boolean containsAll(Collection<?> c) {
		return list.containsAll(c);
	}
	public void ensureCapacity(int minCapacity) {
		list.ensureCapacity(minCapacity);
	}
	public boolean equals(Object o) {
		return list.equals(o);
	}
	public void forEach(Consumer<? super Town> action) {
		list.forEach(action);
	}
	public Town get(int index) {
		return list.get(index);
	}
	public int hashCode() {
		return list.hashCode();
	}
	public int indexOf(Object o) {
		return list.indexOf(o);
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public Iterator<Town> iterator() {
		return list.iterator();
	}
	public int lastIndexOf(Object o) {
		return list.lastIndexOf(o);
	}
	public ListIterator<Town> listIterator() {
		return list.listIterator();
	}
	public ListIterator<Town> listIterator(int index) {
		return list.listIterator(index);
	}
	public Town remove(int index) {
		return list.remove(index);
	}
	public boolean remove(Object o) {
		return list.remove(o);
	}
	public boolean removeAll(Collection<?> c) {
		return list.removeAll(c);
	}
	public boolean removeIf(Predicate<? super Town> filter) {
		return list.removeIf(filter);
	}
	public void replaceAll(UnaryOperator<Town> operator) {
		list.replaceAll(operator);
	}
	public boolean retainAll(Collection<?> c) {
		return list.retainAll(c);
	}
	public Town set(int index, Town element) {
		return list.set(index, element);
	}
	public int size() {
		return list.size();
	}
	public void sort(Comparator<? super Town> c) {
		list.sort(c);
	}
	public Spliterator<Town> spliterator() {
		return list.spliterator();
	}
	public List<Town> subList(int fromIndex, int toIndex) {
		return list.subList(fromIndex, toIndex);
	}
	public Object[] toArray() {
		return list.toArray();
	}
	public <T> T[] toArray(T[] a) {
		return list.toArray(a);
	}
	public String toString() {
// TODO. You are going to use StringBuilder sb = new StringBuilder();
// You are not allowed to use string concatenation "+" in this method
// StringBuilder allows you to add chars sb.append('[') and Strings sb.append(str)
// first append '[', then loop through list (STOP one before the last element)
// appending the String from the list (the elements are of type Town so you must
// convert them to Strings) and then "; "
// After the loop, append the last element of list followed by ']'
// return sb.toString()
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for (int i = 0; i < list.size()-1 ;i++ ) {
			sb.append((list.get(i)).toString());
			sb.append("; ");
		}
		sb.append((list.get(list.size()-1).toString()));
		sb.append(']');
		return sb.toString();
	}
	public void trimToSize() {
		list.trimToSize();
	}
}
