package Arrays;
//write a java program to find second largest element in an array of integers?
public class SecondLargest {
 public static void main(String[] args) {
	
	int array[]= {23,43,47,89,75};
	int n=array.length;
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(array[i]>array[j]) {
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		
	}
System.out.println("Secocnd Largest"+array[n-2]);	
	
}
}
