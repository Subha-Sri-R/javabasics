package day1;
import java.util.Scanner;

public class SampleJava3 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the values of a and b");
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		c=a-b;
		System.out.println("Addition of a=" +a+"and b="+b+"is:"+c);
		System.out.println("Subtraction of a=" +a+"and b="+b+"is:"+c);


	}

}
