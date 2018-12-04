package com.blockchain.java_blockchain_demo;
import java.util.List;
import java.util.*;
public class Block {
	private int previousHash;
	private List<Transaction> transaction;
	
	public Block(int previousHash, List<Transaction> transaction) {
		this.previousHash = previousHash;
		this.transaction = transaction;
	}
	
	public int getPreviousHash() {
		return previousHash;
	}
	
	public void setPreviousHash(int previousHash) {
		this.previousHash = previousHash;
	}
	
	public List<Transaction> getTransaction() {
		return transaction;
	}
	
	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	

}
