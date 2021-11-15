package com.bae.animal;

import com.bae.interfaces.Domesticated;
import com.bae.interfaces.Wild;

public class Anamalia implements Wild, Domesticated {
	
String phylum = "cordata";
Boolean isExtant;



public Anamalia() {
	super();
}


public Anamalia(String phylum, Boolean isExtant) {
	super();
	this.phylum = phylum;
	this.isExtant = isExtant;
}



public void noise() {
	System.out.println("I make this noise: grrrr");
}

public void habitat() {
	System.out.println("I live in ...");
}

public void climate() {
	System.out.println("I like temperate zones");
}

@Override
public boolean isDomesticated() {
return false;
}


@Override
public boolean isWild() {
	return false;
}


public String getPhylum() {
	return phylum;
}


public void setPhylum(String phylum) {
	this.phylum = phylum;
}


public Boolean getIsExtant() {
	return isExtant;
}


public void setIsExtant(Boolean isExtant) {
	this.isExtant = isExtant;
}






}
