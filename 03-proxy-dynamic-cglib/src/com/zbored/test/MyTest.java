package com.zbored.test;

import com.zbored.factory.MyCglibFactory;
import com.zbored.service.SomeService;

public class MyTest {

	public static void main(String[] args) {
		SomeService service = new MyCglibFactory().myCglibCreator();		
		String result = service.doFirst();
		System.out.println("result = " + result);
		service.doSecond();
	}

}
