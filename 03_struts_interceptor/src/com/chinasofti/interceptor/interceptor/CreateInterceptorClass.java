package com.chinasofti.interceptor.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class CreateInterceptorClass extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("action对象的名字:" + invocation.getAction().getClass().getName());
		System.out.println("resultCode:" + invocation.getResultCode() );
		System.out.println("action配置的名字" + invocation.getProxy().getActionName());
		System.out.println("action的命名空间" + invocation.getProxy().getNamespace());
		System.out.println("action的默认方法名" + invocation.getProxy().getMethod());
		String ret =  invocation.invoke();
		System.out.println("resultCode:" + invocation.getResultCode() );
		System.out.println("action的返回值" + ret);
		return "ret";
	}

}
