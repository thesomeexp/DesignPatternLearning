package com.someexp.DesignPatternLearning;

public class CloneTest implements Cloneable{
	
	public String nameString;
	
	@Override
	public CloneTest clone() throws CloneNotSupportedException {
		return (CloneTest) super.clone();
	}

	public void print() {
		System.out.println(this.toString() + " " + this.nameString + " " +
				System.identityHashCode(this));
	}
	
	public static void main(String[] args) throws Exception {
		CloneTest cloneTest1 = new CloneTest();
		cloneTest1.nameString = "String1";
		cloneTest1.print();
		
		CloneTest cloneTest2 = cloneTest1.clone();
	}
}