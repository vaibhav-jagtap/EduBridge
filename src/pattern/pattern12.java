package pattern;
import java.util.Scanner;

	public class pattern12 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the Number: ");
	        int num = sc.nextInt();
	        int m = num;
	        for (int i = num; i >= 1; i--) {
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(" ");
	            }
	            for (int k = m; k <= num; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	            m--;
	        }
	        m = 1;
	        for (int a = 1; a <= num; a++) {
	            for (int b = 1; b <= a; b++) {
	                System.out.print(" ");
	            }
	            for (int c = m; c <= num - 1; c++) {
	                System.out.print("*");
	            }
	            System.out.println();
	            m++;
	        }
	        sc.close();
	    }
	}