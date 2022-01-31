package com.capgemini.oops;

class solar
{
	void sprint()
	{
		System.out.println("Parent class aka Solar System");
	}
}
class mercury extends solar
{
	void mprint()
	{
		System.out.println("Child Class aka Mercury");
	}
}
class venus extends solar
{
	void vprint()
	{
		System.out.println("Child Class aka Venus");
	}
}
class earth extends solar
{
	void eprint()
	{
		System.out.println("Child Class aka Earth");
	}
}
class mars extends solar
{
	void maprint()
	{
		System.out.println("Child Class aka Mars");
	}
}
class jupiter extends solar
{
	void jprint()
	{
		System.out.println("Child Class aka Jupiter");
	}
}
class saturn extends solar
{
	void saprint()
	{
		System.out.println("Child Class aka Saturn");
	}
}
class uranus extends solar
{
	void uprint()
	{
		System.out.println("Child Class aka Uranus");
	}
}
class neptune extends solar
{
	void nprint()
	{
		System.out.println("Child Class aka Neptune");
	}
}
public class HierarchicalInheritance 
{
	public static void main(String [] args)
	{
			mercury m = new mercury();
			m.sprint();
			m.mprint();
			venus v = new venus();
			v.sprint();
			v.vprint();
			earth e = new earth();
			e.sprint();
			e.eprint();
			mars ma = new mars();
			ma.sprint();
			ma.maprint();
			jupiter j = new jupiter();
			j.sprint();
			j.jprint();
			saturn s = new saturn();
			s.sprint();
			s.saprint();
			uranus u = new uranus();
			u.sprint();
			u.uprint();
			neptune n = new neptune();
			n.sprint();
			n.nprint();
	}
}
