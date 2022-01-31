package com.capgemini.oops;
class a
{
	static void print()
	{
		System.out.println("This is parent class A");
	}
}
class b extends a
{
	static void printb()
	{
		System.out.println("This is child class B");
	}
}
public class BasicInheritance 
{
	public static void main(String [] args)
	{
		b ob = new b();
		b.print();
		b.printb();
	}
}
