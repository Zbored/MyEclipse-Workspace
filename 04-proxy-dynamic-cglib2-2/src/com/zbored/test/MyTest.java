package com.zbored.test;

import com.zbored.factory.MyCglibFactory;
import com.zbored.service.ISomeService;

public class MyTest {

	public static void main(String[] args) {
		ISomeService service = new MyCglibFactory().myCglibCreator();		
		String result = service.doFirst();
		System.out.println("result = " + result);
		service.doSecond();
	}

}
