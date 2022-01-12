package atm;
import java.util.Scanner;

public class OddNumn1ton2 {
    public static void main(String[]args) {
    	Scanner input= new Scanner(System.in);
    	System.out.println("Enter the first number");
    	int n1 = input.nextInt();
    	System.out.println("Enter the Second number");
    	int n2 = input.nextInt();
    	int i;
    	for(i=n1;i<=n2;i++) {
    		if(i%2==1) {
    			System.out.println(""+i);
    		}
    	}
    }
}
