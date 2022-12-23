package array;

import java.util.Arrays;

public class ArrayWithMethod {
	/*
	 * ================ Array With Method ==============
	 *  1> array as argument :
	 *  
	 *      
	 *        void sum(float a[]){
	 *        
	 *        }
	 *        sum(array);
	 *      
	 *  2> array as return type :
	 *    
	 *      int[] getData(){
	 *      
	 *        //array = 100,90,50,44,779,90,48,29
	 *      
	 *        return array;
	 *      }
	 *       
	 */
	
	  public static void main(String[] args) {
//		
//		  int data[] = {65,78,9,7,65,78,97,6,57,89,79,87,657,87,68};
//		  
//		  
//		  sum(data);
//		  printArray(data);
		  
		  int[] x = getOddnumsFrom1to100();
		  System.out.println(Arrays.toString(x));
		  
		  
	}
	  
	//1. array as arguments
	 static void sum(int values[]) {
		  
		    int s = 0;
		    
		    for(int x : values) {
		    	s = s + x;
		    }
		    
		    System.out.println("Total = "+s);
	  }
	  
	
	 static  void printArray(int array[]) {
		  
          for(int a : array) {
        	  System.out.println(a);
          }
	  }
	 
	 //2. array return type
	static int[] getOddnumsFrom1to100() {
		 
	         int oddnums[] = new int[50];
	         int j = 0;
			 
			 for(int i=1; i<=100; i++) {
				 
				   if(i%2 != 0) {
					   oddnums[j] = i;
					   j++;
				   }
			 }
			 
			 return oddnums;
	 }
	
	/*
	 * Q1> WAP to print smallest value from given array using method.
	 * Q2> WAP to get odd numbers from given array using method.
	 */
}





