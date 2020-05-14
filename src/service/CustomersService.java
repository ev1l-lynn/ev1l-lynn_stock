package service;

import java.sql.Connection;

import domain.CustomerException;
import domain.Customers;
import persistence.CustomersRepository;

public class CustomersService {
	private Connection con;
	private CustomersRepository customersRepository;
	
	public CustomersService(Connection con) {
		this.con = con;
		this.customersRepository = new CustomersRepository();
	}
	
	public void getCustomers(Customers cus) throws CustomerException {
		cus.clear();
		cus.addAll(customersRepository.selectAll(con));
	}
}
