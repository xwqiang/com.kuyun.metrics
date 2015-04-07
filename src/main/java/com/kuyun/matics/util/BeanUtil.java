package com.kuyun.matics.util;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanUtil {
	private static BeanFactory factory ;
	static{
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {
				"application-context.xml","spring-beans.xml","spring-reporter.xml"});  
		factory = (BeanFactory) ctx; 
	}
	public static <T> T getBean(String name,Class<T> t){
		return factory.getBean(name, t);
	}
	public static Object getBean(String name) {
		return factory.getBean(name);
	}
}
