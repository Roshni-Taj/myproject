package com.blockchain.java_blockchain_demo;

import java.util.Arrays;

public class blockchainDemo {
	public static void main(String args[])
	{

		Transaction  transaction1 = new Transaction("ponam","sam", 100L);
		Transaction  transaction2 = new Transaction("syeda","sameer", 100L);
		Transaction  transaction3 = new Transaction("peter","ted", 1000L);
		Transaction  transaction4= new Transaction("peter","sam", 1000L);
		
		transaction2.setDestName("amir");
		
		Block firstBlock = new Block(0, Arrays.asList(transaction1,transaction2));
		System.out.println(firstBlock.hashCode());
		Block second = new Block(firstBlock.hashCode(),Arrays.asList(transaction3));
		System.out.println(second.hashCode());
		Block third = new Block(second.hashCode(),Arrays.asList(transaction4));
		System.out.println(third.hashCode());
	}
	

}
