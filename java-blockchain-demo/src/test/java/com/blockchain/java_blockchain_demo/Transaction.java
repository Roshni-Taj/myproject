package com.blockchain.java_blockchain_demo;


public class Transaction 
{
private String sourceName;
private String destName;
private Long sum;
public Transaction(String sourceName, String destName, Long sum) {
	
	this.sourceName = sourceName;
	this.destName = destName;
	this.sum = sum;
}
public String getSourceName() {
	return sourceName;
}
public void setSourceName(String sourceName) {
	this.sourceName = sourceName;
}
public String getDestName() {
	return destName;
}
public void setDestName(String destName) {
	this.destName = destName;
}
public Long getSum() {
	return sum;
}
public void setSum(Long sum) {
	this.sum = sum;
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}



}

