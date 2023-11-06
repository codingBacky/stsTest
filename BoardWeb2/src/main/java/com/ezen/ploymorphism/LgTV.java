package com.ezen.ploymorphism;

import org.springframework.stereotype.Component;

@Component
public class LgTV implements TV{

	
	
	public LgTV() {
		System.out.println("LG 생성자");
	}

	@Override
	public void powerOn() {
		System.out.println("LgTV powerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV powerOff");
	}

	@Override
	public void volumUp() {
		System.out.println("LgTV volumUp");
	}

	@Override
	public void volumDown() {
		System.out.println("LgTV volumDown");
	}

}
