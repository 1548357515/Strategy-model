package com.strategy;
/**
 * 抽象策略类  接口
 * @author Administrator
 *
 */
public interface Price {
	/**
	 * 策略方法  计算金额
	 * @param money  RMB
	 */
     void calcPrice (double money);
}
