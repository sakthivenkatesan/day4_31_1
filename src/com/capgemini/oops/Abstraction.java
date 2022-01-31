package com.capgemini.oops;

abstract  class Mobile
{
	final int price=1000;
	//abstract method
	abstract public void voicecalling();
   abstract public void videocalling();	
	//non abstract method
	public void chargingtype()
	{
		System.out.println("USB charging");
	}
}
class Google extends Mobile
{
	public void voicecalling() {
		System.out.println("4g Voice calling");
	}
	public void videocalling() {
		System.out.println("HD video calling");
	}
	public void os()
	{
		System.out.println("Android Operating System");
	}
}
class Apple extends Mobile
{
	public void voicecalling() {
	}
	public void videocalling() {
	}
	public void OS()
	{
		System.out.println("Apple IOS");
	}
	public void Processor()
	{
		System.out.println("M1 pro chip");
	}
}
public class Abstraction {
	public static void main(String args[])
	{
	Google gPlus=new Google();
	gPlus.voicecalling();
	gPlus.videocalling();
	gPlus.chargingtype();
	gPlus.os();
	//Apple 
	Apple plus12=new Apple();
	plus12.Processor();
	plus12.OS();
	plus12.chargingtype();
	}
}