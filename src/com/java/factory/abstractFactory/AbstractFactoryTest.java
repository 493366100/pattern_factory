package com.java.factory.abstractFactory;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoesFactory factory = new ShoesFactory();
		//制造一双耐克鞋
		factory.nikeCreate().create();
		//制造一双阿迪鞋
		factory.adidasCreate().create();
	}
}
