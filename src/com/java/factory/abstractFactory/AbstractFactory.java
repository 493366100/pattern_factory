package com.java.factory.abstractFactory;

import com.java.factory.shoesbean.Shoes;

public abstract class AbstractFactory {
	public abstract Shoes nikeCreate();
	public abstract Shoes adidasCreate();
}
