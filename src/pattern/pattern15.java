package pattern;
import java.util.Scanner;

	public class pattern15 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the Number: ");
	        int num = sc.nextInt();
	        int m=num;
	        for (int i = 1; i <= num; i++) {
	            for (int j = 1; j <= num; j++) {
	                if (i == 1 || i == num || j == 1 || j == num || i==j || j==m) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            m--;
	            System.out.println();
	        }

	        sc.close();
	    }

	}
