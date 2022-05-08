
package app;
import java.util.Scanner;

import lib.Calculator;

public class GoodCalc extends Calculator{
	public int add(int a, int b) {
		return a+b;
	}
	public int subtract(int a, int b) {
		return a-b;
	}
	public double average(int a[]) {
		double sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum/a.length;
	}
	public static void main(String[] args) {

		Calculator c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] {2,3,4}));
		
		
		//7¹ø¹®Á¦
		String a7 = "Hello";
		String b7 = "Hello";
		String c7 = "Java";
		String d7 = new String("Hello");
		String e7 = new String("Java");
		String f7 = new String("Java");
		if(f7.equals(c7)) {
			System.out.println("true");
		}
	}

}

