package assignment07;

import java.util.List;
/**
 * A subtype of Product which has a cost and a manufacturing time 
 * @author Shehtab Zaman
 *
 */

public class Piece extends Product {
	private double cost;
	private double manufactureTime;
	
	/**
	 * Creates a new Piece object with cst as the cost and mTime as the 
	 * manufactureTime and passes description in the product super constructor
	 * @param description The description of the piece. Added to its toString
	 * @param cst the cost of the Piece
	 * @param mTime the manufacturing time of the Piece
	 */
	public Piece(String description, double cst, double mTime) {
		super(description);
		cost = cst;
		manufactureTime = mTime;
	}
	/**
	 * Returns the cost of the Piece. 
	 * @return double the cost of the Piece
	 */
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return cost;
	}
	/**
	 * Returns the manufacture time of the Piece
	 * @return double the manufacture time of the Piece
	 */
	@Override
	public double getManufactureTime() {
		// TODO Auto-generated method stub
		return manufactureTime;
	}
	@Override
	/**	
	 * Takes in a double cost as parameters and sets the cost of the Piece.
	 * @param cost cost of Piece
	 */
	public void setCost(double cost){
		this.cost = cost;
	}
	@Override
	/**
	 * Takes in a double manufactureTime and sets the manufactureTime of the Piece.
	 * @param manufactureTime manufactureTime to set for Piece
	 */
	public void setManufactureTime(double manufactureTime){
		this.manufactureTime = manufactureTime;
	}
	@Override
	/**
	 * Accepts a Visitor V, which implicitly changes the cost of the Piece. Per visitor 
	 * visit increases or decreases the cost of the Piece. 
	 * @param v Visitor which changes the  cost of the Piece
	 */
	public void accept(Visitor v){
		v.visit(this);
	}
	/**
	 * Sets indentation for the Piece. 
	 * @param indent indentation level of Piece
	 * @param list list of Products 
	 */
	protected void addAllParts(int indent, List<Product> list){
		setIndent(indent);
	}
	
}
