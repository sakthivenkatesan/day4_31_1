package com.capgemini.oops;

class universe
{
	void uprint()
	{
		System.out.println("My Universe");
	}
}
class solar extends universe
{
	void sprint()
	{
		System.out.println("Our Solar System");
	}
}
class earth extends solar
{
	void eprint()
	{
		System.out.println("This earth");
	}
}
public class MultiLevelInheritance 
{
	public static void main(String [] args)
	{
			earth e = new earth();
			e.uprint();
			e.sprint();
			e.eprint();
	}
}
