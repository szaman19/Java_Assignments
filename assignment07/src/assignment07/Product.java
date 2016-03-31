package assignment07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * An Abstract class of Product which holds description and indentation 
 * levels and abstract methods
 * @author Shehtab Zaman
 *
 */
public abstract class Product implements Iterable<Product>,Comparable<Product>{
	//Fields
	private String description;
	private int indent = 0;
	//Abstract methods
	/**
	 * Abstract method that returns the cost of a Product
	 * @return a double containing the cost or sum of costs of a Product
	 */
	public abstract double getCost();
	/**
	 * abstract method that returns the manufacturing time of a Product 
	 *or the highest time for its member Products. 
	 * @return a double containing the manufacturing time 
	 */
	public abstract double getManufactureTime();
	/**
	 * Adds the sub parts of a Product or changes the indentation level, 
	 * depending on the sub type of the product. Since Subassembly, can hold 
	 * other Products, it changes the indentation level for it and iterates
	 * through sub parts. For Piece objects, only the indentation is changed.
	 * @param indent indentation level of the product
	 * @param list list of members of Products in the current Product
	 */
	protected abstract void addAllParts(int indent, List<Product>list);
	abstract void accept(Visitor v);
	/**
	 * Creates a Product with String description
	 * @param description String description of Product
	 */
	public Product(String description){
		this.description = description;
	}
	/**
	 * Sets the indent level for the product. Used to adjust the 
	 * number of dashes before the description of the Product
	 * @param indent the indent level of the display tree
	 */

	public void setIndent(int indent){
		this.indent = indent;
	}
	/**
	 * Returns the indent level of the Product
	 * @return int the indentation level
	 */
	public int getIndent(){
		return indent;
	}
	/**
	 * Throws an UnsupportedoperationException if called on Product
	 * @throws UnsuppportedOperationException.Throws an 
	 * UnsupportedOperationExcetion for Produucts.Overriden in 
	 * subclasses, Piece andSubassembly
	 * @param cost value to set 
	 */
	public void setCost(double cost){
		throw new UnsupportedOperationException("Method setCost cannot"
				+ "be called on this object");

	}
	/**
	 * Sets the manufactureTime for the Products. Throws an 
	 * UnsupportedOperationExcetion for Produucts.Overriden in 
	 * subclasses, Piece andSubassembly
	 * @throws UnsuppportedOperationException
	 * @param time double for the manufacturing time for Product
	 */
	public void setManufactureTime(double time){
		throw new UnsupportedOperationException("Method setManufacturingTime"
				+ "cannot be called on this object");
	}
	
	/**
	 * Returns a iterator object of the Product. Takes in the parts 
	 * and sub parts of this Product and turns it into an Iterator.
	 * Subassembly object can hold sub parts, which are Products 
	 * @return Iterator Product
	 * @see Iterable
	 */
	public Iterator<Product> iterator(){
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(this);
		addAllParts(0,list);
		return list.iterator();

	}
	/**
	 * Overrides the toString method in object and prints out the 
	 * Description with an indent number of '--'s.
	 * 
	 * @see Object
	 * @return String description of Product with trailing dashes.
	 */
	@Override
	public String toString(){
		StringBuilder returnVal = new StringBuilder();
		for (int i = 0; i < indent; i++){
			returnVal.append("--");
		}
		returnVal.append(description);
		return returnVal.toString();
	}
	/**
	 * Creates a campareTo for Products where Piece is sorted before Subassembly 
	 * and Subassembly is sorted after Piece. 
	 * 
	 * @see Comparable
	 * @param Other The produfct to be compared with this 
	 */
	public int compareTo(Product other){
		int returnVal = 0;
		if(this instanceof Piece && other instanceof Subassembly){
			returnVal = -1;
		}else if (this instanceof Subassembly && other instanceof Piece){
			returnVal = 1;
		}
		return returnVal;
	}
}



