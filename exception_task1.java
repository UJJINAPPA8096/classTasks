package com.Exception;

import java.util.Scanner;

public class exception_task1 {
	
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("enter username");
			String a = sc.next();
			System.out.println("enter password");
			String b = sc.next();
			if(a.equals("admin") && b.equals("admin123")) {
				System.out.println("ouput:-");
				System.out.println("username and password is matched");
			}
			else {
				System.out.println("ouput:-");
				System.out.println("InvalidCrentialException");
			}
		
		

	}

}
