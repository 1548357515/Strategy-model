package com.strategy;

public class FifteenDay implements Price {

	@Override
	public void calcPrice(double money) {
		System.out.println("��ҵ15��7.8��");
		System.out.println("��������Ϊ" + money * 0.78 + "RMB");
	}

}
