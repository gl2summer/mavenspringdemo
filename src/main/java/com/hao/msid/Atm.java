package com.hao.msid;

public class Atm {

	private Card card = null;
	
	public Atm() {
	}

	public Atm(Card card) {
		this.card = card;
	}

	public void setCard(Card card) {
		this.card = card;
	}
	public Card getCard() {
		return this.card;
	}
	
	public void print() {
		if(card != null) {
			card.print();
		}
	}
}
