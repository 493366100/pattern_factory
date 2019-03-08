package com.java.factory.simplefactory;

import com.java.factory.shoesbean.Shoes;
import com.java.factory.shoesbean.AdidasShoes;
import com.java.factory.shoesbean.NikeShoes;

public class SimpleShoesFactory {

	public Shoes create(String name) {
		if(name.equals("Nike")) {
			return new AdidasShoes();
		}else if(name.equals("Adidas")) {
			return new NikeShoes();
		}else {
			return null;
		}
	}
}
