package com.ezen.ploymorphism;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public SamsungTV() {
		System.out.println("삼성 생성자 실행됨");
	}
	
	public SamsungTV(Speaker speaker){
		this.speaker = speaker;
		System.out.println("소니 스피커 생성자");
	}
	
	public SamsungTV(Speaker speaker, int price){
		this.speaker = speaker;
		this.price = price;
		System.out.println("삼성 생성자 :" + price);
	}
	public void initMethod() {
		System.out.println("생성자 initMethod 초기화 문장 기입");
	}
	
	public void destroyMethod() {
		System.out.println("객체 소멸시 구동");
	}
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV powerOn" + price);
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV powerOff");
	}

	@Override
	public void volumUp() {
//		speaker = new SonySpeaker();
		speaker.volumUp();
	}

	@Override
	public void volumDown() {
		speaker.volumDown();
	}

}
