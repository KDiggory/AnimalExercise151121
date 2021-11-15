package com.bae.canis;

public class DomesticDog extends Canis{

	
	String furColour = "brown";
	Boolean howls = true;
	
	public DomesticDog(String furColour, Boolean howls) {
		super();
		this.furColour = furColour;
		this.howls = howls;
	}
	public DomesticDog() {
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
		System.out.println("I make this noise: woof woof ");
	}

	public void habitat() {
		System.out.println("I live in houses");
	}

	public void climate() {
		System.out.println("I like warm cushions");
	}

	

	@Override
	public boolean isWild() { 
		return false;
	}

	@Override
	public boolean isDomesticated() {
		return true;
	}
	@Override
	public String getFurColour() {
		// TODO Auto-generated method stub
		return super.getFurColour();
	}
	@Override
	public void setFurColour(String furColour) {
		// TODO Auto-generated method stub
		super.setFurColour(furColour);
	}
	@Override
	public Boolean getHowls() {
		// TODO Auto-generated method stub
		return super.getHowls();
	}
	@Override
	public void setHowls(Boolean howls) {
		// TODO Auto-generated method stub
		super.setHowls(howls);
	}
	@Override
	public String getPhylum() {
		// TODO Auto-generated method stub
		return super.getPhylum();
	}
	@Override
	public void setPhylum(String phylum) {
		// TODO Auto-generated method stub
		super.setPhylum(phylum);
	}
	@Override
	public Boolean getIsExtant() {
		// TODO Auto-generated method stub
		return super.getIsExtant();
	}
	@Override
	public void setIsExtant(Boolean isExtant) {
		// TODO Auto-generated method stub
		super.setIsExtant(isExtant);
	}

}
