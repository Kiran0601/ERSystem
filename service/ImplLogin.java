package com.revature.ers.service;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import com.revature.ers.client.*;
import com.revature.ers.model.*;
import com.revature.ers.doa.*;
public class ImplLogin implements IntLogin
   {
	EmployeeLogin l = new EmployeeLogin();
	DaoImpl cdi = new DaoImpl();
	Scanner sc = new Scanner(System.in);
	User log = new User();
	
	ImplService emImp = new ImplService();
	
	
	public void login() {
		cdi.getCon();
		System.out.println("Enter your name");
		log.setName(sc.nextLine());
		System.out.println("Enter your password");
		log.setPassword(sc.nextLine());
		//System.out.println("Enter your UserId");
		//log.setUserid(sc.nextInt());
		try {
			String query = "select * from Employeedetails where empname=? and password=?;";
			PreparedStatement pst = cdi.getCon().prepareStatement(query);
			pst.setString(1, log.getName());
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				if(rs.getString(1).contentEquals(log.getName()) && rs.getString(2).contentEquals(log.getPassword())){
					System.out.println("Logged in Successfully as "+ log.getName()+"!!");
				}
				else{
					System.out.println("You have entered wrong credentials.");
				}	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void logout() {
		System.out.println("Logged out successfully!!");
		l.strt();
	}
	
	

	
		}
