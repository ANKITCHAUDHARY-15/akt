
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int []arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[sc.nextInt()-1]++;
		    }
		    int r=0,m=n;
		    for(int i=n-1;i>=0;i--){
		        if(arr[i]==0){
		            m=i+1;
		        }
		        if(arr[i]>=2){
		            r=i+1;
		        }
		    }
 		    System.out.println(r+" "+m);
		}
	}
}
