package cogn.test7;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the company name:");
		String companyName = sc.nextLine();
		System.out.println("Employee company name is:"+companyName);
		System.out.println("Enter the name:");
		String name = sc.next();
		System.out.println("Employee name is:"+name);
		System.out.println("Enter the age:");
		byte age = sc.nextByte();
		System.out.println("Employee age is:"+age);
		System.out.println("Enter the atm pin:");
		short atmPin = sc.nextShort();
		System.out.println("Employee atm pin is:"+atmPin);
		System.out.println("Enter the pin code:");
		int pinCode = sc.nextInt();
		System.out.println("Employee pin code is:"+pinCode);
		System.out.println("Enter the mob no:");
		long mobNum = sc.nextLong();
		System.out.println("Employee mob no is:"+mobNum);
		System.out.println("Enter the weight:");
		float weight = sc.nextFloat();
		System.out.println("Employee weight is:"+weight);
		System.out.println("Enter the Salary:");
		double salary = sc.nextDouble();
		System.out.println("Employee salary is:"+salary);

		System.out.println("Enter the marital Status:");
		boolean maritalStatus = sc.nextBoolean();
		System.out.println("Employee marital Status is:"+maritalStatus);
		System.out.println("Address");

	}

}
