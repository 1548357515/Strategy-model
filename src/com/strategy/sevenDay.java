package com.strategy;

public class sevenDay implements Price{

	@Override
	public void calcPrice(double money) {
		System.out.println("开业7天五折！！");
		System.out.println("您的消费为" + money * 0.5 + "RMB");
	}
	
}
