package com.atria.day1;

public class TypeCast2 {


		public static void main(String[] args) {
			// implicit
			int num1 = 10;
	        float f1 = num1;  // int to float
	        System.out.println(f1);
	        
	        float f2 = 9.7f;
	        int num2 = (int) f2;  // float to int (decimal part will be cut off)
	        System.out.println(num2);
	        
	        double d1=34.22d;
	        float d2=(float)d1;
	        System.out.println(d2);

		}

	}


