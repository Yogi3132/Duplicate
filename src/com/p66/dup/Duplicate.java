package com.p66.dup;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an array");
		String str=sc.nextLine();
		int in=0;
		int n=str.length();
		char arr[]=str.toCharArray();
		
			for (int i=0; i<n; i++) { 
		         
			   
			     int j;   
			     for (j=0; j<i; j++)  
			     { if (arr[i] == arr[j]) 
			           break;
			     }
			       
			     
			     if (j == i) 
			    	 arr[in++]=arr[i];
			}
			str=String.valueOf(Arrays.copyOf(arr,in));
			System.out.println(str);
			
			
	}
	}
		
		
		
		
		
		
		
		
		
		
	
	



