package com.bae.canis;

public class Poodle extends DomesticDog {

	public Poodle() {
		super();
		
	}

	public Poodle(String furColour, Boolean howls) {
		super(furColour, howls);
		
	}

	@Override
	public Boolean howls() {
	
		return super.howls();
	}

	public void noise() {
		System.out.println("I make this noise: yip yip ");
	}

	public void habitat() {
		System.out.println("I live in houses!");
	}

	@Override
	public void climate() {
	
		super.climate();
	}

	@Override
	public boolean isWild() {
		
		return super.isWild();
	}

	@Override
	public boolean isDomesticated() {
	
		return super.isDomesticated();
	}

	@Override
	public String getFurColour() {
		
		return super.getFurColour();
	}

	@Override
	public void setFurColour(String furColour) {
		
		super.setFurColour(furColour);
	}

	@Override
	public Boolean getHowls() {
		
		return super.getHowls();
	}

	@Override
	public void setHowls(Boolean howls) {
		
		super.setHowls(howls);
	}

	@Override
	public String getPhylum() {
		
		return super.getPhylum();
	}

	@Override
	public void setPhylum(String phylum) {
		
		super.setPhylum(phylum);
	}

	@Override
	public Boolean getIsExtant() {
		
		return super.getIsExtant();
	}

	@Override
	public void setIsExtant(Boolean isExtant) {
		
		super.setIsExtant(isExtant);
	}

	
	
	
	
	

}
