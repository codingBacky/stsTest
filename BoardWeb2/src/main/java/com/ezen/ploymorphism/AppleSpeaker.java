package com.ezen.ploymorphism;

import org.springframework.stereotype.Component;

@Component("apple")
public class AppleSpeaker implements Speaker{

	@Override
	public void volumUp() {
		System.out.println("AppleSpeaker volumUp");
	}

	@Override
	public void volumDown() {
		System.out.println("AppleSpeaker volumUp");
	}

}
