package bpi.project1.hello;
import java.util.Scanner;


public class Act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Java Training 101!");
		
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		double x = age; //convert automatically to int
		double y = 11.75; //double
		int z = (int) y ; //convert manually to int
		System.out.println("Your age as int is: " + age);
		System.out.println("Your age as double is: " + x);
		System.out.println("Your age as double converted to int is: " + z);
		

		
	}

}
