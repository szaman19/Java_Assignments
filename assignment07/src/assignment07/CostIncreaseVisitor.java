package assignment07;
/**
 * An implementation of visitor for @see Piece 
 * @author Shehtab Zaman
 *
 */
public class CostIncreaseVisitor implements Visitor {
	private double increase;
	/**
	 * Creates a new instance of CosIncreaseVisitor
	 * @param increase The percent factor by which the the cost of a piece changes
	 */
	public CostIncreaseVisitor(double increase){
		this.increase = increase;
	}
	/**
	 * Not implemented
	 */
	@Override
	public void visit(Product p) {
		// TODO Auto-generated method stub

	}
	/**
	 * Not implemented in this class
	 * @see Sorter
	 */

	@Override
	public void visit(Subassembly p) {
		// TODO Auto-generated method stub

	}
	/**
	 * Increases the cost of Piece p by this objects increase field by a factor a of initial value
	 * plus increase percent. 
	 * @param p The visited piece which has a change in cost according to 
	 * this objects field
	 */
	@Override
	public void visit(Piece p) {
		// TODO Auto-generated method stub
		p.setCost(p.getCost()+(p.getCost()*(increase)/100));

	}

}
