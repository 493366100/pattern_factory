package com.java.factory.shoesbean;

public class AdidasShoes implements Shoes{

	public AdidasShoes() {
		super();
	}
	
	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("生产出一双阿迪鞋");
	}

}
