package com.java.factory.simplefactory;

import com.java.factory.shoesbean.Shoes;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleShoesFactory factory = new SimpleShoesFactory();
		Shoes nikeShoes = factory.create("Nike");
		Shoes adidaShoes = factory.create("Adidas");
		nikeShoes.create();
		adidaShoes.create();
	}

}
