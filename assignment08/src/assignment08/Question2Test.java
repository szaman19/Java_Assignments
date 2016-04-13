package assignment08;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class Question2Test {

	@Test
	public void test() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random r = new Random(); // this is java.util.Random
		int count = 0;
		for(int i = 0; i < 100; i++) {
			int j = r.nextInt(1000);
			list.add(j);
			count += j;
		}
		int recSum = Question2.recursiveSum(list);
		Assert.assertEquals(recSum,count);
		
	}
	
	@Test 
	public void emptyTest(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int recSum = Question2.recursiveSum(list);
		Assert.assertEquals(0,recSum);
	}
	@Test
	public void nullTest(){
		ArrayList <Integer> list = new ArrayList<Integer>();
		list = null;
		int recSum = Question2.recursiveSum(list);
		Assert.assertEquals(0, recSum);
	}
	
	@Test 
	public void nullElementTest(){
		ArrayList <Integer> list = new ArrayList<Integer>();
		list.add(null);
		list.add(2);
		int recSum = Question2.recursiveSum(list);
		Assert.assertEquals(2, recSum);
		
	}
	

}
