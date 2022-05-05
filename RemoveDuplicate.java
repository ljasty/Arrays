package Arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;

// 8)write a java program to remove duplicate numbers in given array?
 public class RemoveDuplicate {
/*public static int removeDuplicate(int arr[],int n)
{
	if(n==0||n==1) {
		return n;
	}
	int j=0;
	int temp[]=new int[n];
	for(int i=0;i<n-1;i++) {
		if(arr[i]!=arr[i+1]) {
			temp[j++]=arr[i];
		}
	}
	temp[j++]=arr[n-1];
	for(int i=0;i<j;i++) {
	arr[i]=temp[i];
	}
	return j;
}  
				
	
	
	public static void main(String[] args) {
		
		int array[]= {1,5,7,3,6,5,7};
		Arrays.sort(array);
		int length=array.length;
		length=removeDuplicate(array,length);
		for(int i=0;i<length;i++)
		{
			System.out.println(array[i]);
		}
		
	}
	
}  */




public static void main(String[] args) {
    int arr[]= {7,5,9,8,6,4,7,5};
    Arrays.sort(arr);
    int j=0;
    for(int i=0;i<arr.length-1;i++ ) {
    	if(arr[i]!=arr[i+1]) {
    		arr[j]=arr[i];
      j++;
}
 }
 arr[j]=arr[arr.length-1];
 for(int i=0;i<=j;i++) {
	 System.out.println(arr[i]);
 }
 

    		
}
 }   
 
 /* public static void main(String[] args) {
	

          int a[] = {1,4,2,6,8,6,7,5,2,8};
          LinkedHashSet<Integer> lset= new LinkedHashSet<>();
                  for (int i=0;i<a.length;i++) {
                   lset.add(a[i]);
                  }
       
        System.out.print(lset);
    
  
   
    }
}
   */
  

