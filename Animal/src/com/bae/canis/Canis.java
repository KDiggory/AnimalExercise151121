package com.bae.canis;

import com.bae.animal.Anamalia;


public class Canis extends Anamalia {
	
	String furColour;
	Boolean howls;
	
	public Canis() {
		super();
		
	}
	
	public Boolean howls() {
		howls = true;
		return howls;
	}

	public String getFurColour() {
		return furColour;
	}

	public void setFurColour(String furColour) {
		this.furColour = furColour;
	}

	public Boolean getHowls() {
		return howls;
	}

	public void setHowls(Boolean howls) {
		this.howls = howls;
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
