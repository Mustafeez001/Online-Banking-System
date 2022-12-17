package com.masai.Dao;

import com.masai.Exception.AccountException;
import com.masai.Exception.AccountantException;
import com.masai.Exception.CustomerException;
import com.masai.Model.Accountant;
import com.masai.Model.Customer;

public interface AccountantDAO {
	
	public Accountant LoginAccountant(String username, String password)throws AccountantException;
	
	public int addCustomer(String cname,String cmail, String cpass, String cmob, String cadd) throws CustomerException;

	public String addAccount(int cbal,int cid) throws AccountException;
	
	public String updateCustomer(int cACno,String cadd) throws CustomerException;

	public  Customer viewCustomer(String cACno) throws CustomerException;
	
	public int getCustomer(String cmail,String cmob) throws CustomerException;
	
	public Customer viewAllCustomer() throws CustomerException;
	
	public String deleteAccount(int cACno) throws CustomerException;
	
	
}
