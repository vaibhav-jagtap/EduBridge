package pattern;
import java.util.Scanner;
public class S28 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the Number: ");
	        int num = sc.nextInt();

	        for (int i = 1; i <= num; i++) {
	            System.out.print(i + " ");
	        }

	        sc.close();
	    }

	}
