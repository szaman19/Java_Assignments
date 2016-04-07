package lab09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class BinarySearchTree<T> {
	private BinarySearchTree<T> left;
	private BinarySearchTree<T> right;
	private T item;
	private Comparator<T> compare;
	
	
	public void insert(T item){
		if(this.item != null){
			if(compare.compare(this.item, item)== 0){
				this.item = item;
			}else if (compare.compare(this.item, item)==1){
				if(right == null){
					right = new BinarySearchTree<T> (compare);
				}
				right.insert(item);
			}else{
				if(left == null){
					left = new BinarySearchTree<T>(compare);
				}
				left.insert(item);
			
			}
		}else{
			this.item = item;
		}
		
	}
	
	public T find(T item){
		T returnItem = null; 
		if(compare.compare(this.item, item) ==0){
			returnItem = item;
		}else if(compare.compare(this.item, item) == 1){
			if(right != null){
				returnItem = right.find(item);
			}
			
		}
		else if (compare.compare(this.item, item) ==-1){
			if(left != null){
				returnItem = left.find(item);
			}
		}
		return returnItem;
	} 
	
	public ArrayList<T> toArray(ArrayList<T> previousArray){
		ArrayList<T> returnVal = previousArray;
		
		if(this.item != null){
			returnVal.add(this.item);
		}
		if(right != null){
			returnVal = right.toArray(returnVal);
		}
		if(left != null){
			returnVal = left.toArray(returnVal);
		}
		
		return  returnVal;
	}
	public ArrayList<T> getElems(){
		ArrayList<T> returnValArray = new ArrayList<T>();
		return toArray(returnValArray);
	}
	
	public BinarySearchTree(Comparator<T>  compare){
		this.compare = compare;
	}
	
}
