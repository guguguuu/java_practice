package com.chain.test;

public class chain{
	public static void main(String[] args){
		chain ch = new chain();
		try{
			ch.test2();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void test1() throws DrunkException{
		throw new DrunkException("aaasd");
	}	
	public void test2(){
		try{
			test1();
		}catch(DrunkException e){
			RuntimeException run = new RuntimeException("aaa");
			run.initCause(e);
			throw run;
		}
} 
}
