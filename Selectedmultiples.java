package pack1;
import java.util.Scanner;
public class Selectedmultiples {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
   int start,end,tables;
System.out.print("Enter starting point : ");
start =sc.nextInt();
System.out.println();

System.out.print("Enter ending : ");
end =sc.nextInt();
System.out.println();


System.out.print("Enter number : ");
tables =sc.nextInt();
System.out.println();

for(int i=start;start<=end;start++){
System.out.println(tables + " * " + start + " = " + start*tables);
}}

}
