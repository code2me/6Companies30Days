// https://practice.geeksforgeeks.org/problems/run-length-encoding/1/#

import java.util.*;
 
class Q4_Fourth
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}



class GfG
 {
	String encode(String str)
	{
	   char src[] = str.toCharArray();   
       int count=1,n=src.length;
       String ans="";
       ans+=src[0];
       for(int i=1;i<n;i++) {
           if(src[i]==src[i-1]) {
               count++;
           } else {
               ans+=count;
               ans+=src[i];
               count=1;
           }
       }
       ans+=count;  
       return ans;
	}
	
 }
