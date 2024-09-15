package TargetQuestions;

public class quest1 {
	
  public static String verifyIsFibonacci(int number){
	    int n1 = 0, n2 = 1;
	    
	    while(n1 <= number){
	    	int temp = n2;
	    	n2 = n1 + n2;
	    	n1 = temp;
	    	
	    	if(n1 == number){
	    		return "The number " + number + " is a Fibonacci number";
	    	}
	    }
	    return "The number " + number + " is not a Fibonacci number";
  }
  
  public static void main(String[] args) {
	  System.out.println(verifyIsFibonacci(8));
  }
  
}
