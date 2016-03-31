package assignment07;
/**
 * A visitor object which implicitly modifies Product
 * @author Shehtab Zaman
 *
 */
public interface Visitor {
	/**
	 * Perform action on Piece p when visited.
	 * @param p Product to Visit
	 */
	public void visit(Product p);
	/**
	 * Perform action on Piece p when visited.
	 * @param p Subassembly to Visit
	 */
	public void visit(Subassembly p);
	/**
	 * Perform action on Piece p when visited.  
	 * @param p Piece to Visit
	 */
	public void visit(Piece p);
}
