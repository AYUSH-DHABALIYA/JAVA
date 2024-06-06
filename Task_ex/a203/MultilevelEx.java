package com.a203;

class P
{
	void p()
	{
		System.out.println("P");
	}
}
class Q extends P
{
	void q()
	{
		System.out.println("Q");
	}
}
class R extends Q
{
	void r()
	{
		System.out.println("R");
	}
}


public class MultilevelEx 
{
	public static void main(String[] args) 
	{
		R r = new R();
		
		r.p();
		r.q();
		r.r();
	}
}
