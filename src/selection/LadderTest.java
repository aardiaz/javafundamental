package selection;

public class LadderTest {
	
	/*
	 *    ================= else if =============
	 *    
	 *    syntax :
	 *    
	 *        if(condition-1){
	 *        
	 *        }
	 *        
	 *        else if(condition-2){
	 *        
	 *        }
	 *        
	 *        else if(condition-3){
	 *        
	 *        }
	 *        
	 *        else if(condition-4){
	 *        
	 *        }
	 *        
	 *        .............
	 *        ...............
	 *        else{
	 *        
	 *        }
	 */
	
	public static void main(String[] args) {
		
		
		  int marks = 20;
		  
		  if(marks >= 80) {
			  System.out.println("Distinction !!");
		  }
		  
		  else if(marks >= 60) {
			  System.out.println("First");
		  }
		  
		  else if(marks >= 45) {
			  System.out.println("Second");
		  }
		
		  else if(marks >= 32) {
			  System.out.println("Third");
		  }
		  else {
			  System.out.println("Failed");
		  }
		  
		  
		  
		
	}

}








