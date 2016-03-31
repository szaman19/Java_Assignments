package assignment07;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
/**
 * @exclude
 * @author Shehtab Zaman
 *
 */
public class Tester {
	Piece [] piece = new Piece[11];
	Subassembly[] assembly = new Subassembly[5];
	@Before
	public void setup(){
		
		
		Piece piece0 = new Piece("Piece 0",10.0,5.0);
		Piece piece1 = new Piece("Piece 1",10.0,5.0);
		Piece piece2 = new Piece("Piece 2",10.0,5.0);
		Piece piece3 = new Piece("Piece 3",10.0,5.0);
		Piece piece4 = new Piece("Piece 4",10.0,5.0);
		Piece piece5 = new Piece("Piece 5",10.0,5.0);
		Piece piece6 = new Piece("Piece 6",10.0,5.0);
		Piece piece7 = new Piece("Piece 7",10.0,5.0);
		Piece piece8 = new Piece("Piece 8",10.0,5.0);
		Piece piece9 = new Piece("Piece 9",10.0,5.0);
		Piece piece10 = new Piece("Piece 10",10.0,5.0);
		
		piece[0] = piece0;
		piece[1] = piece1;
		piece[2] = piece2;
		piece[3] = piece3;
		piece[4] = piece4;
		piece[5] = piece5;
		piece[6] = piece6;
		piece[7] = piece7;
		piece[8] = piece8;
		piece[9] = piece9;
		piece[10] = piece10;
		
		Subassembly assembly0 = new Subassembly("Assembly 0" );
		Subassembly assembly1 = new Subassembly("Assembly 1" );
		Subassembly assembly2 = new Subassembly("Assembly 2" );
		Subassembly assembly3 = new Subassembly("Assembly 3" );
		Subassembly assembly4 = new Subassembly("Assembly 4" );
		
		assembly0.add(piece0);
		assembly0.add(assembly1);
		assembly0.add(assembly2);
		assembly1.add(piece1);
		assembly1.add(piece2);
		assembly1.add(piece3);
		assembly2.add(assembly3);
		assembly2.add(assembly4);
		assembly2.add(piece10);
		assembly3.add(piece4);
		assembly3.add(piece5);
		assembly3.add(piece6);
		assembly4.add(piece7);
		assembly4.add(piece8);
		assembly4.add(piece9);
		
		assembly[0] = assembly0;
		assembly[1] = assembly1;
		assembly[2] = assembly2;
		assembly[3] = assembly3;
		assembly[4] = assembly4;
		
	}
	@Test
	public void testCost() {
		assertEquals(110.0,(assembly[0]).getCost(),.01);
	}
	@Test
	public void testTime(){
		assertEquals(5.0,(assembly[0]).getManufactureTime(),.01);
	}
	@Test
	public void testLayout(){
		for (Object p: assembly[0]){
			System.out.println(p);
		}
		//for(Product p : assembly[0]) System.out.println(p);
	}
	@Test
	public void testVistor50(){
		Visitor v = new CostIncreaseVisitor(50);
		System.out.println((assembly[0]).getCost());
		for(Product p:assembly[0]){
			(p).accept(v);
		}
		System.out.println((assembly[0]).getCost());
		
	}
	@Test
	public void testVistor25(){
		Visitor v = new CostIncreaseVisitor(25);
		System.out.println((assembly[0]).getCost());
		for(Product p:assembly[0]){
			(p).accept(v);
		}
		System.out.println((assembly[0]).getCost());
		
	}
	@Test
	public void testVistorNeg25(){
		Visitor v = new CostIncreaseVisitor(-25);
		System.out.println((assembly[0]).getCost());
		for(Product p:assembly[0]){
			p.accept(v);
		}
		System.out.println((assembly[0]).getCost());
		
	}
	@Test
	public void testSorter(){
		Visitor v = new Sorter();
		for(Product p: assembly[0]){
			p.accept(v);
		}
		for (Object p: assembly[0]){
			System.out.println(p);
		}
		
	}

}
