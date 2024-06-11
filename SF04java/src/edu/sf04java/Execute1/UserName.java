package edu.sf04java.Execute1;
import java.util.Scanner;
public class UserName 
{
	private static Scanner input;

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the user name:");
		
		String n =input.next();
		
		System.out.println("User Name:"+n);
		
	}

}


