package Arrays;
//write a java program find largest and smallest number in unsorted array?
public class LargestAndSmallest {
	public static void main(String[] args) {
		
		int a[]= {2,3,8,6,14,7};
		int largest =a[0] ,smallest=a[0];
		for (int i=0;i<a.length;i++)
		{ 
			if(a[i]>largest)
				largest=a[i];
			else if(a[i]<smallest)
			smallest=a[i];
			
		}
		System.out.println("Largest number is"+largest);
		System.out.println("Smallest number is "+smallest);
		
	}
}
			
	
		
	
	
	


