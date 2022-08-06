package pack1;
import java.util.Scanner;
public class multiples {
public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	int j=0;
	System.out.print("Enter the number you want the multiples of : ");
j=sc.nextInt();
for(int i=1;i<11;i++) {
	System.out.println(j+" * "+i+" = "+i*j);
}
}}
