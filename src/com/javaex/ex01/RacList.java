package com.javaex.ex01;

public class RacList {
	
	//필드
	private Ractangle[] rArray;
	private int crtPos;
	
	//생성자
	public RacList() {
		rArray = new Ractangle[3];
		crtPos = 0;
	}
	//메소드 g/s
	
	//메소드 일반
	public void add(Ractangle r) {
		rArray[crtPos] = r;
		crtPos++;
	}

	public Ractangle get(int index) {
		return rArray[index];
	}
	
	public int size() {
		return crtPos;
	}
	
}
