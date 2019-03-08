package com.java.factory.factoryMethod;

import com.java.factory.shoesbean.AdidasShoes;
import com.java.factory.shoesbean.Shoes;

public class AdidasFactory implements ShoesFactory{

	@Override
	public Shoes create() {
		// TODO Auto-generated method stub
		return new AdidasShoes();
	}

}
