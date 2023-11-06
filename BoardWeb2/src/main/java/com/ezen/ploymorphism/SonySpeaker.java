package com.ezen.ploymorphism;

import org.springframework.stereotype.Component;

@Component("sony")
public class SonySpeaker implements Speaker{
	
	
	
	public SonySpeaker() {
		System.out.println("SonySpeaker 생성자");
	}

	@Override
	public void volumUp() {
		System.out.println("SonySpeaker volumUp");
	}

	@Override
	public void volumDown() {
		System.out.println("SonySpeaker volumDown");
	}

}
