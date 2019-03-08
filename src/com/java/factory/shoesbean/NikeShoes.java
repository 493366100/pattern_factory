package com.java.factory.shoesbean;

public class NikeShoes implements Shoes{

	public NikeShoes() {
		super();
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("生产出一双耐克鞋");
	}

}
