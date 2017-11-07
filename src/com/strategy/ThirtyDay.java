package com.strategy;

public class ThirtyDay implements Price {

	@Override
	public void calcPrice(double money) {
		System.out.println("优惠时间已过！");
		System.out.println("您的消费为" + money  + "RMB");
	}

}
