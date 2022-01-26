package com.revature.ers.client;

import com.revature.ers.doa.*;
import com.revature.ers.model.*;
import com.revature.ers.service.*;

import java.util.Scanner;

public class ClientEmployee {
	
	private static final Form f = null;
	ImplService im=new ImplService();
	DaoImpl da=new DaoImpl();
	
	public void EmployeeLogin() {
		try (Scanner sc=new Scanner(System.in)){
			System.out.println("Welcome to Employee login!!");
			ImplLogin ad = new ImplLogin();
			ad.login();
			System.out.println("Choose the operation you need to perform ");
			System.out.println("1. View Resolved Cases");
			System.out.println("2. View Pending Cases");
			//System.out.println("3. Submit form");
			System.out.println("3. Logout");
		
			int e = sc.nextInt();
			switch(e) {
			case 1:
				int userid=sc.nextInt();
				im.viewResolvedRequest(userid);
				break;
			case 2:
				int userid1=sc.nextInt();
				im.viewPendingRequest(userid1);
				break;
			//case 3:
				//im.submitRequest(Form f);
				//break;
			case 3:
				ad.logout();
				break;
			}	
		} 
	}
}