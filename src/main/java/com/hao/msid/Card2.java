package com.hao.msid;

public class Card2 implements Card {

	private StringBuffer sb = null;
	
	public Card2() {
		sb = new StringBuffer();
	}
	
	public String read() {
		// TODO Auto-generated method stub
		return sb.toString();
	}

	public void write(String string) {
		// TODO Auto-generated method stub
		sb.setLength(0);
		sb.append(string);
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(sb.toString());
	}

	public void setSb(String string) {
		write(string);
	}

	public String getSb() {
		return read();
	}
}
