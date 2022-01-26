package com.revature.ers.service;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import com.revature.ers.doa.DaoImpl;
import com.revature.ers.model.Form;

public class ImplService implements Service {

    DaoImpl di = new DaoImpl();
    static ArrayList<Form> erslist=new ArrayList<Form>();

	@Override
	public void submitRequest(Form f) {
		erslist.add(f);
		System.out.println(erslist);
		
	}
	
	@Override
	public void viewResolvedRequest(int userid) {
		for(Form form:erslist) {
			System.out.println("Yes");
			if(form.getStatus()=="Resolved") {
				System.out.println("Ye Yes");
				System.out.println(form);
			}
		}
	}

	@Override
	public void viewPendingRequest(int userid) {
		Iterator<Form> i=erslist.iterator();
		while(i.hasNext()) {
			System.out.println("Yes");
			Form f=i.next();
			   String sta=f.getStatus();
			   System.out.println(sta);
			if(sta.equals("Pending")) {
				System.out.println("Yes Yes");
			System.out.println(f);}
				
		}
		
	
	
		
	}
}
