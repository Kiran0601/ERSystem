package com.revature.ers.service;

import com.revature.ers.client.*;
import com.revature.ers.model.*;

public interface Service {
	
	public void submitRequest(Form f);
	public void viewResolvedRequest(int userid);
	public void viewPendingRequest(int userid);
	//public void ManagerResolvedRequest();
	//public void ManagerPendingRequest();
	//public void view();
	//public void login(String email,String pwd);
	
	
}
