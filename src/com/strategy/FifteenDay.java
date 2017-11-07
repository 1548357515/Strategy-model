package com.strategy;

public class FifteenDay implements Price {

	@Override
	public void calcPrice(double money) {
		System.out.println("开业15天7.8折");
		System.out.println("您的消费为" + money * 0.78 + "RMB");
	}

}
