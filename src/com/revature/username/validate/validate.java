package com.revature.username.validate;

import java.util.Scanner;

import com.revature.username.Username;

public class validate {

	public static void main(String[] arg) {
		validate vc = new validate();
		Username username=new Username();

		try {
			vc.validator(username);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	

	private static void validator(Username username) throws Exception {
		// TODO Auto-generated method stub
	
		System.out.println("enter the username and password");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		String password = scan.next();
		scan.close();

		if (username.equals(name) && username.equals(password)) {

			throw new Exception("valid username and password");

		} else {
			throw new Exception("invalid username and password");
		}
	}
}

