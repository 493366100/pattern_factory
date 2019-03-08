package com.java.factory.factoryMethod;

import com.java.factory.shoesbean.Shoes;

public class FactoryMethodTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoesFactory nikefactory = new NikeFactory();
		Shoes nikeShoes = nikefactory.create();
		nikeShoes.create();
		
		ShoesFactory adidasfactory = new AdidasFactory();
		Shoes adidaShoes = adidasfactory.create();
		adidaShoes.create();
	}
}
