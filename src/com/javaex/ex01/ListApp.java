package com.javaex.ex01;

public class ListApp {

	public static void main(String[] args) {
		//사각형 사각형 끼지
		//원 원끼리
		//삼각형 삼각형 끼리
		
		//tk각형 관리
		RacList rList = new RacList();
		
		Ractangle r01 = new Ractangle(3, 9);
		Ractangle r02 = new Ractangle(10, 11);
		
		rList.add(r01);
		rList.add(r02);
	    
		Ractangle r100 = rList.get(0);
		r100.draw();
		
		//원 관리 
		//CircleList cList = new CircleList();
		

	}

}
