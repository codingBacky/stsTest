package com.ezen.ploymorphism;

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
