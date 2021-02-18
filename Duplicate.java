package project;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElemInArray {
	public static void main(String[] args) {  
	

		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int dup=0;
		int[] arr = new int[n];
		for( int i = 0 ; i < n ; i++ ) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Array with duplicate ");
		for( int i = 0 ; i < n ; i++ ) {
			System.out.print(arr[i] +" ");
		}
		  Arrays.sort(arr);    
		  
		  for( int i = 0 ; i < n ; i++ ) {
		if(arr[i]==arr[i+1]) {
			arr[i+1]=dup;
			
		}
			
		  }
		  
		  
		System.out.print("Array without duplicate ");
		for( int i = 0 ; i < n ; i++ ) {
			System.out.print(arr[i] +" ");
		}
	}  
	

}
