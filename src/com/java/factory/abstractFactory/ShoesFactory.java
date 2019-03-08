package com.java.factory.abstractFactory;

import com.java.factory.factoryMethod.AdidasFactory;
import com.java.factory.factoryMethod.NikeFactory;
import com.java.factory.shoesbean.Shoes;

public class ShoesFactory extends AbstractFactory {

	@Override
	public Shoes nikeCreate() {
		// TODO Auto-generated method stub
		return new NikeFactory().create();
	}

	@Override
	public Shoes adidasCreate() {
		// TODO Auto-generated method stub
		return new AdidasFactory().create();
	}

}
