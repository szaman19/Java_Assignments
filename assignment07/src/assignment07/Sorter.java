package assignment07;
/**
 * A sorter for Subassembly that sorts the the subassembly
 * @author Shehtab Zaman
 *
 */
public class Sorter implements Visitor {
	/**
	 * Not implemented
	 */
	@Override
	public void visit(Product p) {
	}
	/**
	 * Calls the sort method in the param Subassembly p. The 
	 * subassembly utilizes collections.sort() to sort its members. 
	 * 
	 * @param p Subassembly p to be sorted
	 * @see Collections
	 */
	@Override
	public void visit(Subassembly p) {
		// TODO Auto-generated method stub
		p.sort();

	}
	/**
	 * Not implemented here.
	 * @see CostIncreaseVisitor 
	 * @param p Piece to be visited
	 */
	@Override
	public void visit(Piece p) {
	}

}
