
public class DataType {
	
	/*
	 * ====================== Data Type ==========================
	 * 
	 *   # proper data representation
	 *   # proper memory allocation
	 *   # proper operation to be perform.
	 *   
	 *   # Types :
	 *   
	 *    1> primitive
	 *    	a> byte
	 *    	b> short
	 *    	c> int
	 *    	d> long
	 *    	e> float
	 *    	f> double
	 *    	g> char        '1','z','@'
	 *    	h> boolean     true/false
	 *    
	 *    2> non-primitive
	 *    	a> String 
	 *    	b> Array
	 *    	c> Classes
	 *    	d> Collection
	 *   
	 */
	
	  public static void main(String[] args) {
		  
		  long a = 600000000000l;
		  float k = 2.5f;
		  
		  System.out.println("byte = "+Byte.SIZE+" "+Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
		  System.out.println("short = "+Short.SIZE+" "+Short.MIN_VALUE+" "+Short.MAX_VALUE);
		  System.out.println("int = "+Integer.SIZE+" "+Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
		  System.out.println("long = "+Long.SIZE+" "+Long.MIN_VALUE+" "+Long.MAX_VALUE);
		  System.out.println("float = "+Float.SIZE+" "+Float.MIN_VALUE+" "+Float.MAX_VALUE);
		  System.out.println("double = "+Double.SIZE+" "+Double.MIN_VALUE+" "+Double.MAX_VALUE);
	}

}








