package com.strategy;

public class TestPrice {
	public static void main(String[] args) {
		
		//ѡ�񲢴�����Ҫʹ�õĲ��Զ���  
		Price price = new sevenDay();
		//��������
		Strategy strategy = new Strategy(price);
		//���÷�������۸�
		strategy.show(324);
		
		//ѡ�񲢴�����Ҫʹ�õĲ��Զ���
		Price price1 = new FifteenDay();
		//��������
		Strategy strategy1 = new Strategy(price1);
		//���÷�������۸�
		strategy1.show(276);
		
		//ѡ�񲢴�����Ҫʹ�õĲ��Զ���
		Price price2 = new ThirtyDay();
		//��������
		Strategy strategy2 = new Strategy(price2);
		//���÷�������۸�
		strategy2.show(0);
	}
}
