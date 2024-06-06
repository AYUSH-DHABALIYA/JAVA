package com.a203;

interface Print
{
	void print();
}
interface Show
{
	void show();
}


public class Data implements Print,Show
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("showing");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("printing");
	}

	public static void main(String[] args) {
		
		Data d = new Data();
		
		d.print();
		d.show();
	}
}
