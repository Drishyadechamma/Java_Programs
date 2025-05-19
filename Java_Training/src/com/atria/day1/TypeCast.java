package com.atria.day1;

public class TypeCast {
	

		public static void main(String[] args) {
			//implicit
			byte b=10;
			int i=b; //b is stored in i and in the form of integer
			System.out.println(i);
			
			//explicit typecasting 
			float f2=35.42f;
			int f1=(int)f2; // convert f2 to int else error 
			System.out.println(f1);
		}

	}


