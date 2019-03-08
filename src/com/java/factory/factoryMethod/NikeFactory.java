package com.java.factory.factoryMethod;

import com.java.factory.shoesbean.NikeShoes;
import com.java.factory.shoesbean.Shoes;

public class NikeFactory implements ShoesFactory{

	@Override
	public Shoes create() {
		// TODO Auto-generated method stub
		return new NikeShoes();
	}

}
