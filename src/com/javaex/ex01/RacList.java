package com.javaex.ex01;

public class RacList {
	
	//�ʵ�
	private Ractangle[] rArray;
	private int crtPos;
	
	//������
	public RacList() {
		rArray = new Ractangle[3];
		crtPos = 0;
	}
	//�޼ҵ� g/s
	
	//�޼ҵ� �Ϲ�
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
