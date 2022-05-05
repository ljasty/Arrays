package Arrays;

import java.util.Scanner;

public class MissIngNumber {
	
	   public static void main(String[] args) {  
		   int n=10;
		   int a[]= {1,2,3,4,5,7,8,9,10};
		   int msum=0;
		   
		   int sum= (n*(n+1))/2;
		   for(int i=0;i<a.length;i++)
		   {
			   msum=msum+a[i];
		   }
		   int missingNum=sum-msum;
		   System.out.println("Missing number is" +missingNum);
		    
		   
	/*   Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the range ");
	      int n=sc.nextInt();
	      
	      int missingN[]=new int[n];
	      System.out.println("enter n-1 range");
	      for(int i=0;i<=n-2;i++) {
	    	  missingN[i]=sc.nextInt();
	      }
	      
	      int sumOfAll=(n*(n+1))/2;
	      int sumOfMissing=0;
	      for(int i=0;i<=n-2;i++) {
	    	  sumOfMissing=sumOfMissing+missingN[i];
	      }
	      int missingNumber=sumOfAll-sumOfMissing;
	    System.out.println("MissingNumber"+missingNumber);  */
	 
	    
	    
	    
	       
	   }
	}


