package com.javaex.ex01;

public class ListApp {

	public static void main(String[] args) {
		//�簢�� �簢�� ����
		//�� ������
		//�ﰢ�� �ﰢ�� ����
		
		//tk���� ����
		RacList rList = new RacList();
		
		Ractangle r01 = new Ractangle(3, 9);
		Ractangle r02 = new Ractangle(10, 11);
		
		rList.add(r01);
		rList.add(r02);
	    
		Ractangle r100 = rList.get(0);
		r100.draw();
		
		//�� ���� 
		//CircleList cList = new CircleList();
		

	}

}
