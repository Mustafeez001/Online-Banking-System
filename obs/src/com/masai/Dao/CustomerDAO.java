package com.masai.Dao;

import java.util.List;

import com.masai.Exception.CustomerException;
import com.masai.Model.Customer;
import com.masai.Model.Transaction;

public interface CustomerDAO {
	
	public Customer LoginCustomer(String username, String password, int accountno)throws CustomerException; 
	
	public int viewBalance(int cACno) throws CustomerException;
	
	public int Deposit(int cACno, int amount) throws CustomerException; 
	
	public int Withdraw(int cACno, int amount) throws CustomerException;
	
	public int Transfer(int cACno, int amount, int cACno2) throws CustomerException; 
	
	public List<Transaction> viewTransaction(int cACno) throws CustomerException;
	
}
