package com.a203;

class Q1
{
	void q1()
	{
		System.out.println("q1");
	}
}
class W1 extends Q1
{
	void w1()
	{
		System.out.println("w1");
	}
}
interface E1 
{
	void e1();

}
class R1 extends W1 implements E1
{
	void r1()
	{
		System.out.println("R1");
	}

	@Override
	public void e1() 
	{
		// TODO Auto-generated method stub
		System.out.println("E1");
	}
}


public class HybridEx 
{
	public static void main(String[] args) 
	{
		R1 r = new R1();
		
		r.e1();
		r.q1();
		r.r1();
		r.w1();
	}
}
