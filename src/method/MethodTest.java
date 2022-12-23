package method;

public class MethodTest {
	
	public static void main(String[] args) {
		
		//sum();
		//area(30, 50);
		
		int x = getSumOf1to100();
		System.out.println("Sum of 1 to 100 ="+x);
		
		int sv = findSmallestValue(35445, 345643);
		System.out.println("Smallest value = "+findSmallestValue(35445, 345643));
	}
	
	//1. no return type with no arguments
	static void sum() {
		
		int a = 9000;
		int b = 5000;
		int s = a + b;
		System.out.println("Total = "+s);
	}
	
	//2. no return type with arguments
	static void area(int l, int b) {
		int ar = l * b;
		System.out.println("Area = "+ar);
	}
	
	//3. return type with no arguments
	static int getSumOf1to100() {
		
	    int s = 0;
		for(int i=1; i<=100; i++) {
			s = s+i;
		}
		
		return s;
	}
	
  //4. return type with arguments
	static int findSmallestValue(int x, int y) {
		
			if(x < y) {
				return x;
			}else {
				return y;
			}
	}
	
}







