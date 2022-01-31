package com.capgemini.oops;

interface universe
{
	void uprint()
	{
		System.out.println("My Universe");
	}
}
class solar 
{
	void sprint()
	{
		System.out.println("Our Solar System");
	}
}
class earth extends solar implements universe
{
	void eprint()
	{
		System.out.println("This earth");
	}
}
public class MultipleInheritance 
{
	public static void main(String [] args)
	{
			earth e = new earth();
			e.uprint();
			e.sprint();
			e.eprint();
	}
}
