package com.zbored.test;

import com.zbored.proxy.SomeServiceProxy;
import com.zbored.service.ISomeService;

public class MyTest {

	public static void main(String[] args) {

		ISomeService service = new SomeServiceProxy();
		String result = service.doFirst();
		System.out.println("result = " + result);
		service.doSecond();
	}

}
