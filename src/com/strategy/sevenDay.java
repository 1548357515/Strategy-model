package com.strategy;

public class sevenDay implements Price{

	@Override
	public void calcPrice(double money) {
		System.out.println("��ҵ7�����ۣ���");
		System.out.println("��������Ϊ" + money * 0.5 + "RMB");
	}
	
}
