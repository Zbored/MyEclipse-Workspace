package com.zbored.shoot;
/** С�۷�:�Ƿ�����,Ҳ�ǽ��� */
public class Bee extends FlyingObject implements Award {
	private int xSpeed = 1;//x�����ƶ�
	private int ySpeed = 2;//y�����ƶ�
	private int awardType;//��������
	
	/** ���췽�� */
	public Bee(){
		
	}
	
	/** ��дgetType() */
	public int getType(){
		return awardType;//���ؽ�������(0��1)
	}
}
