package com.a203;

class A
{
	void a()
	{
		System.out.println("a");
	}
}
class B extends A
{
	void b()
	{
		System.out.println("b");
	}
}

public class SingleEx 
{
	public static void main(String[] args) {
		
		
		B b = new B();
		
		b.a();
		b.b();
		
	}
}
