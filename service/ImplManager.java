package com.revature.ers.service;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import com.revature.ers.doa.*;
import com.revature.ers.model.Form;

import java.util.ArrayList;
public class ImplManager implements IntManager {

    DaoImpl cdi = new DaoImpl();
    static ArrayList<Form> erslist=new ArrayList<Form>();

	
    @Override
	public void ManagerResolvedRequest() {
		Iterator<Form> i=erslist.iterator();
		while(i.hasNext()) {
			Form f=i.next();
			if(f.getStatus()=="Resolved") {
			System.out.println(f);}
				
		}
		
	}

	@Override
	public void ManagerPendingRequest() {
		Iterator<Form> i=erslist.iterator();
		while(i.hasNext()) {
			Form f=i.next();
			if(f.getStatus()=="Resolved") {
			System.out.println(erslist);}
				
		}
		
	}
	@Override
	public void view()
	{
		if(erslist.isEmpty()) {
	
		System.out.println("Sorry :( No Products Available");
	}
	else {
		System.out.println("EMPLOYEES ARE: ");
		for (Form  form : erslist) {
			System.out.println(form);
		}
	}

}}