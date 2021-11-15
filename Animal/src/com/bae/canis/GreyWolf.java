package com.bae.canis;

import com.bae.interfaces.Wild;

public class GreyWolf extends Canis {
	
	String furColour;
	Boolean howls;
	
	public GreyWolf(String furColour, Boolean howls) {
		super();
		this.furColour = furColour;
		this.howls = howls;
	}
	public GreyWolf() {
		super();
	}
	
	public Boolean howls() {
		howls = true;
		if (howls == true) {
			System.out.println("Hoooooooooooooooooo");
		}
		return howls;
	}
	
	public void noise() {
		System.out.println("I make this noise: growl ");
	}

	public void habitat() {
		System.out.println("I live in forests");
	}

	public void climate() {
		System.out.println("I like temperate zones and cold zones");
	}

	

	@Override
	public boolean isWild() {
		return true;
	}

	@Override
	public boolean isDomesticated() {
		return false;
	}


}
