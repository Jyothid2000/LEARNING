package com.kodnest.concepts;

public class MobileApp {
	public static void main(String[] args) {
		Mobile m = new Mobile("Samsung","Purple",125000);
		System.out.println(m.brand+" "+m.color+" "+m.cost);
		m.allowToCall();
		m.allowToPlay();
		
	}

}
