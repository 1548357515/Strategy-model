package com.strategy;

public class TestPrice {
	public static void main(String[] args) {
		
		//选择并创建需要使用的策略对象  
		Price price = new sevenDay();
		//创建环境
		Strategy strategy = new Strategy(price);
		//调用方法计算价格
		strategy.show(324);
		
		//选择并创建需要使用的策略对象
		Price price1 = new FifteenDay();
		//创建环境
		Strategy strategy1 = new Strategy(price1);
		//调用方法计算价格
		strategy1.show(276);
		
		//选择并创建需要使用的策略对象
		Price price2 = new ThirtyDay();
		//创建环境
		Strategy strategy2 = new Strategy(price2);
		//调用方法计算价格
		strategy2.show(0);
	}
}
