package com.bae.main;

import com.bae.animal.Anamalia;
import com.bae.canis.DomesticDog;
import com.bae.canis.GreyWolf;
import com.bae.canis.Poodle;

public class Runner {

	public static void main(String[] args) {
		Anamalia greyWolf = new GreyWolf("grey", true);
		System.out.println("Grey wolves are wild? " + greyWolf.isWild());
		((GreyWolf) greyWolf).howls();
		greyWolf.setIsExtant(true);
		System.out.println("Grey wolves are in the pyylum" + greyWolf.getPhylum());
		greyWolf.noise();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Anamalia dog = new DomesticDog();
		System.out.println("Dogs are wild? " +dog.isWild());
		((DomesticDog) dog).howls();
		dog.setIsExtant(true);
		System.out.println("Domestic Dogs are in the pyylum" + dog.getPhylum());
		dog.climate();
		dog.noise();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Anamalia poodle = new Poodle();
		System.out.println("Poodles are wild? " +poodle.isWild());
		((Poodle) poodle).howls();
		poodle.setIsExtant(true);
		System.out.println("Poodles are in the pyylum" + poodle.getPhylum());
		poodle.climate();
		poodle.noise();
		((DomesticDog) poodle).setFurColour("white");
		poodle.habitat();
		
	}

}
