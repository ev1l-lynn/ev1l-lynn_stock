package test;

import connection.OracleConnection;
import domain.CustomerException;
import domain.Customers;
import service.CustomersService;

public class B_TestSelect {

	public static void main(String[] args) {
		try {
			Customers customers = new Customers();
			OracleConnection oracon;
			oracon = new OracleConnection();
			CustomersService customersService = new CustomersService(oracon.getConnection());
			customersService.getCustomers(customers);
			System.out.println(customers);
		}
		catch (CustomerException e) {
		System.out.println(e.getMessage());
		}
		
		
	}

}
