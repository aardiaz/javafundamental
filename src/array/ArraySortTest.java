package array;

import java.util.Arrays;

public class ArraySortTest {
	
	public static void main(String[] args) {
		
		int data[] = {9,87,6,54,32,34,56,76,54,3,45,67,8,76,56,7};
		
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		
		System.out.println("=========== reverse order =========");
		for(int i=data.length-1; i>=0; i--) {
			System.out.print(data[i]+",");
		}
		
		
		Arrays.fill(data, 50);
		Arrays.fill(data, 5, 8, 777);
		Arrays.fill(data, 8, 12, 44);
		 
		System.out.println("\n"+Arrays.toString(data));
		
		int[] newArray = Arrays.copyOf(data, 5); 
		System.out.println(Arrays.toString(newArray));
		System.out.println(Arrays.toString(Arrays.copyOfRange(data, 3, 9)));
	}

}
