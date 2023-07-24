package com.Exception;

import java.util.Scanner;

public class exception_task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total runs scored");
		int a = sc.nextInt();
		System.out.println("enter total overs faced");
		int b = sc.nextInt();
		try{
			
			int c=a/b;
			System.out.println("Required Runrate:- "+c);
		}
		catch (Exception e) {
			//System.out.println(e);
			e.printStackTrace();
		}

	}

}
