package com.strategy;
/**
 * ������ɫ��
 * @author Administrator
 *
 */
public class Strategy {
	//������ԵĶ���
	private Price price ;
	
	//���췽��������һ�����Զ���
	public Strategy(Price price){
		this.price = price;
	}
	
	//���Է���
	public void show(double money){
		this.price.calcPrice(money);
	}
}
