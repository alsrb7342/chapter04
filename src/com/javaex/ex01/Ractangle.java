package com.javaex.ex01;

public class Ractangle{
	
	//�ʵ�
	private int width;
	private int height;

	//������
	public Ractangle() {
	}
	public Ractangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//�޼ҵ� g/s
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

    //�޼ҵ� �Ϲ�

	public void draw(){
		System.out.println("�簢��(����=" + width + ",  ����=" + height + ")");
	}
	
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + "]";
	}
	



	

}
