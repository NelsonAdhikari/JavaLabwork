
package atm;
import java.util.Scanner;

public class Onenumtoother {
    public static void main(String[]args) {
    	Scanner input= new Scanner(System.in);
    	System.out.println("Enter the first number:");
    	int n1=input.nextInt();
    	System.out.println("Enter the Second number:");
    	int n2= input.nextInt();
    	for(int i=0;i<=n2;i++) {
    		System.out.println(""+i);
    	}
    }
}
