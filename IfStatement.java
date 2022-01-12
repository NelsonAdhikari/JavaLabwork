package atm;

public class IfStatement {
     public static void main(String[]args) {
    	 int num=123;
    	 if(num%2==0) {
    		 System.out.println("It is even");
    	 }
    	 else{
    		 System.out.println("It is odd");
         }
    
        boolean b=true;
        if(b!=false) {
        	System.out.println("Hello,I'm Nelson");
        }
        
      int day=2;
      if(day==1) {
    	  System.out.println("Sunday");
      }
      if(day==2) {
    	  System.out.println("Monday");
      }
      else if(day==3) {
    	  System.out.println("Tuesday");
      }
      else if(day==4) {
    	  System.out.println("Wednesday");
      }
      else if(day==5) {
    	  System.out.println("Thursday");
      }
      else if(day==6) {
    	  System.out.println("Friday");
      }
      else if(day==7) {
    	  System.out.println("Saturday");
      }
      else {
    	  System.out.println("Invalid Output!!");
      }
     }
}
