package project;

import java.util.Scanner;

public class FindMissing {
	public static void main(String[] args) {  
	
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int missing=0;
		int[] arr = new int[n];
		for( int i = 0 ; i < n ; i++ ) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Missing numbers in integer array [" );
		for( int i = 0 ; i < n ; i++ ) {
			System.out.print( arr[i] +" ");
		}
		int see= 1 ;
		for( int i = 0 ; i < n ; i++ ) {
			if(arr[i]==see) {
				see++;
			}
			else {
				 missing = see;
				 break;
			}
			
		}
		System.out.print("] with total number "+n+" is " + missing);
		
		
	}	
}
