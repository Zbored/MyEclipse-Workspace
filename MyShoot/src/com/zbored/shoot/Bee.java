package com.zbored.shoot;
/** 小蜜蜂:是飞行物,也是奖励 */
public class Bee extends FlyingObject implements Award {
	private int xSpeed = 1;//x坐标移动
	private int ySpeed = 2;//y坐标移动
	private int awardType;//奖励类型
	
	/** 构造方法 */
	public Bee(){
		
	}
	
	/** 重写getType() */
	public int getType(){
		return awardType;//返回奖励类型(0或1)
	}
}
