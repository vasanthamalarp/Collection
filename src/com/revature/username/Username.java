package com.revature.username;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Username {

	public static void main(String[] args)  {
		Username username=new Username();

		HashMap<String, String> hashmap = new HashMap<String, String>();

		hashmap.put("malar", "vasu");
		hashmap.put("renu", "tamil");
		hashmap.put("vasantha", "kuty");

		List<String> blacklist = new ArrayList<>();
		blacklist.add("yoga");
		blacklist.add("vindhya");

		try {
			addUsername(blacklist);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void addUsername(List<String> list) throws Exception {
		// TODO Auto-generated method stub
		List<String> l=list;
		String newname;
		System.out.println("enter the new username");
		Scanner scan = new Scanner(System.in);
		newname = scan.next();
		scan.close();
		for(String t: l)
		if (t.equals(newname)) {
			throw new Exception("User Account is blacklist,please send a mail to admin");

		}

	}
}
