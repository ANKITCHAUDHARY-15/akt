/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    int ma=max(arr);
		    ArrayList<Integer> fibo=new ArrayList<Integer>();
		     fibo.add(0);
		     fibo.add(1);
		     for(int i=2;fibo.get(i-1)<ma;i++){
		         fibo.add(fibo.get(i-1)+fibo.get(i-2));
		     }
		     for(int i=0;i<n;i++){
		         if(fibo.contains(arr[i])){
		             System.out.print(arr[i]+" ");
		         }
		     }
		     System.out.println();
		}
	}
	static int max(int arr[]){
	    int max=arr[0];
	    for(int i=1;i<arr.length;i++){
	        if(arr[i]>max)
	            max=arr[i];
	    }
	    return max;
	}
}
