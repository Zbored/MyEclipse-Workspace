package com.zbored.shoot;
/** �л�:�Ƿ�����,Ҳ�ǵ��� */
public class Airplane extends FlyingObject implements Enemy {
	private int speed = 2;
	
	/** ���췽�� */
	public Airplane(){
		
	}
	
	/** ��дgetScore() */
	public int getScore(){
		return 5;
	}
}
