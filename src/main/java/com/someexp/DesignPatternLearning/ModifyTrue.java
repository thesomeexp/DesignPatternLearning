package com.someexp.DesignPatternLearning;

public class ModifyTrue {
	public static void main(String[] args) throws Exception{
//		System.out.println(true);
		String s1 = String.valueOf(true);
		System.out.println("s1:" + s1 + " " + System.identityHashCode(s1));
		
		String s2 = "true";
		Class clzClass = s2.getClass();
		java.lang.reflect.Field field = clzClass.getDeclaredField("value");
		field.setAccessible(true);
		char[] ch = (char[]) field.get(s2);
		ch[1]='*';
		ch[2]='*';
		System.out.println("s2:" + s2 + " " + System.identityHashCode(s2));
		
		boolean b1 = true;
		System.out.println(b1);
		
	}
}
