package com.ezen.ploymorphism;

public class SonySpeaker implements Speaker{

	@Override
	public void volumUp() {
		System.out.println("SonySpeaker volumUp");
	}

	@Override
	public void volumDown() {
		System.out.println("SonySpeaker volumDown");
	}

}
