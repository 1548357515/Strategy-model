package com.strategy;

public class ThirtyDay implements Price {

	@Override
	public void calcPrice(double money) {
		System.out.println("�Ż�ʱ���ѹ���");
		System.out.println("��������Ϊ" + money  + "RMB");
	}

}
