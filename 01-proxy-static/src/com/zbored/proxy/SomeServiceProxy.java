package com.zbored.proxy;

// 代理类
import com.zbored.service.ISomeService;
import com.zbored.service.SomeServiceImpl;

public class SomeServiceProxy implements ISomeService {

	private ISomeService target;

	public SomeServiceProxy() {
		super();
		// 创建目标对象
		target = new SomeServiceImpl();
	}

	@Override
	public String doFirst() {
		
		// 代理类调用目标方法
		String result = target.doFirst();
		// 增强就发生在这里
		return result.toUpperCase();
	}

	@Override
	public void doSecond() {
				
		target.doSecond();
		
	}

}
