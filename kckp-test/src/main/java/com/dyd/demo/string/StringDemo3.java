package com.dyd.demo.string;

public class StringDemo3 {

	public static int getValue(int i) {

		int result = 0;
		switch (i) {
		case 1:
			result = result + i;
		case 2:
			result = result + i * 2;
			
		case 3:
			result = result + i * 3;
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println(getValue(2));
	}
}
