/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int first_no=sc.nextInt();
		    int second_no=sc.nextInt();
		    int sum=0;
		    for(int i=1;i<=first_no/2;i++){
		        if(first_no%i==0){
		            sum+=i;
		            
		        }
		    }
		    if(sum==second_no){
		        sum=0;
		      for(int i=1;i<=second_no/2;i++){
		        if(second_no%i==0){
		            sum+=i;
		             
		        }
		    }
		    if(sum==first_no){
		        System.out.println(1);
		    }
		    else
		        System.out.println(0);
		    }
		    else
		        System.out.println(0);
		}
	}
}
