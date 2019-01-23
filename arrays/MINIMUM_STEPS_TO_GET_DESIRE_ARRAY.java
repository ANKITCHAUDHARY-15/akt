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
		    int arr[]=new int[n];
		    int brr[]=new int[n];
		    for(int i=0;i<n;i++){
		         arr[i]=sc.nextInt();
		    }
		    
		    int count=0;
		    while(true)
		    {
		        int flag=0;
		        count+=1;
		       for(int i=0;i<n;i++){
		        count+=arr[i]%2;
		        arr[i]/=2;
		        if(arr[i]==0){
		            flag+=1;
		        }
		    }
		    if(flag>=n){
		        break;
		    }
		    }
		    System.out.println(count-1);
		}
	}
}
