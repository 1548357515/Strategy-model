package com.strategy;
/**
 * 环境角色类
 * @author Administrator
 *
 */
public class Strategy {
	//具体策略的对象
	private Price price ;
	
	//构造方法，传入一个策略对象
	public Strategy(Price price){
		this.price = price;
	}
	
	//策略方法
	public void show(double money){
		this.price.calcPrice(money);
	}
}
