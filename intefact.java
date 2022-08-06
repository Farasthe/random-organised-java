package pack1;

import java.util.Scanner;
public class intefact {
		public static void main(String[] args) {
		double a=0;
		int b=0;
			Scanner scan = new Scanner(System.in);
		System.out.println("Enter double");
			a=scan.nextDouble();
		b=(int)a;
		a=a-b;
		System.out.println("Integral part "+b);
		System.out.println("Fractional part "+a);
		
		}
		
	}


