package Preparation;

import java.util.Arrays;

public class ToCheckArraysAreEqualOrNot {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {1,2,3,4};
		
		boolean res =Arrays.equals(a, b);
		System.out.println(res);
		if(res==true)
		{
			System.out.println("both arrays are equal");
		}
		else
		{
			System.out.println("both arrays are not equal");
		}
	  

	}

}
