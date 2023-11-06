package com.ezen.ploymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvUser {
	public static void main(String[] args) {
		
		//1. 스프링 컨테이너 구동
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		/*
		 * //2. 스프링 컨테이너에서 필요한 빈을 요청 TV tv = factory.getBean("tv", SamsungTV.class); //
		 * tv.powerOn(); // tv.volumUp();
		 * 
		 * 
		 * TV tv2 = (TV) factory.getBean("tv"); // tv2.powerOn(); // tv2.volumUp();
		 * 
		 * tv.powerOn(); tv.volumUp(); tv.volumDown();
		 */
		TV tv = factory.getBean("samsung",TV.class);
		tv.powerOn();
		tv.volumUp();
		factory.close();
	}
}
