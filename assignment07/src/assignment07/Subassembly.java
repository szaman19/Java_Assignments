package assignment07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * A sub type of Product which holds an array of Products 
 * 
 * @author Shehtab Zaman
 *
 */
public class Subassembly extends Product {
	private ArrayList<Product> parts = new ArrayList<Product>();
	
	/**
	 * Constructor for Subassembly which passes the param description to the 
	 * super constructor of Product. 
	 * @param description description of the Subassembly
	 */
	public Subassembly(String description) {
		super(description);
	}
	/**
	 * Returns a Double of the sum of all Products (Pieces and Subassembly)
	 * currently in the ArrayList of products of this Subassembly.
	 * If no Product are in the List, then the sum returns 0.0
	 * 
	 * @return double returns the total cost of all Products in this Subassembly
	 */
	@Override
	public double getCost(){
		double totalCost = 0.0;
		for(Product p: parts){
			totalCost += p.getCost();
		}
		return totalCost;
	}
	/**
	 * Returns a Double of the highest manufactureTime of all Products(Pieces and
	 * Subassembly) currently in the ArrayList of products of this Subassembly
	 * If no Product are in the List, then the sum returns 0.0
	 * 
	 * @return double returns the highest manufacturingTime of all the products
	 */
	@Override
	public double getManufactureTime(){
		double time = (parts.get(0)).getManufactureTime();
		for(Product p: parts){
			if(p.getManufactureTime() > time){
				time = p.getManufactureTime();
			}
		}
		return time;
	}
	/**
	 * Receives a Visitor and implicitly transmits this Subassembly to Visitor 
	 * @param v Visitor that implicitly changes Subassembly
	 */
	@Override
	public void accept(Visitor v){
		v.visit(this);
	}
	/**
	 * Adds a Product to this Subassembly
	 * @param p the product added
	 */
	public void add(Product p){
		parts.add(p);
	}
	/**
	 * Sorts the products in the Subassembly
	 */
	public void sort(){
		Collections.sort(parts);
	}
	/**
	 * Sets the indentation level for products in this Subassembly and 
	 * all subparts
	 * @param indent indentation level of subparts
	 * @param list list of Products to set indentation of. 
	 */
	protected void addAllParts(int indent, List<Product> list){
		setIndent(indent);
		for(Product p: parts){
			list.add(p);
			p.addAllParts(1+indent, list);
		}
		
	}
}
